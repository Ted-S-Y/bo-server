package com.bo.main.api.entities.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;


@Data
@ApiModel("Save ")
public class QuestionListVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 문의내역 순번
     */
    @NotNull(message = "quesSeq can not null")
    @ApiModelProperty("문의내역 순번")
    private Long quesSeq;


    /**
     * 회원순번
     */
    @NotNull(message = "mbrSeq can not null")
    @ApiModelProperty("회원순번")
    private Long mbrSeq;


    /**
     * 문의내역 제목
     */
    @ApiModelProperty("문의내역 제목")
    private String quesTtl;


    /**
     * 문의내역 내용
     */
    @ApiModelProperty("문의내역 내용")
    private String quesCnnts;


    /**
     * 답변여부
     */
    @ApiModelProperty("답변여부")
    private String ansYn;


    /**
     * 답변 내용
     */
    @ApiModelProperty("답변 내용")
    private String ansCnnts;


    /**
     * 답변완료일자
     */
    @ApiModelProperty("답변완료일자")
    private String ansCmpltDt;


    /**
     * 등록일시
     */
    @ApiModelProperty("등록일시")
    private Date crtDtm;


    /**
     * 등록자
     */
    @ApiModelProperty("등록자")
    private String CRTR;


    /**
     * 수정일시
     */
    @ApiModelProperty("수정일시")
    private Date updDtm;


    /**
     * 수정자
     */
    @ApiModelProperty("수정자")
    private String UPDTR;

}
