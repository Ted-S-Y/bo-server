package com.bo.main.api.controller.vo.req;

import lombok.Data;


@Data
public class ReqQuestionListSearchVo {


    /**
     * 문의내역 순번
     */
    private Long quesSeq;


    /**
     * 회원순번
     */
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


}
