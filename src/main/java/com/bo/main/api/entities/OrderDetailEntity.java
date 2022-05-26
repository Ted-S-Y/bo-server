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
@Table(name = "ORDER_DETAIL")
public class OrderDetailEntity extends BaseTimeEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 주문상세순번
     */
    @Id
    @Schema(description="주문상세순번")
    @Column(name = "ORDR_DTL_SEQ", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ordrDtlSeq;

    /**
     * 주문구분(주문/취소/반품/교환)
     */
    @Column(name = "ORDR_CLS")
    @Schema(description="주문구분(주문/취소/반품/교환)")
    private String ordrCls;

    /**
     * 주문금액
     */
    @Schema(description="주문금액")
    @Column(name = "ORDR_AMT")
    private Integer ordrAmt;


    /**
     * 주문번호
     */
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ORDR_NO", insertable = false, updatable = false)
    @JsonBackReference
    @ToString.Exclude
    private OrderInfoEntity orderInfoEntity;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        OrderDetailEntity that = (OrderDetailEntity) o;
        return ordrDtlSeq != null && Objects.equals(ordrDtlSeq, that.ordrDtlSeq);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
