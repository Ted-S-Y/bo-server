package com.bo.main.api.entities.converts;

import com.bo.main.api.entities.ClassVideoEntity;
import com.bo.main.api.entities.vo.ClassBaseVo;
import com.bo.main.api.entities.vo.ClassVideoVo;
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
public class ClassVideoMapperImpl implements ClassVideoMapper {

    @Override
    public List<ClassVideoVo> toVos(List<ClassVideoEntity> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<ClassVideoVo> list = new ArrayList<ClassVideoVo>( arg0.size() );
        for ( ClassVideoEntity classVideoEntity : arg0 ) {
            list.add( toVo( classVideoEntity ) );
        }

        return list;
    }

    @Override
    public List<ClassVideoEntity> toEntities(List<ClassVideoVo> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<ClassVideoEntity> list = new ArrayList<ClassVideoEntity>( arg0.size() );
        for ( ClassVideoVo classVideoVo : arg0 ) {
            list.add( toEntity( classVideoVo ) );
        }

        return list;
    }

    @Override
    public ClassVideoVo toVo(ClassVideoEntity classVideoEntity) {
        if ( classVideoEntity == null ) {
            return null;
        }

        ClassVideoVo classVideoVo = new ClassVideoVo();

        classVideoVo.setVdSeq( classVideoEntity.getVdSeq() );
        classVideoVo.setVdTtl( classVideoEntity.getVdTtl() );
        classVideoVo.setVdUrl( classVideoEntity.getVdUrl() );
        classVideoVo.setDelYn( classVideoEntity.getDelYn() );
        classVideoVo.setPrvYn( classVideoEntity.getPrvYn() );
        classVideoVo.setCrtDtm( classVideoEntity.getCrtDtm() );
        classVideoVo.setCrtr( classVideoEntity.getCrtr() );
        classVideoVo.setUpdDtm( classVideoEntity.getUpdDtm() );
        classVideoVo.setUpdtr( classVideoEntity.getUpdtr() );

        return classVideoVo;
    }

    @Override
    public ClassVideoEntity toEntity(ClassVideoVo classVideoVo) {
        if ( classVideoVo == null ) {
            return null;
        }

        ClassVideoEntity classVideoEntity = new ClassVideoEntity();

        classVideoEntity.setVdSeq( classVideoVo.getVdSeq() );
        classVideoEntity.setVdTtl( classVideoVo.getVdTtl() );
        classVideoEntity.setVdUrl( classVideoVo.getVdUrl() );
        classVideoEntity.setDelYn( classVideoVo.getDelYn() );
        classVideoEntity.setPrvYn( classVideoVo.getPrvYn() );

        return classVideoEntity;
    }

    @Override
    public ClassVideoVo toVo(ClassBaseVo classBaseVo) {
        if ( classBaseVo == null ) {
            return null;
        }

        ClassVideoVo classVideoVo = new ClassVideoVo();

        classVideoVo.setClssSeq( classBaseVo.getClssSeq() );
        classVideoVo.setPrvYn( classBaseVo.getPrvYn() );
        classVideoVo.setCrtDtm( classBaseVo.getCrtDtm() );
        classVideoVo.setCrtr( classBaseVo.getCrtr() );
        classVideoVo.setUpdDtm( classBaseVo.getUpdDtm() );
        classVideoVo.setUpdtr( classBaseVo.getUpdtr() );

        return classVideoVo;
    }

    @Override
    public void updateFromVo(ClassVideoVo dto, ClassVideoEntity entity) {
        if ( dto == null ) {
            return;
        }

        entity.setVdSeq( dto.getVdSeq() );
        entity.setVdTtl( dto.getVdTtl() );
        entity.setVdUrl( dto.getVdUrl() );
        entity.setDelYn( dto.getDelYn() );
        entity.setPrvYn( dto.getPrvYn() );
    }
}
