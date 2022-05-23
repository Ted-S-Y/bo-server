package com.bo.main.api.entities.vo;


import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
@io.swagger.annotations.ApiModel("Retrieve by query ")
public class CARTQueryVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 장바구니 번호
     */
    @io.swagger.annotations.ApiModelProperty("장바구니 번호")
    private Long cartNo;


    /**
     * 회원순번
     */
    @io.swagger.annotations.ApiModelProperty("회원순번")
    private Long mbrSeq;


    /**
     * 장바구니 상태(주문전/주문완료)
     */
    @io.swagger.annotations.ApiModelProperty("장바구니 상태(주문전/주문완료)")
    private String cartStat;


    /**
     * 상품수
     */
    @io.swagger.annotations.ApiModelProperty("상품수")
    private Integer prdtCnt;


    /**
     * 주문합계금액
     */
    @io.swagger.annotations.ApiModelProperty("주문합계금액")
    private Integer ordrSumAmt;


    /**
     * 등록일시
     */
    @io.swagger.annotations.ApiModelProperty("등록일시")
    private Date crtDtm;


    /**
     * 등록자
     */
    @io.swagger.annotations.ApiModelProperty("등록자")
    private String CRTR;


    /**
     * 수정일
     */
    @io.swagger.annotations.ApiModelProperty("수정일")
    private Date updDtm;


    /**
     * 수정자
     */
    @io.swagger.annotations.ApiModelProperty("수정자")
    private String UPDTR;

}
