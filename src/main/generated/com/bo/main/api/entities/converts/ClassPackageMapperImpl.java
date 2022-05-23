package com.bo.main.api.entities.converts;

import com.bo.main.api.controller.vo.req.ReqClassPackageVo;
import com.bo.main.api.controller.vo.res.ResClassPackageVo;
import com.bo.main.api.entities.ClassPackageDetailEntity;
import com.bo.main.api.entities.ClassPackageEntity;
import com.bo.main.api.entities.vo.ClassPackageVo;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-05-19T18:06:33+0900",
    comments = "version: 1.4.2.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-7.4.jar, environment: Java 11.0.6 (Oracle Corporation)"
)
@Component
public class ClassPackageMapperImpl implements ClassPackageMapper {

    @Autowired
    private ClassPackageDetailMapper classPackageDetailMapper;

    @Override
    public ClassPackageVo toVo(ClassPackageEntity classPackageEntity) {
        if ( classPackageEntity == null ) {
            return null;
        }

        ClassPackageVo classPackageVo = new ClassPackageVo();

        classPackageVo.setClassPackageDetailVoList( classPackageDetailMapper.toVos( classPackageEntity.getClassPackageDetailEntities() ) );
        classPackageVo.setPackSeq( classPackageEntity.getPackSeq() );
        classPackageVo.setPackCd( classPackageEntity.getPackCd() );
        classPackageVo.setCtgrId( classPackageEntity.getCtgrId() );
        classPackageVo.setPackThnl( classPackageEntity.getPackThnl() );
        classPackageVo.setPackNm( classPackageEntity.getPackNm() );
        classPackageVo.setPRC( classPackageEntity.getPRC() );
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

        classPackageEntity.setClassPackageDetailEntities( classPackageDetailMapper.toEntities( classPackageVo.getClassPackageDetailVoList() ) );
        classPackageEntity.setPackSeq( classPackageVo.getPackSeq() );
        classPackageEntity.setPackCd( classPackageVo.getPackCd() );
        classPackageEntity.setCtgrId( classPackageVo.getCtgrId() );
        classPackageEntity.setPackThnl( classPackageVo.getPackThnl() );
        classPackageEntity.setPackNm( classPackageVo.getPackNm() );
        classPackageEntity.setPRC( classPackageVo.getPRC() );
        classPackageEntity.setUseYn( classPackageVo.getUseYn() );

        return classPackageEntity;
    }

    @Override
    public List<ClassPackageVo> toVos(List<ClassPackageEntity> e) {
        if ( e == null ) {
            return null;
        }

        List<ClassPackageVo> list = new ArrayList<ClassPackageVo>( e.size() );
        for ( ClassPackageEntity classPackageEntity : e ) {
            list.add( toVo( classPackageEntity ) );
        }

        return list;
    }

    @Override
    public List<ClassPackageEntity> toEntities(List<ClassPackageVo> d) {
        if ( d == null ) {
            return null;
        }

        List<ClassPackageEntity> list = new ArrayList<ClassPackageEntity>( d.size() );
        for ( ClassPackageVo classPackageVo : d ) {
            list.add( toEntity( classPackageVo ) );
        }

        return list;
    }

    @Override
    public ClassPackageVo toVo(ReqClassPackageVo reqClassPackageVo) {
        if ( reqClassPackageVo == null ) {
            return null;
        }

        ClassPackageVo classPackageVo = new ClassPackageVo();

        classPackageVo.setPackSeq( reqClassPackageVo.getPackSeq() );
        classPackageVo.setPackCd( reqClassPackageVo.getPackCd() );
        classPackageVo.setCtgrId( reqClassPackageVo.getCtgrId() );
        classPackageVo.setPackThnl( reqClassPackageVo.getPackThnl() );
        classPackageVo.setPackNm( reqClassPackageVo.getPackNm() );
        classPackageVo.setPRC( reqClassPackageVo.getPRC() );
        classPackageVo.setUseYn( reqClassPackageVo.getUseYn() );
        classPackageVo.setCrtDtm( reqClassPackageVo.getCrtDtm() );
        classPackageVo.setCrtr( reqClassPackageVo.getCrtr() );
        classPackageVo.setUpdDtm( reqClassPackageVo.getUpdDtm() );
        classPackageVo.setUpdtr( reqClassPackageVo.getUpdtr() );

        return classPackageVo;
    }

    @Override
    public ResClassPackageVo toVo(ClassPackageVo classPackageVo) {
        if ( classPackageVo == null ) {
            return null;
        }

        ResClassPackageVo resClassPackageVo = new ResClassPackageVo();

        resClassPackageVo.setCrtDtm( classPackageVo.getCrtDtm() );
        resClassPackageVo.setCrtr( classPackageVo.getCrtr() );
        resClassPackageVo.setUpdDtm( classPackageVo.getUpdDtm() );
        resClassPackageVo.setUpdtr( classPackageVo.getUpdtr() );
        resClassPackageVo.setPackSeq( classPackageVo.getPackSeq() );
        resClassPackageVo.setPackCd( classPackageVo.getPackCd() );
        resClassPackageVo.setCtgrId( classPackageVo.getCtgrId() );
        resClassPackageVo.setPackThnl( classPackageVo.getPackThnl() );
        resClassPackageVo.setPackNm( classPackageVo.getPackNm() );
        resClassPackageVo.setPRC( classPackageVo.getPRC() );
        resClassPackageVo.setUseYn( classPackageVo.getUseYn() );

        return resClassPackageVo;
    }

    @Override
    public void updateFromVo(ClassPackageVo dto, ClassPackageEntity entity) {
        if ( dto == null ) {
            return;
        }

        if ( entity.getClassPackageDetailEntities() != null ) {
            List<ClassPackageDetailEntity> list = classPackageDetailMapper.toEntities( dto.getClassPackageDetailVoList() );
            if ( list != null ) {
                entity.getClassPackageDetailEntities().clear();
                entity.getClassPackageDetailEntities().addAll( list );
            }
            else {
                entity.setClassPackageDetailEntities( null );
            }
        }
        else {
            List<ClassPackageDetailEntity> list = classPackageDetailMapper.toEntities( dto.getClassPackageDetailVoList() );
            if ( list != null ) {
                entity.setClassPackageDetailEntities( list );
            }
        }
        entity.setPackSeq( dto.getPackSeq() );
        entity.setPackCd( dto.getPackCd() );
        entity.setCtgrId( dto.getCtgrId() );
        entity.setPackThnl( dto.getPackThnl() );
        entity.setPackNm( dto.getPackNm() );
        entity.setPRC( dto.getPRC() );
        entity.setUseYn( dto.getUseYn() );
    }
}
