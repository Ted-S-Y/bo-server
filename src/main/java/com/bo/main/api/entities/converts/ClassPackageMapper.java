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

    @Mapping(target = "classPackageDetailVoList", source = "classPackageDetailEntities")
    @Override
    ClassPackageVo toVo(ClassPackageEntity classPackageEntity);

    @Mapping(target = "classPackageDetailEntities", source = "classPackageDetailVoList")
    @Override
    ClassPackageEntity toEntity(ClassPackageVo classPackageVo);

    @Override
    List<ClassPackageVo> toVos(List<ClassPackageEntity> e);

    @Override
    List<ClassPackageEntity> toEntities(List<ClassPackageVo> d);



    ClassPackageVo toVo(ReqClassPackageVo reqClassPackageVo);

    ResClassPackageVo toVo(ClassPackageVo classPackageVo);

    @Mapping(target = "classPackageDetailEntities", source = "classPackageDetailVoList")
    void updateFromVo(ClassPackageVo dto, @MappingTarget ClassPackageEntity entity);
}
