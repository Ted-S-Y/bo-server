package com.bo.main.api.entities;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QSalesProductEntity is a Querydsl query type for SalesProductEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QSalesProductEntity extends EntityPathBase<SalesProductEntity> {

    private static final long serialVersionUID = -1149333762L;

    public static final QSalesProductEntity salesProductEntity = new QSalesProductEntity("salesProductEntity");

    public final QBaseTimeEntity _super = new QBaseTimeEntity(this);

    public final ListPath<CartDetailEntity, QCartDetailEntity> cartDetailEntityList = this.<CartDetailEntity, QCartDetailEntity>createList("cartDetailEntityList", CartDetailEntity.class, QCartDetailEntity.class, PathInits.DIRECT2);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> crtDtm = _super.crtDtm;

    //inherited
    public final StringPath crtr = _super.crtr;

    public final NumberPath<Long> ctgrId = createNumber("ctgrId", Long.class);

    public final StringPath delYn = createString("delYn");

    public final StringPath prdtDesc = createString("prdtDesc");

    public final StringPath prdtNm = createString("prdtNm");

    public final StringPath prdtRepImg = createString("prdtRepImg");

    public final ListPath<SalesProductDetailEntity, QSalesProductDetailEntity> salesProductDetailEntityList = this.<SalesProductDetailEntity, QSalesProductDetailEntity>createList("salesProductDetailEntityList", SalesProductDetailEntity.class, QSalesProductDetailEntity.class, PathInits.DIRECT2);

    public final StringPath shipCls = createString("shipCls");

    public final NumberPath<Integer> shipFee = createNumber("shipFee", Integer.class);

    public final NumberPath<Integer> slsCost = createNumber("slsCost", Integer.class);

    public final NumberPath<Integer> slsPrc = createNumber("slsPrc", Integer.class);

    public final NumberPath<Long> slsPrdtSeq = createNumber("slsPrdtSeq", Long.class);

    public final StringPath slsStat = createString("slsStat");

    public final NumberPath<Integer> stock = createNumber("stock", Integer.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updDtm = _super.updDtm;

    //inherited
    public final StringPath updtr = _super.updtr;

    public QSalesProductEntity(String variable) {
        super(SalesProductEntity.class, forVariable(variable));
    }

    public QSalesProductEntity(Path<? extends SalesProductEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QSalesProductEntity(PathMetadata metadata) {
        super(SalesProductEntity.class, metadata);
    }

}

