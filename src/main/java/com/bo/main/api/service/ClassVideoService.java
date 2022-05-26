package com.bo.main.api.service;

import com.bo.main.api.entities.ClassVideoEntity;
import com.bo.main.api.entities.converts.ClassVideoMapper;
import com.bo.main.api.entities.vo.ClassBaseVo;
import com.bo.main.api.entities.vo.ClassVideoVo;
import com.bo.main.api.repositories.jpa.ClassVideoRepository;
import com.bo.main.api.repositories.querydsl.QClassVideoRepository;
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
public class ClassVideoService {

    private final QClassVideoRepository qClassVideoRepository;
    private final ClassVideoRepository classVideoRepository;

    private final ClassVideoMapper classVideoMapper;

    public Optional<ClassVideoEntity> findClassVideoById(long vdSeq) {
        return classVideoRepository.findById(vdSeq);
    }

    public Optional<ClassVideoEntity> findClassVideoByClssSeq(long clssSeq) {
        return classVideoRepository.findByClssSeq(clssSeq);
    }


    public ClassVideoVo findClassBaseByIdRetError(long vdSeq) throws Exception{
        Optional<ClassVideoEntity> opt = findClassVideoById(vdSeq);
        return classVideoMapper.toVo(opt.orElseThrow(() -> new Exception(StringUtils.message("등록된 Class Video 정보({})가 없습니다.", vdSeq+""))));
    }

    public ClassVideoVo findClassBaseByClssSeqRetError(long clssSeq) throws Exception{
        Optional<ClassVideoEntity> opt = findClassVideoByClssSeq(clssSeq);
        return classVideoMapper.toVo(opt.orElseThrow(() -> new Exception(StringUtils.message("등록된 Class Video 정보({})가 없습니다.", clssSeq+""))));
    }



    public ClassVideoVo update(ClassVideoVo classVideoVo) throws Exception {

        Optional<ClassVideoEntity> opt = findClassVideoById(classVideoVo.getVdSeq());

        ClassVideoEntity loadClassVideo = opt.orElseGet(ClassVideoEntity::new);
        classVideoMapper.updateFromVo(classVideoVo, loadClassVideo);

        return classVideoMapper.toVo(classVideoRepository.save(loadClassVideo));
    }

    public ClassVideoVo add(ClassVideoVo classVideoVo) throws Exception {

        ClassVideoEntity loadClassVideo = new ClassVideoEntity();
        classVideoMapper.updateFromVo(classVideoVo, loadClassVideo);

        return classVideoMapper.toVo(classVideoRepository.save(loadClassVideo));
    }

    @Transactional
    public List<ClassVideoVo> bulkAdds(ClassBaseVo classBaseVo, List<ClassVideoVo> classVideos) throws Exception {
        List<ClassVideoVo> results = new ArrayList<>();

        for (ClassVideoVo classVideoVo: classVideos) {
            classVideoVo.setClssSeq(classBaseVo.getClssSeq());
            results.add(add(classVideoVo));
        }

        return results;
    }

    @Transactional
    public List<ClassVideoVo> bulkUpdates(ClassBaseVo classBaseVo, List<ClassVideoVo> classVideos) throws Exception {
        List<ClassVideoVo> results = new ArrayList<>();

        for (ClassVideoVo classVideoVo: classVideos) {
            classVideoVo.setClssSeq(classBaseVo.getClssSeq());

            if (classVideoVo.getVdSeq() != null) {
                results.add(update(classVideoVo));
            } else {
                results.add(add(classVideoVo));
            }
        }

        return results;
    }
}
