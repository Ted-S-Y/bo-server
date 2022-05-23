package com.bo.main.api.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "ORDER_DETAIL")
public class OrderDetailEntity extends BaseTimeEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 주문번호
     */
    @Id
    @Schema(description="주문번호")
    @Column(name = "ORDR_NO", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ordrNo;

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

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ORDR_NO", insertable = false, updatable = false)
    @JsonBackReference
    @ToString.Exclude
    private OrderInfoEntity orderInfoEntity;

}
