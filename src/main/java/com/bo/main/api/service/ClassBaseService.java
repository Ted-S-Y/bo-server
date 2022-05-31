package com.bo.main.api.service;

import com.bo.main.api.controller.vo.req.ReqClassBaseSearchVo;
import com.bo.main.api.controller.vo.req.ReqClassBaseVo;
import com.bo.main.api.controller.vo.res.ResClassBaseVo;
import com.bo.main.api.entities.ClassBaseEntity;
import com.bo.main.api.entities.converts.ClassBaseMapper;
import com.bo.main.api.entities.converts.ClassVideoMapper;
import com.bo.main.api.entities.vo.ClassBaseVo;
import com.bo.main.api.entities.vo.ClassVideoVo;
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

import java.util.List;
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
    private final LecturerClassMappingService lecturerClassMappingService;

    public Optional<ClassBaseEntity> findClassBaseById(long clssSeq) {
        return classBaseRepository.findById(clssSeq);
    }

    public ClassBaseVo findClassBaseByIdRetError(long clssSeq) throws Exception{
        Optional<ClassBaseEntity> opt = findClassBaseById(clssSeq);
        return classBaseMapper.toVo(opt.orElseThrow(() -> new Exception(StringUtils.message("등록된 ClassBase 정보({})가 없습니다.", clssSeq+""))));
    }

    public ResClassBaseVo findClassBaseOneRetError(ReqClassBaseVo reqClassBaseVo) throws Exception{
        ResClassBaseVo resClassBaseVo = classBaseMapper.toVo(findClassBaseByIdRetError(reqClassBaseVo.getClssSeq()));

        List<ClassVideoVo> classVideoVoList = classVideoService.findByClssSeqRetError(reqClassBaseVo.getClssSeq());
        resClassBaseVo.setVideos(classVideoVoList);




        Optional<ResClassBaseVo> opt = qClassBaseRepository.findOne(reqClassBaseVo);
        return opt.orElseThrow(() -> new Exception(StringUtils.message("등록된 ClassBase 정보({})가 없습니다.", reqClassBaseVo.getClssSeq()+"")));
    }

    public Page<ResClassBaseVo> search(ReqClassBaseSearchVo searchVo, Pageable pageable) throws Exception {
        Page<ResClassBaseVo> classBasePage = qClassBaseRepository.findList(searchVo, pageable);
        return new PageImpl<>(classBasePage.getContent(), pageable, classBasePage.getTotalElements());
    }

    public ClassBaseVo update(ReqClassBaseVo reqClassBaseVo) throws Exception {

        ClassBaseVo updateClassBaseVo = classBaseMapper.toVo(reqClassBaseVo);

        Optional<ClassBaseEntity> opt = findClassBaseById(updateClassBaseVo.getClssSeq());

        ClassBaseEntity loadClassBase = opt.orElseThrow(() -> new Exception(StringUtils.message("등록된 ClassBase 정보({})가 없습니다.", updateClassBaseVo.getClssSeq() + "")));
        classBaseMapper.updateFromVo(updateClassBaseVo, loadClassBase);

        ClassBaseVo classBaseVo = classBaseMapper.toVo(classBaseRepository.save(loadClassBase));
        classBaseVo.setVideos(classVideoService.bulkUpdates(classBaseVo, updateClassBaseVo.getVideos()));
        classBaseVo.setLecturerClasses(lecturerClassMappingService.bulkMerges(classBaseVo, updateClassBaseVo.getLecturerClasses()));

        return classBaseVo;
    }

    public ClassBaseVo add(ReqClassBaseVo reqClassBaseVo) throws Exception {

//        Optional<ClassBaseEntity> opt = findClassBaseById(newClassBaseVo.getClssSeq());
//
//        if (opt.isPresent()) {
//            throw new Exception(StringUtils.message("이미등록된 ClassBase({}) 입니다.",newClassBaseVo.getClssSeq() + ""));
//        }
        ClassBaseVo newClassBaseVo = classBaseMapper.toVo(reqClassBaseVo);

        ClassBaseEntity loadClassBase = new ClassBaseEntity();
        classBaseMapper.updateFromVo(newClassBaseVo, loadClassBase);

        ClassBaseVo classBaseVo = classBaseMapper.toVo(classBaseRepository.save(loadClassBase));
        classBaseVo.setVideos(classVideoService.bulkAdds(classBaseVo, newClassBaseVo.getVideos()));
        classBaseVo.setLecturerClasses(lecturerClassMappingService.bulkMerges(classBaseVo, newClassBaseVo.getLecturerClasses()));

        return classBaseVo;
    }
}
