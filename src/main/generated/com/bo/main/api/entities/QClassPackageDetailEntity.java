package com.bo.main.api.entities;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QClassPackageDetailEntity is a Querydsl query type for ClassPackageDetailEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QClassPackageDetailEntity extends EntityPathBase<ClassPackageDetailEntity> {

    private static final long serialVersionUID = 2092138330L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QClassPackageDetailEntity classPackageDetailEntity = new QClassPackageDetailEntity("classPackageDetailEntity");

    public final QBaseTimeEntity _super = new QBaseTimeEntity(this);

    public final QClassBaseEntity classBaseEntity;

    public final QClassPackageEntity classPackageEntity;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> crtDtm = _super.crtDtm;

    //inherited
    public final StringPath crtr = _super.crtr;

    public final NumberPath<Long> mapSeq = createNumber("mapSeq", Long.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updDtm = _super.updDtm;

    //inherited
    public final StringPath updtr = _super.updtr;

    public QClassPackageDetailEntity(String variable) {
        this(ClassPackageDetailEntity.class, forVariable(variable), INITS);
    }

    public QClassPackageDetailEntity(Path<? extends ClassPackageDetailEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QClassPackageDetailEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QClassPackageDetailEntity(PathMetadata metadata, PathInits inits) {
        this(ClassPackageDetailEntity.class, metadata, inits);
    }

    public QClassPackageDetailEntity(Class<? extends ClassPackageDetailEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.classBaseEntity = inits.isInitialized("classBaseEntity") ? new QClassBaseEntity(forProperty("classBaseEntity")) : null;
        this.classPackageEntity = inits.isInitialized("classPackageEntity") ? new QClassPackageEntity(forProperty("classPackageEntity")) : null;
    }

}

