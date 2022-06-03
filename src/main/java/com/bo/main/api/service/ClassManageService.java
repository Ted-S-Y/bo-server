package com.bo.main.api.service;

import com.bo.main.api.controller.vo.req.ReqClassManageSearchVo;
import com.bo.main.api.controller.vo.req.ReqClassManageVo;
import com.bo.main.api.controller.vo.res.ResClassManageVo;
import com.bo.main.api.entities.converts.ClassBaseMapper;
import com.bo.main.api.entities.converts.ClassVideoMapper;
import com.bo.main.api.entities.converts.LecturerClassMapper;
import com.bo.main.api.entities.vo.ClassBaseVo;
import com.bo.main.api.entities.vo.ClassVideoVo;
import com.bo.main.api.entities.vo.LecturerClassVo;
import com.bo.main.api.entities.vo.LecturerVo;
import com.bo.main.api.repositories.querydsl.QClassManageRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * packageName : com.bo.main.api.service
 * fileName : ClassManageService
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
public class ClassManageService {
    private final QClassManageRepository qClassManageRepository;

    private final ClassBaseService classBaseService;
    private final ClassBaseMapper classBaseMapper;

    private final ClassVideoService classVideoService;
    private final ClassVideoMapper classVideoMapper;

    private final LecturerClassMappingService lecturerClassMappingService;
    private final LecturerClassMapper lecturerClassMapper;

    private final LecturerService lecturerService;

    public ResClassManageVo findClassOneRetError(long clssSeq) throws Exception{
        ResClassManageVo resClassManageVo = classBaseMapper.toVo(classBaseService.findClassBaseByIdRetError(clssSeq));

        List<ClassVideoVo> classVideoVoList = classVideoService.findByClssSeqRetError(clssSeq);
        resClassManageVo.setVideos(classVideoVoList);

        LecturerClassVo lecturerClassVo = new LecturerClassVo();
        lecturerClassVo.setClssSeq(clssSeq);
        List<LecturerClassVo> lecturerClassVoList = lecturerClassMappingService.findList(lecturerClassVo);

        LecturerVo lecturerVo = new LecturerVo();
        for (LecturerClassVo tempVo : lecturerClassVoList) {
            lecturerVo = lecturerService.findLecturerByIdRetError(tempVo.getLctrSeq());
        }

        resClassManageVo.setLecturerVo(lecturerVo);

        return resClassManageVo;
    }

    public Page<ResClassManageVo> search(ReqClassManageSearchVo searchVo, Pageable pageable) throws Exception {
        Page<ResClassManageVo> classBasePage = qClassManageRepository.findList(searchVo, pageable);
        return new PageImpl<>(classBasePage.getContent(), pageable, classBasePage.getTotalElements());
    }

    public void update(ReqClassManageVo reqClassManageVo) throws Exception {
        ClassBaseVo updateClassBaseVo =classBaseService.update(classBaseMapper.toVo(reqClassManageVo));

        classVideoService.bulkUpdates(updateClassBaseVo, reqClassManageVo.getVideos());
        lecturerClassMappingService.merge(reqClassManageVo.getLecturerClassVo());
    }

    public void add(ReqClassManageVo reqClassManageVo) throws Exception {
        ClassBaseVo newClassBaseVo = classBaseService.add(classBaseMapper.toVo(reqClassManageVo));

        classVideoService.bulkAdds(newClassBaseVo, reqClassManageVo.getVideos());
        lecturerClassMappingService.merge(reqClassManageVo.getLecturerClassVo());
    }

    public void delete(long clssSeq) throws Exception {
        ClassBaseVo classBaseVo = classBaseService.findClassBaseByIdRetError(clssSeq);

        classVideoService.delete(classVideoMapper.toVo(classBaseVo));
        lecturerClassMappingService.delete(lecturerClassMapper.toVo(classBaseVo));
        classBaseService.delete(classBaseVo);
    }
}
