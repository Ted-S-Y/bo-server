package com.bo.main.api.repositories.querydsl;

import com.bo.main.api.controller.vo.req.ReqClassBaseSearchVo;
import com.bo.main.api.controller.vo.req.ReqLecturerSearchVo;
import com.bo.main.api.entities.ClassBaseEntity;
import com.querydsl.core.BooleanBuilder;
import com.querydsl.core.types.dsl.BooleanExpression;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import org.apache.commons.lang3.StringUtils;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

import java.util.List;

import static com.bo.main.api.entities.QClassBaseEntity.classBaseEntity;

@RequiredArgsConstructor
@Repository
public class QClassBaseRepository {
    private final JPAQueryFactory queryFactory;

    public List<ClassBaseEntity> findAll() {
        return queryFactory.selectFrom(classBaseEntity)
                .fetch();
    }

    public Page<ClassBaseEntity> findList(ReqClassBaseSearchVo searchVo, Pageable pageable) {

        List<ClassBaseEntity> content = queryFactory.selectFrom(classBaseEntity)
                .where(eqClssCd(searchVo.getClssCd()),
                        eqClssNm(searchVo.getClssNm()))
                .offset(pageable.getOffset())
                .limit(pageable.getPageSize())
                .fetch();

        return new PageImpl<>(content, pageable, content.size());
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
}
