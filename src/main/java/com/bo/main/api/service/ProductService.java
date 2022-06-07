package com.bo.main.api.service;

import com.bo.main.api.controller.vo.req.ReqProductSearchVo;
import com.bo.main.api.controller.vo.req.ReqProductVo;
import com.bo.main.api.controller.vo.res.ResProductVo;
import com.bo.main.api.entities.converts.SalesProductDetailMapper;
import com.bo.main.api.entities.converts.SalesProductMapper;
import com.bo.main.api.entities.vo.ClassPackageVo;
import com.bo.main.api.entities.vo.SalesProductDetailVo;
import com.bo.main.api.entities.vo.SalesProductVo;
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
    private final SalesProductDetailService salesProductDetailService;
    private final SalesProductDetailMapper salesProductDetailMapper;


    private final QProductRepository qProductRepository;

    private final ClassPackageService classPackageService;

    public ResProductVo findProductOneRetError(long slsPrdtSeq) throws Exception{
        ResProductVo resProductVo = salesProductMapper.toVo(salesProductService.findSalesProductByIdRetError(slsPrdtSeq));

        List<ClassPackageVo> classPackageVoList = new ArrayList<>();

        SalesProductDetailVo salesProductDetailVo = new SalesProductDetailVo();
        salesProductDetailVo.setSlsPrdtSeq(slsPrdtSeq);
        List<SalesProductDetailVo> salesProductDetailVoList = salesProductDetailService.findList(salesProductDetailVo);

        for (SalesProductDetailVo tempVo : salesProductDetailVoList) {
            classPackageVoList.add(classPackageService.findClassPackageByIdRetError(tempVo.getPackSeq()));
        }

        resProductVo.setClassPackages(classPackageVoList);

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

    public void delete(long slsPrdtSeq) throws Exception {
        SalesProductVo salesProductVo = salesProductService.findSalesProductByIdRetError(slsPrdtSeq);

        salesProductDetailService.delete(salesProductDetailMapper.toVo(salesProductVo));
        salesProductService.delete(salesProductVo);
    }
}
