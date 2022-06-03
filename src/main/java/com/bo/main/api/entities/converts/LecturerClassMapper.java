package com.bo.main.api.entities.converts;

import com.bo.main.api.controller.vo.req.ReqClassManageVo;
import com.bo.main.api.controller.vo.res.ResClassManageVo;
import com.bo.main.api.entities.LecturerClassEntity;
import com.bo.main.api.entities.vo.ClassBaseVo;
import com.bo.main.api.entities.vo.LecturerClassVo;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(
        componentModel = "spring"
)
public interface LecturerClassMapper extends GenericMapper<LecturerClassVo, LecturerClassEntity> {

    LecturerClassVo toVo(ClassBaseVo classBaseVo);

}
