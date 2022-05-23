package com.bo.main.api.entities.vo;


import lombok.Data;

import java.io.Serializable;

@Data
@io.swagger.annotations.ApiModel("Retrieve by query ")
public class OrderDetailQueryVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 주문번호
     */
    @io.swagger.annotations.ApiModelProperty("주문번호")
    private Long ordrNo;


    /**
     * 주문구분(주문/취소/반품/교환)
     */
    @io.swagger.annotations.ApiModelProperty("주문구분(주문/취소/반품/교환)")
    private String ordrCls;


    /**
     * 주문금액
     */
    @io.swagger.annotations.ApiModelProperty("주문금액")
    private Integer ordrAmt;

}
