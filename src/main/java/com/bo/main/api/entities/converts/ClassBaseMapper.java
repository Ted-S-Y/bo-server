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

    @Mapping(target = "videos", source = "classVideoEntityList")
    @Override
    ClassBaseVo toVo(ClassBaseEntity classBaseEntity);

    @Mapping(target = "classVideoEntityList", source = "videos")
    @Override
    ClassBaseEntity toEntity(ClassBaseVo classBaseVo);

    @Override
    List<ClassBaseVo> toVos(List<ClassBaseEntity> e);

    @Override
    List<ClassBaseEntity> toEntities(List<ClassBaseVo> d);


    ClassBaseVo toVo(ReqClassBaseVo reqClassBaseVo);

    ResClassBaseVo toVo(ClassBaseVo classBaseVo);

    @Mapping(target = "classVideoEntityList", source = "videos")
    void updateFromVo(ClassBaseVo dto, @MappingTarget ClassBaseEntity entity);

}
