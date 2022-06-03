package com.bo.main.api.entities;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Entity
@Table(name = "SALES_PRODUCT_DETAIL")
public class SalesProductDetailEntity extends BaseTimeEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 판매상품상세순번
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Schema(description="판매상품상세순번")
    @Column(name = "SLS_PRDT_DTL_SEQ", nullable = false)
    private Long slsPrdtDtlSeq;

//    /**
//     * 판매상품 순번
//     */
//    @Schema(description="판매상품 순번")
//    @Column(name = "SLS_PRDT_SEQ", nullable = false)
//    private Long slsPrdtSeq;

    /**
     * 배송상품 순번
     */
    @Schema(description="배송상품 순번")
    @Column(name = "SHIP_PRDT_SEQ", nullable = false)
    private Long shipPrdtSeq;

//    /**
//     * 패키지 순번
//     */
//    @Schema(description="패키지 순번")
//    @Column(name = "PACK_SEQ", nullable = false)
//    private Long packSeq;

    /**
     * 배송상품여부
     */
    @Schema(description="배송상품여부")
    @Column(name = "SHIP_PRDT_YN")
    private String shipPrdtYn;

    /**
     * 판매상품 순번
     */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "SLS_PRDT_SEQ", insertable = false, updatable = false)
    @ToString.Exclude
    private SalesProductEntity salesProductEntity;

    /**
     * 패키지 순번
     */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PACK_SEQ", insertable = false, updatable = false)
    @ToString.Exclude
    private ClassPackageEntity classPackageEntity;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        SalesProductDetailEntity that = (SalesProductDetailEntity) o;
        return slsPrdtDtlSeq != null && Objects.equals(slsPrdtDtlSeq, that.slsPrdtDtlSeq);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
