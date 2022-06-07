package com.bo.main.api.entities;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QMemberHistoryEntity is a Querydsl query type for MemberHistoryEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QMemberHistoryEntity extends EntityPathBase<MemberHistoryEntity> {

    private static final long serialVersionUID = -949330651L;

    public static final QMemberHistoryEntity memberHistoryEntity = new QMemberHistoryEntity("memberHistoryEntity");

    public final QBaseTimeEntity _super = new QBaseTimeEntity(this);

    public final StringPath ADDR = createString("ADDR");

    //inherited
    public final DateTimePath<java.time.LocalDateTime> crtDtm = _super.crtDtm;

    //inherited
    public final StringPath crtr = _super.crtr;

    public final NumberPath<Long> histSeq = createNumber("histSeq", Long.class);

    public final StringPath JOB = createString("JOB");

    public final StringPath joinDt = createString("joinDt");

    public final DateTimePath<java.util.Date> lgnDtm = createDateTime("lgnDtm", java.util.Date.class);

    public final StringPath MAIL = createString("MAIL");

    public final NumberPath<Long> mbrId = createNumber("mbrId", Long.class);

    public final StringPath mbrNm = createString("mbrNm");

    public final StringPath mbrPwd = createString("mbrPwd");

    public final NumberPath<Long> mbrSeq = createNumber("mbrSeq", Long.class);

    public final StringPath mktYn = createString("mktYn");

    public final StringPath MOBL = createString("MOBL");

    public final StringPath SEX = createString("SEX");

    public final StringPath slprYn = createString("slprYn");

    public final StringPath sspdCd = createString("sspdCd");

    public final StringPath sspdYn = createString("sspdYn");

    public final StringPath stdDt = createString("stdDt");

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updDtm = _super.updDtm;

    //inherited
    public final StringPath updtr = _super.updtr;

    public QMemberHistoryEntity(String variable) {
        super(MemberHistoryEntity.class, forVariable(variable));
    }

    public QMemberHistoryEntity(Path<? extends MemberHistoryEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QMemberHistoryEntity(PathMetadata metadata) {
        super(MemberHistoryEntity.class, metadata);
    }

}

