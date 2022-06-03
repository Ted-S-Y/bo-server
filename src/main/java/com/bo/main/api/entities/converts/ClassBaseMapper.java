package com.bo.main.api.entities.converts;

import com.bo.main.api.controller.vo.req.ReqClassManageVo;
import com.bo.main.api.controller.vo.res.ResClassManageVo;
import com.bo.main.api.entities.ClassBaseEntity;
import com.bo.main.api.entities.vo.ClassBaseVo;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.Mappings;

@Mapper(
        uses = {
                ClassVideoMapper.class,
                LecturerClassMapper.class,
                ClassPackageDetailMapper.class
        },
        componentModel = "spring"
)
public interface ClassBaseMapper extends GenericMapper<ClassBaseVo, ClassBaseEntity> {

    @Override
    @Mappings({
            @Mapping(target = "videos", source = "classVideoEntityList"),
            @Mapping(target = "lecturerClasses", source = "lecturerClassEntityList"),
            @Mapping(target = "details", source = "classPackageDetailEntityList")
    })
    ClassBaseVo toVo(ClassBaseEntity classBaseEntity);

    @Override
    @Mappings({
            @Mapping(target = "classVideoEntityList", source = "videos"),
            @Mapping(target = "lecturerClassEntityList", source = "lecturerClasses"),
            @Mapping(target = "classPackageDetailEntityList", source = "details")
    })
    ClassBaseEntity toEntity(ClassBaseVo classBaseVo);

    ClassBaseVo toVo(ReqClassManageVo reqClassManageVo);

    ResClassManageVo toVo(ClassBaseVo classBaseVo);

    @Override
    @Mappings({
            @Mapping(target = "classVideoEntityList", source = "videos"),
            @Mapping(target = "lecturerClassEntityList", source = "lecturerClasses"),
            @Mapping(target = "classPackageDetailEntityList", source = "details")
    })
    void updateFromVo(ClassBaseVo dto, @MappingTarget ClassBaseEntity entity);

}
