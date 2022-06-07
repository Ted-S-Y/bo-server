package com.bo.main.api.entities.converts;

import com.bo.main.api.controller.vo.req.ReqPackageVo;
import com.bo.main.api.controller.vo.res.ResPackageVo;
import com.bo.main.api.entities.ClassPackageDetailEntity;
import com.bo.main.api.entities.ClassPackageEntity;
import com.bo.main.api.entities.SalesProductDetailEntity;
import com.bo.main.api.entities.vo.ClassPackageVo;
import com.bo.main.api.entities.vo.SalesProductDetailVo;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-06-07T17:57:26+0900",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 11.0.6 (Oracle Corporation)"
)
@Component
public class ClassPackageMapperImpl implements ClassPackageMapper {

    @Autowired
    private ClassPackageDetailMapper classPackageDetailMapper;

    @Override
    public List<ClassPackageVo> toVos(List<ClassPackageEntity> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<ClassPackageVo> list = new ArrayList<ClassPackageVo>( arg0.size() );
        for ( ClassPackageEntity classPackageEntity : arg0 ) {
            list.add( toVo( classPackageEntity ) );
        }

        return list;
    }

    @Override
    public List<ClassPackageEntity> toEntities(List<ClassPackageVo> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<ClassPackageEntity> list = new ArrayList<ClassPackageEntity>( arg0.size() );
        for ( ClassPackageVo classPackageVo : arg0 ) {
            list.add( toEntity( classPackageVo ) );
        }

        return list;
    }

    @Override
    public ClassPackageVo toVo(ClassPackageEntity classPackageEntity) {
        if ( classPackageEntity == null ) {
            return null;
        }

        ClassPackageVo classPackageVo = new ClassPackageVo();

        classPackageVo.setClassPackageDetails( classPackageDetailMapper.toVos( classPackageEntity.getClassPackageDetailEntityList() ) );
        classPackageVo.setSalesProductDetails( salesProductDetailEntityListToSalesProductDetailVoList( classPackageEntity.getSalesProductDetailEntityList() ) );
        classPackageVo.setPackSeq( classPackageEntity.getPackSeq() );
        classPackageVo.setPackCd( classPackageEntity.getPackCd() );
        classPackageVo.setPackThnl( classPackageEntity.getPackThnl() );
        classPackageVo.setPackNm( classPackageEntity.getPackNm() );
        classPackageVo.setUseYn( classPackageEntity.getUseYn() );
        classPackageVo.setCrtDtm( classPackageEntity.getCrtDtm() );
        classPackageVo.setCrtr( classPackageEntity.getCrtr() );
        classPackageVo.setUpdDtm( classPackageEntity.getUpdDtm() );
        classPackageVo.setUpdtr( classPackageEntity.getUpdtr() );

        return classPackageVo;
    }

    @Override
    public ClassPackageEntity toEntity(ClassPackageVo classPackageVo) {
        if ( classPackageVo == null ) {
            return null;
        }

        ClassPackageEntity classPackageEntity = new ClassPackageEntity();

        classPackageEntity.setClassPackageDetailEntityList( classPackageDetailMapper.toEntities( classPackageVo.getClassPackageDetails() ) );
        classPackageEntity.setSalesProductDetailEntityList( salesProductDetailVoListToSalesProductDetailEntityList( classPackageVo.getSalesProductDetails() ) );
        classPackageEntity.setPackSeq( classPackageVo.getPackSeq() );
        classPackageEntity.setPackCd( classPackageVo.getPackCd() );
        classPackageEntity.setPackThnl( classPackageVo.getPackThnl() );
        classPackageEntity.setPackNm( classPackageVo.getPackNm() );
        classPackageEntity.setUseYn( classPackageVo.getUseYn() );

        return classPackageEntity;
    }

    @Override
    public ClassPackageVo toVo(ReqPackageVo reqPackageVo) {
        if ( reqPackageVo == null ) {
            return null;
        }

        ClassPackageVo classPackageVo = new ClassPackageVo();

        classPackageVo.setPackSeq( reqPackageVo.getPackSeq() );
        classPackageVo.setPackCd( reqPackageVo.getPackCd() );
        classPackageVo.setCtgrId( reqPackageVo.getCtgrId() );
        classPackageVo.setPackThnl( reqPackageVo.getPackThnl() );
        classPackageVo.setPackNm( reqPackageVo.getPackNm() );
        classPackageVo.setUseYn( reqPackageVo.getUseYn() );
        classPackageVo.setCrtDtm( reqPackageVo.getCrtDtm() );
        classPackageVo.setCrtr( reqPackageVo.getCrtr() );
        classPackageVo.setUpdDtm( reqPackageVo.getUpdDtm() );
        classPackageVo.setUpdtr( reqPackageVo.getUpdtr() );

        return classPackageVo;
    }

