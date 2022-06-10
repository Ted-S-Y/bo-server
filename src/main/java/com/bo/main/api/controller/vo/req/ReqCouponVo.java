package com.bo.main.api.controller.vo.req;

import com.bo.main.api.controller.vo.common.CommonVo;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;


@Data
public class ReqCouponVo extends CommonVo {


    /**
     * 쿠폰순번
     */
    private Long cpnSeq;


    /**
     * 쿠폰발급번호
     */
    private Long cpnNo;


    /**
     * 쿠폰명
     */
    private String cpnNm;


    /**
     * 발급타입
     */
    private String issueTyp;


    /**
     * 회원 아이디
     */
    private String mbrId;

    /**
     * 발급가능 시작일시
     */
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern = "yyyy-MM-dd hh:mm:ss")
    private LocalDateTime issueStDtm;


    /**
     * 발급가능 종료일시
     */
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern = "yyyy-MM-dd hh:mm:ss")
    private LocalDateTime issueEdDtm;


    /**
     * 발급중단여부
     */
    private String issueSppdYn = "N";

}
