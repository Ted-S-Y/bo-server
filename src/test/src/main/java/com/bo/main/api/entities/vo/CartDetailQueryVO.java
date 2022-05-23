package com.bo.main.api.entities.vo;


import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
@io.swagger.annotations.ApiModel("Retrieve by query ")
public class CartDetailQueryVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 장바구니상세순번
     */
    @io.swagger.annotations.ApiModelProperty("장바구니상세순번")
    private Long cartDtlSeq;


    /**
     * 판매상품 순번
     */
    @io.swagger.annotations.ApiModelProperty("판매상품 순번")
    private Long slsPrdtSeq;


    /**
     * 장바구니 번호
     */
    @io.swagger.annotations.ApiModelProperty("장바구니 번호")
    private Long cartNo;


    /**
     * 상품수량
     */
    @io.swagger.annotations.ApiModelProperty("상품수량")
    private Integer prdtQty;


    /**
     * 주문금액
     */
    @io.swagger.annotations.ApiModelProperty("주문금액")
    private Integer ordrAmt;


    /**
     * 등록일시
     */
    @io.swagger.annotations.ApiModelProperty("등록일시")
    private Date crtDtm;


    /**
     * 등록자
     */
    @io.swagger.annotations.ApiModelProperty("등록자")
    private String CRTR;


    /**
     * 수정일시
     */
    @io.swagger.annotations.ApiModelProperty("수정일시")
    private Date updDtm;


    /**
     * 수정자
     */
    @io.swagger.annotations.ApiModelProperty("수정자")
    private String UPDTR;

}
