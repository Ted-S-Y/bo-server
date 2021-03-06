package com.bo.main.api.entities.converts;

import com.bo.main.api.controller.vo.req.ReqPackageVo;
import com.bo.main.api.controller.vo.res.ResPackageVo;
import com.bo.main.api.entities.ClassPackageEntity;
import com.bo.main.api.entities.vo.ClassPackageVo;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

@Mapper(
        uses = {
                ClassPackageDetailMapper.class
        },
        componentModel = "spring"
)
public interface ClassPackageMapper extends GenericMapper<ClassPackageVo, ClassPackageEntity> {

    @Override
    @Mapping(target = "classPackageDetails", source = "classPackageDetailEntityList")
    @Mapping(target = "salesProductDetails", source = "salesProductDetailEntityList")
    ClassPackageVo toVo(ClassPackageEntity classPackageEntity);

    @Override
    @Mapping(target = "classPackageDetailEntityList", source = "classPackageDetails")
    @Mapping(target = "salesProductDetailEntityList", source = "salesProductDetails")
    ClassPackageEntity toEntity(ClassPackageVo classPackageVo);

    ClassPackageVo toVo(ReqPackageVo reqPackageVo);

    ResPackageVo toVo(ClassPackageVo classPackageVo);

    @Override
    @Mapping(target = "classPackageDetailEntityList", source = "classPackageDetails")
    @Mapping(target = "salesProductDetailEntityList", source = "salesProductDetails")
    void updateFromVo(ClassPackageVo dto, @MappingTarget ClassPackageEntity entity);
}
