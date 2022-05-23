package com.bo.main.api.entities.vo;


import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Data
public class OrderDetailVo implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 주문번호
     */
    @NotNull(message = "ordrNo can not null")
    @Schema(description="주문번호")
    private Long ordrNo;


    /**
     * 주문구분(주문/취소/반품/교환)
     */
    @NotNull(message = "ordrCls can not null")
    @Schema(description="주문구분(주문/취소/반품/교환)")
    private String ordrCls;


    /**
     * 주문금액
     */
    @NotNull(message = "ordrAmt can not null")
    @Schema(description="주문금액")
    private Integer ordrAmt;

    private OrderInfoVo orderInfoVo;
}
