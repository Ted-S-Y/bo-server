package com.bo.main.api.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
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

//    /**
//     * 회원순번
//     */
//    @Schema(description="회원순번")
//    @Column(name = "MBR_SEQ", nullable = false)
//    private Long mbrSeq;

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

    // 장바구니 상세
    @OneToMany(mappedBy = "cartEntity", fetch = FetchType.LAZY)
    @JsonManagedReference
    @ToString.Exclude
    private List<CartDetailEntity> cartDetailEntityList;

    /**
     * 회원순번
     */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "MBR_SEQ", insertable = false, updatable = false)
    @JsonBackReference
    @ToString.Exclude
    private MemberEntity memberEntity;

    // 주문
    @OneToOne(mappedBy = "cartEntity", fetch = FetchType.LAZY)
    @JsonManagedReference
    @ToString.Exclude
    private OrderInfoEntity orderInfoEntity;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        CartEntity that = (CartEntity) o;
        return cartNo != null && Objects.equals(cartNo, that.cartNo);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
