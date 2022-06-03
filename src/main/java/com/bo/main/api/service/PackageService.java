package com.bo.main.api.service;

import com.bo.main.api.controller.vo.req.ReqPackageVo;
import com.bo.main.api.controller.vo.req.ReqPackageSearchVo;
import com.bo.main.api.controller.vo.res.ResPackageVo;
import com.bo.main.api.entities.converts.CategoryMapper;
import com.bo.main.api.entities.converts.ClassPackageDetailMapper;
import com.bo.main.api.entities.converts.ClassPackageMapper;
import com.bo.main.api.entities.vo.*;
import com.bo.main.api.repositories.querydsl.QPackageRepository;
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
 * fileName : PackageService
 * author : sbyoon
 * date : 2022-06-02
 * description :
 * ===========================================================
 * DATE AUTHOR  NOTE
 * -----------------------------------------------------------
 * 2022-06-02  sbyoon 최초 생성
 */
@Service
@Transactional
@Slf4j
@RequiredArgsConstructor
public class PackageService {
    private final QPackageRepository qPackageRepository;

    private final ClassPackageService classPackageService;
    private final ClassPackageMapper classPackageMapper;

    private final ClassPackageDetailService classPackageDetailService;
    private final ClassPackageDetailMapper classPackageDetailMapper;

    private final ClassBaseService classBaseService;

    private final CategoryService categoryService;
    private final CategoryMapper categoryMapper;

    public ResPackageVo findPackageOneRetError(long packSeq) throws Exception{
        ResPackageVo resPackageVo = classPackageMapper.toVo(classPackageService.findClassPackageByIdRetError(packSeq));

        ClassPackageDetailVo classPackageDetailVo = new ClassPackageDetailVo();
        classPackageDetailVo.setPackSeq(packSeq);
        List<ClassPackageDetailVo> classPackageDetailVoList = classPackageDetailService.findList(classPackageDetailVo);

        List<ClassBaseVo> results = new ArrayList<>();

        for (ClassPackageDetailVo tempVo : classPackageDetailVoList) {
            ClassBaseVo classBaseVo = classBaseService.findClassBaseByIdRetError(tempVo.getClssSeq());
            results.add(classBaseVo);
        }

        resPackageVo.setClassBases(results);

        return resPackageVo;
    }

    public Page<ResPackageVo> search(ReqPackageSearchVo searchVo, Pageable pageable) throws Exception {
        Page<ResPackageVo> packagePage = qPackageRepository.findList(searchVo, pageable);
        return new PageImpl<>(packagePage.getContent(), pageable, packagePage.getTotalElements());
    }

    public void add(ReqPackageVo reqPackageVo) throws Exception {
        classPackageService.add(classPackageMapper.toVo(reqPackageVo));
        classPackageDetailService.bulkMerges(reqPackageVo.getDetails());
    }

    public void update(ReqPackageVo reqPackageVo) throws Exception {
        classPackageService.update(classPackageMapper.toVo(reqPackageVo));
        classPackageDetailService.bulkMerges(reqPackageVo.getDetails());
    }



    public void delete(long packSeq) throws Exception {
        ClassPackageVo classPackageVo = classPackageService.findClassPackageByIdRetError(packSeq);

        classPackageDetailService.delete(classPackageDetailMapper.toVo(classPackageVo));
        classPackageService.delete(classPackageVo);
    }
}
