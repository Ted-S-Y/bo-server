package com.bo.main.api.entities.converts;

import com.bo.main.api.controller.vo.req.ReqClassPackageVo;
import com.bo.main.api.controller.vo.res.ResClassPackageVo;
import com.bo.main.api.entities.ClassPackageEntity;
import com.bo.main.api.entities.vo.ClassPackageVo;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

import java.util.List;

@Mapper(
        uses = {
                ClassPackageDetailMapper.class
        },
        componentModel = "spring"
)
public interface ClassPackageMapper extends GenericMapper<ClassPackageVo, ClassPackageEntity> {

    @Override
    @Mapping(target = "classPackageDetails", source = "classPackageDetailEntityList")
    ClassPackageVo toVo(ClassPackageEntity classPackageEntity);

    @Override
    @Mapping(target = "classPackageDetailEntityList", source = "classPackageDetails")
    ClassPackageEntity toEntity(ClassPackageVo classPackageVo);

    ClassPackageVo toVo(ReqClassPackageVo reqClassPackageVo);

    ResClassPackageVo toVo(ClassPackageVo classPackageVo);

    @Override
    @Mapping(target = "classPackageDetailEntityList", source = "classPackageDetails")
    void updateFromVo(ClassPackageVo dto, @MappingTarget ClassPackageEntity entity);
}
