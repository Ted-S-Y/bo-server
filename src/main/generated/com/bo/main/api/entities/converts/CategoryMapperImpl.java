package com.bo.main.api.entities.converts;

import com.bo.main.api.controller.vo.req.ReqCategoryVo;
import com.bo.main.api.controller.vo.res.ResCategoryVo;
import com.bo.main.api.entities.CategoryEntity;
import com.bo.main.api.entities.vo.CategoryVo;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-06-07T17:57:26+0900",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 11.0.6 (Oracle Corporation)"
)
@Component
public class CategoryMapperImpl implements CategoryMapper {

    @Override
    public CategoryVo toVo(CategoryEntity arg0) {
        if ( arg0 == null ) {
            return null;
        }

        CategoryVo categoryVo = new CategoryVo();

        categoryVo.setCtgrId( arg0.getCtgrId() );
        categoryVo.setUpperCtgrYn( arg0.getUpperCtgrYn() );
        categoryVo.setUpperCtgrId( arg0.getUpperCtgrId() );
        categoryVo.setShowYn( arg0.getShowYn() );
        categoryVo.setCtgrTyp( arg0.getCtgrTyp() );
        categoryVo.setCtgrNm( arg0.getCtgrNm() );
        categoryVo.setDelYn( arg0.getDelYn() );
        categoryVo.setCrtDtm( arg0.getCrtDtm() );
        categoryVo.setCrtr( arg0.getCrtr() );
        categoryVo.setUpdDtm( arg0.getUpdDtm() );
        categoryVo.setUpdtr( arg0.getUpdtr() );

        return categoryVo;
    }

    @Override
    public CategoryEntity toEntity(CategoryVo arg0) {
        if ( arg0 == null ) {
            return null;
        }

        CategoryEntity categoryEntity = new CategoryEntity();

        categoryEntity.setCtgrId( arg0.getCtgrId() );
        categoryEntity.setUpperCtgrYn( arg0.getUpperCtgrYn() );
        categoryEntity.setUpperCtgrId( arg0.getUpperCtgrId() );
        categoryEntity.setShowYn( arg0.getShowYn() );
        categoryEntity.setCtgrTyp( arg0.getCtgrTyp() );
        categoryEntity.setCtgrNm( arg0.getCtgrNm() );
        categoryEntity.setDelYn( arg0.getDelYn() );

        return categoryEntity;
    }

    @Override
    public List<CategoryVo> toVos(List<CategoryEntity> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<CategoryVo> list = new ArrayList<CategoryVo>( arg0.size() );
        for ( CategoryEntity categoryEntity : arg0 ) {
            list.add( toVo( categoryEntity ) );
        }

        return list;
    }

    @Override
    public List<CategoryEntity> toEntities(List<CategoryVo> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<CategoryEntity> list = new ArrayList<CategoryEntity>( arg0.size() );
        for ( CategoryVo categoryVo : arg0 ) {
            list.add( toEntity( categoryVo ) );
        }

        return list;
    }

    @Override
    public void updateFromVo(CategoryVo arg0, CategoryEntity arg1) {
        if ( arg0 == null ) {
            return;
        }

        if ( arg0.getCtgrId() != null ) {
            arg1.setCtgrId( arg0.getCtgrId() );
        }
        if ( arg0.getUpperCtgrYn() != null ) {
            arg1.setUpperCtgrYn( arg0.getUpperCtgrYn() );
        }
        if ( arg0.getUpperCtgrId() != null ) {
            arg1.setUpperCtgrId( arg0.getUpperCtgrId() );
        }
        if ( arg0.getShowYn() != null ) {
            arg1.setShowYn( arg0.getShowYn() );
        }
        if ( arg0.getCtgrTyp() != null ) {
            arg1.setCtgrTyp( arg0.getCtgrTyp() );
        }
        if ( arg0.getCtgrNm() != null ) {
            arg1.setCtgrNm( arg0.getCtgrNm() );
        }
        if ( arg0.getDelYn() != null ) {
            arg1.setDelYn( arg0.getDelYn() );
        }
    }

    @Override
    public CategoryVo toVo(ReqCategoryVo reqCategoryVo) {
        if ( reqCategoryVo == null ) {
            return null;
        }

        CategoryVo categoryVo = new CategoryVo();

        categoryVo.setCtgrId( reqCategoryVo.getCtgrId() );
        categoryVo.setUpperCtgrYn( reqCategoryVo.getUpperCtgrYn() );
        categoryVo.setUpperCtgrId( reqCategoryVo.getUpperCtgrId() );
        categoryVo.setCtgrTyp( reqCategoryVo.getCtgrTyp() );
        categoryVo.setDelYn( reqCategoryVo.getDelYn() );
        categoryVo.setCrtDtm( reqCategoryVo.getCrtDtm() );
        categoryVo.setCrtr( reqCategoryVo.getCrtr() );
        categoryVo.setUpdDtm( reqCategoryVo.getUpdDtm() );
        categoryVo.setUpdtr( reqCategoryVo.getUpdtr() );

        return categoryVo;
    }

    @Override
    public ResCategoryVo toVo(CategoryVo categoryVo) {
        if ( categoryVo == null ) {
            return null;
        }

        ResCategoryVo resCategoryVo = new ResCategoryVo();

        resCategoryVo.setCrtDtm( categoryVo.getCrtDtm() );
        resCategoryVo.setCrtr( categoryVo.getCrtr() );
        resCategoryVo.setUpdDtm( categoryVo.getUpdDtm() );
        resCategoryVo.setUpdtr( categoryVo.getUpdtr() );
        resCategoryVo.setCtgrId( categoryVo.getCtgrId() );
        resCategoryVo.setUpperCtgrYn( categoryVo.getUpperCtgrYn() );
        resCategoryVo.setUpperCtgrId( categoryVo.getUpperCtgrId() );
        resCategoryVo.setShowYn( categoryVo.getShowYn() );
        resCategoryVo.setCtgrTyp( categoryVo.getCtgrTyp() );
        resCategoryVo.setCtgrNm( categoryVo.getCtgrNm() );
        resCategoryVo.setDelYn( categoryVo.getDelYn() );

        return resCategoryVo;
    }
}
