package com.bo.main.api.controller.vo.req;

import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class ReqClassBaseSearchVo {

    /**
     * 비디오 순번
     */
    private Long vdSeq;
    /**
     * 강의 순번
     */
    private Long clssSeq;

    /**
     * 강의코드
     */
    @NotBlank
    private String clssCd;

    /**
     * 강의명
     */
    @NotBlank
    private String clssNm;

    /**
     * 강의설명
     */
    @NotBlank
    private String clssDesc;

    /**
     * 미리보기영상여부
     */
    private String prvYn;

    /**
     * 사용여부
     */
    private String useYn;

}
