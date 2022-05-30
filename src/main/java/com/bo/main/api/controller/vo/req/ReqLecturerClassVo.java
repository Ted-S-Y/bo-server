package com.bo.main.api.controller.vo.req;

import com.bo.main.api.controller.vo.common.CommonVo;
import com.bo.main.api.entities.vo.ClassBaseVo;
import com.bo.main.api.entities.vo.LecturerVo;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.time.LocalDateTime;


@Data
public class ReqLecturerClassVo extends CommonVo {

    /**
     * 강사순번
     */
    private Long lctrSeq;


    /**
     * 강의 순번
     */
    private Long clssSeq;

}
