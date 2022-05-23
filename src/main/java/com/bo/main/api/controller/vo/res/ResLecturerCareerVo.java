package com.bo.main.api.controller.vo.res;

import com.bo.main.api.controller.vo.common.CommonVo;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.NotBlank;
import java.util.Date;

@EqualsAndHashCode(callSuper = true)
@Data
public class ResLecturerCareerVo extends CommonVo {

    /**
     * 경력순번
     */
    private Long carrSeq;

    /**
     * 경력 명
     */
    private String carrNm;

    /**
     * 경력정렬순번
     */
    private Integer carrNo;

}
