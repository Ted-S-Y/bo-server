package com.bo.main.api.entities.vo;


import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
@io.swagger.annotations.ApiModel("Retrieve by query ")
public class QuestionListQueryVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 문의내역 순번
     */
    @io.swagger.annotations.ApiModelProperty("문의내역 순번")
    private Long quesSeq;


    /**
     * 회원순번
     */
    @io.swagger.annotations.ApiModelProperty("회원순번")
    private Long mbrSeq;


    /**
     * 문의내역 제목
     */
    @io.swagger.annotations.ApiModelProperty("문의내역 제목")
    private String quesTtl;


    /**
     * 문의내역 내용
     */
    @io.swagger.annotations.ApiModelProperty("문의내역 내용")
    private String quesCnnts;


    /**
     * 답변여부
     */
    @io.swagger.annotations.ApiModelProperty("답변여부")
    private String ansYn;


    /**
     * 답변 내용
     */
    @io.swagger.annotations.ApiModelProperty("답변 내용")
    private String ansCnnts;


    /**
     * 답변완료일자
     */
    @io.swagger.annotations.ApiModelProperty("답변완료일자")
    private String ansCmpltDt;


    /**
     * 등록일시
     */
    @io.swagger.annotations.ApiModelProperty("등록일시")
    private Date crtDtm;


    /**
     * 등록자
     */
    @io.swagger.annotations.ApiModelProperty("등록자")
    private String CRTR;


    /**
     * 수정일시
     */
    @io.swagger.annotations.ApiModelProperty("수정일시")
    private Date updDtm;


    /**
     * 수정자
     */
    @io.swagger.annotations.ApiModelProperty("수정자")
    private String UPDTR;

}
