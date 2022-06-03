package com.bo.main.api.entities.converts;

import com.bo.main.api.controller.vo.req.ReqClassManageVo;
import com.bo.main.api.controller.vo.res.ResClassManageVo;
import com.bo.main.api.entities.ClassBaseEntity;
import com.bo.main.api.entities.ClassPackageDetailEntity;
import com.bo.main.api.entities.ClassVideoEntity;
import com.bo.main.api.entities.LecturerClassEntity;
import com.bo.main.api.entities.vo.ClassBaseVo;
import com.bo.main.api.entities.vo.ClassPackageDetailVo;
import com.bo.main.api.entities.vo.ClassVideoVo;
import com.bo.main.api.entities.vo.LecturerClassVo;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-06-02T17:31:06+0900",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 11.0.6 (Oracle Corporation)"
)
@Component
public class ClassBaseMapperImpl implements ClassBaseMapper {

    @Autowired
    private ClassVideoMapper classVideoMapper;
    @Autowired
    private LecturerClassMapper lecturerClassMapper;
    @Autowired
    private ClassPackageDetailMapper classPackageDetailMapper;

    @Override
    public List<ClassBaseVo> toVos(List<ClassBaseEntity> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<ClassBaseVo> list = new ArrayList<ClassBaseVo>( arg0.size() );
        for ( ClassBaseEntity classBaseEntity : arg0 ) {
            list.add( toVo( classBaseEntity ) );
        }

        return list;
    }

    @Override
    public List<ClassBaseEntity> toEntities(List<ClassBaseVo> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<ClassBaseEntity> list = new ArrayList<ClassBaseEntity>( arg0.size() );
        for ( ClassBaseVo classBaseVo : arg0 ) {
            list.add( toEntity( classBaseVo ) );
        }

        return list;
    }

    @Override
    public ClassBaseVo toVo(ClassBaseEntity classBaseEntity) {
        if ( classBaseEntity == null ) {
            return null;
        }

        ClassBaseVo classBaseVo = new ClassBaseVo();

        classBaseVo.setVideos( classVideoMapper.toVos( classBaseEntity.getClassVideoEntityList() ) );
        classBaseVo.setLecturerClasses( lecturerClassMapper.toVos( classBaseEntity.getLecturerClassEntityList() ) );
        classBaseVo.setDetails( classPackageDetailMapper.toVos( classBaseEntity.getClassPackageDetailEntityList() ) );
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
        classBaseEntity.setLecturerClassEntityList( lecturerClassMapper.toEntities( classBaseVo.getLecturerClasses() ) );
        classBaseEntity.setClassPackageDetailEntityList( classPackageDetailMapper.toEntities( classBaseVo.getDetails() ) );
        classBaseEntity.setClssSeq( classBaseVo.getClssSeq() );
        classBaseEntity.setClssCd( classBaseVo.getClssCd() );
        classBaseEntity.setClssNm( classBaseVo.getClssNm() );
        classBaseEntity.setClssDesc( classBaseVo.getClssDesc() );
        classBaseEntity.setPrvYn( classBaseVo.getPrvYn() );
        classBaseEntity.setUseYn( classBaseVo.getUseYn() );

        return classBaseEntity;
    }

    @Override
    public ClassBaseVo toVo(ReqClassManageVo reqClassManageVo) {
        if ( reqClassManageVo == null ) {
            return null;
        }

        ClassBaseVo classBaseVo = new ClassBaseVo();

        classBaseVo.setClssSeq( reqClassManageVo.getClssSeq() );
        classBaseVo.setClssCd( reqClassManageVo.getClssCd() );
        classBaseVo.setClssNm( reqClassManageVo.getClssNm() );
        classBaseVo.setClssDesc( reqClassManageVo.getClssDesc() );
        classBaseVo.setPrvYn( reqClassManageVo.getPrvYn() );
        classBaseVo.setUseYn( reqClassManageVo.getUseYn() );
        classBaseVo.setCrtDtm( reqClassManageVo.getCrtDtm() );
        classBaseVo.setCrtr( reqClassManageVo.getCrtr() );
        classBaseVo.setUpdDtm( reqClassManageVo.getUpdDtm() );
        classBaseVo.setUpdtr( reqClassManageVo.getUpdtr() );
        List<ClassVideoVo> list = reqClassManageVo.getVideos();
        if ( list != null ) {
            classBaseVo.setVideos( new ArrayList<ClassVideoVo>( list ) );
        }

        return classBaseVo;
    }

