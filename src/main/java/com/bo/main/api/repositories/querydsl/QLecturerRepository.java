package com.bo.main.api.repositories.querydsl;

import com.bo.main.api.controller.vo.req.ReqLecturerSearchVo;
import com.bo.main.api.entities.LecturerEntity;
import com.querydsl.core.types.dsl.BooleanExpression;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import org.apache.commons.lang3.StringUtils;
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
        List<LecturerEntity> content = queryFactory.selectFrom(lecturerEntity)
                .where(likeLctrCd(searchVo.getLctrCd()),
                        likeLctrNm(searchVo.getLctrNm()))
                .offset(pageable.getOffset())
                .limit(pageable.getPageSize())
                .fetch();

        return new PageImpl<>(content, pageable, content.size());
    }

    private BooleanExpression likeLctrCd(String lctrCd) {
        if (StringUtils.isEmpty(lctrCd)) {
            return null;
        }
        return lecturerEntity.lctrCd.contains(lctrCd);
    }

    private BooleanExpression likeLctrNm(String lctrNm) {
        if (StringUtils.isEmpty(lctrNm)) {
            return null;
        }
        return lecturerEntity.lctrNm.contains(lctrNm);
    }
}
