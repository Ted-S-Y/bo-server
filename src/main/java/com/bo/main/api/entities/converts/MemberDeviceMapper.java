package com.bo.main.api.entities.converts;

import com.bo.main.api.controller.vo.req.ReqMemberDeviceVo;
import com.bo.main.api.controller.vo.res.ResMemberDeviceVo;
import com.bo.main.api.entities.MemberDeviceEntity;
import com.bo.main.api.entities.vo.MemberDeviceVo;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

import java.util.List;

@Mapper(
    componentModel = "spring"
)
public interface MemberDeviceMapper extends GenericMapper<MemberDeviceVo, MemberDeviceEntity> {

    @Override
    @Mapping(target = "memberVo", ignore = true)
    MemberDeviceVo toVo(MemberDeviceEntity memberDeviceEntity);

    @Override
    @Mapping(target = "memberEntity", ignore = true)
    MemberDeviceEntity toEntity(MemberDeviceVo memberDeviceVo);

    @Override
    List<MemberDeviceVo> toVos(List<MemberDeviceEntity> e);

    @Override
    List<MemberDeviceEntity> toEntities(List<MemberDeviceVo> d);

    @Mapping(target = "memberVo", ignore = true)
    MemberDeviceVo toVo(ReqMemberDeviceVo reqMemberDeviceVo);

    ResMemberDeviceVo toVo(MemberDeviceVo memberDeviceVo);

    @Mapping(target = "memberEntity", ignore = true)
    void updateFromVo(MemberDeviceVo dto, @MappingTarget MemberDeviceEntity entity);


}
