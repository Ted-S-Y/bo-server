package com.bo.main.api.service;

import com.bo.main.api.controller.vo.req.ReqClassBaseSearchVo;
import com.bo.main.api.entities.ClassBaseEntity;
import com.bo.main.api.entities.converts.ClassBaseMapper;
import com.bo.main.api.entities.vo.ClassBaseVo;
import com.bo.main.api.repositories.jpa.ClassBaseRepository;
import com.bo.main.api.repositories.querydsl.QClassBaseRepository;
import com.bo.main.core.util.StringUtils;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
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

    private final QClassBaseRepository qClassBaseRepository;
    private final ClassBaseRepository classBaseRepository;

    private final ClassBaseMapper classBaseMapper;


    private final ClassVideoService classVideoService;

    /**
     * Find class base by id optional.
     *
     * @param clssSeq the clss seq
     * @return the optional
     */
    public Optional<ClassBaseEntity> findClassBaseById(long clssSeq) {
        return classBaseRepository.findById(clssSeq);
    }


    /**
     * Find class base by id ret error class base vo.
     *
     * @param clssSeq the clss seq
     * @return the class base vo
     * @throws Exception the exception
     */
    public ClassBaseVo findClassBaseByIdRetError(long clssSeq) throws Exception{
        Optional<ClassBaseEntity> opt = findClassBaseById(clssSeq);
        return classBaseMapper.toVo(opt.orElseThrow(() -> new Exception(StringUtils.message("등록된 ClassBase 정보({})가 없습니다.", clssSeq+""))));
    }

    /**
     * Search page.
     *
     * @param searchVo the search vo
     * @param pageable the pageable
     * @return the page
     * @throws Exception the exception
     */
    public Page<ClassBaseVo> search(ReqClassBaseSearchVo searchVo, Pageable pageable) throws Exception {
        Page<ClassBaseEntity> classEntityPage = qClassBaseRepository.findList(searchVo, pageable);
        return new PageImpl<>(classBaseMapper.toVos(classEntityPage.getContent()), pageable, classEntityPage.getTotalElements());
    }

    /**
     * Update class base vo.
     *
     * @param updateClassBaseVo the update class base vo
     * @return the class base vo
     * @throws Exception the exception
     */
    public ClassBaseVo update(ClassBaseVo updateClassBaseVo) throws Exception {

        Optional<ClassBaseEntity> opt = findClassBaseById(updateClassBaseVo.getClssSeq());

        ClassBaseEntity loadClassBase = opt.orElseThrow(() -> new Exception(StringUtils.message("등록된 ClassBase 정보({})가 없습니다.", updateClassBaseVo.getClssSeq() + "")));
        classBaseMapper.updateFromVo(updateClassBaseVo, loadClassBase);

        ClassBaseVo classBaseVo = classBaseMapper.toVo(classBaseRepository.save(loadClassBase));
        classBaseVo.setVideos(classVideoService.bulkUpdates(classBaseVo, updateClassBaseVo.getVideos()));;

        return classBaseVo;
    }

    /**
     * Add class base vo.
     *
     * @param newClassBaseVo the new class base vo
     * @return the class base vo
     * @throws Exception the exception
     */
//
    public ClassBaseVo add(ClassBaseVo newClassBaseVo) throws Exception {

//        Optional<ClassBaseEntity> opt = findClassBaseById(classBaseVo.getClssSeq());

//        if (opt.isPresent()) {
//            throw new Exception(StringUtils.message("이미등록된 ClassBase({}) 입니다.",classBaseVo.getClssSeq() + ""));
//        }

        ClassBaseEntity loadClassBase = new ClassBaseEntity();
        classBaseMapper.updateFromVo(newClassBaseVo, loadClassBase);

        ClassBaseVo classBaseVo = classBaseMapper.toVo(classBaseRepository.save(loadClassBase));
        classBaseVo.setVideos(classVideoService.bulkAdds(classBaseVo, newClassBaseVo.getVideos()));;


        return classBaseVo;

    }
}
