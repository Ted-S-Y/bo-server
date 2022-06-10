package com.bo.main.api.repositories.querydsl;

import com.bo.main.api.entities.SalesProductDetailEntity;
import com.bo.main.api.entities.vo.SalesProductDetailVo;
import com.querydsl.core.types.dsl.BooleanExpression;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import static com.bo.main.api.entities.QSalesProductDetailEntity.salesProductDetailEntity;

/**
 * packageName : com.bo.main.api.repositories.querydsl
 * fileName : QSalaesProductDetailRepository
 * author : sbyoon
 * date : 2022-06-03
 * description :
 * ===========================================================
 * DATE AUTHOR  NOTE
 * -----------------------------------------------------------
 * 2022-06-03  sbyoon 최초 생성
 */
@RequiredArgsConstructor
@Repository
public class QSalesProductDetailRepository {
    private final JPAQueryFactory queryFactory;

    public Optional<List<SalesProductDetailEntity>> findList(SalesProductDetailVo salesProductDetailVo) {
        List<SalesProductDetailEntity> content = queryFactory.selectFrom(salesProductDetailEntity)
                .where(eqShipPrdtSeq(salesProductDetailVo.getShipPrdtSeq()),
                        eqPackSeq(salesProductDetailVo.getPackSeq()),
                        eqSlsPrdtSeq(salesProductDetailVo.getSlsPrdtSeq())
                )
                .fetch();

        return Optional.ofNullable(content);
    }

    private BooleanExpression eqShipPrdtSeq(Long shipPrdtSeq) {
        if (Objects.isNull(shipPrdtSeq)) {
            return null;
        }
        return salesProductDetailEntity.shipPrdtSeq.eq(shipPrdtSeq);
    }

    private BooleanExpression eqSlsPrdtSeq(Long slsPrdtSeq) {
        if (Objects.isNull(slsPrdtSeq)) {
            return null;
        }
        return salesProductDetailEntity.salesProductEntity.slsPrdtSeq.eq(slsPrdtSeq);
    }

    private BooleanExpression eqPackSeq(Long packSeq) {
        if (Objects.isNull(packSeq)) {
            return null;
        }
        return salesProductDetailEntity.classPackageEntity.packSeq.eq(packSeq);
    }
}
