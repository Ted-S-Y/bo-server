package com.bo.main.api.entities;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QCouponIssueHistoryEntity is a Querydsl query type for CouponIssueHistoryEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QCouponIssueHistoryEntity extends EntityPathBase<CouponIssueHistoryEntity> {

    private static final long serialVersionUID = -856094468L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QCouponIssueHistoryEntity couponIssueHistoryEntity = new QCouponIssueHistoryEntity("couponIssueHistoryEntity");

    public final QCouponInfoEntity couponInfoEntity;

    public final DateTimePath<java.util.Date> issueDtm = createDateTime("issueDtm", java.util.Date.class);

    public final NumberPath<Long> issueSeq = createNumber("issueSeq", Long.class);

    public final QMemberEntity memberEntity;

    public final DateTimePath<java.util.Date> useDtm = createDateTime("useDtm", java.util.Date.class);

    public final StringPath useSppdCd = createString("useSppdCd");

    public final DateTimePath<java.util.Date> useSppdDtm = createDateTime("useSppdDtm", java.util.Date.class);

    public QCouponIssueHistoryEntity(String variable) {
        this(CouponIssueHistoryEntity.class, forVariable(variable), INITS);
    }

    public QCouponIssueHistoryEntity(Path<? extends CouponIssueHistoryEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QCouponIssueHistoryEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QCouponIssueHistoryEntity(PathMetadata metadata, PathInits inits) {
        this(CouponIssueHistoryEntity.class, metadata, inits);
    }

    public QCouponIssueHistoryEntity(Class<? extends CouponIssueHistoryEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.couponInfoEntity = inits.isInitialized("couponInfoEntity") ? new QCouponInfoEntity(forProperty("couponInfoEntity")) : null;
        this.memberEntity = inits.isInitialized("memberEntity") ? new QMemberEntity(forProperty("memberEntity")) : null;
    }

}

