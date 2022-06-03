package com.bo.main.api.repositories.querydsl;

import com.bo.main.api.controller.vo.req.ReqClassVideoSearchVo;
import com.bo.main.api.entities.ClassVideoEntity;
import com.bo.main.api.entities.vo.ClassVideoVo;
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
import org.springframework.util.NumberUtils;

import java.util.List;
import java.util.Optional;

import static com.bo.main.api.entities.QClassBaseEntity.classBaseEntity;
import static com.bo.main.api.entities.QClassVideoEntity.classVideoEntity;

@RequiredArgsConstructor
@Repository
public class QClassVideoRepository {
    private final JPAQueryFactory queryFactory;

    public Optional<List<ClassVideoEntity>> findByClssSeq(long clssSeq) {

        List<ClassVideoEntity> content = queryFactory.selectFrom(classVideoEntity)
                .where(eqClssSeq(clssSeq))
                .fetch();

        return Optional.ofNullable(content);
    }

    private BooleanExpression eqClssSeq(Long clssSeq) {
        if (NumberUtil.isNaN(clssSeq)) {
            return null;
        }
        return classBaseEntity.clssSeq.eq(clssSeq);
    }
}
