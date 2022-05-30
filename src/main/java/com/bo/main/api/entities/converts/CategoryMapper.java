package com.bo.main.api.entities.converts;

import com.bo.main.api.controller.vo.req.ReqCategoryVo;
import com.bo.main.api.controller.vo.res.ResCategoryVo;
import com.bo.main.api.entities.CategoryEntity;
import com.bo.main.api.entities.vo.CategoryVo;
import org.mapstruct.Mapper;

/**
 * packageName : com.bo.main.api.entities.converts
 * fileName : CategoryMapper
 * author : sbyoon
 * date : 2022-05-30
 * description :
 * ===========================================================
 * DATE AUTHOR  NOTE
 * -----------------------------------------------------------
 * 2022-05-30  sbyoon 최초 생성
 */
@Mapper(
        componentModel = "spring"
)
public interface CategoryMapper extends GenericMapper<CategoryVo, CategoryEntity> {
    CategoryVo toVo(ReqCategoryVo reqCategoryVo);

    ResCategoryVo toVo(CategoryVo categoryVo);
}
