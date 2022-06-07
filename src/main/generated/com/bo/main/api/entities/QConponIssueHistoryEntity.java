package com.bo.main.api.entities;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QConponIssueHistoryEntity is a Querydsl query type for ConponIssueHistoryEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QConponIssueHistoryEntity extends EntityPathBase<ConponIssueHistoryEntity> {

    private static final long serialVersionUID = 525397667L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QConponIssueHistoryEntity conponIssueHistoryEntity = new QConponIssueHistoryEntity("conponIssueHistoryEntity");

    public final QCouponInfoEntity couponInfoEntity;

    public final DateTimePath<java.util.Date> issueDtm = createDateTime("issueDtm", java.util.Date.class);

    public final NumberPath<Long> issueSeq = createNumber("issueSeq", Long.class);

    public final QMemberEntity memberEntity;

    public final DateTimePath<java.util.Date> useDtm = createDateTime("useDtm", java.util.Date.class);

    public final StringPath useSppdCd = createString("useSppdCd");

    public final DateTimePath<java.util.Date> useSppdDtm = createDateTime("useSppdDtm", java.util.Date.class);

    public QConponIssueHistoryEntity(String variable) {
        this(ConponIssueHistoryEntity.class, forVariable(variable), INITS);
    }

    public QConponIssueHistoryEntity(Path<? extends ConponIssueHistoryEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QConponIssueHistoryEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QConponIssueHistoryEntity(PathMetadata metadata, PathInits inits) {
        this(ConponIssueHistoryEntity.class, metadata, inits);
    }

    public QConponIssueHistoryEntity(Class<? extends ConponIssueHistoryEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.couponInfoEntity = inits.isInitialized("couponInfoEntity") ? new QCouponInfoEntity(forProperty("couponInfoEntity")) : null;
        this.memberEntity = inits.isInitialized("memberEntity") ? new QMemberEntity(forProperty("memberEntity")) : null;
    }

}

