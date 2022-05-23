package com.bo.main.api.entities;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QAdminEntity is a Querydsl query type for AdminEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QAdminEntity extends EntityPathBase<AdminEntity> {

    private static final long serialVersionUID = -1783391206L;

    public static final QAdminEntity adminEntity = new QAdminEntity("adminEntity");

    public final QBaseTimeEntity _super = new QBaseTimeEntity(this);

    public final StringPath admId = createString("admId");

    public final StringPath admMail = createString("admMail");

    public final StringPath admMobl = createString("admMobl");

    public final StringPath admNm = createString("admNm");

    public final StringPath admPwd = createString("admPwd");

    public final NumberPath<Long> admSeq = createNumber("admSeq", Long.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> crtDtm = _super.crtDtm;

    //inherited
    public final StringPath crtr = _super.crtr;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updDtm = _super.updDtm;

    //inherited
    public final StringPath updtr = _super.updtr;

    public final StringPath useYn = createString("useYn");

    public QAdminEntity(String variable) {
        super(AdminEntity.class, forVariable(variable));
    }

    public QAdminEntity(Path<? extends AdminEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QAdminEntity(PathMetadata metadata) {
        super(AdminEntity.class, metadata);
    }

}

