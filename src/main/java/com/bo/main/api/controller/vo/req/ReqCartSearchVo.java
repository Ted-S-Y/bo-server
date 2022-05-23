package com.bo.main.api.controller.vo.req;

import lombok.Data;


@Data
public class ReqCartSearchVo {

    /**
     * 장바구니 번호
     */
    private Long cartNo;


    /**
     * 회원순번
     */
    private Long mbrSeq;


    /**
     * 장바구니 상태(주문전/주문완료)
     */
    private String cartStat;

}
