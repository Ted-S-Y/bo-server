package com.bo.main.api.entities.converts;

import com.bo.main.api.controller.vo.req.ReqLecturerVo;
import com.bo.main.api.controller.vo.res.ResLecturerVo;
import com.bo.main.api.entities.LecturerEntity;
import com.bo.main.api.entities.vo.LecturerVo;
import org.mapstruct.*;

@Mapper(
        uses = { LecturerCareerMapper.class },
        componentModel = "spring"
)
public interface LecturerMapper extends GenericMapper<LecturerVo, LecturerEntity> {

    @Mapping(target = "lecturerCareerEntityList", source = "lecturerCareerVos")
    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void updateFromVo(LecturerVo dto, @MappingTarget LecturerEntity entity);

    @Mapping(target = "lecturerCareerVos", source = "lecturerCareerEntityList")
    @Override
    LecturerVo toVo(LecturerEntity lecturerEntity);

    @Mapping(target = "lecturerCareerEntityList", source = "lecturerCareerVos")
    @Override
    LecturerEntity toEntity(LecturerVo lecturerVo);

    @Mapping(target = "resLecturerCareerVos", source = "lecturerCareerVos")
    ResLecturerVo toVo(LecturerVo lecturerCareerVo);

    LecturerVo toVo(ReqLecturerVo reqLecturerVo);


}
