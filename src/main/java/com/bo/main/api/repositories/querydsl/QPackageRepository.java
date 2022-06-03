package com.bo.main.api.repositories.querydsl;

import com.bo.main.api.controller.vo.req.ReqPackageSearchVo;
import com.bo.main.api.controller.vo.res.ResPackageVo;
import com.bo.main.api.entities.ClassPackageEntity;
import com.querydsl.core.types.ConstantImpl;
import com.querydsl.core.types.ExpressionUtils;
import com.querydsl.core.types.Projections;
import com.querydsl.core.types.dsl.BooleanExpression;
import com.querydsl.core.types.dsl.Expressions;
import com.querydsl.core.types.dsl.StringTemplate;
import com.querydsl.jpa.JPAExpressions;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import org.apache.commons.lang3.StringUtils;
import org.mapstruct.ap.shaded.freemarker.template.utility.NumberUtil;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

import java.util.List;

import static com.bo.main.api.entities.QClassPackageEntity.classPackageEntity;
import static com.bo.main.api.entities.QClassPackageDetailEntity.classPackageDetailEntity;
import static com.bo.main.api.entities.QClassBaseEntity.classBaseEntity;
import static com.bo.main.api.entities.QCategoryEntity.categoryEntity;

import static com.querydsl.core.types.ExpressionUtils.count;


/**
 * packageName : com.bo.main.api.repositories.querydsl
 * fileName : QClassPackageRepository
 * author : sbyoon
 * date : 2022-05-13
 * description :
 * ===========================================================
 * DATE AUTHOR  NOTE
 * -----------------------------------------------------------
 * 2022-05-13  sbyoon 최초 생성
 */

@RequiredArgsConstructor
@Repository
public class QPackageRepository {
    private final JPAQueryFactory queryFactory;

    public List<ClassPackageEntity> findAll() {
        return queryFactory.selectFrom(classPackageEntity)
                .fetch();
    }

    public Page<ResPackageVo> findList(ReqPackageSearchVo searchVo, Pageable pageable) {

        List<ResPackageVo> content = queryFactory
                .select(Projections.fields(ResPackageVo.class,
                        classPackageEntity.packCd,
                        classPackageEntity.packSeq,
                        classPackageEntity.packNm,
                        classPackageEntity.prc,
                        classPackageEntity.useYn,
                        classPackageEntity.crtDtm,
                        ExpressionUtils.as(
                                JPAExpressions.select(count(classBaseEntity.clssSeq))
                                        .from(classBaseEntity)
                                        .where(classBaseEntity.eq(classPackageDetailEntity.classBaseEntity)),
                                "clssCnt"),
                        classPackageEntity.categoryEntity.ctgrId,
                        classPackageEntity.categoryEntity.ctgrTyp,
                        classPackageEntity.categoryEntity.ctgrNm
                        ))
                .from(classPackageEntity)
                .join(classPackageEntity.classPackageDetailEntityList, classPackageDetailEntity)
                .join(classPackageEntity.categoryEntity, categoryEntity)
                .where(eqPackNm(searchVo.getPackNm()),
                        eqpackCd(searchVo.getPackCd()),
                        eqUseYn(searchVo.getUseYn()),
                        betweenCrtDtm(searchVo.getStDt(), searchVo.getEdDt())
                )
                .offset(pageable.getOffset())
                .limit(pageable.getPageSize())
                .fetch();

        return new PageImpl<>(content, pageable, content.size());
    }

    private BooleanExpression eqPackNm(String packNm) {
        if (StringUtils.isEmpty(packNm)) {
            return null;
        }
        return classPackageEntity.packNm.eq(packNm);
    }

    private BooleanExpression eqUseYn(String useYn) {
        if (StringUtils.isEmpty(useYn)) {
            return null;
        }
        return classPackageEntity.useYn.eq(useYn);
    }

    private BooleanExpression eqpackCd(String packCd) {
        if (StringUtils.isEmpty(packCd)) {
            return null;
        }
        return classPackageEntity.packCd.eq(packCd);
    }

    private BooleanExpression eqPackSeq(Long packSeq) {
        if (NumberUtil.isNaN(packSeq)) {
            return null;
        }
        return classPackageEntity.packSeq.eq(packSeq);
    }


    private BooleanExpression betweenCrtDtm(String stDt, String edDt) {
        if (StringUtils.isEmpty(stDt) || StringUtils.isEmpty(edDt) ) {
            return null;
        }

        StringTemplate formattedDate = Expressions.stringTemplate(
                "DATE_FORMAT({0}, {1})"
                , classPackageEntity.crtDtm
                , ConstantImpl.create("%Y-%m-%d"));

        return formattedDate.between(stDt, edDt);
    }
}
