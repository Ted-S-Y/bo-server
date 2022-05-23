package com.bo.main.api.entities.converts;

import com.bo.main.api.entities.LecturerClassEntity;
import com.bo.main.api.entities.vo.LecturerClassVo;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-05-19T18:06:33+0900",
    comments = "version: 1.4.2.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-7.4.jar, environment: Java 11.0.6 (Oracle Corporation)"
)
@Component
public class LecturerClassMapperImpl implements LecturerClassMapper {

    @Override
    public LecturerClassVo toVo(LecturerClassEntity lecturerClassEntity) {
        if ( lecturerClassEntity == null ) {
            return null;
        }

        LecturerClassVo lecturerClassVo = new LecturerClassVo();

        lecturerClassVo.setLctrSeq( lecturerClassEntity.getLctrSeq() );
        lecturerClassVo.setClssSeq( lecturerClassEntity.getClssSeq() );
        lecturerClassVo.setCrtDtm( lecturerClassEntity.getCrtDtm() );
        lecturerClassVo.setCrtr( lecturerClassEntity.getCrtr() );
        lecturerClassVo.setUpdDtm( lecturerClassEntity.getUpdDtm() );
        lecturerClassVo.setUpdtr( lecturerClassEntity.getUpdtr() );

        return lecturerClassVo;
    }

    @Override
    public LecturerClassEntity toEntity(LecturerClassVo lecturerClassVo) {
        if ( lecturerClassVo == null ) {
            return null;
        }

        LecturerClassEntity lecturerClassEntity = new LecturerClassEntity();

        lecturerClassEntity.setLctrSeq( lecturerClassVo.getLctrSeq() );
        lecturerClassEntity.setClssSeq( lecturerClassVo.getClssSeq() );

        return lecturerClassEntity;
    }

    @Override
    public List<LecturerClassVo> toVos(List<LecturerClassEntity> e) {
        if ( e == null ) {
            return null;
        }

        List<LecturerClassVo> list = new ArrayList<LecturerClassVo>( e.size() );
        for ( LecturerClassEntity lecturerClassEntity : e ) {
            list.add( toVo( lecturerClassEntity ) );
        }

        return list;
    }

    @Override
    public List<LecturerClassEntity> toEntities(List<LecturerClassVo> d) {
        if ( d == null ) {
            return null;
        }

        List<LecturerClassEntity> list = new ArrayList<LecturerClassEntity>( d.size() );
        for ( LecturerClassVo lecturerClassVo : d ) {
            list.add( toEntity( lecturerClassVo ) );
        }

        return list;
    }
}
