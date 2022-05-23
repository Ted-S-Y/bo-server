package com.bo.main.api.entities.converts;

import com.bo.main.api.entities.ClassPackageDetailEntity;
import com.bo.main.api.entities.vo.ClassPackageDetailVo;
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
public class ClassPackageDetailMapperImpl implements ClassPackageDetailMapper {

    @Autowired
    private ClassBaseMapper classBaseMapper;

    @Override
    public ClassPackageDetailVo toVo(ClassPackageDetailEntity classPackageDetailEntity) {
        if ( classPackageDetailEntity == null ) {
            return null;
        }

        ClassPackageDetailVo classPackageDetailVo = new ClassPackageDetailVo();

        classPackageDetailVo.setClassBaseVo( classBaseMapper.toVo( classPackageDetailEntity.getClassBaseEntity() ) );
        classPackageDetailVo.setPackSeq( classPackageDetailEntity.getPackSeq() );
        classPackageDetailVo.setClssSeq( classPackageDetailEntity.getClssSeq() );
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
        classPackageDetailEntity.setPackSeq( classPackageDetailVo.getPackSeq() );
        classPackageDetailEntity.setClssSeq( classPackageDetailVo.getClssSeq() );

        return classPackageDetailEntity;
    }

    @Override
    public List<ClassPackageDetailVo> toVos(List<ClassPackageDetailEntity> e) {
        if ( e == null ) {
            return null;
        }

        List<ClassPackageDetailVo> list = new ArrayList<ClassPackageDetailVo>( e.size() );
        for ( ClassPackageDetailEntity classPackageDetailEntity : e ) {
            list.add( toVo( classPackageDetailEntity ) );
        }

        return list;
    }

    @Override
    public List<ClassPackageDetailEntity> toEntities(List<ClassPackageDetailVo> d) {
        if ( d == null ) {
            return null;
        }

        List<ClassPackageDetailEntity> list = new ArrayList<ClassPackageDetailEntity>( d.size() );
        for ( ClassPackageDetailVo classPackageDetailVo : d ) {
            list.add( toEntity( classPackageDetailVo ) );
        }

        return list;
    }
}
