package com.bo.main.api.entities.converts;

import com.bo.main.api.controller.vo.req.ReqMemberVo;
import com.bo.main.api.controller.vo.res.ResMemberVo;
import com.bo.main.api.entities.MemberEntity;
import com.bo.main.api.entities.vo.MemberVo;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

import java.util.List;

@Mapper(
    uses = {
            MemberDeviceMapper.class
    },
    componentModel = "spring"
)
public interface MemberMapper extends GenericMapper<MemberVo, MemberEntity> {

    @Mapping(target = "devices", source = "memberDeviceEntityList")

    @Override
    MemberVo toVo(MemberEntity memberEntity);

    @Mapping(target = "memberDeviceEntityList", source = "devices")
    @Override
    MemberEntity toEntity(MemberVo memberVo);

    @Override
    List<MemberVo> toVos(List<MemberEntity> e);

    @Override
    List<MemberEntity> toEntities(List<MemberVo> d);


    MemberVo toVo(ReqMemberVo reqMemberVo);

    ResMemberVo toVo(MemberVo memberVo);


    @Mapping(target = "memberDeviceEntityList", source = "devices")
    void updateFromVo(MemberVo dto, @MappingTarget MemberEntity entity);

}
