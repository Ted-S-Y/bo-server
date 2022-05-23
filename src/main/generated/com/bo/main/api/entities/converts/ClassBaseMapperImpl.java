package com.bo.main.api.entities.converts;

import com.bo.main.api.controller.vo.req.ReqClassBaseVo;
import com.bo.main.api.controller.vo.req.ReqClassVideoVo;
import com.bo.main.api.controller.vo.res.ResClassBaseVo;
import com.bo.main.api.controller.vo.res.ResClassVideoVo;
import com.bo.main.api.entities.ClassBaseEntity;
import com.bo.main.api.entities.ClassVideoEntity;
import com.bo.main.api.entities.vo.ClassBaseVo;
import com.bo.main.api.entities.vo.ClassVideoVo;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-05-23T11:40:34+0900",
    comments = "version: 1.4.2.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-7.4.jar, environment: Java 11.0.6 (Oracle Corporation)"
)
@Component
public class ClassBaseMapperImpl implements ClassBaseMapper {

    @Autowired
    private ClassVideoMapper classVideoMapper;

    @Override
    public ClassBaseVo toVo(ClassBaseEntity classBaseEntity) {
        if ( classBaseEntity == null ) {
            return null;
        }

        ClassBaseVo classBaseVo = new ClassBaseVo();

        classBaseVo.setVideos( classVideoMapper.toVos( classBaseEntity.getClassVideoEntityList() ) );
        classBaseVo.setClssSeq( classBaseEntity.getClssSeq() );
        classBaseVo.setClssCd( classBaseEntity.getClssCd() );
        classBaseVo.setClssNm( classBaseEntity.getClssNm() );
        classBaseVo.setClssDesc( classBaseEntity.getClssDesc() );
        classBaseVo.setPrvYn( classBaseEntity.getPrvYn() );
        classBaseVo.setUseYn( classBaseEntity.getUseYn() );
        classBaseVo.setCrtDtm( classBaseEntity.getCrtDtm() );
        classBaseVo.setCrtr( classBaseEntity.getCrtr() );
        classBaseVo.setUpdDtm( classBaseEntity.getUpdDtm() );
        classBaseVo.setUpdtr( classBaseEntity.getUpdtr() );

        return classBaseVo;
    }

    @Override
    public ClassBaseEntity toEntity(ClassBaseVo classBaseVo) {
        if ( classBaseVo == null ) {
            return null;
        }

        ClassBaseEntity classBaseEntity = new ClassBaseEntity();

        classBaseEntity.setClassVideoEntityList( classVideoMapper.toEntities( classBaseVo.getVideos() ) );
        classBaseEntity.setClssSeq( classBaseVo.getClssSeq() );
        classBaseEntity.setClssCd( classBaseVo.getClssCd() );
        classBaseEntity.setClssNm( classBaseVo.getClssNm() );
        classBaseEntity.setClssDesc( classBaseVo.getClssDesc() );
        classBaseEntity.setPrvYn( classBaseVo.getPrvYn() );
        classBaseEntity.setUseYn( classBaseVo.getUseYn() );

        return classBaseEntity;
    }

    @Override
    public List<ClassBaseVo> toVos(List<ClassBaseEntity> e) {
        if ( e == null ) {
            return null;
        }

        List<ClassBaseVo> list = new ArrayList<ClassBaseVo>( e.size() );
        for ( ClassBaseEntity classBaseEntity : e ) {
            list.add( toVo( classBaseEntity ) );
        }

        return list;
    }

    @Override
    public List<ClassBaseEntity> toEntities(List<ClassBaseVo> d) {
        if ( d == null ) {
            return null;
        }

        List<ClassBaseEntity> list = new ArrayList<ClassBaseEntity>( d.size() );
        for ( ClassBaseVo classBaseVo : d ) {
            list.add( toEntity( classBaseVo ) );
        }

        return list;
    }

