package com.bo.main.api.repositories.querydsl;

import com.bo.main.api.controller.vo.req.ReqAdminSearchVo;
import com.bo.main.api.entities.AdminEntity;
import com.querydsl.core.BooleanBuilder;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

import java.util.List;

import static com.bo.main.api.entities.QAdminEntity.adminEntity;

@RequiredArgsConstructor
@Repository
public class QAdminRepository<QAdminEntity> {
    private final JPAQueryFactory queryFactory;

    public List<AdminEntity> findAll() {
        return queryFactory.selectFrom(adminEntity)
                .fetch();
    }

    public Page<AdminEntity> findList(ReqAdminSearchVo searchVo, Pageable pageable) {

        BooleanBuilder booleanBuilder = new BooleanBuilder();

        if (searchVo.getAdmId() != null) {
            booleanBuilder.and(adminEntity.admId.like(searchVo.getAdmId()));
        }

        if (searchVo.getAdmNm() != null) {
            booleanBuilder.and(adminEntity.admNm.like(searchVo.getAdmNm()));
        }

        if (searchVo.getAdmMobl() != null) {
            booleanBuilder.and(adminEntity.admMobl.like(searchVo.getAdmMobl()));
        }

        if (searchVo.getAdmMail() != null) {
            booleanBuilder.and(adminEntity.admMail.like(searchVo.getAdmMail()));
        }

        List<AdminEntity> content = queryFactory.selectFrom(adminEntity)
                .where(booleanBuilder)
                .offset(pageable.getOffset())
                .limit(pageable.getPageSize())
                .fetch();

        return new PageImpl<>(content, pageable, content.size());
    }
}
