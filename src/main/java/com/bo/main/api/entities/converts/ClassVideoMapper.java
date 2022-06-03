package com.bo.main.api.entities.converts;

import com.bo.main.api.controller.vo.req.ReqClassManageVo;
import com.bo.main.api.controller.vo.req.ReqClassVideoVo;
import com.bo.main.api.controller.vo.res.ResClassManageVo;
import com.bo.main.api.controller.vo.res.ResClassVideoVo;
import com.bo.main.api.entities.ClassVideoEntity;
import com.bo.main.api.entities.vo.ClassBaseVo;
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
    ClassVideoVo toVo(ClassVideoEntity classVideoEntity);

    @Mapping(target = "classBaseEntity", ignore = true)
    @Override
    ClassVideoEntity toEntity(ClassVideoVo classVideoVo);

    ClassVideoVo toVo(ClassBaseVo classBaseVo);

    @Mapping(target = "classBaseVo", ignore = true)
    ClassVideoVo toVo(ReqClassVideoVo reqClassBaseVo);

    @Mapping(target = "classBaseEntity", ignore = true)
    void updateFromVo(ClassVideoVo dto, @MappingTarget ClassVideoEntity entity);

}
