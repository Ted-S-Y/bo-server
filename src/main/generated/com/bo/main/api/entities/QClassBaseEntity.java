package com.bo.main.api.entities;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QClassBaseEntity is a Querydsl query type for ClassBaseEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QClassBaseEntity extends EntityPathBase<ClassBaseEntity> {

    private static final long serialVersionUID = -176930380L;

    public static final QClassBaseEntity classBaseEntity = new QClassBaseEntity("classBaseEntity");

    public final QBaseTimeEntity _super = new QBaseTimeEntity(this);

    public final ListPath<ClassPackageDetailEntity, QClassPackageDetailEntity> classPackageDetailEntityList = this.<ClassPackageDetailEntity, QClassPackageDetailEntity>createList("classPackageDetailEntityList", ClassPackageDetailEntity.class, QClassPackageDetailEntity.class, PathInits.DIRECT2);

    public final ListPath<ClassVideoEntity, QClassVideoEntity> classVideoEntityList = this.<ClassVideoEntity, QClassVideoEntity>createList("classVideoEntityList", ClassVideoEntity.class, QClassVideoEntity.class, PathInits.DIRECT2);

    public final StringPath clssCd = createString("clssCd");

    public final StringPath clssDesc = createString("clssDesc");

    public final StringPath clssNm = createString("clssNm");

    public final NumberPath<Long> clssSeq = createNumber("clssSeq", Long.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> crtDtm = _super.crtDtm;

    //inherited
    public final StringPath crtr = _super.crtr;

    public final ListPath<LecturerClassEntity, QLecturerClassEntity> lecturerClassEntityList = this.<LecturerClassEntity, QLecturerClassEntity>createList("lecturerClassEntityList", LecturerClassEntity.class, QLecturerClassEntity.class, PathInits.DIRECT2);

    public final StringPath prvYn = createString("prvYn");

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updDtm = _super.updDtm;

    //inherited
    public final StringPath updtr = _super.updtr;

    public final StringPath useYn = createString("useYn");

    public QClassBaseEntity(String variable) {
        super(ClassBaseEntity.class, forVariable(variable));
    }

    public QClassBaseEntity(Path<? extends ClassBaseEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QClassBaseEntity(PathMetadata metadata) {
        super(ClassBaseEntity.class, metadata);
    }

}

