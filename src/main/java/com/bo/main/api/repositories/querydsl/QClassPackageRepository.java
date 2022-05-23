package com.bo.main.api.repositories.querydsl;

import com.bo.main.api.controller.vo.req.ReqClassBaseSearchVo;
import com.bo.main.api.controller.vo.req.ReqClassPackageSearchVo;
import com.bo.main.api.entities.ClassBaseEntity;
import com.bo.main.api.entities.ClassPackageEntity;
import com.querydsl.core.BooleanBuilder;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

import java.util.List;

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

        BooleanBuilder booleanBuilder = new BooleanBuilder();

//        if (searchVo.getLctrCd() != null) {
//            booleanBuilder.and(lecturerEntity.lctrCd.like(searchVo.getLctrCd()));
//        }
//
//        if (searchVo.getLctrNm() != null) {
//            booleanBuilder.and(lecturerEntity.lctrNm.like(searchVo.getLctrNm()));
//
//        }

        List<ClassPackageEntity> content = queryFactory.selectFrom(classPackageEntity)
                .where(booleanBuilder)
                .offset(pageable.getOffset())
                .limit(pageable.getPageSize())
                .fetch();

        return new PageImpl<>(content, pageable, content.size());
    }
}
