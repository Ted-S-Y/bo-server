package com.bo.main.api.repositories.querydsl;

import com.bo.main.api.controller.vo.req.ReqCouponVo;
import com.bo.main.api.entities.ClassVideoEntity;
import com.bo.main.api.entities.CouponInfoEntity;
import com.bo.main.api.entities.CouponIssueHistoryEntity;
import com.querydsl.core.types.dsl.BooleanExpression;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import org.eclipse.jetty.util.StringUtil;
import org.mapstruct.ap.shaded.freemarker.template.utility.NumberUtil;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import static com.bo.main.api.entities.QMemberEntity.memberEntity;
import static com.bo.main.api.entities.QCouponInfoEntity.couponInfoEntity;
import static com.bo.main.api.entities.QCouponIssueHistoryEntity.couponIssueHistoryEntity;

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
public class QCouponIssueHistoryRepository {
    private final JPAQueryFactory queryFactory;

    public List<CouponIssueHistoryEntity> findAll() {
        return queryFactory.selectFrom(couponIssueHistoryEntity)
                .fetch();
    }

    public Optional<List<CouponIssueHistoryEntity>> findByCpnNo(ReqCouponVo reqCouponVo) {

        List<CouponIssueHistoryEntity> content = queryFactory.selectFrom(couponIssueHistoryEntity)
                .where(eqCpnNo(reqCouponVo.getCpnNo()),
                        eqMbrId(reqCouponVo.getMbrId())
                )
                .fetch();

        return Optional.ofNullable(content);
    }

    private BooleanExpression eqCpnNo(Long cpnNo) {
        if (Objects.isNull(cpnNo)) {
            return null;
        }
        return couponIssueHistoryEntity.couponInfoEntity.cpnNo.eq(cpnNo);
    }

    private BooleanExpression eqMbrId(String mbrId) {
        if (StringUtil.isEmpty(mbrId)) {
            return null;
        }
        return couponIssueHistoryEntity.memberEntity.mbrId.eq(mbrId);
    }
}
