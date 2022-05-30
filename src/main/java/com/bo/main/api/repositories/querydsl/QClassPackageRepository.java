package com.bo.main.api.repositories.querydsl;

import com.bo.main.api.controller.vo.req.ReqClassBaseSearchVo;
import com.bo.main.api.controller.vo.req.ReqClassPackageSearchVo;
import com.bo.main.api.entities.ClassBaseEntity;
import com.bo.main.api.entities.ClassPackageEntity;
import com.querydsl.core.BooleanBuilder;
import com.querydsl.core.types.dsl.BooleanExpression;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import org.apache.commons.lang3.StringUtils;
import org.mapstruct.ap.shaded.freemarker.template.utility.NumberUtil;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

import java.util.List;

import static com.bo.main.api.entities.QClassBaseEntity.classBaseEntity;
import static com.bo.main.api.entities.QClassPackageEntity.classPackageEntity;

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
public class QClassPackageRepository {
    private final JPAQueryFactory queryFactory;

    public List<ClassPackageEntity> findAll() {
        return queryFactory.selectFrom(classPackageEntity)
                .fetch();
    }

    public Page<ClassPackageEntity> findList(ReqClassPackageSearchVo searchVo, Pageable pageable) {

        List<ClassPackageEntity> content = queryFactory.selectFrom(classPackageEntity)
                .where(eqPackNm(searchVo.getPackNm()),
                        eqPackSeq(searchVo.getPackSeq()),
                        eqpackCd(searchVo.getPackCd()),
                        eqUseYn(searchVo.getUseYn()))
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
}
