package com.bo.main.api.entities.vo;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.List;


@Data
public class OrderInfoVo implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 주문번호
     */
    @NotNull(message = "ordrNo can not null")
    @Schema(description="주문번호")
    private Long ordrNo;


    /**
     * 장바구니 번호
     */
    @NotNull(message = "cartNo can not null")
    @Schema(description="장바구니 번호")
    private Long cartNo;


    /**
     * 주문금액
     */
    @Schema(description="주문금액")
    private Integer ordrAmt;


    /**
     * 쿠폰할인가
     */
    @Schema(description="쿠폰할인가")
    private Integer cpnDsctAmt;


    /**
     * 주문상태
     */
    @Schema(description="주문상태")
    private String ordrStat;


    /**
     * 결제일자
     */
    @Schema(description="결제일자")
    private String pymtDt;


    /**
     * 취소일자
     */
    @Schema(description="취소일자")
    private String cnclDt;


    /**
     * 반품일자
     */
    @Schema(description="반품일자")
    private String rtrnDt;


    /**
     * 취소상세내역
     */
    @Schema(description="취소상세내역")
    private String cnclDtlList;

    private List<OrderDetailVo> details;
}
