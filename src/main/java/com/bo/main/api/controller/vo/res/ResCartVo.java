package com.bo.main.api.controller.vo.res;

import com.bo.main.api.controller.vo.common.CommonVo;
import lombok.Data;


@Data
public class ResCartVo extends CommonVo {

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


    /**
     * 상품수
     */
    private Integer prdtCnt;


    /**
     * 주문합계금액
     */
    private Integer ordrSumAmt;

    ResCartDetailVo cartDetailVo;
}
