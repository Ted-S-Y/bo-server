package com.bo.main.api.entities;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QLecturerCareerEntity is a Querydsl query type for LecturerCareerEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QLecturerCareerEntity extends EntityPathBase<LecturerCareerEntity> {

    private static final long serialVersionUID = 235672269L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QLecturerCareerEntity lecturerCareerEntity = new QLecturerCareerEntity("lecturerCareerEntity");

    public final QBaseTimeEntity _super = new QBaseTimeEntity(this);

    public final StringPath carrNm = createString("carrNm");

    public final NumberPath<Integer> carrNo = createNumber("carrNo", Integer.class);

    public final NumberPath<Long> carrSeq = createNumber("carrSeq", Long.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> crtDtm = _super.crtDtm;

    //inherited
    public final StringPath crtr = _super.crtr;

    public final NumberPath<Long> lctrSeq = createNumber("lctrSeq", Long.class);

    public final QLecturerEntity lecturerEntity;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updDtm = _super.updDtm;

    //inherited
    public final StringPath updtr = _super.updtr;

    public QLecturerCareerEntity(String variable) {
        this(LecturerCareerEntity.class, forVariable(variable), INITS);
    }

    public QLecturerCareerEntity(Path<? extends LecturerCareerEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QLecturerCareerEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QLecturerCareerEntity(PathMetadata metadata, PathInits inits) {
        this(LecturerCareerEntity.class, metadata, inits);
    }

    public QLecturerCareerEntity(Class<? extends LecturerCareerEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.lecturerEntity = inits.isInitialized("lecturerEntity") ? new QLecturerEntity(forProperty("lecturerEntity")) : null;
    }

}

