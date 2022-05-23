package com.bo.main.api.entities.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;


@Data
@ApiModel("Save ")
public class CartDetailVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 장바구니상세순번
     */
    @NotNull(message = "cartDtlSeq can not null")
    @ApiModelProperty("장바구니상세순번")
    private Long cartDtlSeq;


    /**
     * 판매상품 순번
     */
    @NotNull(message = "slsPrdtSeq can not null")
    @ApiModelProperty("판매상품 순번")
    private Long slsPrdtSeq;


    /**
     * 장바구니 번호
     */
    @NotNull(message = "cartNo can not null")
    @ApiModelProperty("장바구니 번호")
    private Long cartNo;


    /**
     * 상품수량
     */
    @ApiModelProperty("상품수량")
    private Integer prdtQty;


    /**
     * 주문금액
     */
    @ApiModelProperty("주문금액")
    private Integer ordrAmt;


    /**
     * 등록일시
     */
    @ApiModelProperty("등록일시")
    private Date crtDtm;


    /**
     * 등록자
     */
    @ApiModelProperty("등록자")
    private String CRTR;


    /**
     * 수정일시
     */
    @ApiModelProperty("수정일시")
    private Date updDtm;


    /**
     * 수정자
     */
    @ApiModelProperty("수정자")
    private String UPDTR;

}
