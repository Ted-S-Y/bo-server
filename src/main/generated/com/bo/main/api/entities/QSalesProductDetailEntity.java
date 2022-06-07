package com.bo.main.api.entities;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QSalesProductDetailEntity is a Querydsl query type for SalesProductDetailEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QSalesProductDetailEntity extends EntityPathBase<SalesProductDetailEntity> {

    private static final long serialVersionUID = 1175474799L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QSalesProductDetailEntity salesProductDetailEntity = new QSalesProductDetailEntity("salesProductDetailEntity");

    public final QBaseTimeEntity _super = new QBaseTimeEntity(this);

    public final QClassPackageEntity classPackageEntity;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> crtDtm = _super.crtDtm;

    //inherited
    public final StringPath crtr = _super.crtr;

    public final QSalesProductEntity salesProductEntity;

    public final NumberPath<Long> shipPrdtSeq = createNumber("shipPrdtSeq", Long.class);

    public final StringPath shipPrdtYn = createString("shipPrdtYn");

    public final NumberPath<Long> slsPrdtDtlSeq = createNumber("slsPrdtDtlSeq", Long.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updDtm = _super.updDtm;

    //inherited
    public final StringPath updtr = _super.updtr;

    public QSalesProductDetailEntity(String variable) {
        this(SalesProductDetailEntity.class, forVariable(variable), INITS);
    }

    public QSalesProductDetailEntity(Path<? extends SalesProductDetailEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QSalesProductDetailEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QSalesProductDetailEntity(PathMetadata metadata, PathInits inits) {
        this(SalesProductDetailEntity.class, metadata, inits);
    }

    public QSalesProductDetailEntity(Class<? extends SalesProductDetailEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.classPackageEntity = inits.isInitialized("classPackageEntity") ? new QClassPackageEntity(forProperty("classPackageEntity"), inits.get("classPackageEntity")) : null;
        this.salesProductEntity = inits.isInitialized("salesProductEntity") ? new QSalesProductEntity(forProperty("salesProductEntity")) : null;
    }

}

