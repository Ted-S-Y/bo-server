package com.bo.main.api.entities.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;


@Data
@ApiModel("Save ")
public class OrderInfoVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 주문번호
     */
    @NotNull(message = "ordrNo can not null")
    @ApiModelProperty("주문번호")
    private Long ordrNo;


    /**
     * 장바구니 번호
     */
    @NotNull(message = "cartNo can not null")
    @ApiModelProperty("장바구니 번호")
    private Long cartNo;


    /**
     * 주문금액
     */
    @ApiModelProperty("주문금액")
    private Integer ordrAmt;


    /**
     * 쿠폰할인가
     */
    @ApiModelProperty("쿠폰할인가")
    private Integer cpnDsctAmt;


    /**
     * 주문상태
     */
    @ApiModelProperty("주문상태")
    private String ordrStat;


    /**
     * 결제일자
     */
    @ApiModelProperty("결제일자")
    private String pymtDt;


    /**
     * 취소일자
     */
    @ApiModelProperty("취소일자")
    private String cnclDt;


    /**
     * 반품일자
     */
    @ApiModelProperty("반품일자")
    private String rtrnDt;


    /**
     * 취소상세내역
     */
    @ApiModelProperty("취소상세내역")
    private String cnclDtlList;

}
