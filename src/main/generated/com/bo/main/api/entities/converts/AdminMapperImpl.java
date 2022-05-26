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
    date = "2022-05-26T18:00:28+0900",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 11.0.6 (Oracle Corporation)"
)
@Component
public class AdminMapperImpl implements AdminMapper {

    @Override
    public AdminVo toVo(AdminEntity e) {
        if ( e == null ) {
            return null;
        }

        AdminVo adminVo = new AdminVo();

        return adminVo;
    }

    @Override
    public AdminEntity toEntity(AdminVo d) {
        if ( d == null ) {
            return null;
        }

        AdminEntity adminEntity = new AdminEntity();

        return adminEntity;
    }

    @Override
    public List<AdminVo> toVos(List<AdminEntity> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<AdminVo> list = new ArrayList<AdminVo>( entityList.size() );
        for ( AdminEntity adminEntity : entityList ) {
            list.add( toVo( adminEntity ) );
        }

        return list;
    }

    @Override
    public List<AdminEntity> toEntities(List<AdminVo> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<AdminEntity> list = new ArrayList<AdminEntity>( dtoList.size() );
        for ( AdminVo adminVo : dtoList ) {
            list.add( toEntity( adminVo ) );
        }

        return list;
    }

    @Override
    public void updateFromVo(AdminVo dto, AdminEntity entity) {
        if ( dto == null ) {
            return;
        }
    }

    @Override
    public AdminVo toVo(ReqAdminVo reqAdminVo) {
        if ( reqAdminVo == null ) {
            return null;
        }

        AdminVo adminVo = new AdminVo();

        return adminVo;
    }

    @Override
    public ResAdminVo toVo(AdminVo adminVo) {
        if ( adminVo == null ) {
            return null;
        }

        ResAdminVo resAdminVo = new ResAdminVo();

        return resAdminVo;
    }
}
