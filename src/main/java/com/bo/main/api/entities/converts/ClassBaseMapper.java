package com.bo.main.api.entities.converts;

import com.bo.main.api.controller.vo.req.ReqClassBaseVo;
import com.bo.main.api.controller.vo.res.ResClassBaseVo;
import com.bo.main.api.entities.ClassBaseEntity;
import com.bo.main.api.entities.vo.ClassBaseVo;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

import java.util.List;

@Mapper(
        uses = {
                ClassVideoMapper.class
        },
        componentModel = "spring"
)
public interface ClassBaseMapper extends GenericMapper<ClassBaseVo, ClassBaseEntity> {

    @Override
    @Mapping(target = "videos", source = "classVideoEntityList")
    ClassBaseVo toVo(ClassBaseEntity classBaseEntity);

    @Override
    @Mapping(target = "classVideoEntityList", source = "videos")
    ClassBaseEntity toEntity(ClassBaseVo classBaseVo);

    ClassBaseVo toVo(ReqClassBaseVo reqClassBaseVo);

    ResClassBaseVo toVo(ClassBaseVo classBaseVo);

    @Override
    @Mapping(target = "classVideoEntityList", source = "videos")
    void updateFromVo(ClassBaseVo dto, @MappingTarget ClassBaseEntity entity);

}
