package com.bo.main.api.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
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
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
@Table(name = "SALES PRODUCT")
public class SalesProductEntity extends BaseTimeEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 판매상품 순번
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Schema(description="판매상품 순번")
    @Column(name = "SLS_PRDT_SEQ", nullable = false)
    private Long slsPrdtSeq;

    /**
     * 카테고리
     */
    @Column(name = "CTGR_ID")
    @Schema(description="카테고리")
    private Long ctgrId;

    /**
     * 상품명
     */
    @Schema(description="상품명")
    @Column(name = "PRDT_NM")
    private String prdtNm;

    /**
     * 배송구분
     */
    @Schema(description="배송구분")
    @Column(name = "SHIP_CLS")
    private String shipCls;

    /**
     * 판매원가
     */
    @Schema(description="판매원가")
    @Column(name = "SLS_COST")
    private Integer slsCost;

    /**
     * 판매가
     */
    @Schema(description="판매가")
    @Column(name = "SLS_PRC")
    private Integer slsPrc;

    /**
     * 배송비
     */
    @Schema(description="배송비")
    @Column(name = "SHIP_FEE")
    private Integer shipFee;

    /**
     * 재고
     */
    @Column(name = "STOCK")
    @Schema(description="재고")
    private Integer STOCK;

    /**
     * 판매상태(SALE, STOP, SOLD OUT, END)
     */
    @Column(name = "SLS_STAT")
    @Schema(description="판매상태(SALE, STOP, SOLD OUT, END)")
    private String slsStat;

    /**
     * 삭제여부
     */
    @Column(name = "DEL_YN")
    @Schema(description="삭제여부")
    private String delYn;

    /**
     * 상품대표이미지
     */
    @Schema(description="상품대표이미지")
    @Column(name = "PRDT_REP_IMG")
    private String prdtRepImg;

    /**
     * 상품 설명
     */
    @Schema(description="상품 설명")
    @Column(name = "PRDT_DESC")
    private String prdtDesc;

    // 장바구니 상세
    @OneToMany(mappedBy = "salesProductEntity", fetch = FetchType.LAZY)
    @JsonBackReference
    @ToString.Exclude
    private List<CartDetailEntity> cartDetailEntityList;

    // 판매상품 상세
    @OneToMany(mappedBy = "salesProductEntity", fetch = FetchType.LAZY)
    @JsonBackReference
    @ToString.Exclude
    private List<SalesProductDetailEntity> salesProductDetailEntityList;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        SalesProductEntity that = (SalesProductEntity) o;
        return slsPrdtSeq != null && Objects.equals(slsPrdtSeq, that.slsPrdtSeq);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
