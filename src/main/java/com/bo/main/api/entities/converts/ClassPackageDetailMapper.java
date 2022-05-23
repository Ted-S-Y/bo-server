package com.bo.main.api.entities.converts;

import com.bo.main.api.entities.ClassPackageDetailEntity;
import com.bo.main.api.entities.ClassPackageEntity;
import com.bo.main.api.entities.vo.ClassPackageDetailVo;
import com.bo.main.api.entities.vo.ClassPackageVo;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(
        uses = { ClassBaseMapper.class },
        componentModel = "spring"
)
public interface ClassPackageDetailMapper extends GenericMapper<ClassPackageDetailVo, ClassPackageDetailEntity> {
    @Mapping(target = "classPackageVo", ignore = true)
    @Mapping(target = "classBaseVo", source = "classBaseEntity")
    @Override
    ClassPackageDetailVo toVo(ClassPackageDetailEntity classPackageDetailEntity);

    @Mapping(target = "classPackageEntity", ignore = true)
    @Mapping(target = "classBaseEntity", source = "classBaseVo")
    @Override
    ClassPackageDetailEntity toEntity(ClassPackageDetailVo classPackageDetailVo);

    @Override
    List<ClassPackageDetailVo> toVos(List<ClassPackageDetailEntity> e);

    @Override
    List<ClassPackageDetailEntity> toEntities(List<ClassPackageDetailVo> d);
}
