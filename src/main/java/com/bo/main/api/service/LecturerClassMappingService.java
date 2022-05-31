package com.bo.main.api.service;

import com.bo.main.api.entities.LecturerClassEntity;
import com.bo.main.api.entities.converts.LecturerClassMapper;
import com.bo.main.api.entities.vo.ClassBaseVo;
import com.bo.main.api.entities.vo.LecturerClassVo;
import com.bo.main.api.repositories.jpa.LecturerClassMappingRepository;
import com.bo.main.api.repositories.querydsl.QLecturerClassRepository;
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
public class LecturerClassMappingService {

    private final QLecturerClassRepository qLecturerClassRepository;
    private final LecturerClassMappingRepository lecturerClassMappingRepository;
    private final LecturerClassMapper lecturerClassMapper;

    public Optional<LecturerClassEntity> findLecturerClassById(long mapSeq) {
        return lecturerClassMappingRepository.findById(mapSeq);
    }

    public List<LecturerClassVo> findList(LecturerClassVo lecturerClassVo) throws Exception {

        Optional<List<LecturerClassEntity>> opt = qLecturerClassRepository.findList(lecturerClassVo);

        return lecturerClassMapper.toVos(opt.orElseThrow(() -> new Exception(StringUtils.message("등록된 Lecturer Class 정보({})가 없습니다.", lecturerClassVo.getClssSeq()+""))));
    }

    public LecturerClassVo merge(LecturerClassVo lecturerClassVo) throws Exception {

        Optional<LecturerClassEntity> opt = findLecturerClassById(lecturerClassVo.getMapSeq());

        LecturerClassEntity loadLecturerClass = opt.orElseGet(LecturerClassEntity::new);
        lecturerClassMapper.updateFromVo(lecturerClassVo, loadLecturerClass);

        return lecturerClassMapper.toVo(lecturerClassMappingRepository.save(loadLecturerClass));
    }

    public void delete(LecturerClassVo lecturerClassVo) throws Exception {

        LecturerClassEntity loadLecturerClass = new LecturerClassEntity();
        lecturerClassMapper.updateFromVo(lecturerClassVo, loadLecturerClass);

        lecturerClassMappingRepository.delete(loadLecturerClass);
    }

    @Transactional
    public List<LecturerClassVo> bulkMerges(ClassBaseVo classBaseVo, List<LecturerClassVo> lecturerClasses) throws Exception {
        List<LecturerClassVo> results = new ArrayList<>();

        for (LecturerClassVo lecturerClassVo: lecturerClasses) {
            delete(lecturerClassVo);
            results.add(merge(lecturerClassVo));
        }

        return results;
    }

//    @Autowired
//    private LecturerClassMappingEntityRepository lecturerClassMappingEntityRepository;
//
//    public Long save(LecturerClassMappingEntityVO vO) {
//        LecturerClassMappingEntity bean = new LecturerClassMappingEntity();
//        BeanUtils.copyProperties(vO, bean);
//        bean = lecturerClassMappingEntityRepository.save(bean);
//        return bean.getLctrSeq();
//    }
//
//    public void delete(Long id) {
//        lecturerClassMappingEntityRepository.deleteById(id);
//    }
//
//    public void update(Long id, LecturerClassMappingEntityUpdateVO vO) {
//        LecturerClassMappingEntity bean = requireOne(id);
//        BeanUtils.copyProperties(vO, bean);
//        lecturerClassMappingEntityRepository.save(bean);
//    }
//
//    public LecturerClassMappingEntityDTO getById(Long id) {
//        LecturerClassMappingEntity original = requireOne(id);
//        return toDTO(original);
//    }
//
//    public Page<LecturerClassMappingEntityDTO> query(LecturerClassMappingEntityQueryVO vO) {
//        throw new UnsupportedOperationException();
//    }
//
//    private LecturerClassMappingEntityDTO toDTO(LecturerClassMappingEntity original) {
//        LecturerClassMappingEntityDTO bean = new LecturerClassMappingEntityDTO();
//        BeanUtils.copyProperties(original, bean);
//        return bean;
//    }
//
//    private LecturerClassMappingEntity requireOne(Long id) {
//        return lecturerClassMappingEntityRepository.findById(id)
//                .orElseThrow(() -> new NoSuchElementException("Resource not found: " + id));
//    }
}
