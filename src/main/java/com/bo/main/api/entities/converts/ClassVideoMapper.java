package com.bo.main.api.entities.converts;

import com.bo.main.api.controller.vo.req.ReqClassVideoVo;
import com.bo.main.api.controller.vo.res.ResClassVideoVo;
import com.bo.main.api.entities.ClassVideoEntity;
import com.bo.main.api.entities.vo.ClassVideoVo;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

import java.util.List;

@Mapper(
        componentModel = "spring"
)
public interface ClassVideoMapper extends GenericMapper<ClassVideoVo, ClassVideoEntity> {

    @Mapping(target = "classBaseVo", ignore = true)
    @Override
    ClassVideoVo toVo(ClassVideoEntity classBaseEntity);

    @Mapping(target = "classBaseEntity", ignore = true)
    @Override
    ClassVideoEntity toEntity(ClassVideoVo classBaseVo);

    @Override
    List<ClassVideoVo> toVos(List<ClassVideoEntity> e);

    @Override
    List<ClassVideoEntity> toEntities(List<ClassVideoVo> d);


    @Mapping(target = "classBaseVo", ignore = true)
    ClassVideoVo toVo(ReqClassVideoVo reqClassBaseVo);

    ResClassVideoVo toVo(ClassVideoVo classBaseVo);

    @Mapping(target = "classBaseEntity", ignore = true)
    void updateFromVo(ClassVideoVo dto, @MappingTarget ClassVideoEntity entity);

}
