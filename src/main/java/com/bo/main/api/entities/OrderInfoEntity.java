package com.bo.main.api.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Data
@Entity
@Table(name = "ORDER_INFO")
public class OrderInfoEntity extends BaseTimeEntity implements Serializable {

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
     * 장바구니 번호
     */
    @Schema(description="장바구니번호")
    @Column(name = "CART_NO", nullable = false)
    private Long cartNo;

    /**
     * 주문금액
     */
    @Schema(description="주문금액")
    @Column(name = "ORDR_AMT")
    private Integer ordrAmt;

    /**
     * 쿠폰할인가
     */
    @Schema(description="쿠폰할인가")
    @Column(name = "CPN_DSCT_AMT")
    private Integer cpnDsctAmt;

    /**
     * 주문상태
     */
    @Schema(description="주문상태")
    @Column(name = "ORDR_STAT")
    private String ordrStat;

    /**
     * 결제일자
     */
    @Column(name = "PYMT_DT")
    @Schema(description="결제일자")
    private String pymtDt;

    /**
     * 취소일자
     */
    @Column(name = "CNCL_DT")
    @Schema(description="취소일자")
    private String cnclDt;

    /**
     * 반품일자
     */
    @Column(name = "RTRN_DT")
    @Schema(description="반품일자")
    private String rtrnDt;

    /**
     * 취소상세내역
     */
    @Schema(description="취소상세내역")
    @Column(name = "CNCL_DTL_LIST")
    private String cnclDtlList;

    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "ORDR_NO")
    @JsonBackReference
    @ToString.Exclude
    private List<OrderDetailEntity> orderDetailEntityList;

}
