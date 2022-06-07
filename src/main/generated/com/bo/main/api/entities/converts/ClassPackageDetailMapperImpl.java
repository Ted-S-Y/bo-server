package com.bo.main.api.entities.converts;

import com.bo.main.api.entities.ClassPackageDetailEntity;
import com.bo.main.api.entities.vo.ClassPackageDetailVo;
import com.bo.main.api.entities.vo.ClassPackageVo;
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
public class ClassPackageDetailMapperImpl implements ClassPackageDetailMapper {

    @Autowired
    private ClassBaseMapper classBaseMapper;

    @Override
    public List<ClassPackageDetailVo> toVos(List<ClassPackageDetailEntity> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<ClassPackageDetailVo> list = new ArrayList<ClassPackageDetailVo>( arg0.size() );
        for ( ClassPackageDetailEntity classPackageDetailEntity : arg0 ) {
            list.add( toVo( classPackageDetailEntity ) );
        }

        return list;
    }

    @Override
    public List<ClassPackageDetailEntity> toEntities(List<ClassPackageDetailVo> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<ClassPackageDetailEntity> list = new ArrayList<ClassPackageDetailEntity>( arg0.size() );
        for ( ClassPackageDetailVo classPackageDetailVo : arg0 ) {
            list.add( toEntity( classPackageDetailVo ) );
        }

        return list;
    }

    @Override
    public void updateFromVo(ClassPackageDetailVo arg0, ClassPackageDetailEntity arg1) {
        if ( arg0 == null ) {
            return;
        }

        if ( arg0.getMapSeq() != null ) {
            arg1.setMapSeq( arg0.getMapSeq() );
        }
    }

    @Override
    public ClassPackageDetailVo toVo(ClassPackageDetailEntity classPackageDetailEntity) {
        if ( classPackageDetailEntity == null ) {
            return null;
        }

        ClassPackageDetailVo classPackageDetailVo = new ClassPackageDetailVo();

        classPackageDetailVo.setClassBaseVo( classBaseMapper.toVo( classPackageDetailEntity.getClassBaseEntity() ) );
        classPackageDetailVo.setMapSeq( classPackageDetailEntity.getMapSeq() );
        classPackageDetailVo.setCrtDtm( classPackageDetailEntity.getCrtDtm() );
        classPackageDetailVo.setCrtr( classPackageDetailEntity.getCrtr() );
        classPackageDetailVo.setUpdDtm( classPackageDetailEntity.getUpdDtm() );
        classPackageDetailVo.setUpdtr( classPackageDetailEntity.getUpdtr() );

        return classPackageDetailVo;
    }

    @Override
    public ClassPackageDetailEntity toEntity(ClassPackageDetailVo classPackageDetailVo) {
        if ( classPackageDetailVo == null ) {
            return null;
        }

        ClassPackageDetailEntity classPackageDetailEntity = new ClassPackageDetailEntity();

        classPackageDetailEntity.setClassBaseEntity( classBaseMapper.toEntity( classPackageDetailVo.getClassBaseVo() ) );
        classPackageDetailEntity.setMapSeq( classPackageDetailVo.getMapSeq() );

        return classPackageDetailEntity;
    }

    @Override
    public ClassPackageDetailVo toVo(ClassPackageVo classPackageVo) {
        if ( classPackageVo == null ) {
            return null;
        }

        ClassPackageDetailVo classPackageDetailVo = new ClassPackageDetailVo();

        classPackageDetailVo.setPackSeq( classPackageVo.getPackSeq() );
        classPackageDetailVo.setCrtDtm( classPackageVo.getCrtDtm() );
        classPackageDetailVo.setCrtr( classPackageVo.getCrtr() );
        classPackageDetailVo.setUpdDtm( classPackageVo.getUpdDtm() );
        classPackageDetailVo.setUpdtr( classPackageVo.getUpdtr() );

        return classPackageDetailVo;
    }
}
