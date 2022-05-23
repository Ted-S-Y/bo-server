package com.bo.main.api.repositories.querydsl;

import com.bo.main.api.entities.CartEntity;
import com.bo.main.api.entities.CategoryEntity;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

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
}
