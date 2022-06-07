package com.bo.main.api.entities;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QRevwCnntsEntity is a Querydsl query type for RevwCnntsEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QRevwCnntsEntity extends EntityPathBase<RevwCnntsEntity> {

    private static final long serialVersionUID = -1586163495L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QRevwCnntsEntity revwCnntsEntity = new QRevwCnntsEntity("revwCnntsEntity");

    public final QBaseTimeEntity _super = new QBaseTimeEntity(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> crtDtm = _super.crtDtm;

    //inherited
    public final StringPath crtr = _super.crtr;

    public final StringPath delYn = createString("delYn");

    public final StringPath fileNm = createString("fileNm");

    public final StringPath fileTyp = createString("fileTyp");

    public final NumberPath<Long> revwCnntsSeq = createNumber("revwCnntsSeq", Long.class);

    public final QRevwEntity revwEntity;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updDtm = _super.updDtm;

    //inherited
    public final StringPath updtr = _super.updtr;

    public QRevwCnntsEntity(String variable) {
        this(RevwCnntsEntity.class, forVariable(variable), INITS);
    }

    public QRevwCnntsEntity(Path<? extends RevwCnntsEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QRevwCnntsEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QRevwCnntsEntity(PathMetadata metadata, PathInits inits) {
        this(RevwCnntsEntity.class, metadata, inits);
    }

    public QRevwCnntsEntity(Class<? extends RevwCnntsEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.revwEntity = inits.isInitialized("revwEntity") ? new QRevwEntity(forProperty("revwEntity"), inits.get("revwEntity")) : null;
    }

}

