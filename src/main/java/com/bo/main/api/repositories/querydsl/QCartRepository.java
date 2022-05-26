package com.bo.main.api.repositories.querydsl;

import com.bo.main.api.controller.vo.req.ReqCartSearchVo;
import com.bo.main.api.entities.CartEntity;
import com.querydsl.core.BooleanBuilder;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import org.apache.commons.lang3.StringUtils;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

import java.util.List;

import static com.bo.main.api.entities.QCartEntity.cartEntity;

/**
 * packageName : com.bo.main.api.repositories.querydsl
 * fileName : QCartRepository
 * author : sbyoon
 * date : 2022-05-23
 * description :
 * ===========================================================
 * DATE AUTHOR  NOTE
 * -----------------------------------------------------------
 * 2022-05-23  sbyoon 최초 생성
 */
@RequiredArgsConstructor
@Repository
public class QCartRepository {
    private final JPAQueryFactory queryFactory;

    public List<CartEntity> findAll() {
        return queryFactory.selectFrom(cartEntity)
                .fetch();
    }


    public Page<CartEntity> findList(ReqCartSearchVo searchVo, Pageable pageable) {

        BooleanBuilder booleanBuilder = new BooleanBuilder();

        if (!StringUtils.isEmpty(searchVo.getCartStat())) {
            booleanBuilder.and(cartEntity.cartStat.eq(searchVo.getCartStat()));
        }

        List<CartEntity> content = queryFactory.selectFrom(cartEntity)
                .where(booleanBuilder)
                .offset(pageable.getOffset())
                .limit(pageable.getPageSize())
                .fetch();

        return new PageImpl<>(content, pageable, content.size());
    }
}
