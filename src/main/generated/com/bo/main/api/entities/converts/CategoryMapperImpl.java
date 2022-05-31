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
    date = "2022-05-30T17:14:55+0900",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 11.0.6 (Oracle Corporation)"
)
@Component
public class CategoryMapperImpl implements CategoryMapper {

    @Override
    public CategoryVo toVo(CategoryEntity e) {
        if ( e == null ) {
            return null;
        }

        CategoryVo categoryVo = new CategoryVo();

        categoryVo.setCtgrId( e.getCtgrId() );
        categoryVo.setUpperCtgrYn( e.getUpperCtgrYn() );
        categoryVo.setUpperCtgrId( e.getUpperCtgrId() );
        categoryVo.setShowYn( e.getShowYn() );
        categoryVo.setCtgrTyp( e.getCtgrTyp() );
        categoryVo.setCtgrNm( e.getCtgrNm() );
        categoryVo.setDelYn( e.getDelYn() );
        categoryVo.setCrtDtm( e.getCrtDtm() );
        categoryVo.setCrtr( e.getCrtr() );
        categoryVo.setUpdDtm( e.getUpdDtm() );
        categoryVo.setUpdtr( e.getUpdtr() );

        return categoryVo;
    }

    @Override
    public CategoryEntity toEntity(CategoryVo d) {
        if ( d == null ) {
            return null;
        }

        CategoryEntity categoryEntity = new CategoryEntity();

        categoryEntity.setCtgrId( d.getCtgrId() );
        categoryEntity.setUpperCtgrYn( d.getUpperCtgrYn() );
        categoryEntity.setUpperCtgrId( d.getUpperCtgrId() );
        categoryEntity.setShowYn( d.getShowYn() );
        categoryEntity.setCtgrTyp( d.getCtgrTyp() );
        categoryEntity.setCtgrNm( d.getCtgrNm() );
        categoryEntity.setDelYn( d.getDelYn() );

        return categoryEntity;
    }

    @Override
    public List<CategoryVo> toVos(List<CategoryEntity> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<CategoryVo> list = new ArrayList<CategoryVo>( entityList.size() );
        for ( CategoryEntity categoryEntity : entityList ) {
            list.add( toVo( categoryEntity ) );
        }

        return list;
    }

    @Override
    public List<CategoryEntity> toEntities(List<CategoryVo> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<CategoryEntity> list = new ArrayList<CategoryEntity>( dtoList.size() );
        for ( CategoryVo categoryVo : dtoList ) {
            list.add( toEntity( categoryVo ) );
        }

        return list;
    }

    @Override
    public void updateFromVo(CategoryVo dto, CategoryEntity entity) {
        if ( dto == null ) {
            return;
        }

        if ( dto.getCtgrId() != null ) {
            entity.setCtgrId( dto.getCtgrId() );
        }
        if ( dto.getUpperCtgrYn() != null ) {
            entity.setUpperCtgrYn( dto.getUpperCtgrYn() );
        }
        if ( dto.getUpperCtgrId() != null ) {
            entity.setUpperCtgrId( dto.getUpperCtgrId() );
        }
        if ( dto.getShowYn() != null ) {
            entity.setShowYn( dto.getShowYn() );
        }
        if ( dto.getCtgrTyp() != null ) {
            entity.setCtgrTyp( dto.getCtgrTyp() );
        }
        if ( dto.getCtgrNm() != null ) {
            entity.setCtgrNm( dto.getCtgrNm() );
        }
        if ( dto.getDelYn() != null ) {
            entity.setDelYn( dto.getDelYn() );
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
