package com.bo.main.api.entities;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QRevwEntity is a Querydsl query type for RevwEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QRevwEntity extends EntityPathBase<RevwEntity> {

    private static final long serialVersionUID = -260156369L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QRevwEntity revwEntity = new QRevwEntity("revwEntity");

    public final QBaseTimeEntity _super = new QBaseTimeEntity(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> crtDtm = _super.crtDtm;

    //inherited
    public final StringPath crtr = _super.crtr;

    public final QMemberEntity memberEntity;

    public final StringPath revw = createString("revw");

    public final ListPath<RevwCnntsEntity, QRevwCnntsEntity> revwCnntsEntityList = this.<RevwCnntsEntity, QRevwCnntsEntity>createList("revwCnntsEntityList", RevwCnntsEntity.class, QRevwCnntsEntity.class, PathInits.DIRECT2);

    public final NumberPath<Long> revwSeq = createNumber("revwSeq", Long.class);

    public final NumberPath<Long> slsPrdtSeq = createNumber("slsPrdtSeq", Long.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updDtm = _super.updDtm;

    //inherited
    public final StringPath updtr = _super.updtr;

    public QRevwEntity(String variable) {
        this(RevwEntity.class, forVariable(variable), INITS);
    }

    public QRevwEntity(Path<? extends RevwEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QRevwEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QRevwEntity(PathMetadata metadata, PathInits inits) {
        this(RevwEntity.class, metadata, inits);
    }

    public QRevwEntity(Class<? extends RevwEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.memberEntity = inits.isInitialized("memberEntity") ? new QMemberEntity(forProperty("memberEntity")) : null;
    }

}