    @Override
    public ResClassManageVo toVo(ClassBaseVo classBaseVo) {
        if ( classBaseVo == null ) {
            return null;
        }

        ResClassManageVo resClassManageVo = new ResClassManageVo();

        resClassManageVo.setCrtDtm( classBaseVo.getCrtDtm() );
        resClassManageVo.setCrtr( classBaseVo.getCrtr() );
        resClassManageVo.setUpdDtm( classBaseVo.getUpdDtm() );
        resClassManageVo.setUpdtr( classBaseVo.getUpdtr() );
        resClassManageVo.setClssSeq( classBaseVo.getClssSeq() );
        resClassManageVo.setClssCd( classBaseVo.getClssCd() );
        resClassManageVo.setClssNm( classBaseVo.getClssNm() );
        resClassManageVo.setClssDesc( classBaseVo.getClssDesc() );
        resClassManageVo.setPrvYn( classBaseVo.getPrvYn() );
        resClassManageVo.setUseYn( classBaseVo.getUseYn() );
        List<ClassVideoVo> list = classBaseVo.getVideos();
        if ( list != null ) {
            resClassManageVo.setVideos( new ArrayList<ClassVideoVo>( list ) );
        }
        List<ClassPackageDetailVo> list1 = classBaseVo.getDetails();
        if ( list1 != null ) {
            resClassManageVo.setDetails( new ArrayList<ClassPackageDetailVo>( list1 ) );
        }
        List<LecturerClassVo> list2 = classBaseVo.getLecturerClasses();
        if ( list2 != null ) {
            resClassManageVo.setLecturerClasses( new ArrayList<LecturerClassVo>( list2 ) );
        }

        return resClassManageVo;
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
        if ( entity.getLecturerClassEntityList() != null ) {
            List<LecturerClassEntity> list1 = lecturerClassMapper.toEntities( dto.getLecturerClasses() );
            if ( list1 != null ) {
                entity.getLecturerClassEntityList().clear();
                entity.getLecturerClassEntityList().addAll( list1 );
            }
            else {
                entity.setLecturerClassEntityList( null );
            }
        }
        else {
            List<LecturerClassEntity> list1 = lecturerClassMapper.toEntities( dto.getLecturerClasses() );
            if ( list1 != null ) {
                entity.setLecturerClassEntityList( list1 );
            }
        }
        if ( entity.getClassPackageDetailEntityList() != null ) {
            List<ClassPackageDetailEntity> list2 = classPackageDetailMapper.toEntities( dto.getDetails() );
            if ( list2 != null ) {
                entity.getClassPackageDetailEntityList().clear();
                entity.getClassPackageDetailEntityList().addAll( list2 );
            }
            else {
                entity.setClassPackageDetailEntityList( null );
            }
        }
        else {
            List<ClassPackageDetailEntity> list2 = classPackageDetailMapper.toEntities( dto.getDetails() );
            if ( list2 != null ) {
                entity.setClassPackageDetailEntityList( list2 );
            }
        }
        entity.setClssSeq( dto.getClssSeq() );
        entity.setClssCd( dto.getClssCd() );
        entity.setClssNm( dto.getClssNm() );
        entity.setClssDesc( dto.getClssDesc() );
        entity.setPrvYn( dto.getPrvYn() );
        entity.setUseYn( dto.getUseYn() );
    }
}
