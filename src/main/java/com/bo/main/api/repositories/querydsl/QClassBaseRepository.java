package com.bo.main.api.repositories.querydsl;

import com.bo.main.api.controller.vo.req.ReqClassBaseSearchVo;
import com.bo.main.api.controller.vo.req.ReqLecturerSearchVo;
import com.bo.main.api.entities.ClassBaseEntity;
import com.querydsl.core.BooleanBuilder;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
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

        BooleanBuilder booleanBuilder = new BooleanBuilder();

//        if (searchVo.getLctrCd() != null) {
//            booleanBuilder.and(lecturerEntity.lctrCd.like(searchVo.getLctrCd()));
//        }
//
//        if (searchVo.getLctrNm() != null) {
//            booleanBuilder.and(lecturerEntity.lctrNm.like(searchVo.getLctrNm()));
//
//        }

        List<ClassBaseEntity> content = queryFactory.selectFrom(classBaseEntity)
                .where(booleanBuilder)
                .offset(pageable.getOffset())
                .limit(pageable.getPageSize())
                .fetch();

        return new PageImpl<>(content, pageable, content.size());
    }
}
