package com.bo.main.api.repositories.querydsl;

import com.bo.main.api.controller.vo.req.ReqOrderDetailVo;
import com.bo.main.api.entities.OrderDetailEntity;
import com.querydsl.core.BooleanBuilder;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

import java.util.List;

import static com.bo.main.api.entities.QOrderDetailEntity.orderDetailEntity;

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
public class QOrderDetailRepository {
    private final JPAQueryFactory queryFactory;

    public List<OrderDetailEntity> findAll() {
        return queryFactory.selectFrom(orderDetailEntity)
                .fetch();
    }

    public Page<OrderDetailEntity> findList(ReqOrderDetailVo searchVo, Pageable pageable) {

        BooleanBuilder booleanBuilder = new BooleanBuilder();

//        if (searchVo.getLctrCd() != null) {
//            booleanBuilder.and(lecturerEntity.lctrCd.like(searchVo.getLctrCd()));
//        }
//
//        if (searchVo.getLctrNm() != null) {
//            booleanBuilder.and(lecturerEntity.lctrNm.like(searchVo.getLctrNm()));
//
//        }

        List<OrderDetailEntity> content = queryFactory.selectFrom(orderDetailEntity)
                .where(booleanBuilder)
                .offset(pageable.getOffset())
                .limit(pageable.getPageSize())
                .fetch();

        return new PageImpl<>(content, pageable, content.size());
    }
}
