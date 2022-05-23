package com.bo.main.api.repositories.querydsl;

import com.bo.main.api.controller.vo.req.ReqAdminSearchVo;
import com.bo.main.api.controller.vo.req.ReqLecturerSearchVo;
import com.bo.main.api.entities.AdminEntity;
import com.bo.main.api.entities.LecturerEntity;
import com.querydsl.core.BooleanBuilder;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

import java.util.List;

import static com.bo.main.api.entities.QLecturerEntity.lecturerEntity;

@RequiredArgsConstructor
@Repository
public class QLecturerRepository {
    private final JPAQueryFactory queryFactory;

    public List<LecturerEntity> findAll() {
        return queryFactory.selectFrom(lecturerEntity)
                .fetch();
    }

    public Page<LecturerEntity> findList(ReqLecturerSearchVo searchVo, Pageable pageable) {

        BooleanBuilder booleanBuilder = new BooleanBuilder();

        if (searchVo.getLctrCd() != null) {
            booleanBuilder.and(lecturerEntity.lctrCd.like(searchVo.getLctrCd()));
        }

        if (searchVo.getLctrNm() != null) {
            booleanBuilder.and(lecturerEntity.lctrNm.like(searchVo.getLctrNm()));

        }

        List<LecturerEntity> content = queryFactory.selectFrom(lecturerEntity)
                .where(booleanBuilder)
                .offset(pageable.getOffset())
                .limit(pageable.getPageSize())
                .fetch();

        return new PageImpl<>(content, pageable, content.size());
    }
}
