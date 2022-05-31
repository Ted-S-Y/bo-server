package com.bo.main.api.entities.converts;

import com.bo.main.api.controller.vo.req.ReqLecturerVo;
import com.bo.main.api.controller.vo.res.ResLecturerCareerVo;
import com.bo.main.api.controller.vo.res.ResLecturerVo;
import com.bo.main.api.entities.LecturerCareerEntity;
import com.bo.main.api.entities.LecturerClassEntity;
import com.bo.main.api.entities.LecturerEntity;
import com.bo.main.api.entities.vo.LecturerCareerVo;
import com.bo.main.api.entities.vo.LecturerClassVo;
import com.bo.main.api.entities.vo.LecturerVo;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-05-30T17:15:06+0900",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 11.0.6 (Oracle Corporation)"
)
@Component
public class LecturerMapperImpl implements LecturerMapper {

    @Autowired
    private LecturerCareerMapper lecturerCareerMapper;

    @Override
    public List<LecturerVo> toVos(List<LecturerEntity> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<LecturerVo> list = new ArrayList<LecturerVo>( arg0.size() );
        for ( LecturerEntity lecturerEntity : arg0 ) {
            list.add( toVo( lecturerEntity ) );
        }

        return list;
    }

    @Override
    public List<LecturerEntity> toEntities(List<LecturerVo> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<LecturerEntity> list = new ArrayList<LecturerEntity>( arg0.size() );
        for ( LecturerVo lecturerVo : arg0 ) {
            list.add( toEntity( lecturerVo ) );
        }

        return list;
    }

    @Override
    public LecturerVo toVo(LecturerEntity lecturerEntity) {
        if ( lecturerEntity == null ) {
            return null;
        }

        LecturerVo lecturerVo = new LecturerVo();

        lecturerVo.setLecturerCareers( lecturerCareerMapper.toVos( lecturerEntity.getLecturerCareerEntityList() ) );
        lecturerVo.setLecturerClasses( lecturerClassEntityListToLecturerClassVoList( lecturerEntity.getLecturerClassEntityList() ) );
        lecturerVo.setLctrSeq( lecturerEntity.getLctrSeq() );
        lecturerVo.setLctrCd( lecturerEntity.getLctrCd() );
        lecturerVo.setLctrNm( lecturerEntity.getLctrNm() );
        lecturerVo.setMobl( lecturerEntity.getMobl() );
        lecturerVo.setMail( lecturerEntity.getMail() );
        lecturerVo.setSEX( lecturerEntity.getSEX() );
        lecturerVo.setLctrImg( lecturerEntity.getLctrImg() );
        lecturerVo.setCrtDtm( lecturerEntity.getCrtDtm() );
        lecturerVo.setCrtr( lecturerEntity.getCrtr() );
        lecturerVo.setUpdDtm( lecturerEntity.getUpdDtm() );
        lecturerVo.setUpdtr( lecturerEntity.getUpdtr() );

        return lecturerVo;
    }

    @Override
    public LecturerEntity toEntity(LecturerVo lecturerVo) {
        if ( lecturerVo == null ) {
            return null;
        }

        LecturerEntity lecturerEntity = new LecturerEntity();

        lecturerEntity.setLecturerCareerEntityList( lecturerCareerMapper.toEntities( lecturerVo.getLecturerCareers() ) );
        lecturerEntity.setLecturerClassEntityList( lecturerClassVoListToLecturerClassEntityList( lecturerVo.getLecturerClasses() ) );
        lecturerEntity.setLctrSeq( lecturerVo.getLctrSeq() );
        lecturerEntity.setLctrCd( lecturerVo.getLctrCd() );
        lecturerEntity.setLctrNm( lecturerVo.getLctrNm() );
        lecturerEntity.setMobl( lecturerVo.getMobl() );
        lecturerEntity.setMail( lecturerVo.getMail() );
        lecturerEntity.setSEX( lecturerVo.getSEX() );
        lecturerEntity.setLctrImg( lecturerVo.getLctrImg() );

        return lecturerEntity;
    }

    @Override
    public ResLecturerVo toVo(LecturerVo lecturerCareerVo) {
        if ( lecturerCareerVo == null ) {
            return null;
        }

        ResLecturerVo resLecturerVo = new ResLecturerVo();

        resLecturerVo.setResLecturerCareerVos( lecturerCareerVoListToResLecturerCareerVoList( lecturerCareerVo.getLecturerCareers() ) );
        resLecturerVo.setCrtDtm( lecturerCareerVo.getCrtDtm() );
        resLecturerVo.setCrtr( lecturerCareerVo.getCrtr() );
        resLecturerVo.setUpdDtm( lecturerCareerVo.getUpdDtm() );
        resLecturerVo.setUpdtr( lecturerCareerVo.getUpdtr() );
        resLecturerVo.setLctrSeq( lecturerCareerVo.getLctrSeq() );
        resLecturerVo.setLctrCd( lecturerCareerVo.getLctrCd() );
        resLecturerVo.setLctrNm( lecturerCareerVo.getLctrNm() );
        resLecturerVo.setMobl( lecturerCareerVo.getMobl() );
        resLecturerVo.setMail( lecturerCareerVo.getMail() );
        resLecturerVo.setSEX( lecturerCareerVo.getSEX() );
        resLecturerVo.setLctrImg( lecturerCareerVo.getLctrImg() );

        return resLecturerVo;
    }

