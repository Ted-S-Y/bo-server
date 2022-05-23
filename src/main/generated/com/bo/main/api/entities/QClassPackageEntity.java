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

    public static final QClassPackageEntity classPackageEntity = new QClassPackageEntity("classPackageEntity");

    public final QBaseTimeEntity _super = new QBaseTimeEntity(this);

    public final ListPath<ClassPackageDetailEntity, QClassPackageDetailEntity> classPackageDetailEntities = this.<ClassPackageDetailEntity, QClassPackageDetailEntity>createList("classPackageDetailEntities", ClassPackageDetailEntity.class, QClassPackageDetailEntity.class, PathInits.DIRECT2);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> crtDtm = _super.crtDtm;

    //inherited
    public final StringPath crtr = _super.crtr;

    public final NumberPath<Long> ctgrId = createNumber("ctgrId", Long.class);

    public final StringPath packCd = createString("packCd");

    public final StringPath packNm = createString("packNm");

    public final NumberPath<Long> packSeq = createNumber("packSeq", Long.class);

    public final StringPath packThnl = createString("packThnl");

    public final NumberPath<Integer> PRC = createNumber("PRC", Integer.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updDtm = _super.updDtm;

    //inherited
    public final StringPath updtr = _super.updtr;

    public final StringPath useYn = createString("useYn");

    public QClassPackageEntity(String variable) {
        super(ClassPackageEntity.class, forVariable(variable));
    }

    public QClassPackageEntity(Path<? extends ClassPackageEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QClassPackageEntity(PathMetadata metadata) {
        super(ClassPackageEntity.class, metadata);
    }

}

