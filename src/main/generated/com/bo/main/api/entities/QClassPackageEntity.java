package com.bo.main.api.entities;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QClassPackageEntity is a Querydsl query type for ClassPackageEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QClassPackageEntity extends EntityPathBase<ClassPackageEntity> {

    private static final long serialVersionUID = 1133807657L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QClassPackageEntity classPackageEntity = new QClassPackageEntity("classPackageEntity");

    public final QBaseTimeEntity _super = new QBaseTimeEntity(this);

    public final QCategoryEntity categoryEntity;

    public final ListPath<ClassPackageDetailEntity, QClassPackageDetailEntity> classPackageDetailEntityList = this.<ClassPackageDetailEntity, QClassPackageDetailEntity>createList("classPackageDetailEntityList", ClassPackageDetailEntity.class, QClassPackageDetailEntity.class, PathInits.DIRECT2);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> crtDtm = _super.crtDtm;

    //inherited
    public final StringPath crtr = _super.crtr;

    public final StringPath packCd = createString("packCd");

    public final StringPath packNm = createString("packNm");

    public final NumberPath<Long> packSeq = createNumber("packSeq", Long.class);

    public final StringPath packThnl = createString("packThnl");

    public final NumberPath<Integer> prc = createNumber("prc", Integer.class);

    public final ListPath<SalesProductDetailEntity, QSalesProductDetailEntity> salesProductDetailEntityList = this.<SalesProductDetailEntity, QSalesProductDetailEntity>createList("salesProductDetailEntityList", SalesProductDetailEntity.class, QSalesProductDetailEntity.class, PathInits.DIRECT2);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updDtm = _super.updDtm;

    //inherited
    public final StringPath updtr = _super.updtr;

    public final StringPath useYn = createString("useYn");

    public QClassPackageEntity(String variable) {
        this(ClassPackageEntity.class, forVariable(variable), INITS);
    }

    public QClassPackageEntity(Path<? extends ClassPackageEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QClassPackageEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QClassPackageEntity(PathMetadata metadata, PathInits inits) {
        this(ClassPackageEntity.class, metadata, inits);
    }

    public QClassPackageEntity(Class<? extends ClassPackageEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.categoryEntity = inits.isInitialized("categoryEntity") ? new QCategoryEntity(forProperty("categoryEntity")) : null;
    }

}

