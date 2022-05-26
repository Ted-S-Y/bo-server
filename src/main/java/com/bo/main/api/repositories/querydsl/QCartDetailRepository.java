package com.bo.main.api.repositories.querydsl;

import com.bo.main.api.entities.CartDetailEntity;
import com.querydsl.jpa.impl.JPAQuery;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

import static com.bo.main.api.entities.QCartEntity.cartEntity;
import static com.bo.main.api.entities.QCartDetailEntity.cartDetailEntity;

/**
 * packageName : com.bo.main.api.repositories.querydsl
 * fileName : QCartDetailRepository
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
public class QCartDetailRepository {
    private final JPAQueryFactory queryFactory;

    public List<CartDetailEntity> findAll() {
        return queryFactory.selectFrom(cartDetailEntity)
                .fetch();
    }

    public CartDetailEntity findOne() {
        return queryFactory.selectFrom(cartDetailEntity).join(cartDetailEntity.cartEntity, cartEntity)
                .fetchOne();
    }
}
