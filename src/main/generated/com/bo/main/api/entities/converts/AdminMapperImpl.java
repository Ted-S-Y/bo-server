package com.bo.main.api.entities.converts;

import com.bo.main.api.controller.vo.req.ReqAdminVo;
import com.bo.main.api.controller.vo.res.ResAdminVo;
import com.bo.main.api.entities.AdminEntity;
import com.bo.main.api.entities.vo.AdminVo;
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
public class AdminMapperImpl implements AdminMapper {

    @Override
    public AdminVo toVo(AdminEntity e) {
        if ( e == null ) {
            return null;
        }

        AdminVo adminVo = new AdminVo();

        adminVo.setAdmSeq( e.getAdmSeq() );
        adminVo.setAdmId( e.getAdmId() );
        adminVo.setAdmPwd( e.getAdmPwd() );
        adminVo.setAdmNm( e.getAdmNm() );
        adminVo.setAdmMobl( e.getAdmMobl() );
        adminVo.setAdmMail( e.getAdmMail() );
        adminVo.setUseYn( e.getUseYn() );
        adminVo.setCrtDtm( e.getCrtDtm() );
        adminVo.setCrtr( e.getCrtr() );
        adminVo.setUpdDtm( e.getUpdDtm() );
        adminVo.setUpdtr( e.getUpdtr() );

        return adminVo;
    }

    @Override
    public AdminEntity toEntity(AdminVo d) {
        if ( d == null ) {
            return null;
        }

        AdminEntity adminEntity = new AdminEntity();

        adminEntity.setAdmSeq( d.getAdmSeq() );
        adminEntity.setAdmId( d.getAdmId() );
        adminEntity.setAdmPwd( d.getAdmPwd() );
        adminEntity.setAdmNm( d.getAdmNm() );
        adminEntity.setAdmMobl( d.getAdmMobl() );
        adminEntity.setAdmMail( d.getAdmMail() );
        adminEntity.setUseYn( d.getUseYn() );

        return adminEntity;
    }

    @Override
    public List<AdminVo> toVos(List<AdminEntity> e) {
        if ( e == null ) {
            return null;
        }

        List<AdminVo> list = new ArrayList<AdminVo>( e.size() );
        for ( AdminEntity adminEntity : e ) {
            list.add( toVo( adminEntity ) );
        }

        return list;
    }

    @Override
    public List<AdminEntity> toEntities(List<AdminVo> d) {
        if ( d == null ) {
            return null;
        }

        List<AdminEntity> list = new ArrayList<AdminEntity>( d.size() );
        for ( AdminVo adminVo : d ) {
            list.add( toEntity( adminVo ) );
        }

        return list;
    }

    @Override
    public void updateFromVo(AdminVo dto, AdminEntity entity) {
        if ( dto == null ) {
            return;
        }

        if ( dto.getAdmSeq() != null ) {
            entity.setAdmSeq( dto.getAdmSeq() );
        }
        if ( dto.getAdmId() != null ) {
            entity.setAdmId( dto.getAdmId() );
        }
        if ( dto.getAdmPwd() != null ) {
            entity.setAdmPwd( dto.getAdmPwd() );
        }
        if ( dto.getAdmNm() != null ) {
            entity.setAdmNm( dto.getAdmNm() );
        }
        if ( dto.getAdmMobl() != null ) {
            entity.setAdmMobl( dto.getAdmMobl() );
        }
        if ( dto.getAdmMail() != null ) {
            entity.setAdmMail( dto.getAdmMail() );
        }
        if ( dto.getUseYn() != null ) {
            entity.setUseYn( dto.getUseYn() );
        }
    }

    @Override
    public AdminVo toVo(ReqAdminVo reqAdminVo) {
        if ( reqAdminVo == null ) {
            return null;
        }

        AdminVo adminVo = new AdminVo();

        adminVo.setAdmSeq( reqAdminVo.getAdmSeq() );
        adminVo.setAdmId( reqAdminVo.getAdmId() );
        adminVo.setAdmPwd( reqAdminVo.getAdmPwd() );
        adminVo.setAdmNm( reqAdminVo.getAdmNm() );
        adminVo.setAdmMobl( reqAdminVo.getAdmMobl() );
        adminVo.setAdmMail( reqAdminVo.getAdmMail() );
        adminVo.setUseYn( reqAdminVo.getUseYn() );
        adminVo.setCrtDtm( reqAdminVo.getCrtDtm() );
        adminVo.setCrtr( reqAdminVo.getCrtr() );
        adminVo.setUpdDtm( reqAdminVo.getUpdDtm() );
        adminVo.setUpdtr( reqAdminVo.getUpdtr() );

        return adminVo;
    }

    @Override
    public ResAdminVo toVo(AdminVo adminVo) {
        if ( adminVo == null ) {
            return null;
        }

        ResAdminVo resAdminVo = new ResAdminVo();

        resAdminVo.setCrtDtm( adminVo.getCrtDtm() );
        resAdminVo.setCrtr( adminVo.getCrtr() );
        resAdminVo.setUpdDtm( adminVo.getUpdDtm() );
        resAdminVo.setUpdtr( adminVo.getUpdtr() );
        resAdminVo.setAdmSeq( adminVo.getAdmSeq() );
        resAdminVo.setAdmId( adminVo.getAdmId() );
        resAdminVo.setAdmPwd( adminVo.getAdmPwd() );
        resAdminVo.setAdmNm( adminVo.getAdmNm() );
        resAdminVo.setAdmMobl( adminVo.getAdmMobl() );
        resAdminVo.setAdmMail( adminVo.getAdmMail() );
        resAdminVo.setUseYn( adminVo.getUseYn() );

        return resAdminVo;
    }
}
