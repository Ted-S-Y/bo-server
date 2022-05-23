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
@Table(name = "COUPON_INFO")
public class CouponInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 쿠폰순번
     */
    @ApiModelProperty("쿠폰순번")
    @Column(name = "CPN_SEQ", nullable = false)
    private Long cpnSeq;

    /**
     * 쿠폰발급번호
     */
    @ApiModelProperty("쿠폰발급번호")
    @Column(name = "CPN_NO", nullable = false)
    private Long cpnNo;

    /**
     * 쿠폰명
     */
    @Column(name = "CPN_NM")
    @ApiModelProperty("쿠폰명")
    private String cpnNm;

    /**
     * 발급타입
     */
    @ApiModelProperty("발급타입")
    @Column(name = "ISSUE_TYP")
    private String issueTyp;

    /**
     * 발급수량
     */
    @ApiModelProperty("발급수량")
    @Column(name = "ISSUE_QTY")
    private Integer issueQty;

    /**
     * 발급가능 시작일시
     */
    @Column(name = "ISSUE_ST_DTM")
    @ApiModelProperty("발급가능 시작일시")
    private Date issueStDtm;

    /**
     * 발급가능 종료일시
     */
    @Column(name = "ISSUE_ED_DTM")
    @ApiModelProperty("발급가능 종료일시")
    private Date issueEdDtm;

    /**
     * 발급후 사용 가능 일자
     */
    @Column(name = "ISSUE_USE_DT")
    @ApiModelProperty("발급후 사용 가능 일자")
    private String issueUseDt;

    /**
     * 할인급액
     */
    @ApiModelProperty("할인급액")
    @Column(name = "DSCT_AMT")
    private Integer dsctAmt;

    /**
     * 할인율
     */
    @ApiModelProperty("할인율")
    @Column(name = "DSCT_RATIO")
    private Double dsctRatio;

    /**
     * 발급중단여부
     */
    @ApiModelProperty("발급중단여부")
    @Column(name = "ISSUE_SPPD_YN")
    private String issueSppdYn;

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
