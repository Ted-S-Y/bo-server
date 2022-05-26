package com.bo.main.api.entities;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QClassVideoEntity is a Querydsl query type for ClassVideoEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QClassVideoEntity extends EntityPathBase<ClassVideoEntity> {

    private static final long serialVersionUID = -1262861154L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QClassVideoEntity classVideoEntity = new QClassVideoEntity("classVideoEntity");

    public final QBaseTimeEntity _super = new QBaseTimeEntity(this);

    public final QClassBaseEntity classBaseEntity;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> crtDtm = _super.crtDtm;

    //inherited
    public final StringPath crtr = _super.crtr;

    public final StringPath delYn = createString("delYn");

    public final StringPath prvYn = createString("prvYn");

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updDtm = _super.updDtm;

    //inherited
    public final StringPath updtr = _super.updtr;

    public final NumberPath<Long> vdSeq = createNumber("vdSeq", Long.class);

    public final StringPath vdTtl = createString("vdTtl");

    public final StringPath vdUrl = createString("vdUrl");

    public QClassVideoEntity(String variable) {
        this(ClassVideoEntity.class, forVariable(variable), INITS);
    }

    public QClassVideoEntity(Path<? extends ClassVideoEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QClassVideoEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QClassVideoEntity(PathMetadata metadata, PathInits inits) {
        this(ClassVideoEntity.class, metadata, inits);
    }

    public QClassVideoEntity(Class<? extends ClassVideoEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.classBaseEntity = inits.isInitialized("classBaseEntity") ? new QClassBaseEntity(forProperty("classBaseEntity")) : null;
    }

}

