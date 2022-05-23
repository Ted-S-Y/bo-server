package com.bo.main.api.entities;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QMemberDeviceEntity is a Querydsl query type for MemberDeviceEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QMemberDeviceEntity extends EntityPathBase<MemberDeviceEntity> {

    private static final long serialVersionUID = 2006762635L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QMemberDeviceEntity memberDeviceEntity = new QMemberDeviceEntity("memberDeviceEntity");

    public final QBaseTimeEntity _super = new QBaseTimeEntity(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> crtDtm = _super.crtDtm;

    //inherited
    public final StringPath crtr = _super.crtr;

    public final StringPath delYn = createString("delYn");

    public final StringPath dvNm = createString("dvNm");

    public final NumberPath<Long> dvSeq = createNumber("dvSeq", Long.class);

    public final StringPath dvTyp = createString("dvTyp");

    public final NumberPath<Long> mbrSeq = createNumber("mbrSeq", Long.class);

    public final QMemberEntity memberEntity;

    public final StringPath OS = createString("OS");

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updDtm = _super.updDtm;

    //inherited
    public final StringPath updtr = _super.updtr;

    public QMemberDeviceEntity(String variable) {
        this(MemberDeviceEntity.class, forVariable(variable), INITS);
    }

    public QMemberDeviceEntity(Path<? extends MemberDeviceEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QMemberDeviceEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QMemberDeviceEntity(PathMetadata metadata, PathInits inits) {
        this(MemberDeviceEntity.class, metadata, inits);
    }

    public QMemberDeviceEntity(Class<? extends MemberDeviceEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.memberEntity = inits.isInitialized("memberEntity") ? new QMemberEntity(forProperty("memberEntity")) : null;
    }

}

