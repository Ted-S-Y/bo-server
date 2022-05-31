package com.bo.main.api.repositories.querydsl;

import com.bo.main.api.controller.vo.req.ReqCategoryVo;
import com.bo.main.api.entities.CategoryEntity;
import com.querydsl.core.types.dsl.BooleanExpression;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import org.apache.commons.lang3.StringUtils;
import org.mapstruct.ap.shaded.freemarker.template.utility.NumberUtil;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Objects;

import static com.bo.main.api.entities.QCategoryEntity.categoryEntity;

/**
 * packageName : com.bo.main.api.repositories.querydsl
 * fileName : QCategoryRepository
 * author : sbyoon
 * date : 2022-05-23
 * description :
 * ===========================================================
 * DATE AUTHOR  NOTE
 * -----------------------------------------------------------
 * 2022-05-23  sbyoon 최초 생성
 */
@RequiredArgsConstructor
@Repository
public class QCategoryRepository {
    private final JPAQueryFactory queryFactory;

    public List<CategoryEntity> findAll() {
        return queryFactory.selectFrom(categoryEntity)
                .fetch();
    }

    public List<CategoryEntity> findList(ReqCategoryVo reqCategoryVo) {
        return queryFactory.selectFrom(categoryEntity)
                .where(eqUpperCtgrYn(reqCategoryVo.getUpperCtgrYn()),
                        eqUpperCtgrId(reqCategoryVo.getUpperCtgrId()),
                        eqCtgrTyp(reqCategoryVo.getCtgrTyp()),
                        eqDelYn(reqCategoryVo.getDelYn())
                )
                .fetch();
    }

    private BooleanExpression eqUpperCtgrYn(String upperCtgrYn) {
        if (StringUtils.isEmpty(upperCtgrYn)) {
            return null;
        }
        return categoryEntity.upperCtgrYn.eq(upperCtgrYn);
    }

    private BooleanExpression eqUpperCtgrId(Long upperCtgrId) {
        if (Objects.isNull(upperCtgrId)) {
            return null;
        }
        return categoryEntity.upperCtgrId.eq(upperCtgrId);
    }

    private BooleanExpression eqCtgrTyp(String ctgrTyp) {
        if (StringUtils.isEmpty(ctgrTyp)) {
            return null;
        }
        return categoryEntity.ctgrTyp.eq(ctgrTyp);
    }

    private BooleanExpression eqDelYn(String delYn) {
        if (StringUtils.isEmpty(delYn)) {
            return null;
        }
        return categoryEntity.delYn.eq(delYn);
    }
}


