package com.bo.main.api.repositories.querydsl;

import com.bo.main.api.controller.vo.req.ReqMemberSearchVo;
import com.bo.main.api.entities.MemberEntity;
import com.querydsl.core.BooleanBuilder;
import com.querydsl.core.types.dsl.BooleanExpression;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import org.apache.commons.lang3.StringUtils;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

import java.util.List;

import static com.bo.main.api.entities.QLecturerEntity.lecturerEntity;
import static com.bo.main.api.entities.QMemberEntity.memberEntity;

/**
 * packageName : com.bo.main.api.repositories.querydsl
 * fileName : QMemberRepository
 * author : sbyoon
 * date : 2022-05-16
 * description :
 * ===========================================================
 * DATE AUTHOR  NOTE
 * -----------------------------------------------------------
 * 2022-05-16  sbyoon 최초 생성
 */
@RequiredArgsConstructor
@Repository
public class QMemberRepository {
    private final JPAQueryFactory queryFactory;

    public List<MemberEntity> findAll() {
        return queryFactory.selectFrom(memberEntity)
                .fetch();
    }

    public Page<MemberEntity> findList(ReqMemberSearchVo searchVo, Pageable pageable) {

        List<MemberEntity> content = queryFactory.selectFrom(memberEntity)
                .where(likeMbrId(searchVo.getMbrId()),
                        eqMail(searchVo.getMail()),
                        eqMobl(searchVo.getMobl()),
                        likeMbrNm(searchVo.getMbrNm())
                )
                .offset(pageable.getOffset())
                .limit(pageable.getPageSize())
                .fetch();

        return new PageImpl<>(content, pageable, content.size());
    }

    private BooleanExpression likeMbrId(String mbrId) {
        if (StringUtils.isEmpty(mbrId)) {
            return null;
        }
        return memberEntity.mbrId.like(mbrId);
    }

    private BooleanExpression likeMbrNm(String mbrNm) {
        if (StringUtils.isEmpty(mbrNm)) {
            return null;
        }
        return memberEntity.mbrNm.contains(mbrNm);
    }

    private BooleanExpression eqMobl(String mobl) {
        if (StringUtils.isEmpty(mobl)) {
            return null;
        }
        return memberEntity.mobl.contains(mobl);
    }

    private BooleanExpression eqMail(String mail) {
        if (StringUtils.isEmpty(mail)) {
            return null;
        }
        return memberEntity.mobl.contains(mail);
    }

    private BooleanExpression eqSspdYn(String sspdYn) {
        if (StringUtils.isEmpty(sspdYn)) {
            return null;
        }
        return memberEntity.sspdYn.contains(sspdYn);
    }

    private BooleanExpression eqSlprYn(String slprYn) {
        if (StringUtils.isEmpty(slprYn)) {
            return null;
        }
        return memberEntity.sspdYn.contains(slprYn);
    }
}
