package com.bo.main.api.entities.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;


@Data
@ApiModel("Save ")
public class OrderDetailVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 주문번호
     */
    @NotNull(message = "ordrNo can not null")
    @ApiModelProperty("주문번호")
    private Long ordrNo;


    /**
     * 주문구분(주문/취소/반품/교환)
     */
    @ApiModelProperty("주문구분(주문/취소/반품/교환)")
    private String ordrCls;


    /**
     * 주문금액
     */
    @ApiModelProperty("주문금액")
    private Integer ordrAmt;

}
