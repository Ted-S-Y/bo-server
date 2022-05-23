package com.bo.main.api.entities.converts;

import com.bo.main.api.controller.vo.req.ReqClassVideoVo;
import com.bo.main.api.controller.vo.res.ResClassVideoVo;
import com.bo.main.api.entities.ClassVideoEntity;
import com.bo.main.api.entities.vo.ClassVideoVo;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-05-19T18:06:32+0900",
    comments = "version: 1.4.2.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-7.4.jar, environment: Java 11.0.6 (Oracle Corporation)"
)
@Component
public class ClassVideoMapperImpl implements ClassVideoMapper {

    @Override
    public ClassVideoVo toVo(ClassVideoEntity classBaseEntity) {
        if ( classBaseEntity == null ) {
            return null;
        }

        ClassVideoVo classVideoVo = new ClassVideoVo();

        classVideoVo.setVdSeq( classBaseEntity.getVdSeq() );
        classVideoVo.setClssSeq( classBaseEntity.getClssSeq() );
        classVideoVo.setVdTtl( classBaseEntity.getVdTtl() );
        classVideoVo.setVdUrl( classBaseEntity.getVdUrl() );
        classVideoVo.setDelYn( classBaseEntity.getDelYn() );
        classVideoVo.setPrvYn( classBaseEntity.getPrvYn() );
        classVideoVo.setCrtDtm( classBaseEntity.getCrtDtm() );
        classVideoVo.setCrtr( classBaseEntity.getCrtr() );
        classVideoVo.setUpdDtm( classBaseEntity.getUpdDtm() );
        classVideoVo.setUpdtr( classBaseEntity.getUpdtr() );

        return classVideoVo;
    }

    @Override
    public ClassVideoEntity toEntity(ClassVideoVo classBaseVo) {
        if ( classBaseVo == null ) {
            return null;
        }

        ClassVideoEntity classVideoEntity = new ClassVideoEntity();

        classVideoEntity.setVdSeq( classBaseVo.getVdSeq() );
        classVideoEntity.setClssSeq( classBaseVo.getClssSeq() );
        classVideoEntity.setVdTtl( classBaseVo.getVdTtl() );
        classVideoEntity.setVdUrl( classBaseVo.getVdUrl() );
        classVideoEntity.setDelYn( classBaseVo.getDelYn() );
        classVideoEntity.setPrvYn( classBaseVo.getPrvYn() );

        return classVideoEntity;
    }

    @Override
    public List<ClassVideoVo> toVos(List<ClassVideoEntity> e) {
        if ( e == null ) {
            return null;
        }

        List<ClassVideoVo> list = new ArrayList<ClassVideoVo>( e.size() );
        for ( ClassVideoEntity classVideoEntity : e ) {
            list.add( toVo( classVideoEntity ) );
        }

        return list;
    }

    @Override
    public List<ClassVideoEntity> toEntities(List<ClassVideoVo> d) {
        if ( d == null ) {
            return null;
        }

        List<ClassVideoEntity> list = new ArrayList<ClassVideoEntity>( d.size() );
        for ( ClassVideoVo classVideoVo : d ) {
            list.add( toEntity( classVideoVo ) );
        }

        return list;
    }

    @Override
    public ClassVideoVo toVo(ReqClassVideoVo reqClassBaseVo) {
        if ( reqClassBaseVo == null ) {
            return null;
        }

        ClassVideoVo classVideoVo = new ClassVideoVo();

        classVideoVo.setVdSeq( reqClassBaseVo.getVdSeq() );
        classVideoVo.setClssSeq( reqClassBaseVo.getClssSeq() );
        classVideoVo.setVdTtl( reqClassBaseVo.getVdTtl() );
        classVideoVo.setVdUrl( reqClassBaseVo.getVdUrl() );
        classVideoVo.setDelYn( reqClassBaseVo.getDelYn() );
        classVideoVo.setPrvYn( reqClassBaseVo.getPrvYn() );
        classVideoVo.setCrtDtm( reqClassBaseVo.getCrtDtm() );
        classVideoVo.setCrtr( reqClassBaseVo.getCrtr() );
        classVideoVo.setUpdDtm( reqClassBaseVo.getUpdDtm() );
        classVideoVo.setUpdtr( reqClassBaseVo.getUpdtr() );

        return classVideoVo;
    }

    @Override
    public ResClassVideoVo toVo(ClassVideoVo classBaseVo) {
        if ( classBaseVo == null ) {
            return null;
        }

        ResClassVideoVo resClassVideoVo = new ResClassVideoVo();

        resClassVideoVo.setCrtDtm( classBaseVo.getCrtDtm() );
        resClassVideoVo.setCrtr( classBaseVo.getCrtr() );
        resClassVideoVo.setUpdDtm( classBaseVo.getUpdDtm() );
        resClassVideoVo.setUpdtr( classBaseVo.getUpdtr() );
        resClassVideoVo.setVdSeq( classBaseVo.getVdSeq() );
        resClassVideoVo.setClssSeq( classBaseVo.getClssSeq() );
        resClassVideoVo.setVdTtl( classBaseVo.getVdTtl() );
        resClassVideoVo.setVdUrl( classBaseVo.getVdUrl() );
        resClassVideoVo.setDelYn( classBaseVo.getDelYn() );
        resClassVideoVo.setPrvYn( classBaseVo.getPrvYn() );

        return resClassVideoVo;
    }

    @Override
    public void updateFromVo(ClassVideoVo dto, ClassVideoEntity entity) {
        if ( dto == null ) {
            return;
        }

        entity.setVdSeq( dto.getVdSeq() );
        entity.setClssSeq( dto.getClssSeq() );
        entity.setVdTtl( dto.getVdTtl() );
        entity.setVdUrl( dto.getVdUrl() );
        entity.setDelYn( dto.getDelYn() );
        entity.setPrvYn( dto.getPrvYn() );
    }
}
