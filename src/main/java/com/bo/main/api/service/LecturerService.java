package com.bo.main.api.service;

import com.bo.main.api.controller.vo.req.ReqLecturerSearchVo;
import com.bo.main.api.controller.vo.req.ReqLecturerVo;
import com.bo.main.api.controller.vo.res.ResLecturerVo;
import com.bo.main.api.entities.LecturerEntity;
import com.bo.main.api.entities.converts.LecturerMapper;
import com.bo.main.api.entities.vo.ClassPackageVo;
import com.bo.main.api.entities.vo.LecturerCareerVo;
import com.bo.main.api.entities.vo.LecturerClassVo;
import com.bo.main.api.entities.vo.LecturerVo;
import com.bo.main.api.repositories.jpa.LecturerRepository;
import com.bo.main.api.repositories.querydsl.QLecturerRepository;
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

@Service
@Transactional
@Slf4j
@RequiredArgsConstructor
public class LecturerService {

    private final LecturerRepository lecturerRepository;
    private final QLecturerRepository qLecturerRepository;

    private final LecturerMapper lecturerMapper;

    private final LecturerClassMappingService lecturerClassMappingService;
    private final LecturerCareerService lecturerCareerService;


    public Optional<LecturerEntity> findLecturerByLctrCd(String lctrCd) {
        return lecturerRepository.findByLctrCd(lctrCd);
    }

    public LecturerVo findLecturerByIdRetError(long lctrSeq) throws Exception{
        Optional<LecturerEntity> opt = lecturerRepository.findById(lctrSeq);
        return lecturerMapper.toVo(opt.orElseThrow(() -> new Exception(StringUtils.message("등록된 Lecturer 정보({})가 없습니다.", String.valueOf(lctrSeq)))));
    }

    public LecturerVo findLecturerByLctrCdRetError(String lctrCd) throws Exception{
        Optional<LecturerEntity> opt = findLecturerByLctrCd(lctrCd);
        return lecturerMapper.toVo(opt.orElseThrow(() -> new Exception(StringUtils.message("등록된 Lecturer 정보({})가 없습니다.", lctrCd))));
    }

    public ResLecturerVo findLecturerRetError(String lctrCd) throws Exception{
        ResLecturerVo resLecturerVo = lecturerMapper.toVo(findLecturerByLctrCdRetError(lctrCd));

        LecturerCareerVo lecturerCareerVo = new LecturerCareerVo();
        lecturerCareerVo.setLctrSeq(resLecturerVo.getLctrSeq());

        List<LecturerCareerVo> lecturerCareerVoList = lecturerCareerService.findByLctrSeqRetError(lecturerCareerVo);

        resLecturerVo.setLecturerCareers(lecturerCareerVoList);

        return resLecturerVo;
    }

    public Page<LecturerVo> search(ReqLecturerSearchVo searchVo, Pageable pageable) throws Exception {
        Page<LecturerEntity> lecturerEntityPage = qLecturerRepository.findList(searchVo, pageable);
        return new PageImpl<>(lecturerMapper.toVos(lecturerEntityPage.getContent()), pageable, lecturerEntityPage.getTotalElements());
    }

    public LecturerVo update(ReqLecturerVo reqLecturerVo) throws Exception {
        LecturerVo lecturerVo = lecturerMapper.toVo(reqLecturerVo);

        Optional<LecturerEntity> opt = findLecturerByLctrCd(lecturerVo.getLctrCd());

        LecturerEntity loadLecturer = opt.orElseThrow(() -> new Exception(StringUtils.message("등록된 Lecturer 정보({})가 없습니다.", lecturerVo.getLctrCd())));
        lecturerMapper.updateFromVo(lecturerVo, loadLecturer);

        lecturerCareerService.bulkMerges(reqLecturerVo.getLecturerCareerVoList());

        return lecturerMapper.toVo(lecturerRepository.save(loadLecturer));
    }

    public LecturerVo add(ReqLecturerVo reqLecturerVo) throws Exception {

        LecturerVo lecturerVo = lecturerMapper.toVo(reqLecturerVo);

        Optional<LecturerEntity> opt = findLecturerByLctrCd(lecturerVo.getLctrCd());

        if (opt.isPresent()) {
            throw new Exception(StringUtils.message("이미 등록된 Lecturer Id({}) 입니다.", lecturerVo.getLctrCd()));
        }

        LecturerEntity lecturerEntity = new LecturerEntity();

        lecturerMapper.updateFromVo(lecturerVo, lecturerEntity);
        lecturerCareerService.bulkMerges(reqLecturerVo.getLecturerCareerVoList());

        return lecturerMapper.toVo(lecturerRepository.save(lecturerEntity));
    }

    public void delete(String lctrCd) throws Exception {
        LecturerVo lecturerVo = findLecturerByLctrCdRetError(lctrCd);

        Long lctrSeq = lecturerVo.getLctrSeq();

        LecturerCareerVo lecturerCareerVo = new LecturerCareerVo();
        lecturerCareerVo.setLctrSeq(lctrSeq);
        lecturerCareerService.delete(lecturerCareerVo);

        LecturerClassVo lecturerClassVo = new LecturerClassVo();
        lecturerClassVo.setLctrSeq(lctrSeq);
        lecturerClassMappingService.delete(lecturerClassVo);

        lecturerRepository.deleteById(lctrSeq);
    }
}
