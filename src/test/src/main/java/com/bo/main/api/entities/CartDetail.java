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
@Table(name = "CART_DETAIL")
public class CartDetail implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 장바구니상세순번
     */
    @ApiModelProperty("장바구니상세순번")
    @Column(name = "CART_DTL_SEQ", nullable = false)
    private Long cartDtlSeq;

    /**
     * 판매상품 순번
     */
    @ApiModelProperty("판매상품 순번")
    @Column(name = "SLS_PRDT_SEQ", nullable = false)
    private Long slsPrdtSeq;

    /**
     * 장바구니 번호
     */
    @ApiModelProperty("장바구니 번호")
    @Column(name = "CART_NO", nullable = false)
    private Long cartNo;

    /**
     * 상품수량
     */
    @ApiModelProperty("상품수량")
    @Column(name = "PRDT_QTY")
    private Integer prdtQty;

    /**
     * 주문금액
     */
    @ApiModelProperty("주문금액")
    @Column(name = "ORDR_AMT")
    private Integer ordrAmt;

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
