package com.bo.main.api.entities;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QOrderDetailEntity is a Querydsl query type for OrderDetailEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QOrderDetailEntity extends EntityPathBase<OrderDetailEntity> {

    private static final long serialVersionUID = 668506122L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QOrderDetailEntity orderDetailEntity = new QOrderDetailEntity("orderDetailEntity");

    public final QBaseTimeEntity _super = new QBaseTimeEntity(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> crtDtm = _super.crtDtm;

    //inherited
    public final StringPath crtr = _super.crtr;

    public final QOrderInfoEntity orderInfoEntity;

    public final NumberPath<Integer> ordrAmt = createNumber("ordrAmt", Integer.class);

    public final StringPath ordrCls = createString("ordrCls");

    public final NumberPath<Long> ordrNo = createNumber("ordrNo", Long.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updDtm = _super.updDtm;

    //inherited
    public final StringPath updtr = _super.updtr;

    public QOrderDetailEntity(String variable) {
        this(OrderDetailEntity.class, forVariable(variable), INITS);
    }

    public QOrderDetailEntity(Path<? extends OrderDetailEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QOrderDetailEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QOrderDetailEntity(PathMetadata metadata, PathInits inits) {
        this(OrderDetailEntity.class, metadata, inits);
    }

    public QOrderDetailEntity(Class<? extends OrderDetailEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.orderInfoEntity = inits.isInitialized("orderInfoEntity") ? new QOrderInfoEntity(forProperty("orderInfoEntity")) : null;
    }

}

