package com.bo.main.api.repositories.querydsl;

import com.bo.main.api.controller.vo.req.ReqClassBaseSearchVo;
import com.bo.main.api.controller.vo.req.ReqLecturerSearchVo;
import com.bo.main.api.controller.vo.res.ResClassBaseVo;
import com.bo.main.api.entities.ClassBaseEntity;
import com.querydsl.core.BooleanBuilder;
import com.querydsl.core.types.ExpressionUtils;
import com.querydsl.core.types.Projections;
import com.querydsl.core.types.dsl.BooleanExpression;
import com.querydsl.jpa.JPAExpressions;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import org.apache.commons.lang3.StringUtils;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

import java.util.List;

import static com.bo.main.api.entities.QClassBaseEntity.classBaseEntity;
import static com.bo.main.api.entities.QClassVideoEntity.classVideoEntity;
import static com.bo.main.api.entities.QLecturerEntity.lecturerEntity;
import static com.bo.main.api.entities.QLecturerClassEntity.lecturerClassEntity;
import static com.querydsl.core.types.ExpressionUtils.count;


@RequiredArgsConstructor
@Repository
public class QClassBaseRepository {
    private final JPAQueryFactory queryFactory;

    public List<ClassBaseEntity> findAll() {
        return queryFactory.selectFrom(classBaseEntity)
                .fetch();
    }

    public Page<ResClassBaseVo> findList(ReqClassBaseSearchVo searchVo, Pageable pageable) {
        List<ResClassBaseVo> content = queryFactory
                .select(Projections.fields(ResClassBaseVo.class,
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
                .where(eqClssCd(searchVo.getClssCd()),
                        eqClssNm(searchVo.getClssNm()))
                .offset(pageable.getOffset())
                .limit(pageable.getPageSize())
                .fetch();

        return new PageImpl<>(content, pageable, content.size());
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
}
