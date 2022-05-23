package com.bo.main.api.entities;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "CART_DETAIL")
public class CartDetailEntity extends BaseTimeEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 장바구니상세순번
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Schema(description="장바구니상세순번")
    @Column(name = "CART_DTL_SEQ", nullable = false)
    private Long cartDtlSeq;

    /**
     * 판매상품 순번
     */
    @Schema(description="판매상품 순번")
    @Column(name = "SLS_PRDT_SEQ", nullable = false)
    private Long slsPrdtSeq;

    /**
     * 장바구니 번호
     */
    @Schema(description="장바구니 번호")
    @Column(name = "CART_NO", nullable = false)
    private Long cartNo;

    /**
     * 상품수량
     */
    @Schema(description="상품수량")
    @Column(name = "PRDT_QTY")
    private Integer prdtQty;

    /**
     * 주문금액
     */
    @Schema(description="주문금액")
    @Column(name = "ORDR_AMT")
    private Integer ordrAmt;

}
