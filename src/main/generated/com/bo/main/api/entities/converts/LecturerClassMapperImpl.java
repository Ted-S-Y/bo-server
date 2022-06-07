package com.bo.main.api.entities.converts;

import com.bo.main.api.entities.LecturerClassEntity;
import com.bo.main.api.entities.vo.ClassBaseVo;
import com.bo.main.api.entities.vo.LecturerClassVo;
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
public class LecturerClassMapperImpl implements LecturerClassMapper {

    @Override
    public LecturerClassVo toVo(LecturerClassEntity arg0) {
        if ( arg0 == null ) {
            return null;
        }

        LecturerClassVo lecturerClassVo = new LecturerClassVo();

        lecturerClassVo.setMapSeq( arg0.getMapSeq() );
        lecturerClassVo.setCrtDtm( arg0.getCrtDtm() );
        lecturerClassVo.setCrtr( arg0.getCrtr() );
        lecturerClassVo.setUpdDtm( arg0.getUpdDtm() );
        lecturerClassVo.setUpdtr( arg0.getUpdtr() );

        return lecturerClassVo;
    }

    @Override
    public LecturerClassEntity toEntity(LecturerClassVo arg0) {
        if ( arg0 == null ) {
            return null;
        }

        LecturerClassEntity lecturerClassEntity = new LecturerClassEntity();

        lecturerClassEntity.setMapSeq( arg0.getMapSeq() );

        return lecturerClassEntity;
    }

    @Override
    public List<LecturerClassVo> toVos(List<LecturerClassEntity> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<LecturerClassVo> list = new ArrayList<LecturerClassVo>( arg0.size() );
        for ( LecturerClassEntity lecturerClassEntity : arg0 ) {
            list.add( toVo( lecturerClassEntity ) );
        }

        return list;
    }

    @Override
    public List<LecturerClassEntity> toEntities(List<LecturerClassVo> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<LecturerClassEntity> list = new ArrayList<LecturerClassEntity>( arg0.size() );
        for ( LecturerClassVo lecturerClassVo : arg0 ) {
            list.add( toEntity( lecturerClassVo ) );
        }

        return list;
    }

    @Override
    public void updateFromVo(LecturerClassVo arg0, LecturerClassEntity arg1) {
        if ( arg0 == null ) {
            return;
        }

        if ( arg0.getMapSeq() != null ) {
            arg1.setMapSeq( arg0.getMapSeq() );
        }
    }

    @Override
    public LecturerClassVo toVo(ClassBaseVo classBaseVo) {
        if ( classBaseVo == null ) {
            return null;
        }

        LecturerClassVo lecturerClassVo = new LecturerClassVo();

        lecturerClassVo.setClssSeq( classBaseVo.getClssSeq() );
        lecturerClassVo.setCrtDtm( classBaseVo.getCrtDtm() );
        lecturerClassVo.setCrtr( classBaseVo.getCrtr() );
        lecturerClassVo.setUpdDtm( classBaseVo.getUpdDtm() );
        lecturerClassVo.setUpdtr( classBaseVo.getUpdtr() );

        return lecturerClassVo;
    }
}
