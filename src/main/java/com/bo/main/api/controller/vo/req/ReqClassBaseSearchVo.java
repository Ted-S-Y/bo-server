package com.bo.main.api.controller.vo.req;

import com.bo.main.api.controller.vo.common.CommonVo;
import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class ReqClassBaseSearchVo extends CommonVo {

    /**
     * 강의 순번
     */
    private Long clssSeq;

    /**
     * 강의코드
     */
    private String clssCd;

    /**
     * 강의명
     */
    private String clssNm;

    /**
     * 강사명
     */
    private String lctrNm;

    /**
     * 사용여부
     */
    private String useYn;

}
