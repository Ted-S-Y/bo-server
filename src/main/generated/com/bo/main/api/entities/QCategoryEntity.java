package com.bo.main.api.entities;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QCategoryEntity is a Querydsl query type for CategoryEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QCategoryEntity extends EntityPathBase<CategoryEntity> {

    private static final long serialVersionUID = -631883399L;

    public static final QCategoryEntity categoryEntity = new QCategoryEntity("categoryEntity");

    public final QBaseTimeEntity _super = new QBaseTimeEntity(this);

    public final ListPath<ClassPackageEntity, QClassPackageEntity> classPackageEntityList = this.<ClassPackageEntity, QClassPackageEntity>createList("classPackageEntityList", ClassPackageEntity.class, QClassPackageEntity.class, PathInits.DIRECT2);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> crtDtm = _super.crtDtm;

    //inherited
    public final StringPath crtr = _super.crtr;

    public final NumberPath<Long> ctgrId = createNumber("ctgrId", Long.class);

    public final StringPath ctgrNm = createString("ctgrNm");

    public final StringPath ctgrTyp = createString("ctgrTyp");

    public final StringPath delYn = createString("delYn");

    public final StringPath showYn = createString("showYn");

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updDtm = _super.updDtm;

    //inherited
    public final StringPath updtr = _super.updtr;

    public final NumberPath<Long> upperCtgrId = createNumber("upperCtgrId", Long.class);

    public final StringPath upperCtgrYn = createString("upperCtgrYn");

    public QCategoryEntity(String variable) {
        super(CategoryEntity.class, forVariable(variable));
    }

    public QCategoryEntity(Path<? extends CategoryEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QCategoryEntity(PathMetadata metadata) {
        super(CategoryEntity.class, metadata);
    }

}

