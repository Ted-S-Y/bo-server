package com.bo.main.api.repositories.querydsl;

import com.bo.main.api.entities.CouponInfoEntity;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

import static com.bo.main.api.entities.QCouponInfoEntity.couponInfoEntity;

/**
 * packageName : com.bo.main.api.repositories.querydsl
 * fileName : QCouponInfoRepository
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
public class QCouponInfoRepository {
    private final JPAQueryFactory queryFactory;

    public List<CouponInfoEntity> findAll() {
        return queryFactory.selectFrom(couponInfoEntity)
                .fetch();
    }
}
