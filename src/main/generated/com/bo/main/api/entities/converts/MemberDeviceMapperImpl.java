package com.bo.main.api.entities.converts;

import com.bo.main.api.entities.MemberDeviceEntity;
import com.bo.main.api.entities.vo.MemberDeviceVo;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-06-08T11:19:03+0900",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 11.0.6 (Oracle Corporation)"
)
@Component
public class MemberDeviceMapperImpl implements MemberDeviceMapper {

    @Override
    public MemberDeviceVo toVo(MemberDeviceEntity memberDeviceEntity) {
        if ( memberDeviceEntity == null ) {
            return null;
        }

        MemberDeviceVo memberDeviceVo = new MemberDeviceVo();

        memberDeviceVo.setDvSeq( memberDeviceEntity.getDvSeq() );
        memberDeviceVo.setDvNm( memberDeviceEntity.getDvNm() );
        memberDeviceVo.setOS( memberDeviceEntity.getOS() );
        memberDeviceVo.setDvTyp( memberDeviceEntity.getDvTyp() );
        memberDeviceVo.setDelYn( memberDeviceEntity.getDelYn() );
        memberDeviceVo.setCrtDtm( memberDeviceEntity.getCrtDtm() );
        memberDeviceVo.setCrtr( memberDeviceEntity.getCrtr() );
        memberDeviceVo.setUpdDtm( memberDeviceEntity.getUpdDtm() );
        memberDeviceVo.setUpdtr( memberDeviceEntity.getUpdtr() );

        return memberDeviceVo;
    }

    @Override
    public MemberDeviceEntity toEntity(MemberDeviceVo memberDeviceVo) {
        if ( memberDeviceVo == null ) {
            return null;
        }

        MemberDeviceEntity memberDeviceEntity = new MemberDeviceEntity();

        memberDeviceEntity.setDvSeq( memberDeviceVo.getDvSeq() );
        memberDeviceEntity.setDvNm( memberDeviceVo.getDvNm() );
        memberDeviceEntity.setOS( memberDeviceVo.getOS() );
        memberDeviceEntity.setDvTyp( memberDeviceVo.getDvTyp() );
        memberDeviceEntity.setDelYn( memberDeviceVo.getDelYn() );

        return memberDeviceEntity;
    }

    @Override
    public List<MemberDeviceVo> toVos(List<MemberDeviceEntity> e) {
        if ( e == null ) {
            return null;
        }

        List<MemberDeviceVo> list = new ArrayList<MemberDeviceVo>( e.size() );
        for ( MemberDeviceEntity memberDeviceEntity : e ) {
            list.add( toVo( memberDeviceEntity ) );
        }

        return list;
    }

    @Override
    public List<MemberDeviceEntity> toEntities(List<MemberDeviceVo> d) {
        if ( d == null ) {
            return null;
        }

        List<MemberDeviceEntity> list = new ArrayList<MemberDeviceEntity>( d.size() );
        for ( MemberDeviceVo memberDeviceVo : d ) {
            list.add( toEntity( memberDeviceVo ) );
        }

        return list;
    }

    @Override
    public void updateFromVo(MemberDeviceVo dto, MemberDeviceEntity entity) {
        if ( dto == null ) {
            return;
        }

        entity.setDvSeq( dto.getDvSeq() );
        entity.setDvNm( dto.getDvNm() );
        entity.setOS( dto.getOS() );
        entity.setDvTyp( dto.getDvTyp() );
        entity.setDelYn( dto.getDelYn() );
    }
}
