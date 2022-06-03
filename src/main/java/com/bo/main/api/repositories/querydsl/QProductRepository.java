package com.bo.main.api.repositories.querydsl;

import com.bo.main.api.controller.vo.req.ReqProductSearchVo;
import com.bo.main.api.controller.vo.res.ResProductVo;
import com.querydsl.core.types.ConstantImpl;
import com.querydsl.core.types.Projections;
import com.querydsl.core.types.dsl.BooleanExpression;
import com.querydsl.core.types.dsl.Expressions;
import com.querydsl.core.types.dsl.StringTemplate;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import org.apache.commons.lang3.StringUtils;
import org.mapstruct.ap.shaded.freemarker.template.utility.NumberUtil;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

import java.util.List;

import static com.bo.main.api.entities.QSalesProductEntity.salesProductEntity;

/**
 * packageName : com.bo.main.api.repositories.querydsl
 * fileName : QProductRepository
 * author : sbyoon
 * date : 2022-06-03
 * description :
 * ===========================================================
 * DATE AUTHOR  NOTE
 * -----------------------------------------------------------
 * 2022-06-03  sbyoon 최초 생성
 */
@RequiredArgsConstructor
@Repository
public class QProductRepository {
    private final JPAQueryFactory queryFactory;

    public Page<ResProductVo> findList(ReqProductSearchVo searchVo, Pageable pageable) {

        List<ResProductVo> content = queryFactory
                .select(Projections.fields(ResProductVo.class,
                        salesProductEntity.ctgrId,
                        salesProductEntity.slsPrdtSeq,
                        salesProductEntity.prdtNm,
                        salesProductEntity.shipCls,
                        salesProductEntity.slsCost,
                        salesProductEntity.slsPrc,
                        salesProductEntity.slsStat,
                        salesProductEntity.crtDtm
                ))
                .from(salesProductEntity)
                .where(eqShipCls(searchVo.getShipCls()),
                        eqSlsStat(searchVo.getSlsStat()),
                        eqSlsPrdtSeq(searchVo.getSlsPrdtSeq()),
                        eqPrdtNm(searchVo.getPrdtNm()),
                        betweenCrtDtm(searchVo.getStDt(), searchVo.getEdDt())
                )
                .offset(pageable.getOffset())
                .limit(pageable.getPageSize())
                .fetch();

        return new PageImpl<>(content, pageable, content.size());
    }

    private BooleanExpression eqShipCls(String shipCls) {
        if (StringUtils.isEmpty(shipCls)) {
            return null;
        }
        return salesProductEntity.shipCls.eq(shipCls);
    }

    private BooleanExpression eqPrdtNm(String prdtNm) {
        if (StringUtils.isEmpty(prdtNm)) {
            return null;
        }
        return salesProductEntity.slsStat.eq(prdtNm);
    }

    private BooleanExpression eqSlsStat(String slsStat) {
        if (StringUtils.isEmpty(slsStat)) {
            return null;
        }
        return salesProductEntity.slsStat.eq(slsStat);
    }

    private BooleanExpression eqSlsPrdtSeq(Long slsPrdtSeq) {
        if (NumberUtil.isNaN(slsPrdtSeq)) {
            return null;
        }
        return salesProductEntity.slsPrdtSeq.eq(slsPrdtSeq);
    }
    
    private BooleanExpression eqCtgrId(Long ctgrId) {
        if (NumberUtil.isNaN(ctgrId)) {
            return null;
        }
        return salesProductEntity.ctgrId.eq(ctgrId);
    }

    private BooleanExpression betweenCrtDtm(String stDt, String edDt) {
        if (StringUtils.isEmpty(stDt) || StringUtils.isEmpty(edDt) ) {
            return null;
        }

        StringTemplate formattedDate = Expressions.stringTemplate(
                "DATE_FORMAT({0}, {1})"
                , salesProductEntity.crtDtm
                , ConstantImpl.create("%Y-%m-%d"));

        return formattedDate.between(stDt, edDt);
    }
}
