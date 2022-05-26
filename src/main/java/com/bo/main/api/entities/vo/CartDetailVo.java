package com.bo.main.api.entities.vo;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;


@Data
public class CartDetailVo implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 장바구니상세순번
     */
    @NotNull(message = "cartDtlSeq can not null")
    private Long cartDtlSeq;


    /**
     * 판매상품 순번
     */
    @NotNull(message = "slsPrdtSeq can not null")
    private Long slsPrdtSeq;


    /**
     * 장바구니 번호
     */
    @NotNull(message = "cartNo can not null")
    private Long cartNo;


    /**
     * 상품수량
     */
    private Integer prdtQty;


    /**
     * 주문금액
     */
    private Integer ordrAmt;


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
     * 수정일시
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd hh:mm:ss")
    private LocalDateTime updDtm;


    /**
     * 수정자
     */
    private String updtr;

    CartVo cartVo;

    SalesProductVo salesProductVo;
}
