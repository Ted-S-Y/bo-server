package com.bo.main.api.entities;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QQuestionListEntity is a Querydsl query type for QuestionListEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QQuestionListEntity extends EntityPathBase<QuestionListEntity> {

    private static final long serialVersionUID = 1666034079L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QQuestionListEntity questionListEntity = new QQuestionListEntity("questionListEntity");

    public final QBaseTimeEntity _super = new QBaseTimeEntity(this);

    public final StringPath ansCmpltDt = createString("ansCmpltDt");

    public final StringPath ansCnnts = createString("ansCnnts");

    public final StringPath ansYn = createString("ansYn");

    //inherited
    public final DateTimePath<java.time.LocalDateTime> crtDtm = _super.crtDtm;

    //inherited
    public final StringPath crtr = _super.crtr;

    public final QMemberEntity memberEntity;

    public final StringPath quesCnnts = createString("quesCnnts");

    public final NumberPath<Long> quesSeq = createNumber("quesSeq", Long.class);

    public final StringPath quesTtl = createString("quesTtl");

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updDtm = _super.updDtm;

    //inherited
    public final StringPath updtr = _super.updtr;

    public QQuestionListEntity(String variable) {
        this(QuestionListEntity.class, forVariable(variable), INITS);
    }

    public QQuestionListEntity(Path<? extends QuestionListEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QQuestionListEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QQuestionListEntity(PathMetadata metadata, PathInits inits) {
        this(QuestionListEntity.class, metadata, inits);
    }

    public QQuestionListEntity(Class<? extends QuestionListEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.memberEntity = inits.isInitialized("memberEntity") ? new QMemberEntity(forProperty("memberEntity")) : null;
    }

}

