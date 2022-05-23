package com.bo.main.api.entities;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QLecturerClassEntity is a Querydsl query type for LecturerClassEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QLecturerClassEntity extends EntityPathBase<LecturerClassEntity> {

    private static final long serialVersionUID = 415024175L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QLecturerClassEntity lecturerClassEntity1 = new QLecturerClassEntity("lecturerClassEntity1");

    public final QBaseTimeEntity _super = new QBaseTimeEntity(this);

    public final QClassBaseEntity classBaseEntity;

    public final NumberPath<Long> clssSeq = createNumber("clssSeq", Long.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> crtDtm = _super.crtDtm;

    //inherited
    public final StringPath crtr = _super.crtr;

    public final NumberPath<Long> lctrSeq = createNumber("lctrSeq", Long.class);

    public final QLecturerClassEntity lecturerClassEntity;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updDtm = _super.updDtm;

    //inherited
    public final StringPath updtr = _super.updtr;

    public QLecturerClassEntity(String variable) {
        this(LecturerClassEntity.class, forVariable(variable), INITS);
    }

    public QLecturerClassEntity(Path<? extends LecturerClassEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QLecturerClassEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QLecturerClassEntity(PathMetadata metadata, PathInits inits) {
        this(LecturerClassEntity.class, metadata, inits);
    }

    public QLecturerClassEntity(Class<? extends LecturerClassEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.classBaseEntity = inits.isInitialized("classBaseEntity") ? new QClassBaseEntity(forProperty("classBaseEntity")) : null;
        this.lecturerClassEntity = inits.isInitialized("lecturerClassEntity") ? new QLecturerClassEntity(forProperty("lecturerClassEntity"), inits.get("lecturerClassEntity")) : null;
    }

}

