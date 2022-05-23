package com.bo.main.api.entities.vo;


import lombok.Data;

import java.io.Serializable;

@Data
@io.swagger.annotations.ApiModel("Retrieve by query ")
public class OrderInfoQueryVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 주문번호
     */
    @io.swagger.annotations.ApiModelProperty("주문번호")
    private Long ordrNo;


    /**
     * 장바구니 번호
     */
    @io.swagger.annotations.ApiModelProperty("장바구니 번호")
    private Long cartNo;


    /**
     * 주문금액
     */
    @io.swagger.annotations.ApiModelProperty("주문금액")
    private Integer ordrAmt;


    /**
     * 쿠폰할인가
     */
    @io.swagger.annotations.ApiModelProperty("쿠폰할인가")
    private Integer cpnDsctAmt;


    /**
     * 주문상태
     */
    @io.swagger.annotations.ApiModelProperty("주문상태")
    private String ordrStat;


    /**
     * 결제일자
     */
    @io.swagger.annotations.ApiModelProperty("결제일자")
    private String pymtDt;


    /**
     * 취소일자
     */
    @io.swagger.annotations.ApiModelProperty("취소일자")
    private String cnclDt;


    /**
     * 반품일자
     */
    @io.swagger.annotations.ApiModelProperty("반품일자")
    private String rtrnDt;


    /**
     * 취소상세내역
     */
    @io.swagger.annotations.ApiModelProperty("취소상세내역")
    private String cnclDtlList;

}
