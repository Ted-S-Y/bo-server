package com.bo.main.api.entities.converts;

import com.bo.main.api.controller.vo.res.ResLecturerCareerVo;
import com.bo.main.api.entities.LecturerCareerEntity;
import com.bo.main.api.entities.vo.LecturerCareerVo;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-05-23T11:40:34+0900",
    comments = "version: 1.4.2.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-7.4.jar, environment: Java 11.0.6 (Oracle Corporation)"
)
@Component
public class LecturerCareerMapperImpl implements LecturerCareerMapper {

    @Override
    public List<LecturerCareerVo> toVos(List<LecturerCareerEntity> e) {
        if ( e == null ) {
            return null;
        }

        List<LecturerCareerVo> list = new ArrayList<LecturerCareerVo>( e.size() );
        for ( LecturerCareerEntity lecturerCareerEntity : e ) {
            list.add( toVo( lecturerCareerEntity ) );
        }

        return list;
    }

    @Override
    public List<LecturerCareerEntity> toEntities(List<LecturerCareerVo> d) {
        if ( d == null ) {
            return null;
        }

        List<LecturerCareerEntity> list = new ArrayList<LecturerCareerEntity>( d.size() );
        for ( LecturerCareerVo lecturerCareerVo : d ) {
            list.add( toEntity( lecturerCareerVo ) );
        }

        return list;
    }

    @Override
    public LecturerCareerVo toVo(LecturerCareerEntity lecturerCareerEntity) {
        if ( lecturerCareerEntity == null ) {
            return null;
        }

        LecturerCareerVo lecturerCareerVo = new LecturerCareerVo();

        lecturerCareerVo.setCarrSeq( lecturerCareerEntity.getCarrSeq() );
        lecturerCareerVo.setLctrSeq( lecturerCareerEntity.getLctrSeq() );
        lecturerCareerVo.setCarrNm( lecturerCareerEntity.getCarrNm() );
        lecturerCareerVo.setCarrNo( lecturerCareerEntity.getCarrNo() );
        lecturerCareerVo.setCrtDtm( lecturerCareerEntity.getCrtDtm() );
        lecturerCareerVo.setCrtr( lecturerCareerEntity.getCrtr() );
        lecturerCareerVo.setUpdDtm( lecturerCareerEntity.getUpdDtm() );
        lecturerCareerVo.setUpdtr( lecturerCareerEntity.getUpdtr() );

        return lecturerCareerVo;
    }

    @Override
    public LecturerCareerEntity toEntity(LecturerCareerVo lecturerCareerVo) {
        if ( lecturerCareerVo == null ) {
            return null;
        }

        LecturerCareerEntity lecturerCareerEntity = new LecturerCareerEntity();

        lecturerCareerEntity.setCarrSeq( lecturerCareerVo.getCarrSeq() );
        lecturerCareerEntity.setLctrSeq( lecturerCareerVo.getLctrSeq() );
        lecturerCareerEntity.setCarrNm( lecturerCareerVo.getCarrNm() );
        lecturerCareerEntity.setCarrNo( lecturerCareerVo.getCarrNo() );

        return lecturerCareerEntity;
    }

    @Override
    public ResLecturerCareerVo toVo(LecturerCareerVo lecturerCareerVo) {
        if ( lecturerCareerVo == null ) {
            return null;
        }

        ResLecturerCareerVo resLecturerCareerVo = new ResLecturerCareerVo();

        resLecturerCareerVo.setCrtDtm( lecturerCareerVo.getCrtDtm() );
        resLecturerCareerVo.setCrtr( lecturerCareerVo.getCrtr() );
        resLecturerCareerVo.setUpdDtm( lecturerCareerVo.getUpdDtm() );
        resLecturerCareerVo.setUpdtr( lecturerCareerVo.getUpdtr() );
        resLecturerCareerVo.setCarrSeq( lecturerCareerVo.getCarrSeq() );
        resLecturerCareerVo.setCarrNm( lecturerCareerVo.getCarrNm() );
        resLecturerCareerVo.setCarrNo( lecturerCareerVo.getCarrNo() );

        return resLecturerCareerVo;
    }
}
