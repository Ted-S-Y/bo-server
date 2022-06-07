package com.bo.main.api.entities.converts;

import com.bo.main.api.controller.vo.req.ReqMemberVo;
import com.bo.main.api.controller.vo.res.ResMemberVo;
import com.bo.main.api.entities.MemberDeviceEntity;
import com.bo.main.api.entities.MemberEntity;
import com.bo.main.api.entities.vo.MemberDeviceVo;
import com.bo.main.api.entities.vo.MemberVo;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-06-07T17:39:51+0900",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 11.0.6 (Oracle Corporation)"
)
@Component
public class MemberMapperImpl implements MemberMapper {

    @Autowired
    private MemberDeviceMapper memberDeviceMapper;

    @Override
    public MemberVo toVo(MemberEntity classBaseEntity) {
        if ( classBaseEntity == null ) {
            return null;
        }

        MemberVo memberVo = new MemberVo();

        memberVo.setDevices( memberDeviceMapper.toVos( classBaseEntity.getMemberDeviceEntityList() ) );
        memberVo.setMbrSeq( classBaseEntity.getMbrSeq() );
        memberVo.setMbrId( classBaseEntity.getMbrId() );
        memberVo.setMbrNm( classBaseEntity.getMbrNm() );
        memberVo.setMbrPwd( classBaseEntity.getMbrPwd() );
        memberVo.setMobl( classBaseEntity.getMobl() );
        memberVo.setMail( classBaseEntity.getMail() );
        memberVo.setMktYn( classBaseEntity.getMktYn() );
        memberVo.setJoinDt( classBaseEntity.getJoinDt() );
        memberVo.setLgnDtm( classBaseEntity.getLgnDtm() );
        memberVo.setSlprYn( classBaseEntity.getSlprYn() );
        memberVo.setSspdYn( classBaseEntity.getSspdYn() );
        memberVo.setSspdCd( classBaseEntity.getSspdCd() );
        memberVo.setCrtDtm( classBaseEntity.getCrtDtm() );
        memberVo.setCrtr( classBaseEntity.getCrtr() );
        memberVo.setUpdDtm( classBaseEntity.getUpdDtm() );
        memberVo.setUpdtr( classBaseEntity.getUpdtr() );

        return memberVo;
    }

    @Override
    public MemberEntity toEntity(MemberVo memberVo) {
        if ( memberVo == null ) {
            return null;
        }

        MemberEntity memberEntity = new MemberEntity();

        memberEntity.setMemberDeviceEntityList( memberDeviceMapper.toEntities( memberVo.getDevices() ) );
        memberEntity.setMbrSeq( memberVo.getMbrSeq() );
        memberEntity.setMbrId( memberVo.getMbrId() );
        memberEntity.setMbrNm( memberVo.getMbrNm() );
        memberEntity.setMbrPwd( memberVo.getMbrPwd() );
        memberEntity.setMobl( memberVo.getMobl() );
        memberEntity.setMail( memberVo.getMail() );
        memberEntity.setMktYn( memberVo.getMktYn() );
        memberEntity.setJoinDt( memberVo.getJoinDt() );
        memberEntity.setLgnDtm( memberVo.getLgnDtm() );
        memberEntity.setSlprYn( memberVo.getSlprYn() );
        memberEntity.setSspdYn( memberVo.getSspdYn() );
        memberEntity.setSspdCd( memberVo.getSspdCd() );

        return memberEntity;
    }

    @Override
    public List<MemberVo> toVos(List<MemberEntity> e) {
        if ( e == null ) {
            return null;
        }

        List<MemberVo> list = new ArrayList<MemberVo>( e.size() );
        for ( MemberEntity memberEntity : e ) {
            list.add( toVo( memberEntity ) );
        }

        return list;
    }

    @Override
    public List<MemberEntity> toEntities(List<MemberVo> d) {
        if ( d == null ) {
            return null;
        }

        List<MemberEntity> list = new ArrayList<MemberEntity>( d.size() );
        for ( MemberVo memberVo : d ) {
            list.add( toEntity( memberVo ) );
        }

        return list;
    }

