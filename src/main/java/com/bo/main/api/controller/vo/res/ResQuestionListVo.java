package com.bo.main.api.controller.vo.res;

import com.bo.main.api.controller.vo.common.CommonVo;
import lombok.Data;


@Data
public class ResQuestionListVo extends CommonVo {


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


    /**
     * 답변 내용
     */
    private String ansCnnts;


    /**
     * 답변완료일자
     */
    private String ansCmpltDt;

}
