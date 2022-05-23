package com.bo.main.api.entities;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Data
@Entity
@Table(name = "CART")
public class CartEntity extends BaseTimeEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 장바구니 번호
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Schema(description="장바구니 번호")
    @Column(name = "CART_NO", nullable = false)
    private Long cartNo;

    /**
     * 회원순번
     */
    @Schema(description="회원순번")
    @Column(name = "MBR_SEQ", nullable = false)
    private Long mbrSeq;

    /**
     * 장바구니 상태(주문전/주문완료)
     */
    @Column(name = "CART_STAT")
    @Schema(description="장바구니 상태(주문전/주문완료)")
    private String cartStat;

    /**
     * 상품수
     */
    @Schema(description="상품수")
    @Column(name = "PRDT_CNT")
    private Integer prdtCnt;

    /**
     * 주문합계금액
     */
    @Schema(description="주문합계금액")
    @Column(name = "ORDR_SUM_AMT")
    private Integer ordrSumAmt;

    @OneToOne(fetch = FetchType.LAZY)
    private CartDetailEntity cartDetailEntity;
}
