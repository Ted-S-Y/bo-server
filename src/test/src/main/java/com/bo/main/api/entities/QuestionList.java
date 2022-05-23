package com.bo.main.api.entities;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Data
@Entity
@Table(name = "QUESTION_LIST")
public class QuestionList implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 문의내역 순번
     */
    @ApiModelProperty("문의내역 순번")
    @Column(name = "QUES_SEQ", nullable = false)
    private Long quesSeq;

    /**
     * 회원순번
     */
    @ApiModelProperty("회원순번")
    @Column(name = "MBR_SEQ", nullable = false)
    private Long mbrSeq;

    /**
     * 문의내역 제목
     */
    @Column(name = "QUES_TTL")
    @ApiModelProperty("문의내역 제목")
    private String quesTtl;

    /**
     * 문의내역 내용
     */
    @Column(name = "QUES_CNNTS")
    @ApiModelProperty("문의내역 내용")
    private String quesCnnts;

    /**
     * 답변여부
     */
    @Column(name = "ANS_YN")
    @ApiModelProperty("답변여부")
    private String ansYn;

    /**
     * 답변 내용
     */
    @ApiModelProperty("답변 내용")
    @Column(name = "ANS_CNNTS")
    private String ansCnnts;

    /**
     * 답변완료일자
     */
    @ApiModelProperty("답변완료일자")
    @Column(name = "ANS_CMPLT_DT")
    private String ansCmpltDt;

    /**
     * 등록일시
     */
    @Column(name = "CRT_DTM")
    @ApiModelProperty("등록일시")
    private Date crtDtm;

    /**
     * 등록자
     */
    @Column(name = "CRTR")
    @ApiModelProperty("등록자")
    private String CRTR;

    /**
     * 수정일시
     */
    @Column(name = "UPD_DTM")
    @ApiModelProperty("수정일시")
    private Date updDtm;

    /**
     * 수정자
     */
    @Column(name = "UPDTR")
    @ApiModelProperty("수정자")
    private String UPDTR;

}
