package com.bo.main.api.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
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

//    /**
//     * 판매상품 순번
//     */
//    @Schema(description="판매상품 순번")
//    @Column(name = "SLS_PRDT_SEQ", nullable = false)
//    private Long slsPrdtSeq;

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


    // 장바구니
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CART_NO", insertable = false, updatable = false)
    @JsonBackReference
    @ToString.Exclude
    private CartEntity cartEntity;

    /**
     * 판매상품 순번
     */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "SLS_PRDT_SEQ", insertable = false, updatable = false)
    @JsonBackReference
    @ToString.Exclude
    private SalesProductEntity salesProductEntity;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        CartDetailEntity that = (CartDetailEntity) o;
        return cartDtlSeq != null && Objects.equals(cartDtlSeq, that.cartDtlSeq);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
