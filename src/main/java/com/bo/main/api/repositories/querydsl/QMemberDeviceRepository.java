package com.bo.main.api.repositories.querydsl;

import com.bo.main.api.controller.vo.req.ReqMemberDeviceSearchVo;
import com.bo.main.api.controller.vo.req.ReqMemberSearchVo;
import com.bo.main.api.entities.MemberDeviceEntity;
import com.bo.main.api.entities.MemberEntity;
import com.querydsl.core.BooleanBuilder;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

import java.util.List;

import static com.bo.main.api.entities.QMemberDeviceEntity.memberDeviceEntity;

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
public class QMemberDeviceRepository {
    private final JPAQueryFactory queryFactory;

    public List<MemberDeviceEntity> findAll() {
        return queryFactory.selectFrom(memberDeviceEntity)
                .fetch();
    }

    public Page<MemberDeviceEntity> findList(ReqMemberDeviceSearchVo searchVo, Pageable pageable) {

        BooleanBuilder booleanBuilder = new BooleanBuilder();

//        if (searchVo.getLctrCd() != null) {
//            booleanBuilder.and(lecturerEntity.lctrCd.like(searchVo.getLctrCd()));
//        }
//
//        if (searchVo.getLctrNm() != null) {
//            booleanBuilder.and(lecturerEntity.lctrNm.like(searchVo.getLctrNm()));
//
//        }

        List<MemberDeviceEntity> content = queryFactory.selectFrom(memberDeviceEntity)
                .where(booleanBuilder)
                .offset(pageable.getOffset())
                .limit(pageable.getPageSize())
                .fetch();

        return new PageImpl<>(content, pageable, content.size());
    }
}