    @Override
    public ClassBaseVo toVo(ReqClassBaseVo reqClassBaseVo) {
        if ( reqClassBaseVo == null ) {
            return null;
        }

        ClassBaseVo classBaseVo = new ClassBaseVo();

        classBaseVo.setClssSeq( reqClassBaseVo.getClssSeq() );
        classBaseVo.setClssCd( reqClassBaseVo.getClssCd() );
        classBaseVo.setClssNm( reqClassBaseVo.getClssNm() );
        classBaseVo.setClssDesc( reqClassBaseVo.getClssDesc() );
        classBaseVo.setPrvYn( reqClassBaseVo.getPrvYn() );
        classBaseVo.setUseYn( reqClassBaseVo.getUseYn() );
        classBaseVo.setCrtDtm( reqClassBaseVo.getCrtDtm() );
        classBaseVo.setCrtr( reqClassBaseVo.getCrtr() );
        classBaseVo.setUpdDtm( reqClassBaseVo.getUpdDtm() );
        classBaseVo.setUpdtr( reqClassBaseVo.getUpdtr() );
        classBaseVo.setVideos( reqClassVideoVoListToClassVideoVoList( reqClassBaseVo.getVideos() ) );

        return classBaseVo;
    }

    @Override
    public ResClassBaseVo toVo(ClassBaseVo classBaseVo) {
        if ( classBaseVo == null ) {
            return null;
        }

        ResClassBaseVo resClassBaseVo = new ResClassBaseVo();

        resClassBaseVo.setCrtDtm( classBaseVo.getCrtDtm() );
        resClassBaseVo.setCrtr( classBaseVo.getCrtr() );
        resClassBaseVo.setUpdDtm( classBaseVo.getUpdDtm() );
        resClassBaseVo.setUpdtr( classBaseVo.getUpdtr() );
        resClassBaseVo.setClssSeq( classBaseVo.getClssSeq() );
        resClassBaseVo.setClssCd( classBaseVo.getClssCd() );
        resClassBaseVo.setClssNm( classBaseVo.getClssNm() );
        resClassBaseVo.setClssDesc( classBaseVo.getClssDesc() );
        resClassBaseVo.setPrvYn( classBaseVo.getPrvYn() );
        resClassBaseVo.setUseYn( classBaseVo.getUseYn() );
        resClassBaseVo.setVideos( classVideoVoListToResClassVideoVoList( classBaseVo.getVideos() ) );

        return resClassBaseVo;
    }

    @Override
    public void updateFromVo(ClassBaseVo dto, ClassBaseEntity entity) {
        if ( dto == null ) {
            return;
        }

        if ( entity.getClassVideoEntityList() != null ) {
            List<ClassVideoEntity> list = classVideoMapper.toEntities( dto.getVideos() );
            if ( list != null ) {
                entity.getClassVideoEntityList().clear();
                entity.getClassVideoEntityList().addAll( list );
            }
            else {
                entity.setClassVideoEntityList( null );
            }
        }
        else {
            List<ClassVideoEntity> list = classVideoMapper.toEntities( dto.getVideos() );
            if ( list != null ) {
                entity.setClassVideoEntityList( list );
            }
        }
        entity.setClssSeq( dto.getClssSeq() );
        entity.setClssCd( dto.getClssCd() );
        entity.setClssNm( dto.getClssNm() );
        entity.setClssDesc( dto.getClssDesc() );
        entity.setPrvYn( dto.getPrvYn() );
        entity.setUseYn( dto.getUseYn() );
    }

    protected List<ClassVideoVo> reqClassVideoVoListToClassVideoVoList(List<ReqClassVideoVo> list) {
        if ( list == null ) {
            return null;
        }

        List<ClassVideoVo> list1 = new ArrayList<ClassVideoVo>( list.size() );
        for ( ReqClassVideoVo reqClassVideoVo : list ) {
            list1.add( classVideoMapper.toVo( reqClassVideoVo ) );
        }

        return list1;
    }

    protected List<ResClassVideoVo> classVideoVoListToResClassVideoVoList(List<ClassVideoVo> list) {
        if ( list == null ) {
            return null;
        }

        List<ResClassVideoVo> list1 = new ArrayList<ResClassVideoVo>( list.size() );
        for ( ClassVideoVo classVideoVo : list ) {
            list1.add( classVideoMapper.toVo( classVideoVo ) );
        }

        return list1;
    }
}
