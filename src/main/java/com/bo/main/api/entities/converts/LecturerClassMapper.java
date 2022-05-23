package com.bo.main.api.entities.converts;

import com.bo.main.api.entities.LecturerClassEntity;
import com.bo.main.api.entities.vo.LecturerClassVo;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(
        componentModel = "spring"
)
public interface LecturerClassMapper extends GenericMapper<LecturerClassVo, LecturerClassEntity> {

    @Override
    LecturerClassVo toVo(LecturerClassEntity lecturerClassEntity);

    @Override
    LecturerClassEntity toEntity(LecturerClassVo lecturerClassVo);

    @Override
    List<LecturerClassVo> toVos(List<LecturerClassEntity> e);

    @Override
    List<LecturerClassEntity> toEntities(List<LecturerClassVo> d);
}
