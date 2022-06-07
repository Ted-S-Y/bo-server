package com.bo.main.api.entities;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QCartEntity is a Querydsl query type for CartEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QCartEntity extends EntityPathBase<CartEntity> {

    private static final long serialVersionUID = 283611675L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QCartEntity cartEntity = new QCartEntity("cartEntity");

    public final QBaseTimeEntity _super = new QBaseTimeEntity(this);

    public final ListPath<CartDetailEntity, QCartDetailEntity> cartDetailEntityList = this.<CartDetailEntity, QCartDetailEntity>createList("cartDetailEntityList", CartDetailEntity.class, QCartDetailEntity.class, PathInits.DIRECT2);

    public final NumberPath<Long> cartNo = createNumber("cartNo", Long.class);

    public final StringPath cartStat = createString("cartStat");

    //inherited
    public final DateTimePath<java.time.LocalDateTime> crtDtm = _super.crtDtm;

    //inherited
    public final StringPath crtr = _super.crtr;

    public final QMemberEntity memberEntity;

    public final QOrderInfoEntity orderInfoEntity;

    public final NumberPath<Integer> ordrSumAmt = createNumber("ordrSumAmt", Integer.class);

    public final NumberPath<Integer> prdtCnt = createNumber("prdtCnt", Integer.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updDtm = _super.updDtm;

    //inherited
    public final StringPath updtr = _super.updtr;

    public QCartEntity(String variable) {
        this(CartEntity.class, forVariable(variable), INITS);
    }

    public QCartEntity(Path<? extends CartEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QCartEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QCartEntity(PathMetadata metadata, PathInits inits) {
        this(CartEntity.class, metadata, inits);
    }

    public QCartEntity(Class<? extends CartEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.memberEntity = inits.isInitialized("memberEntity") ? new QMemberEntity(forProperty("memberEntity")) : null;
        this.orderInfoEntity = inits.isInitialized("orderInfoEntity") ? new QOrderInfoEntity(forProperty("orderInfoEntity"), inits.get("orderInfoEntity")) : null;
    }

}

