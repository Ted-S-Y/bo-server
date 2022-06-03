package com.bo.main.api.repositories.querydsl;

import com.bo.main.api.controller.vo.req.ReqClassManageSearchVo;
import com.bo.main.api.controller.vo.req.ReqClassManageVo;
import com.bo.main.api.controller.vo.res.ResClassManageVo;
import com.bo.main.api.entities.ClassBaseEntity;
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
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import static com.bo.main.api.entities.QClassBaseEntity.classBaseEntity;
import static com.bo.main.api.entities.QClassVideoEntity.classVideoEntity;
import static com.bo.main.api.entities.QLecturerEntity.lecturerEntity;
import static com.bo.main.api.entities.QLecturerClassEntity.lecturerClassEntity;
import static com.querydsl.core.types.ExpressionUtils.count;


@RequiredArgsConstructor
@Repository
public class QClassManageRepository {
    private final JPAQueryFactory queryFactory;

    public List<ClassBaseEntity> findAll() {
        return queryFactory.selectFrom(classBaseEntity)
                .fetch();
    }

    public Page<ResClassManageVo> findList(ReqClassManageSearchVo searchVo, Pageable pageable) {
        List<ResClassManageVo> content = queryFactory
                .select(Projections.fields(ResClassManageVo.class,
                        classBaseEntity.clssCd,
                        classBaseEntity.clssSeq,
                        classBaseEntity.prvYn,
                        lecturerEntity.lctrNm,
                        ExpressionUtils.as(
                                JPAExpressions.select(count(classVideoEntity.vdSeq))
                                        .from(classVideoEntity)
                                        .where(classVideoEntity.classBaseEntity.eq(classBaseEntity)),
                                "vdCnt"),
                        classBaseEntity.crtDtm,
                        classBaseEntity.useYn
                        ))
                .from(classBaseEntity)
                .join(classBaseEntity.lecturerClassEntityList, lecturerClassEntity)
                .join(lecturerClassEntity.lecturerEntity, lecturerEntity)
                .where(likeClssCd(searchVo.getClssCd()),
                        likeClssNm(searchVo.getClssNm()),
                        likeLctrNm(searchVo.getLctrNm()),
                        betweenCrtDtm(searchVo.getStDt(), searchVo.getEdDt())
                )
                .offset(pageable.getOffset())
                .limit(pageable.getPageSize())
                .fetch();

        return new PageImpl<>(content, pageable, content.size());
    }

    public Optional<ResClassManageVo> findOne(ReqClassManageVo reqClassManageVo) {
        ResClassManageVo content = queryFactory
                .select(Projections.fields(ResClassManageVo.class,
                        classBaseEntity.clssCd,
                        classBaseEntity.clssSeq,
                        classBaseEntity.clssDesc,
                        classBaseEntity.prvYn,
                        classBaseEntity.crtDtm,
                        classBaseEntity.useYn
                ))
                .from(classBaseEntity)
                .where(eqClssSeq(reqClassManageVo.getClssSeq())
                )
                .fetchOne();

        return Optional.ofNullable(content);
    }

//    public Page<ClassBaseEntity> findList(ReqClassBaseSearchVo searchVo, Pageable pageable) {
//
//        List<ClassBaseEntity> content = queryFactory.selectFrom(classBaseEntity)
//                .where(eqClssCd(searchVo.getClssCd()),
//                        eqClssNm(searchVo.getClssNm()))
//                .offset(pageable.getOffset())
//                .limit(pageable.getPageSize())
//                .fetch();
//
//        return new PageImpl<>(content, pageable, content.size());
//    }
    private BooleanExpression eqClssSeq(Long clssSeq) {
        if (Objects.isNull(clssSeq)) {
            return null;
        }
        return classBaseEntity.clssSeq.eq(clssSeq);
    }

    private BooleanExpression eqClssCd(String clssCd) {
        if (StringUtils.isEmpty(clssCd)) {
            return null;
        }
        return classBaseEntity.clssCd.eq(clssCd);
    }

    private BooleanExpression eqClssNm(String clssNm) {
        if (StringUtils.isEmpty(clssNm)) {
            return null;
        }
        return classBaseEntity.clssNm.eq(clssNm);
    }

    private BooleanExpression eqLctrNm(String lctrNm) {
        if (StringUtils.isEmpty(lctrNm)) {
            return null;
        }
        return lecturerEntity.lctrNm.eq(lctrNm);
    }

    private BooleanExpression likeClssCd(String clssCd) {
        if (StringUtils.isEmpty(clssCd)) {
            return null;
        }
        return classBaseEntity.clssCd.contains(clssCd);
    }

    private BooleanExpression likeClssNm(String clssNm) {
        if (StringUtils.isEmpty(clssNm)) {
            return null;
        }
        return classBaseEntity.clssNm.contains(clssNm);
    }

    private BooleanExpression likeLctrNm(String lctrNm) {
        if (StringUtils.isEmpty(lctrNm)) {
            return null;
        }
        return lecturerEntity.lctrNm.contains(lctrNm);
    }

    private BooleanExpression betweenCrtDtm(String stDt, String edDt) {
        if (StringUtils.isEmpty(stDt) || StringUtils.isEmpty(edDt) ) {
            return null;
        }

        StringTemplate formattedDate = Expressions.stringTemplate(
                "DATE_FORMAT({0}, {1})"
                , classBaseEntity.crtDtm
                , ConstantImpl.create("%Y-%m-%d"));

        return formattedDate.between(stDt, edDt);
    }
}
