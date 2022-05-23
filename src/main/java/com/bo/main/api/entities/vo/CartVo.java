package com.bo.main.api.entities.vo;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.time.LocalDateTime;


@Data
public class CartVo implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 장바구니 번호
     */
    @NotNull(message = "cartNo can not null")
    private Long cartNo;


    /**
     * 회원순번
     */
    @NotNull(message = "mbrSeq can not null")
    private Long mbrSeq;


    /**
     * 장바구니 상태(주문전/주문완료)
     */
    private String cartStat;


    /**
     * 상품수
     */
    private Integer prdtCnt;


    /**
     * 주문합계금액
     */
    private Integer ordrSumAmt;


    /**
     * 등록일시
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd hh:mm:ss")
    private LocalDateTime crtDtm;


    /**
     * 등록자
     */
    private String crtr;


    /**
     * 수정일
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd hh:mm:ss")
    private LocalDateTime updDtm;


    /**
     * 수정자
     */
    private String updtr;

    CartDetailVo cartDetailVo;
}
