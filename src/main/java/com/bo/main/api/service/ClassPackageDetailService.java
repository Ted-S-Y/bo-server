package com.bo.main.api.service;

import com.bo.main.api.entities.ClassPackageDetailEntity;
import com.bo.main.api.entities.converts.ClassPackageDetailMapper;
import com.bo.main.api.entities.vo.ClassPackageDetailVo;
import com.bo.main.api.repositories.jpa.ClassPackageDetailRepository;
import com.bo.main.api.repositories.querydsl.QClassPackageDetailRepository;
import com.bo.main.core.util.StringUtils;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
@Slf4j
@RequiredArgsConstructor
public class ClassPackageDetailService {

    private final QClassPackageDetailRepository qClassPackageDetailRepository;
    private final ClassPackageDetailRepository classPackageDetailRepository;
    private final ClassPackageDetailMapper classPackageDetailMapper;


    public Optional<ClassPackageDetailEntity> findClassPackageDetailById(long mapSeq) {
        return classPackageDetailRepository.findById(mapSeq);
    }

    public List<ClassPackageDetailVo> findList(ClassPackageDetailVo classPackageDetailVo) throws Exception {

        Optional<List<ClassPackageDetailEntity>> opt = qClassPackageDetailRepository.findList(classPackageDetailVo);

        return classPackageDetailMapper.toVos(opt.orElseThrow(() -> new Exception(StringUtils.message("등록된 Class Package 정보({})가 없습니다.", classPackageDetailVo.getMapSeq()+""))));
    }


    public ClassPackageDetailVo merge(ClassPackageDetailVo classPackageDetailVo) throws Exception {

        Optional<ClassPackageDetailEntity> opt = findClassPackageDetailById(classPackageDetailVo.getMapSeq());

        ClassPackageDetailEntity loadClassPackageDetail = opt.orElseGet(ClassPackageDetailEntity::new);
        classPackageDetailMapper.updateFromVo(classPackageDetailVo, loadClassPackageDetail);

        delete(classPackageDetailVo);

        return classPackageDetailMapper.toVo(classPackageDetailRepository.save(loadClassPackageDetail));
    }

    public void delete(ClassPackageDetailVo classPackageDetailVo) throws Exception {
        Optional<List<ClassPackageDetailEntity>> opt = qClassPackageDetailRepository.findList(classPackageDetailVo);

        List<ClassPackageDetailEntity> loadClassPackageDetailEntityList = opt.orElseThrow(() -> new Exception(StringUtils.message("등록된 Class Package 정보({})가 없습니다.", classPackageDetailVo.getMapSeq()+"")));

        for (ClassPackageDetailEntity tempEntity : loadClassPackageDetailEntityList) {
            classPackageDetailMapper.updateFromVo(classPackageDetailVo, tempEntity);
            classPackageDetailRepository.delete(tempEntity);
        }
    }


    @Transactional
    public List<ClassPackageDetailVo> bulkMerges(List<ClassPackageDetailVo> classPackageDetailVoList) throws Exception {
        List<ClassPackageDetailVo> results = new ArrayList<>();

        for (ClassPackageDetailVo tempVo: classPackageDetailVoList) {
            results.add(merge(tempVo));
        }

        return results;
    }
}
