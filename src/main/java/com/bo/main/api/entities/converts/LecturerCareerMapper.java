package com.bo.main.api.entities.converts;

import com.bo.main.api.controller.vo.res.ResAdminVo;
import com.bo.main.api.controller.vo.res.ResLecturerCareerVo;
import com.bo.main.api.entities.LecturerCareerEntity;
import com.bo.main.api.entities.LecturerEntity;
import com.bo.main.api.entities.vo.AdminVo;
import com.bo.main.api.entities.vo.LecturerCareerVo;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(
        componentModel = "spring"
)
public interface LecturerCareerMapper extends GenericMapper<LecturerCareerVo, LecturerCareerEntity> {

    @Mapping(target = "lecturerVo", ignore = true)
    @Override
    LecturerCareerVo toVo(LecturerCareerEntity lecturerCareerEntity);

    @Mapping(target = "lecturerEntity", ignore = true)
    @Override
    LecturerCareerEntity toEntity(LecturerCareerVo lecturerCareerVo);

    ResLecturerCareerVo toVo(LecturerCareerVo lecturerCareerVo);

}
