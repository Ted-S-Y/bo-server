package com.bo.main.api.entities;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QCartDetailEntity is a Querydsl query type for CartDetailEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QCartDetailEntity extends EntityPathBase<CartDetailEntity> {

    private static final long serialVersionUID = -645936180L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QCartDetailEntity cartDetailEntity = new QCartDetailEntity("cartDetailEntity");

    public final QBaseTimeEntity _super = new QBaseTimeEntity(this);

    public final NumberPath<Long> cartDtlSeq = createNumber("cartDtlSeq", Long.class);

    public final QCartEntity cartEntity;

    public final NumberPath<Long> cartNo = createNumber("cartNo", Long.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> crtDtm = _super.crtDtm;

    //inherited
    public final StringPath crtr = _super.crtr;

    public final NumberPath<Integer> ordrAmt = createNumber("ordrAmt", Integer.class);

    public final NumberPath<Integer> prdtQty = createNumber("prdtQty", Integer.class);

    public final QSalesProductEntity salesProductEntity;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updDtm = _super.updDtm;

    //inherited
    public final StringPath updtr = _super.updtr;

    public QCartDetailEntity(String variable) {
        this(CartDetailEntity.class, forVariable(variable), INITS);
    }

    public QCartDetailEntity(Path<? extends CartDetailEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QCartDetailEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QCartDetailEntity(PathMetadata metadata, PathInits inits) {
        this(CartDetailEntity.class, metadata, inits);
    }

    public QCartDetailEntity(Class<? extends CartDetailEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.cartEntity = inits.isInitialized("cartEntity") ? new QCartEntity(forProperty("cartEntity"), inits.get("cartEntity")) : null;
        this.salesProductEntity = inits.isInitialized("salesProductEntity") ? new QSalesProductEntity(forProperty("salesProductEntity")) : null;
    }

}

