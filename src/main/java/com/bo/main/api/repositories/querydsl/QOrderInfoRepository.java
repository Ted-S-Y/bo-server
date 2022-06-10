package com.bo.main.api.repositories.querydsl;

import com.bo.main.api.controller.vo.req.ReqOrderInfoSearchVo;
import com.bo.main.api.controller.vo.res.ResOrderInfoVo;
import com.bo.main.api.entities.OrderInfoEntity;
import com.querydsl.core.types.Projections;
import com.querydsl.core.types.dsl.BooleanExpression;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import org.apache.commons.lang3.StringUtils;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Objects;

import static com.bo.main.api.entities.QOrderDetailEntity.orderDetailEntity;
import static com.bo.main.api.entities.QOrderInfoEntity.orderInfoEntity;

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
public class QOrderInfoRepository {
    private final JPAQueryFactory queryFactory;

    public List<OrderInfoEntity> findAll() {
        return queryFactory.selectFrom(orderInfoEntity)
                .fetch();
    }

    public Page<ResOrderInfoVo> findList(ReqOrderInfoSearchVo searchVo, Pageable pageable) {
        List<ResOrderInfoVo> content = queryFactory
                .select(Projections.fields(ResOrderInfoVo.class,
                        orderInfoEntity.ordrNo,
                        orderInfoEntity.ordrAmt,
//                        orderInfoEntity.orderDetailEntity.ordrAmt,
                        orderInfoEntity.orderDetailEntity.ordrCls,
                        orderInfoEntity.ordrStat,
                        orderInfoEntity.pymtDt,
                        orderInfoEntity.cnclDt,
                        orderInfoEntity.rtrnDt,
                        orderInfoEntity.cnclDtlList,
                        orderInfoEntity.cpnDsctAmt,
                        orderInfoEntity.cartEntity.cartNo
                ))
                .from(orderInfoEntity)
                .join(orderInfoEntity.orderDetailEntity, orderDetailEntity)
                .where(eqOrdrCls(searchVo.getOrdrCls()),
                        eqOrdrNo(searchVo.getOrdrNo()),
                        eqOrdrStat(searchVo.getOrdrStat()),
                        betweenPymtDt(searchVo.getStDt(), searchVo.getEdDt()),
                        betweenCnclDt(searchVo.getStDt(), searchVo.getEdDt()),
                        betweenRtrnDt(searchVo.getStDt(), searchVo.getEdDt())
                )
                .offset(pageable.getOffset())
                .limit(pageable.getPageSize())
                .fetch();

        return new PageImpl<>(content, pageable, content.size());
    }

    private BooleanExpression eqOrdrStat(String ordrStat) {
        if (StringUtils.isEmpty(ordrStat)) {
            return null;
        }
        return orderInfoEntity.ordrStat.eq(ordrStat);
    }

    private BooleanExpression eqOrdrCls(String ordrCls) {
        if (StringUtils.isEmpty(ordrCls)) {
            return null;
        }
        return orderInfoEntity.orderDetailEntity.ordrCls.eq(ordrCls);
    }

    private BooleanExpression eqOrdrNo(Long ordrNo) {
        if (Objects.isNull(ordrNo)) {
            return null;
        }
        return orderInfoEntity.ordrNo.eq(ordrNo);
    }

    private BooleanExpression betweenPymtDt(String stDt, String edDt) {
        if (StringUtils.isEmpty(stDt) || StringUtils.isEmpty(edDt) ) {
            return null;
        }

        return orderInfoEntity.pymtDt.between(stDt, edDt);
    }

    private BooleanExpression betweenCnclDt(String stDt, String edDt) {
        if (StringUtils.isEmpty(stDt) || StringUtils.isEmpty(edDt) ) {
            return null;
        }

        return orderInfoEntity.cnclDt.between(stDt, edDt);
    }

    private BooleanExpression betweenRtrnDt(String stDt, String edDt) {
        if (StringUtils.isEmpty(stDt) || StringUtils.isEmpty(edDt) ) {
            return null;
        }

        return orderInfoEntity.rtrnDt.between(stDt, edDt);
    }
}
