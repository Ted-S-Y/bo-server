package com.bo.main.api.service;

import com.bo.main.api.entities.ClassPackageDetailEntity;
import com.bo.main.api.entities.MemberDeviceEntity;
import com.bo.main.api.entities.converts.MemberDeviceMapper;
import com.bo.main.api.entities.vo.ClassPackageDetailVo;
import com.bo.main.api.entities.vo.MemberDeviceVo;
import com.bo.main.api.entities.vo.MemberVo;
import com.bo.main.api.repositories.jpa.MemberDeviceRepository;
import com.bo.main.api.repositories.querydsl.QMemberDeviceRepository;
import com.bo.main.core.util.StringUtils;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * packageName : com.bo.main.api.service
 * fileName : MemberDeviceService
 * author : sbyoon
 * date : 2022-05-16
 * description :
 * ===========================================================
 * DATE AUTHOR  NOTE
 * -----------------------------------------------------------
 * 2022-05-16  sbyoon 최초 생성
 */
@Service
@Transactional
@Slf4j
@RequiredArgsConstructor
public class MemberDeviceService {
    private final QMemberDeviceRepository qMemberDeviceRepository;
    private final MemberDeviceRepository memberDeviceRepository;
    private final MemberDeviceMapper memberDeviceMapper;


    public Optional<MemberDeviceEntity> findMemberDeviceById(long dvSeq) {
        return memberDeviceRepository.findById(dvSeq);
    }

    public MemberDeviceVo findClassBaseByIdRetError(long dvSeq) throws Exception{
        Optional<MemberDeviceEntity> opt = findMemberDeviceById(dvSeq);
        return memberDeviceMapper.toVo(opt.orElseThrow(() -> new Exception(StringUtils.message("등록된 Device 정보({})가 없습니다.", dvSeq+""))));
    }

    public List<MemberDeviceVo> findList(MemberDeviceVo memberDeviceVo) throws Exception {

        Optional<List<MemberDeviceEntity>> opt = qMemberDeviceRepository.findList(memberDeviceVo);

        return memberDeviceMapper.toVos(opt.orElseThrow(() -> new Exception(StringUtils.message("등록된 Device 정보({})가 없습니다.", memberDeviceVo.getDvSeq()+""))));
    }

//    public MemberDeviceVo update(MemberDeviceVo memberDeviceVo) throws Exception {
//
//        Optional<MemberDeviceEntity> opt = findMemberDeviceById(memberDeviceVo.getDvSeq());
//
//        MemberDeviceEntity loadMemberDevice = opt.orElseGet(MemberDeviceEntity::new);
//        memberDeviceMapper.updateFromVo(memberDeviceVo, loadMemberDevice);
//
//        return memberDeviceMapper.toVo(memberDeviceRepository.save(loadMemberDevice));
//    }
//
//
//    public MemberDeviceVo add(MemberDeviceVo memberDeviceVo) throws Exception {
//
//        MemberDeviceEntity loadMemberDevice = new MemberDeviceEntity();
//        memberDeviceMapper.updateFromVo(memberDeviceVo, loadMemberDevice);
//
//        return memberDeviceMapper.toVo(memberDeviceRepository.save(loadMemberDevice));
//    }
//
//    @Transactional
//    public List<MemberDeviceVo> bulkAdds(MemberVo memberVo, List<MemberDeviceVo> memberDevices) throws Exception {
//        List<MemberDeviceVo> results = new ArrayList<>();
//
//        for (MemberDeviceVo memberDeviceVo: memberDevices) {
//            memberDeviceVo.setMbrSeq(memberVo.getMbrSeq());
//            results.add(add(memberDeviceVo));
//        }
//
//        return results;
//    }
//
//    @Transactional
//    public List<MemberDeviceVo> bulkUpdates(MemberVo memberVo, List<MemberDeviceVo> memberDevices) throws Exception {
//        List<MemberDeviceVo> results = new ArrayList<>();
//
//        for (MemberDeviceVo memberDeviceVo: memberDevices) {
//            memberDeviceVo.setMbrSeq(memberVo.getMbrSeq());
//
//            if (memberDeviceVo.getMbrSeq() != null) {
//                results.add(update(memberDeviceVo));
//            } else {
//                results.add(add(memberDeviceVo));
//            }
//        }
//
//        return results;
//    }
}
