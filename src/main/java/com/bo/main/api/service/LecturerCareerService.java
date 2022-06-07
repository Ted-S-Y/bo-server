package com.bo.main.api.service;

import com.bo.main.api.entities.LecturerCareerEntity;
import com.bo.main.api.entities.converts.LecturerCareerMapper;
import com.bo.main.api.entities.vo.LecturerCareerVo;
import com.bo.main.api.repositories.jpa.LecturerCareerRepository;
import com.bo.main.api.repositories.querydsl.QLecturerCareerRepository;
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
public class LecturerCareerService {

    private final LecturerCareerRepository lecturerCareerRepository;
    private final QLecturerCareerRepository qLecturerCareerRepository;

    private final LecturerCareerMapper lecturerCareerMapper;


    public Optional<LecturerCareerEntity> findLecturerCareerById(long carrSeq) {
        return lecturerCareerRepository.findById(carrSeq);
    }

    public List<LecturerCareerVo> findByLctrSeqRetError(LecturerCareerVo lecturerCareerVo) throws Exception {
        Optional<List<LecturerCareerEntity>> opt = qLecturerCareerRepository.findList(lecturerCareerVo);

        return lecturerCareerMapper.toVos(opt.orElseThrow(() -> new Exception(StringUtils.message("등록된 Lecturer Career 정보({})가 없습니다.", lecturerCareerVo.getCarrSeq()+""))));
    }


    public LecturerCareerVo merge(LecturerCareerVo lecturerCareerVo) throws Exception {

        Optional<LecturerCareerEntity> opt = findLecturerCareerById(lecturerCareerVo.getCarrSeq());

        LecturerCareerEntity loadLecturerCareer = opt.orElseGet(LecturerCareerEntity::new);
        lecturerCareerMapper.updateFromVo(lecturerCareerVo, loadLecturerCareer);

        delete(lecturerCareerVo);

        return lecturerCareerMapper.toVo(lecturerCareerRepository.save(loadLecturerCareer));
    }

    public void delete(LecturerCareerVo lecturerCareerVo) throws Exception {
        Optional<List<LecturerCareerEntity>> opt = qLecturerCareerRepository.findList(lecturerCareerVo);

        List<LecturerCareerEntity> loadLecturerCareerEntityList = opt.orElseThrow(() -> new Exception(StringUtils.message("등록된 Lecturer Career 정보({})가 없습니다.", lecturerCareerVo.getCarrSeq()+"")));

        for (LecturerCareerEntity tempEntity : loadLecturerCareerEntityList) {
            lecturerCareerMapper.updateFromVo(lecturerCareerVo, tempEntity);
            lecturerCareerRepository.delete(tempEntity);
        }
    }


    @Transactional
    public List<LecturerCareerVo> bulkMerges(List<LecturerCareerVo> lecturerCareerVoList) throws Exception {
        List<LecturerCareerVo> results = new ArrayList<>();

        for (LecturerCareerVo tempVo: lecturerCareerVoList) {
            results.add(merge(tempVo));
        }

        return results;
    }

}
