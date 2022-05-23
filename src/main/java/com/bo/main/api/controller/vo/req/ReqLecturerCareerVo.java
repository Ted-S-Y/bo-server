package com.bo.main.api.controller.vo.req;

import com.bo.main.api.controller.vo.common.CommonVo;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.NotBlank;
import java.util.Date;

@EqualsAndHashCode(callSuper = true)
@Data
public class ReqLecturerCareerVo extends CommonVo {

    /**
     * 경력순번
     */
    private Long carrSeq;

    /**
     * 경력 명
     */
    @NotBlank
    private String carrNm;

    /**
     * 경력정렬순번
     */
    @NotBlank
    private Integer carrNo;

}
