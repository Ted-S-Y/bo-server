package com.bo.main.api.service;

import com.bo.main.api.entities.ClassPackageEntity;
import com.bo.main.api.entities.converts.ClassPackageMapper;
import com.bo.main.api.entities.vo.ClassPackageVo;
import com.bo.main.api.repositories.jpa.ClassPackageRepository;
import com.bo.main.core.util.StringUtils;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@Transactional
@Slf4j
@RequiredArgsConstructor
public class ClassPackageService {

    private final ClassPackageRepository classPackageRepository;

    private final ClassPackageMapper classPackageMapper;

    public Optional<ClassPackageEntity> findByPackSeq(long packSeq) {
        return classPackageRepository.findById(packSeq);
    }

    public ClassPackageVo findClassPackageByIdRetError(long packSeq) throws Exception{
        Optional<ClassPackageEntity> opt = findByPackSeq(packSeq);
        return classPackageMapper.toVo(opt.orElseThrow(() -> new Exception(StringUtils.message("등록된 ClassPackage 정보({})가 없습니다.", packSeq+""))));
    }

    public ClassPackageVo update(ClassPackageVo updateClassPackageVo) throws Exception {

        Optional<ClassPackageEntity> opt = findByPackSeq(updateClassPackageVo.getPackSeq());

        ClassPackageEntity loadClassPackage = opt.orElseThrow(() -> new Exception(StringUtils.message("등록된 ClassBase 정보({})가 없습니다.", updateClassPackageVo.getPackSeq()+ "")));
        classPackageMapper.updateFromVo(updateClassPackageVo, loadClassPackage);

        ClassPackageVo classPackageVo = classPackageMapper.toVo(classPackageRepository.save(loadClassPackage));
//        classPackageVo.setClassPackageDetails(classPackageDetailService.);

        return classPackageVo;
    }

    public ClassPackageVo add(ClassPackageVo newClassPackageVo) throws Exception {

        Optional<ClassPackageEntity> opt = findByPackSeq(newClassPackageVo.getPackSeq());

        if (opt.isPresent()) {
            throw new Exception(StringUtils.message("이미등록된 ClassPackage({}) 입니다.",newClassPackageVo.getPackSeq() + ""));
        }

        ClassPackageEntity loadClassPackage = new ClassPackageEntity();
        classPackageMapper.updateFromVo(newClassPackageVo, loadClassPackage);

        ClassPackageVo ClassPackageVo = classPackageMapper.toVo(classPackageRepository.save(loadClassPackage));

        return ClassPackageVo;

    }

    public void delete(ClassPackageVo classPackageVo) throws Exception {
        Optional<ClassPackageEntity> opt = findByPackSeq(classPackageVo.getPackSeq());
        ClassPackageEntity loadClassPackage = opt.orElseThrow(() -> new Exception(StringUtils.message("등록된 ClassPackage 정보({})가 없습니다.", classPackageVo.getPackSeq() + "")));
        classPackageMapper.updateFromVo(classPackageVo, loadClassPackage);

        classPackageRepository.delete(loadClassPackage);
    }

}
