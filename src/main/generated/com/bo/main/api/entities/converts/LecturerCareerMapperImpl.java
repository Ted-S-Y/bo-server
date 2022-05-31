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
    date = "2022-05-30T17:14:54+0900",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 11.0.6 (Oracle Corporation)"
)
@Component
public class LecturerCareerMapperImpl implements LecturerCareerMapper {

    @Override
    public List<LecturerCareerVo> toVos(List<LecturerCareerEntity> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<LecturerCareerVo> list = new ArrayList<LecturerCareerVo>( entityList.size() );
        for ( LecturerCareerEntity lecturerCareerEntity : entityList ) {
            list.add( toVo( lecturerCareerEntity ) );
        }

        return list;
    }

    @Override
    public List<LecturerCareerEntity> toEntities(List<LecturerCareerVo> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<LecturerCareerEntity> list = new ArrayList<LecturerCareerEntity>( dtoList.size() );
        for ( LecturerCareerVo lecturerCareerVo : dtoList ) {
            list.add( toEntity( lecturerCareerVo ) );
        }

        return list;
    }

    @Override
    public void updateFromVo(LecturerCareerVo dto, LecturerCareerEntity entity) {
        if ( dto == null ) {
            return;
        }

        if ( dto.getCarrSeq() != null ) {
            entity.setCarrSeq( dto.getCarrSeq() );
        }
        if ( dto.getCarrNm() != null ) {
            entity.setCarrNm( dto.getCarrNm() );
        }
        if ( dto.getCarrNo() != null ) {
            entity.setCarrNo( dto.getCarrNo() );
        }
    }

    @Override
    public LecturerCareerVo toVo(LecturerCareerEntity lecturerCareerEntity) {
        if ( lecturerCareerEntity == null ) {
            return null;
        }

        LecturerCareerVo lecturerCareerVo = new LecturerCareerVo();

        lecturerCareerVo.setCarrSeq( lecturerCareerEntity.getCarrSeq() );
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
