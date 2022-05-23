package com.bo.main.api.entities.vo;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.time.LocalDateTime;


@Data
public class QuestionListVo implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 문의내역 순번
     */
    @NotNull(message = "quesSeq can not null")
    private Long quesSeq;


    /**
     * 회원순번
     */
    @NotNull(message = "mbrSeq can not null")
    private Long mbrSeq;


    /**
     * 문의내역 제목
     */
    private String quesTtl;


    /**
     * 문의내역 내용
     */
    private String quesCnnts;


    /**
     * 답변여부
     */
    private String ansYn;


    /**
     * 답변 내용
     */
    private String ansCnnts;


    /**
     * 답변완료일자
     */
    private String ansCmpltDt;


    /**
     * 등록일시
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd hh:mm:ss")
    private LocalDateTime crtDtm;


    /**
     * 등록자
     */
    private String crtr;


    /**
     * 수정일시
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd hh:mm:ss")
    private LocalDateTime pdDtm;


    /**
     * 수정자
     */
    private String updtr;

}
