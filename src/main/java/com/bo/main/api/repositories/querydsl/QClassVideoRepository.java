package com.bo.main.api.repositories.querydsl;

import com.bo.main.api.controller.vo.req.ReqClassVideoSearchVo;
import com.bo.main.api.entities.ClassVideoEntity;
import com.querydsl.core.BooleanBuilder;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

import java.util.List;

import static com.bo.main.api.entities.QClassVideoEntity.classVideoEntity;

@RequiredArgsConstructor
@Repository
public class QClassVideoRepository {
    private final JPAQueryFactory queryFactory;

    public List<ClassVideoEntity> findAll() {
        return queryFactory.selectFrom(classVideoEntity)
                .fetch();
    }

    public Page<ClassVideoEntity> findList(ReqClassVideoSearchVo searchVo, Pageable pageable) {

        BooleanBuilder booleanBuilder = new BooleanBuilder();

//        if (searchVo.getLctrCd() != null) {
//            booleanBuilder.and(lecturerEntity.lctrCd.like(searchVo.getLctrCd()));
//        }
//
//        if (searchVo.getLctrNm() != null) {
//            booleanBuilder.and(lecturerEntity.lctrNm.like(searchVo.getLctrNm()));
//
//        }

        List<ClassVideoEntity> content = queryFactory.selectFrom(classVideoEntity)
                .where(booleanBuilder)
                .offset(pageable.getOffset())
                .limit(pageable.getPageSize())
                .fetch();

        return new PageImpl<>(content, pageable, content.size());
    }
}
