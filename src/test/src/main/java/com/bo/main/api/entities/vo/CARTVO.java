package com.bo.main.api.entities.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;


@Data
@ApiModel("Save ")
public class CARTVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 장바구니 번호
     */
    @NotNull(message = "cartNo can not null")
    @ApiModelProperty("장바구니 번호")
    private Long cartNo;


    /**
     * 회원순번
     */
    @NotNull(message = "mbrSeq can not null")
    @ApiModelProperty("회원순번")
    private Long mbrSeq;


    /**
     * 장바구니 상태(주문전/주문완료)
     */
    @ApiModelProperty("장바구니 상태(주문전/주문완료)")
    private String cartStat;


    /**
     * 상품수
     */
    @ApiModelProperty("상품수")
    private Integer prdtCnt;


    /**
     * 주문합계금액
     */
    @ApiModelProperty("주문합계금액")
    private Integer ordrSumAmt;


    /**
     * 등록일시
     */
    @ApiModelProperty("등록일시")
    private Date crtDtm;


    /**
     * 등록자
     */
    @ApiModelProperty("등록자")
    private String CRTR;


    /**
     * 수정일
     */
    @ApiModelProperty("수정일")
    private Date updDtm;


    /**
     * 수정자
     */
    @ApiModelProperty("수정자")
    private String UPDTR;

}
