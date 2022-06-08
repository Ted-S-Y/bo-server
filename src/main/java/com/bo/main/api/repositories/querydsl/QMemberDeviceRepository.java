package com.bo.main.api.repositories.querydsl;

import com.bo.main.api.entities.MemberDeviceEntity;
import com.bo.main.api.entities.vo.MemberDeviceVo;
import com.querydsl.core.types.dsl.BooleanExpression;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import static com.bo.main.api.entities.QMemberDeviceEntity.memberDeviceEntity;

@RequiredArgsConstructor
@Repository
public class QMemberDeviceRepository {
    private final JPAQueryFactory queryFactory;

    public List<MemberDeviceEntity> findAll() {
        return queryFactory.selectFrom(memberDeviceEntity)
                .fetch();
    }

    public Optional<List<MemberDeviceEntity>> findList(MemberDeviceVo memberDeviceVo) {
        List<MemberDeviceEntity> content = queryFactory.selectFrom(memberDeviceEntity)
                .where(eqMbrSeq(memberDeviceVo.getMbrSeq()),
                        eqDvSeq(memberDeviceVo.getDvSeq()))
                .fetch();

        return Optional.ofNullable(content);
    }

    private BooleanExpression eqMbrSeq(Long mbrSeq) {
        if (Objects.isNull(mbrSeq)) {
            return null;
        }
        return memberDeviceEntity.memberEntity.mbrSeq.eq(mbrSeq);
    }

    private BooleanExpression eqDvSeq(Long dvSeq) {
        if (Objects.isNull(dvSeq)) {
            return null;
        }
        return memberDeviceEntity.dvSeq.eq(dvSeq);
    }
}