    @Override
    public ResPackageVo toVo(ClassPackageVo classPackageVo) {
        if ( classPackageVo == null ) {
            return null;
        }

        ResPackageVo resPackageVo = new ResPackageVo();

        resPackageVo.setCrtDtm( classPackageVo.getCrtDtm() );
        resPackageVo.setCrtr( classPackageVo.getCrtr() );
        resPackageVo.setUpdDtm( classPackageVo.getUpdDtm() );
        resPackageVo.setUpdtr( classPackageVo.getUpdtr() );
        resPackageVo.setPackSeq( classPackageVo.getPackSeq() );
        resPackageVo.setPackCd( classPackageVo.getPackCd() );
        resPackageVo.setCtgrId( classPackageVo.getCtgrId() );
        resPackageVo.setPackThnl( classPackageVo.getPackThnl() );
        resPackageVo.setPackNm( classPackageVo.getPackNm() );
        resPackageVo.setUseYn( classPackageVo.getUseYn() );

        return resPackageVo;
    }

    @Override
    public void updateFromVo(ClassPackageVo dto, ClassPackageEntity entity) {
        if ( dto == null ) {
            return;
        }

        if ( entity.getClassPackageDetailEntityList() != null ) {
            List<ClassPackageDetailEntity> list = classPackageDetailMapper.toEntities( dto.getClassPackageDetails() );
            if ( list != null ) {
                entity.getClassPackageDetailEntityList().clear();
                entity.getClassPackageDetailEntityList().addAll( list );
            }
            else {
                entity.setClassPackageDetailEntityList( null );
            }
        }
        else {
            List<ClassPackageDetailEntity> list = classPackageDetailMapper.toEntities( dto.getClassPackageDetails() );
            if ( list != null ) {
                entity.setClassPackageDetailEntityList( list );
            }
        }
        if ( entity.getSalesProductDetailEntityList() != null ) {
            List<SalesProductDetailEntity> list1 = salesProductDetailVoListToSalesProductDetailEntityList( dto.getSalesProductDetails() );
            if ( list1 != null ) {
                entity.getSalesProductDetailEntityList().clear();
                entity.getSalesProductDetailEntityList().addAll( list1 );
            }
            else {
                entity.setSalesProductDetailEntityList( null );
            }
        }
        else {
            List<SalesProductDetailEntity> list1 = salesProductDetailVoListToSalesProductDetailEntityList( dto.getSalesProductDetails() );
            if ( list1 != null ) {
                entity.setSalesProductDetailEntityList( list1 );
            }
        }
        entity.setPackSeq( dto.getPackSeq() );
        entity.setPackCd( dto.getPackCd() );
        entity.setPackThnl( dto.getPackThnl() );
        entity.setPackNm( dto.getPackNm() );
        entity.setUseYn( dto.getUseYn() );
    }

    protected SalesProductDetailVo salesProductDetailEntityToSalesProductDetailVo(SalesProductDetailEntity salesProductDetailEntity) {
        if ( salesProductDetailEntity == null ) {
            return null;
        }

        SalesProductDetailVo salesProductDetailVo = new SalesProductDetailVo();

        salesProductDetailVo.setSlsPrdtDtlSeq( salesProductDetailEntity.getSlsPrdtDtlSeq() );
        salesProductDetailVo.setShipPrdtSeq( salesProductDetailEntity.getShipPrdtSeq() );
        salesProductDetailVo.setShipPrdtYn( salesProductDetailEntity.getShipPrdtYn() );
        salesProductDetailVo.setCrtDtm( salesProductDetailEntity.getCrtDtm() );
        salesProductDetailVo.setCrtr( salesProductDetailEntity.getCrtr() );
        salesProductDetailVo.setUpdDtm( salesProductDetailEntity.getUpdDtm() );
        salesProductDetailVo.setUpdtr( salesProductDetailEntity.getUpdtr() );

        return salesProductDetailVo;
    }

    protected List<SalesProductDetailVo> salesProductDetailEntityListToSalesProductDetailVoList(List<SalesProductDetailEntity> list) {
        if ( list == null ) {
            return null;
        }

        List<SalesProductDetailVo> list1 = new ArrayList<SalesProductDetailVo>( list.size() );
        for ( SalesProductDetailEntity salesProductDetailEntity : list ) {
            list1.add( salesProductDetailEntityToSalesProductDetailVo( salesProductDetailEntity ) );
        }

        return list1;
    }

    protected SalesProductDetailEntity salesProductDetailVoToSalesProductDetailEntity(SalesProductDetailVo salesProductDetailVo) {
        if ( salesProductDetailVo == null ) {
            return null;
        }

        SalesProductDetailEntity salesProductDetailEntity = new SalesProductDetailEntity();

        salesProductDetailEntity.setSlsPrdtDtlSeq( salesProductDetailVo.getSlsPrdtDtlSeq() );
        salesProductDetailEntity.setShipPrdtSeq( salesProductDetailVo.getShipPrdtSeq() );
        salesProductDetailEntity.setShipPrdtYn( salesProductDetailVo.getShipPrdtYn() );

        return salesProductDetailEntity;
    }

    protected List<SalesProductDetailEntity> salesProductDetailVoListToSalesProductDetailEntityList(List<SalesProductDetailVo> list) {
        if ( list == null ) {
            return null;
        }

        List<SalesProductDetailEntity> list1 = new ArrayList<SalesProductDetailEntity>( list.size() );
        for ( SalesProductDetailVo salesProductDetailVo : list ) {
            list1.add( salesProductDetailVoToSalesProductDetailEntity( salesProductDetailVo ) );
        }

        return list1;
    }
}
