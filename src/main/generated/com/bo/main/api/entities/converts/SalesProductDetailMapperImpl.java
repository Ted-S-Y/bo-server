package com.bo.main.api.entities.converts;

import com.bo.main.api.entities.ClassPackageEntity;
import com.bo.main.api.entities.SalesProductDetailEntity;
import com.bo.main.api.entities.vo.ClassPackageVo;
import com.bo.main.api.entities.vo.SalesProductDetailVo;
import com.bo.main.api.entities.vo.SalesProductVo;
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
public class SalesProductDetailMapperImpl implements SalesProductDetailMapper {

    @Override
    public List<SalesProductDetailVo> toVos(List<SalesProductDetailEntity> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<SalesProductDetailVo> list = new ArrayList<SalesProductDetailVo>( arg0.size() );
        for ( SalesProductDetailEntity salesProductDetailEntity : arg0 ) {
            list.add( toVo( salesProductDetailEntity ) );
        }

        return list;
    }

    @Override
    public List<SalesProductDetailEntity> toEntities(List<SalesProductDetailVo> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<SalesProductDetailEntity> list = new ArrayList<SalesProductDetailEntity>( arg0.size() );
        for ( SalesProductDetailVo salesProductDetailVo : arg0 ) {
            list.add( toEntity( salesProductDetailVo ) );
        }

        return list;
    }

    @Override
    public void updateFromVo(SalesProductDetailVo arg0, SalesProductDetailEntity arg1) {
        if ( arg0 == null ) {
            return;
        }

        if ( arg0.getSlsPrdtDtlSeq() != null ) {
            arg1.setSlsPrdtDtlSeq( arg0.getSlsPrdtDtlSeq() );
        }
        if ( arg0.getShipPrdtSeq() != null ) {
            arg1.setShipPrdtSeq( arg0.getShipPrdtSeq() );
        }
        if ( arg0.getShipPrdtYn() != null ) {
            arg1.setShipPrdtYn( arg0.getShipPrdtYn() );
        }
    }

    @Override
    public SalesProductDetailVo toVo(SalesProductDetailEntity salesProductDetailEntity) {
        if ( salesProductDetailEntity == null ) {
            return null;
        }

        SalesProductDetailVo salesProductDetailVo = new SalesProductDetailVo();

        salesProductDetailVo.setClassPackageVo( classPackageEntityToClassPackageVo( salesProductDetailEntity.getClassPackageEntity() ) );
        salesProductDetailVo.setSlsPrdtDtlSeq( salesProductDetailEntity.getSlsPrdtDtlSeq() );
        salesProductDetailVo.setShipPrdtSeq( salesProductDetailEntity.getShipPrdtSeq() );
        salesProductDetailVo.setShipPrdtYn( salesProductDetailEntity.getShipPrdtYn() );
        salesProductDetailVo.setCrtDtm( salesProductDetailEntity.getCrtDtm() );
        salesProductDetailVo.setCrtr( salesProductDetailEntity.getCrtr() );
        salesProductDetailVo.setUpdDtm( salesProductDetailEntity.getUpdDtm() );
        salesProductDetailVo.setUpdtr( salesProductDetailEntity.getUpdtr() );

        return salesProductDetailVo;
    }

    @Override
    public SalesProductDetailEntity toEntity(SalesProductDetailVo salesProductDetailVo) {
        if ( salesProductDetailVo == null ) {
            return null;
        }

        SalesProductDetailEntity salesProductDetailEntity = new SalesProductDetailEntity();

        salesProductDetailEntity.setClassPackageEntity( classPackageVoToClassPackageEntity( salesProductDetailVo.getClassPackageVo() ) );
        salesProductDetailEntity.setSlsPrdtDtlSeq( salesProductDetailVo.getSlsPrdtDtlSeq() );
        salesProductDetailEntity.setShipPrdtSeq( salesProductDetailVo.getShipPrdtSeq() );
        salesProductDetailEntity.setShipPrdtYn( salesProductDetailVo.getShipPrdtYn() );

        return salesProductDetailEntity;
    }

    @Override
    public SalesProductDetailVo toVo(SalesProductVo salesProductVo) {
        if ( salesProductVo == null ) {
            return null;
        }

        SalesProductDetailVo salesProductDetailVo = new SalesProductDetailVo();

        salesProductDetailVo.setSlsPrdtSeq( salesProductVo.getSlsPrdtSeq() );
        salesProductDetailVo.setCrtDtm( salesProductVo.getCrtDtm() );
        salesProductDetailVo.setCrtr( salesProductVo.getCrtr() );
        salesProductDetailVo.setUpdDtm( salesProductVo.getUpdDtm() );
        salesProductDetailVo.setUpdtr( salesProductVo.getUpdtr() );

        return salesProductDetailVo;
    }

    protected ClassPackageVo classPackageEntityToClassPackageVo(ClassPackageEntity classPackageEntity) {
        if ( classPackageEntity == null ) {
            return null;
        }

        ClassPackageVo classPackageVo = new ClassPackageVo();

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

    protected ClassPackageEntity classPackageVoToClassPackageEntity(ClassPackageVo classPackageVo) {
        if ( classPackageVo == null ) {
            return null;
        }

        ClassPackageEntity classPackageEntity = new ClassPackageEntity();

        classPackageEntity.setPackSeq( classPackageVo.getPackSeq() );
        classPackageEntity.setPackCd( classPackageVo.getPackCd() );
        classPackageEntity.setPackThnl( classPackageVo.getPackThnl() );
        classPackageEntity.setPackNm( classPackageVo.getPackNm() );
        classPackageEntity.setUseYn( classPackageVo.getUseYn() );

        return classPackageEntity;
    }
}
