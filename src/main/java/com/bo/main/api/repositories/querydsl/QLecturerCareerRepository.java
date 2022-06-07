package com.bo.main.api.repositories.querydsl;

import com.bo.main.api.entities.LecturerCareerEntity;
import com.bo.main.api.entities.LecturerClassEntity;
import com.bo.main.api.entities.vo.LecturerCareerVo;
import com.bo.main.api.entities.vo.LecturerClassVo;
import com.querydsl.core.types.dsl.BooleanExpression;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import static com.bo.main.api.entities.QLecturerCareerEntity.lecturerCareerEntity;

@RequiredArgsConstructor
@Repository
public class QLecturerCareerRepository {
    private final JPAQueryFactory queryFactory;

    public List<LecturerCareerEntity> findAll() {
        return queryFactory.selectFrom(lecturerCareerEntity)
                .fetch();
    }

    public Optional<List<LecturerCareerEntity>> findList(LecturerCareerVo lecturerCareerVo) {
        List<LecturerCareerEntity> content = queryFactory.selectFrom(lecturerCareerEntity)
                .where(eqClssSeq(lecturerCareerVo.getCarrSeq()),
                        eqLctrSeq(lecturerCareerVo.getLctrSeq()))
                .fetch();

        return Optional.ofNullable(content);
    }

    private BooleanExpression eqClssSeq(Long clssSeq) {
        if (Objects.isNull(clssSeq)) {
            return null;
        }
        return lecturerCareerEntity.carrSeq.eq(clssSeq);
    }

    private BooleanExpression eqLctrSeq(Long lctrSeq) {
        if (Objects.isNull(lctrSeq)) {
            return null;
        }
        return lecturerCareerEntity.lecturerEntity.lctrSeq.eq(lctrSeq);
    }
}
