package com.bo.main.api.repositories.querydsl;

import com.bo.main.api.entities.LecturerClassEntity;
import com.bo.main.api.entities.vo.LecturerClassVo;
import com.querydsl.core.types.dsl.BooleanExpression;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import static com.bo.main.api.entities.QLecturerClassEntity.lecturerClassEntity;

@RequiredArgsConstructor
@Repository
public class QLecturerClassRepository {
    private final JPAQueryFactory queryFactory;

    public List<LecturerClassEntity> findAll() {
        return queryFactory.selectFrom(lecturerClassEntity)
                .fetch();
    }

    public Optional<List<LecturerClassEntity>> findList(LecturerClassVo lecturerClassVo) {
        List<LecturerClassEntity> content = queryFactory.selectFrom(lecturerClassEntity)
                .where(eqClssSeq(lecturerClassVo.getClssSeq()),
                        eqLctrSeq(lecturerClassVo.getLctrSeq()))
                .fetch();

        return Optional.ofNullable(content);
    }

    private BooleanExpression eqClssSeq(Long clssSeq) {
        if (Objects.isNull(clssSeq)) {
            return null;
        }
        return lecturerClassEntity.classBaseEntity.clssSeq.eq(clssSeq);
    }

    private BooleanExpression eqLctrSeq(Long lctrSeq) {
        if (Objects.isNull(lctrSeq)) {
            return null;
        }
        return lecturerClassEntity.lecturerEntity.lctrSeq.eq(lctrSeq);
    }
}
