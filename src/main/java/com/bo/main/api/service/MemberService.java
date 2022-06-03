package com.bo.main.api.service;

import com.bo.main.api.controller.vo.req.ReqAdminSearchVo;
import com.bo.main.api.controller.vo.req.ReqMemberSearchVo;
import com.bo.main.api.entities.AdminEntity;
import com.bo.main.api.entities.MemberEntity;
import com.bo.main.api.entities.converts.MemberMapper;
import com.bo.main.api.entities.vo.AdminVo;
import com.bo.main.api.entities.vo.ClassBaseVo;
import com.bo.main.api.entities.vo.MemberVo;
import com.bo.main.api.repositories.jpa.MemberRepository;
import com.bo.main.api.repositories.querydsl.QMemberRepository;
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
 * packageName : com.bo.main.api.service
 * fileName : MemberService
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
public class MemberService {
    private final QMemberRepository qMemberRepository;
    private final MemberRepository memberRepository;

    private final MemberMapper memberMapper;

    private final MemberDeviceService memberDeviceService;

    public Optional<MemberEntity> findByMbrId(String mbrId) {
        return memberRepository.findByMbrId(mbrId);
    }

    public MemberVo findByMbrIdRetError(String mbrId) throws Exception{
        Optional<MemberEntity> opt = findByMbrId(mbrId);
        return memberMapper.toVo(opt.orElseThrow(() -> new Exception(StringUtils.message("등록된 Member 정보({})가 없습니다.", mbrId))));
    }
    
    public Page<MemberVo> search(ReqMemberSearchVo searchVo, Pageable pageable) throws Exception {
        Page<MemberEntity> memberEntityPage = qMemberRepository.findList(searchVo, pageable);
        return new PageImpl<>(memberMapper.toVos(memberEntityPage.getContent()), pageable, memberEntityPage.getTotalElements());
    }
    
    public MemberVo update(MemberVo updateMemberVo) throws Exception {

        Optional<MemberEntity> opt = findByMbrId(updateMemberVo.getMbrId());

        MemberEntity loadMember = opt.orElseThrow(() -> new Exception(StringUtils.message("등록된 Member 정보({})가 없습니다.", updateMemberVo.getMbrId())));
        memberMapper.updateFromVo(updateMemberVo, loadMember);

        MemberVo memberVo = memberMapper.toVo(memberRepository.save(loadMember));
        memberVo.setDevices(memberDeviceService.bulkUpdates(memberVo, updateMemberVo.getDevices()));;

        return memberVo;
    }
}
