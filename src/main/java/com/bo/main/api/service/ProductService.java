package com.bo.main.api.service;

import com.bo.main.api.controller.vo.req.ReqPackageSearchVo;
import com.bo.main.api.controller.vo.req.ReqPackageVo;
import com.bo.main.api.controller.vo.req.ReqProductSearchVo;
import com.bo.main.api.controller.vo.req.ReqProductVo;
import com.bo.main.api.controller.vo.res.ResProductVo;
import com.bo.main.api.entities.converts.SalesProductDetailMapper;
import com.bo.main.api.entities.converts.SalesProductMapper;
import com.bo.main.api.entities.vo.ClassBaseVo;
import com.bo.main.api.entities.vo.ClassPackageDetailVo;
import com.bo.main.api.repositories.querydsl.QProductRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/**
 * packageName : com.bo.main.api.service
 * fileName : ProductService
 * author : sbyoon
 * date : 2022-06-03
 * description :
 * ===========================================================
 * DATE AUTHOR  NOTE
 * -----------------------------------------------------------
 * 2022-06-03  sbyoon 최초 생성
 */
@Service
@Transactional
@Slf4j
@RequiredArgsConstructor
public class ProductService {
    private final SalesProductService salesProductService;
    private final SalesProductMapper salesProductMapper;

    private final QProductRepository qProductRepository;

    private final SalesProductDetailService salesProductDetailService;
    private final SalesProductDetailMapper salesProductDetailMapper;

    private final ClassBaseService classBaseService;


    public ResProductVo findProductOneRetError(long packSeq) throws Exception{
        ResProductVo resProductVo = salesProductMapper.toVo(salesProductService.findClassPackageByIdRetError(packSeq));

        ClassPackageDetailVo classPackageDetailVo = new ClassPackageDetailVo();
        classPackageDetailVo.setPackSeq(packSeq);
        List<ClassPackageDetailVo> classPackageDetailVoList = salesProductDetailService.findList(classPackageDetailVo);

        List<ClassBaseVo> results = new ArrayList<>();

        for (ClassPackageDetailVo tempVo : classPackageDetailVoList) {
            ClassBaseVo classBaseVo = classBaseService.findClassBaseByIdRetError(tempVo.getClssSeq());
            results.add(classBaseVo);
        }

        resProductVo.setClassBases(results);

        return resProductVo;
    }

    public Page<ResProductVo> search(ReqProductSearchVo searchVo, Pageable pageable) throws Exception {
        Page<ResProductVo> packagePage = qProductRepository.findList(searchVo, pageable);
        return new PageImpl<>(packagePage.getContent(), pageable, packagePage.getTotalElements());
    }

    public void add(ReqProductVo reqProductVo) throws Exception {

        salesProductService.add(salesProductMapper.toVo(reqProductVo));
        salesProductDetailService.bulkMerges(reqProductVo.getDetails());
    }

    public void update(ReqProductVo reqProductVo) throws Exception {
        salesProductService.update(salesProductMapper.toVo(reqProductVo));
        salesProductDetailService.bulkMerges(reqProductVo.getDetails());
    }

}
