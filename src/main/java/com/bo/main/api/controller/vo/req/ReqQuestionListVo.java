package com.bo.main.api.controller.vo.req;

import com.bo.main.api.controller.vo.common.CommonVo;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.time.LocalDateTime;


@Data
public class ReqQuestionListVo extends CommonVo {


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
