package com.bo.main.api.entities;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Data
@Entity
@Table(name = "QUESTION_LIST")
public class QuestionListEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 문의내역 순번
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Schema(description="문의내역 순번")
    @Column(name = "QUES_SEQ", nullable = false)
    private Long quesSeq;

    /**
     * 회원순번
     */
    @Schema(description="회원순번")
    @Column(name = "MBR_SEQ", nullable = false)
    private Long mbrSeq;

    /**
     * 문의내역 제목
     */
    @Column(name = "QUES_TTL")
    @Schema(description="문의내역 제목")
    private String quesTtl;

    /**
     * 문의내역 내용
     */
    @Column(name = "QUES_CNNTS")
    @Schema(description="문의내역 내용")
    private String quesCnnts;

    /**
     * 답변여부
     */
    @Column(name = "ANS_YN")
    @Schema(description="답변여부")
    private String ansYn;

    /**
     * 답변 내용
     */
    @Schema(description="답변 내용")
    @Column(name = "ANS_CNNTS")
    private String ansCnnts;

    /**
     * 답변완료일자
     */
    @Schema(description="답변완료일자")
    @Column(name = "ANS_CMPLT_DT")
    private String ansCmpltDt;

    /**
     * 등록일시
     */
    @Column(name = "CRT_DTM")
    @Schema(description="등록일시")
    private Date crtDtm;

    /**
     * 등록자
     */
    @Column(name = "CRTR")
    @Schema(description="등록자")
    private String CRTR;

    /**
     * 수정일시
     */
    @Column(name = "UPD_DTM")
    @Schema(description="수정일시")
    private Date updDtm;

    /**
     * 수정자
     */
    @Column(name = "UPDTR")
    @Schema(description="수정자")
    private String UPDTR;

}
