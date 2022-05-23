package com.bo.main.api.entities;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

@Data
@Entity
@Table(name = "ORDER_INFO")
public class OrderInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 주문번호
     */
    @ApiModelProperty("주문번호")
    @Column(name = "ORDR_NO", nullable = false)
    private Long ordrNo;

    /**
     * 장바구니 번호
     */
    @ApiModelProperty("장바구니 번호")
    @Column(name = "CART_NO", nullable = false)
    private Long cartNo;

    /**
     * 주문금액
     */
    @ApiModelProperty("주문금액")
    @Column(name = "ORDR_AMT")
    private Integer ordrAmt;

    /**
     * 쿠폰할인가
     */
    @ApiModelProperty("쿠폰할인가")
    @Column(name = "CPN_DSCT_AMT")
    private Integer cpnDsctAmt;

    /**
     * 주문상태
     */
    @ApiModelProperty("주문상태")
    @Column(name = "ORDR_STAT")
    private String ordrStat;

    /**
     * 결제일자
     */
    @Column(name = "PYMT_DT")
    @ApiModelProperty("결제일자")
    private String pymtDt;

    /**
     * 취소일자
     */
    @Column(name = "CNCL_DT")
    @ApiModelProperty("취소일자")
    private String cnclDt;

    /**
     * 반품일자
     */
    @Column(name = "RTRN_DT")
    @ApiModelProperty("반품일자")
    private String rtrnDt;

    /**
     * 취소상세내역
     */
    @ApiModelProperty("취소상세내역")
    @Column(name = "CNCL_DTL_LIST")
    private String cnclDtlList;

}
