package com.bo.main.api.entities;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QOrderInfoEntity is a Querydsl query type for OrderInfoEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QOrderInfoEntity extends EntityPathBase<OrderInfoEntity> {

    private static final long serialVersionUID = 1105727527L;

    public static final QOrderInfoEntity orderInfoEntity = new QOrderInfoEntity("orderInfoEntity");

    public final QBaseTimeEntity _super = new QBaseTimeEntity(this);

    public final NumberPath<Long> cartNo = createNumber("cartNo", Long.class);

    public final StringPath cnclDt = createString("cnclDt");

    public final StringPath cnclDtlList = createString("cnclDtlList");

    public final NumberPath<Integer> cpnDsctAmt = createNumber("cpnDsctAmt", Integer.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> crtDtm = _super.crtDtm;

    //inherited
    public final StringPath crtr = _super.crtr;

    public final ListPath<OrderDetailEntity, QOrderDetailEntity> orderDetailEntityList = this.<OrderDetailEntity, QOrderDetailEntity>createList("orderDetailEntityList", OrderDetailEntity.class, QOrderDetailEntity.class, PathInits.DIRECT2);

    public final NumberPath<Integer> ordrAmt = createNumber("ordrAmt", Integer.class);

    public final NumberPath<Long> ordrNo = createNumber("ordrNo", Long.class);

    public final StringPath ordrStat = createString("ordrStat");

    public final StringPath pymtDt = createString("pymtDt");

    public final StringPath rtrnDt = createString("rtrnDt");

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updDtm = _super.updDtm;

    //inherited
    public final StringPath updtr = _super.updtr;

    public QOrderInfoEntity(String variable) {
        super(OrderInfoEntity.class, forVariable(variable));
    }

    public QOrderInfoEntity(Path<? extends OrderInfoEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QOrderInfoEntity(PathMetadata metadata) {
        super(OrderInfoEntity.class, metadata);
    }

}

