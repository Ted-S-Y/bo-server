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
@Table(name = "CART")
public class CART implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 장바구니 번호
     */
    @ApiModelProperty("장바구니 번호")
    @Column(name = "CART_NO", nullable = false)
    private Long cartNo;

    /**
     * 회원순번
     */
    @ApiModelProperty("회원순번")
    @Column(name = "MBR_SEQ", nullable = false)
    private Long mbrSeq;

    /**
     * 장바구니 상태(주문전/주문완료)
     */
    @Column(name = "CART_STAT")
    @ApiModelProperty("장바구니 상태(주문전/주문완료)")
    private String cartStat;

    /**
     * 상품수
     */
    @ApiModelProperty("상품수")
    @Column(name = "PRDT_CNT")
    private Integer prdtCnt;

    /**
     * 주문합계금액
     */
    @ApiModelProperty("주문합계금액")
    @Column(name = "ORDR_SUM_AMT")
    private Integer ordrSumAmt;

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
     * 수정일
     */
    @ApiModelProperty("수정일")
    @Column(name = "UPD_DTM")
    private Date updDtm;

    /**
     * 수정자
     */
    @Column(name = "UPDTR")
    @ApiModelProperty("수정자")
    private String UPDTR;

}
