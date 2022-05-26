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

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QOrderInfoEntity orderInfoEntity = new QOrderInfoEntity("orderInfoEntity");

    public final QBaseTimeEntity _super = new QBaseTimeEntity(this);

    public final QCartEntity cartEntity;

    public final StringPath cnclDt = createString("cnclDt");

    public final StringPath cnclDtlList = createString("cnclDtlList");

    public final NumberPath<Integer> cpnDsctAmt = createNumber("cpnDsctAmt", Integer.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> crtDtm = _super.crtDtm;

    //inherited
    public final StringPath crtr = _super.crtr;

    public final QOrderDetailEntity orderDetailEntity;

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
        this(OrderInfoEntity.class, forVariable(variable), INITS);
    }

    public QOrderInfoEntity(Path<? extends OrderInfoEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QOrderInfoEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QOrderInfoEntity(PathMetadata metadata, PathInits inits) {
        this(OrderInfoEntity.class, metadata, inits);
    }

    public QOrderInfoEntity(Class<? extends OrderInfoEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.cartEntity = inits.isInitialized("cartEntity") ? new QCartEntity(forProperty("cartEntity"), inits.get("cartEntity")) : null;
        this.orderDetailEntity = inits.isInitialized("orderDetailEntity") ? new QOrderDetailEntity(forProperty("orderDetailEntity"), inits.get("orderDetailEntity")) : null;
    }

}

