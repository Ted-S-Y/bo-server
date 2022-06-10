package com.bo.main.api.service;

import com.bo.main.api.entities.ClassBaseEntity;
import com.bo.main.api.entities.converts.ClassBaseMapper;
import com.bo.main.api.entities.vo.ClassBaseVo;
import com.bo.main.api.repositories.jpa.ClassBaseRepository;
import com.bo.main.core.util.StringUtils;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

/**
 * The type Class base service.
 */
@Service
@Transactional
@Slf4j
@RequiredArgsConstructor
public class ClassBaseService {

    private final ClassBaseRepository classBaseRepository;
    private final ClassBaseMapper classBaseMapper;

    public Optional<ClassBaseEntity> findClassBaseById(long clssSeq) {
        return classBaseRepository.findById(clssSeq);
    }

    public ClassBaseVo findClassBaseByIdRetError(long clssSeq) throws Exception{
        Optional<ClassBaseEntity> opt = findClassBaseById(clssSeq);
        return classBaseMapper.toVo(opt.orElseThrow(() -> new Exception(StringUtils.message("등록된 ClassBase 정보({})가 없습니다.", clssSeq+""))));
    }

    public ClassBaseVo update(ClassBaseVo classBaseVo) throws Exception {
        Optional<ClassBaseEntity> opt = findClassBaseById(classBaseVo.getClssSeq());

        ClassBaseEntity loadClassBase = opt.orElseThrow(() -> new Exception(StringUtils.message("등록된 ClassBase 정보({})가 없습니다.", classBaseVo.getClssSeq() + "")));
        classBaseMapper.updateFromVo(classBaseVo, loadClassBase);

        return classBaseMapper.toVo(classBaseRepository.save(loadClassBase));
    }

    public ClassBaseVo add(ClassBaseVo classBaseVo) throws Exception {

        Optional<ClassBaseEntity> opt = findClassBaseById(classBaseVo.getClssSeq());

        if (opt.isPresent()) {
            throw new Exception(StringUtils.message("이미등록된 ClassBase({}) 입니다.", classBaseVo.getClssSeq() + ""));
        }

        ClassBaseEntity loadClassBase = new ClassBaseEntity();
        classBaseMapper.updateFromVo(classBaseVo, loadClassBase);

        return classBaseMapper.toVo(classBaseRepository.save(loadClassBase));
    }


    public void delete(ClassBaseVo classBaseVo) throws Exception {
        Optional<ClassBaseEntity> opt = findClassBaseById(classBaseVo.getClssSeq());
        ClassBaseEntity loadClassBase = opt.orElseThrow(() -> new Exception(StringUtils.message("등록된 ClassBase 정보({})가 없습니다.", classBaseVo.getClssSeq() + "")));
        classBaseMapper.updateFromVo(classBaseVo, loadClassBase);

        classBaseRepository.delete(loadClassBase);
    }
}
