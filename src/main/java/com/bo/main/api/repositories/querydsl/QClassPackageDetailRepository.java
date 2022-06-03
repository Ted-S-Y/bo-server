package com.bo.main.api.repositories.querydsl;

import com.bo.main.api.entities.ClassPackageDetailEntity;
import com.bo.main.api.entities.ClassPackageDetailEntity;
import com.bo.main.api.entities.vo.ClassPackageDetailVo;
import com.bo.main.api.entities.vo.LecturerClassVo;
import com.querydsl.core.types.dsl.BooleanExpression;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import static com.bo.main.api.entities.QClassPackageDetailEntity.classPackageDetailEntity;

@RequiredArgsConstructor
@Repository
public class QClassPackageDetailRepository {
    private final JPAQueryFactory queryFactory;

    public List<ClassPackageDetailEntity> findAll() {
        return queryFactory.selectFrom(classPackageDetailEntity)
                .fetch();
    }

    public Optional<List<ClassPackageDetailEntity>> findList(ClassPackageDetailVo classPackageDetailVo) {
        List<ClassPackageDetailEntity> content = queryFactory.selectFrom(classPackageDetailEntity)
                .where(eqClssSeq(classPackageDetailVo.getClssSeq()),
                        eqPackSeq(classPackageDetailVo.getPackSeq()))
                .fetch();

        return Optional.ofNullable(content);
    }

    private BooleanExpression eqClssSeq(Long clssSeq) {
        if (Objects.isNull(clssSeq)) {
            return null;
        }
        return classPackageDetailEntity.classBaseEntity.clssSeq.eq(clssSeq);
    }

    private BooleanExpression eqPackSeq(Long packSeq) {
        if (Objects.isNull(packSeq)) {
            return null;
        }
        return classPackageDetailEntity.classPackageEntity.packSeq.eq(packSeq);
    }
}