    @Override
    public MemberVo toVo(ReqMemberVo reqMemberVo) {
        if ( reqMemberVo == null ) {
            return null;
        }

        MemberVo memberVo = new MemberVo();

        memberVo.setMbrSeq( reqMemberVo.getMbrSeq() );
        memberVo.setMbrId( reqMemberVo.getMbrId() );
        memberVo.setMbrNm( reqMemberVo.getMbrNm() );
        memberVo.setMbrPwd( reqMemberVo.getMbrPwd() );
        memberVo.setMobl( reqMemberVo.getMobl() );
        memberVo.setMail( reqMemberVo.getMail() );
        memberVo.setSEX( reqMemberVo.getSEX() );
        memberVo.setMktYn( reqMemberVo.getMktYn() );
        memberVo.setJOB( reqMemberVo.getJOB() );
        memberVo.setADDR( reqMemberVo.getADDR() );
        memberVo.setJoinDt( reqMemberVo.getJoinDt() );
        memberVo.setLgnDtm( reqMemberVo.getLgnDtm() );
        memberVo.setSlprYn( reqMemberVo.getSlprYn() );
        memberVo.setSspdYn( reqMemberVo.getSspdYn() );
        memberVo.setSspdCd( reqMemberVo.getSspdCd() );
        memberVo.setCrtDtm( reqMemberVo.getCrtDtm() );
        memberVo.setCrtr( reqMemberVo.getCrtr() );
        memberVo.setUpdDtm( reqMemberVo.getUpdDtm() );
        memberVo.setUpdtr( reqMemberVo.getUpdtr() );
        List<MemberDeviceVo> list = reqMemberVo.getDevices();
        if ( list != null ) {
            memberVo.setDevices( new ArrayList<MemberDeviceVo>( list ) );
        }

        return memberVo;
    }

    @Override
    public ResMemberVo toVo(MemberVo memberVo) {
        if ( memberVo == null ) {
            return null;
        }

        ResMemberVo resMemberVo = new ResMemberVo();

        resMemberVo.setCrtDtm( memberVo.getCrtDtm() );
        resMemberVo.setCrtr( memberVo.getCrtr() );
        resMemberVo.setUpdDtm( memberVo.getUpdDtm() );
        resMemberVo.setUpdtr( memberVo.getUpdtr() );
        resMemberVo.setMbrSeq( memberVo.getMbrSeq() );
        resMemberVo.setMbrId( memberVo.getMbrId() );
        resMemberVo.setMbrNm( memberVo.getMbrNm() );
        resMemberVo.setMbrPwd( memberVo.getMbrPwd() );
        resMemberVo.setMobl( memberVo.getMobl() );
        resMemberVo.setMail( memberVo.getMail() );
        resMemberVo.setSEX( memberVo.getSEX() );
        resMemberVo.setMktYn( memberVo.getMktYn() );
        resMemberVo.setJOB( memberVo.getJOB() );
        resMemberVo.setADDR( memberVo.getADDR() );
        resMemberVo.setJoinDt( memberVo.getJoinDt() );
        resMemberVo.setLgnDtm( memberVo.getLgnDtm() );
        resMemberVo.setSlprYn( memberVo.getSlprYn() );
        resMemberVo.setSspdYn( memberVo.getSspdYn() );
        resMemberVo.setSspdCd( memberVo.getSspdCd() );

        return resMemberVo;
    }

    @Override
    public void updateFromVo(MemberVo dto, MemberEntity entity) {
        if ( dto == null ) {
            return;
        }

        if ( entity.getMemberDeviceEntityList() != null ) {
            List<MemberDeviceEntity> list = memberDeviceMapper.toEntities( dto.getDevices() );
            if ( list != null ) {
                entity.getMemberDeviceEntityList().clear();
                entity.getMemberDeviceEntityList().addAll( list );
            }
            else {
                entity.setMemberDeviceEntityList( null );
            }
        }
        else {
            List<MemberDeviceEntity> list = memberDeviceMapper.toEntities( dto.getDevices() );
            if ( list != null ) {
                entity.setMemberDeviceEntityList( list );
            }
        }
        entity.setMbrSeq( dto.getMbrSeq() );
        entity.setMbrId( dto.getMbrId() );
        entity.setMbrNm( dto.getMbrNm() );
        entity.setMbrPwd( dto.getMbrPwd() );
        entity.setMobl( dto.getMobl() );
        entity.setMail( dto.getMail() );
        entity.setMktYn( dto.getMktYn() );
        entity.setJoinDt( dto.getJoinDt() );
        entity.setLgnDtm( dto.getLgnDtm() );
        entity.setSlprYn( dto.getSlprYn() );
        entity.setSspdYn( dto.getSspdYn() );
        entity.setSspdCd( dto.getSspdCd() );
    }
}