    @Override
    public LecturerVo toVo(ReqLecturerVo reqLecturerVo) {
        if ( reqLecturerVo == null ) {
            return null;
        }

        LecturerVo lecturerVo = new LecturerVo();

        lecturerVo.setLctrSeq( reqLecturerVo.getLctrSeq() );
        lecturerVo.setLctrCd( reqLecturerVo.getLctrCd() );
        lecturerVo.setLctrNm( reqLecturerVo.getLctrNm() );
        lecturerVo.setMobl( reqLecturerVo.getMobl() );
        lecturerVo.setMail( reqLecturerVo.getMail() );
        lecturerVo.setSEX( reqLecturerVo.getSEX() );
        lecturerVo.setLctrImg( reqLecturerVo.getLctrImg() );
        lecturerVo.setCrtDtm( reqLecturerVo.getCrtDtm() );
        lecturerVo.setCrtr( reqLecturerVo.getCrtr() );
        lecturerVo.setUpdDtm( reqLecturerVo.getUpdDtm() );
        lecturerVo.setUpdtr( reqLecturerVo.getUpdtr() );

        return lecturerVo;
    }

    @Override
    public void updateFromVo(LecturerVo dto, LecturerEntity entity) {
        if ( dto == null ) {
            return;
        }

        if ( entity.getLecturerCareerEntityList() != null ) {
            List<LecturerCareerEntity> list = lecturerCareerMapper.toEntities( dto.getLecturerCareers() );
            if ( list != null ) {
                entity.getLecturerCareerEntityList().clear();
                entity.getLecturerCareerEntityList().addAll( list );
            }
        }
        else {
            List<LecturerCareerEntity> list = lecturerCareerMapper.toEntities( dto.getLecturerCareers() );
            if ( list != null ) {
                entity.setLecturerCareerEntityList( list );
            }
        }
        if ( entity.getLecturerClassEntityList() != null ) {
            List<LecturerClassEntity> list1 = lecturerClassVoListToLecturerClassEntityList( dto.getLecturerClasses() );
            if ( list1 != null ) {
                entity.getLecturerClassEntityList().clear();
                entity.getLecturerClassEntityList().addAll( list1 );
            }
        }
        else {
            List<LecturerClassEntity> list1 = lecturerClassVoListToLecturerClassEntityList( dto.getLecturerClasses() );
            if ( list1 != null ) {
                entity.setLecturerClassEntityList( list1 );
            }
        }
        if ( dto.getLctrSeq() != null ) {
            entity.setLctrSeq( dto.getLctrSeq() );
        }
        if ( dto.getLctrCd() != null ) {
            entity.setLctrCd( dto.getLctrCd() );
        }
        if ( dto.getLctrNm() != null ) {
            entity.setLctrNm( dto.getLctrNm() );
        }
        if ( dto.getMobl() != null ) {
            entity.setMobl( dto.getMobl() );
        }
        if ( dto.getMail() != null ) {
            entity.setMail( dto.getMail() );
        }
        if ( dto.getSEX() != null ) {
            entity.setSEX( dto.getSEX() );
        }
        if ( dto.getLctrImg() != null ) {
            entity.setLctrImg( dto.getLctrImg() );
        }
    }

    protected LecturerClassVo lecturerClassEntityToLecturerClassVo(LecturerClassEntity lecturerClassEntity) {
        if ( lecturerClassEntity == null ) {
            return null;
        }

        LecturerClassVo lecturerClassVo = new LecturerClassVo();

        lecturerClassVo.setCrtDtm( lecturerClassEntity.getCrtDtm() );
        lecturerClassVo.setCrtr( lecturerClassEntity.getCrtr() );
        lecturerClassVo.setUpdDtm( lecturerClassEntity.getUpdDtm() );
        lecturerClassVo.setUpdtr( lecturerClassEntity.getUpdtr() );

        return lecturerClassVo;
    }

    protected List<LecturerClassVo> lecturerClassEntityListToLecturerClassVoList(List<LecturerClassEntity> list) {
        if ( list == null ) {
            return null;
        }

        List<LecturerClassVo> list1 = new ArrayList<LecturerClassVo>( list.size() );
        for ( LecturerClassEntity lecturerClassEntity : list ) {
            list1.add( lecturerClassEntityToLecturerClassVo( lecturerClassEntity ) );
        }

        return list1;
    }

    protected LecturerClassEntity lecturerClassVoToLecturerClassEntity(LecturerClassVo lecturerClassVo) {
        if ( lecturerClassVo == null ) {
            return null;
        }

        LecturerClassEntity lecturerClassEntity = new LecturerClassEntity();

        return lecturerClassEntity;
    }

    protected List<LecturerClassEntity> lecturerClassVoListToLecturerClassEntityList(List<LecturerClassVo> list) {
        if ( list == null ) {
            return null;
        }

        List<LecturerClassEntity> list1 = new ArrayList<LecturerClassEntity>( list.size() );
        for ( LecturerClassVo lecturerClassVo : list ) {
            list1.add( lecturerClassVoToLecturerClassEntity( lecturerClassVo ) );
        }

        return list1;
    }

    protected List<ResLecturerCareerVo> lecturerCareerVoListToResLecturerCareerVoList(List<LecturerCareerVo> list) {
        if ( list == null ) {
            return null;
        }

        List<ResLecturerCareerVo> list1 = new ArrayList<ResLecturerCareerVo>( list.size() );
        for ( LecturerCareerVo lecturerCareerVo : list ) {
            list1.add( lecturerCareerMapper.toVo( lecturerCareerVo ) );
        }

        return list1;
    }
}
