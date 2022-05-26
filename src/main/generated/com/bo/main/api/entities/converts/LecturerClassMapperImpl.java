package com.bo.main.api.entities.converts;

import com.bo.main.api.entities.LecturerClassEntity;
import com.bo.main.api.entities.vo.LecturerClassVo;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-05-26T18:00:28+0900",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 11.0.6 (Oracle Corporation)"
)
@Component
public class LecturerClassMapperImpl implements LecturerClassMapper {

    @Override
    public void updateFromVo(LecturerClassVo dto, LecturerClassEntity entity) {
        if ( dto == null ) {
            return;
        }
    }

    @Override
    public LecturerClassVo toVo(LecturerClassEntity lecturerClassEntity) {
        if ( lecturerClassEntity == null ) {
            return null;
        }

        LecturerClassVo lecturerClassVo = new LecturerClassVo();

        return lecturerClassVo;
    }

    @Override
    public LecturerClassEntity toEntity(LecturerClassVo lecturerClassVo) {
        if ( lecturerClassVo == null ) {
            return null;
        }

        LecturerClassEntity lecturerClassEntity = new LecturerClassEntity();

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
