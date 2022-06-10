package com.bo.main.api.entities.vo;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;


@Data
public class CouponInfoVo implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 쿠폰순번
     */
    @NotNull(message = "cpnSeq can not null")
    private Long cpnSeq;


    /**
     * 쿠폰발급번호
     */
    @NotNull(message = "cpnNo can not null")
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
     * 발급수량
     */
    private Integer issueQty;


    /**
     * 발급가능 시작일시
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd hh:mm:ss")
    private LocalDateTime issueStDtm;


    /**
     * 발급가능 종료일시
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd hh:mm:ss")
    private LocalDateTime issueEdDtm;


    /**
     * 발급후 사용 가능 일자
     */
    private String issueUseDt;


    /**
     * 할인급액
     */
    private Integer dsctAmt;


    /**
     * 할인율
     */
    private Double dsctRatio;


    /**
     * 발급중단여부
     */
    private String issueSppdYn;


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
    private LocalDateTime updDtm;


    /**
     * 수정자
     */
    private String updtr;


    List<CouponIssueHistoryVo> conponIssueHistories;
}
