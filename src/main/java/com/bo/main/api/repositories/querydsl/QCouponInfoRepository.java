package com.bo.main.api.repositories.querydsl;

import com.bo.main.api.controller.vo.req.ReqCouponSearchVo;
import com.bo.main.api.controller.vo.req.ReqCouponVo;
import com.bo.main.api.controller.vo.res.ResClassManageVo;
import com.bo.main.api.controller.vo.res.ResCouponVo;
import com.bo.main.api.entities.CouponInfoEntity;
import com.querydsl.core.types.ConstantImpl;
import com.querydsl.core.types.dsl.BooleanExpression;
import com.querydsl.core.types.dsl.Expressions;
import com.querydsl.core.types.dsl.StringTemplate;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import org.apache.commons.lang3.StringUtils;
import org.eclipse.jetty.util.StringUtil;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

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
public class QCouponInfoRepository {
    private final JPAQueryFactory queryFactory;

    public List<CouponInfoEntity> findAll() {
        return queryFactory.selectFrom(couponInfoEntity)
                .fetch();
    }

    public Optional<CouponInfoEntity> findOne(ReqCouponVo reqCouponVo) {

        CouponInfoEntity content = queryFactory.selectFrom(couponInfoEntity)
                .join(couponInfoEntity.couponIssueHistoryEntityList, couponIssueHistoryEntity)
                .where(eqCpnNo(reqCouponVo.getCpnNo()),
                        eqIssueTyp(reqCouponVo.getIssueTyp()),
                        eqCpnNm(reqCouponVo.getCpnNm()),
                        eqIssueSppdYn(reqCouponVo.getIssueSppdYn()),
                        eqCpnNo(reqCouponVo.getCpnNo())
                )
                .fetchOne();

        return Optional.ofNullable(content);
    }

    public Page<CouponInfoEntity> findList(ReqCouponSearchVo searchVo, Pageable pageable) {

        List<CouponInfoEntity> content = queryFactory.selectFrom(couponInfoEntity)
                .where(eqCpnNo(searchVo.getCpnNo()),
                        eqIssueTyp(searchVo.getIssueTyp()),
                        eqCpnNm(searchVo.getCpnNm()),
                        eqIssueSppdYn(searchVo.getIssueSppdYn()),
                        eqCpnNo(searchVo.getCpnNo()),
                        betweenIssueEdDtm(searchVo.getIssueEdStDt(), searchVo.getIssueEdEdDt()),
                        betweenIssueStDtm(searchVo.getIssueStStDt(), searchVo.getIssueStEdDt())
                )
                .offset(pageable.getOffset())
                .limit(pageable.getPageSize())
                .fetch();

        return new PageImpl<>(content, pageable, content.size());
    }

    private BooleanExpression eqCpnNo(Long cpnNo) {
        if (Objects.isNull(cpnNo)) {
            return null;
        }
        return couponInfoEntity.cpnNo.eq(cpnNo);
    }

    private BooleanExpression eqIssueTyp(String issueTyp) {
        if (StringUtil.isEmpty(issueTyp)) {
            return null;
        }
        return couponInfoEntity.issueTyp.eq(issueTyp);
    }

   private BooleanExpression eqCpnNm(String cpnNm) {
        if (StringUtil.isEmpty(cpnNm)) {
            return null;
        }
        return couponInfoEntity.cpnNm.eq(cpnNm);
    }

    private BooleanExpression betweenIssueStDtm(String stDt, String edDt) {
        if (StringUtils.isEmpty(stDt) || StringUtils.isEmpty(edDt) ) {
            return null;
        }

        StringTemplate formattedDate = Expressions.stringTemplate(
                "DATE_FORMAT({0}, {1})"
                , couponInfoEntity.issueStDtm
                , ConstantImpl.create("%Y-%m-%d"));

        return formattedDate.between(stDt, edDt);
    }

    private BooleanExpression betweenIssueEdDtm(String stDt, String edDt) {
        if (StringUtils.isEmpty(stDt) || StringUtils.isEmpty(edDt) ) {
            return null;
        }

        StringTemplate formattedDate = Expressions.stringTemplate(
                "DATE_FORMAT({0}, {1})"
                , couponInfoEntity.issueEdDtm
                , ConstantImpl.create("%Y-%m-%d"));

        return formattedDate.between(stDt, edDt);
    }

    private BooleanExpression eqIssueSppdYn(String issueSppdYn) {
        if (StringUtil.isEmpty(issueSppdYn)) {
            return null;
        }
        return couponInfoEntity.issueSppdYn.eq(issueSppdYn);
    }
}
