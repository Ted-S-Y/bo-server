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

    @Override
    @Mapping(target = "lecturerCareers", source = "lecturerCareerEntityList")
    @Mapping(target = "lecturerClasses", source = "lecturerClassEntityList")
    LecturerVo toVo(LecturerEntity lecturerEntity);

    @Override
    @Mapping(target = "lecturerCareerEntityList", source = "lecturerCareers")
    @Mapping(target = "lecturerClassEntityList", source = "lecturerClasses")
    LecturerEntity toEntity(LecturerVo lecturerVo);

    ResLecturerVo toVo(LecturerVo lecturerCareerVo);

    LecturerVo toVo(ReqLecturerVo reqLecturerVo);

    @Override
    @Mapping(target = "lecturerCareerEntityList", source = "lecturerCareers")
    @Mapping(target = "lecturerClassEntityList", source = "lecturerClasses")
    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void updateFromVo(LecturerVo dto, @MappingTarget LecturerEntity entity);

}
