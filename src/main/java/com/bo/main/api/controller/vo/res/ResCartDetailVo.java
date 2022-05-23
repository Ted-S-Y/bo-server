package com.bo.main.api.controller.vo.res;

import com.bo.main.api.controller.vo.common.CommonVo;
import lombok.Data;


@Data
public class ResCartDetailVo extends CommonVo {

    /**
     * 장바구니상세순번
     */
    private Long cartDtlSeq;


    /**
     * 판매상품 순번
     */
    private Long slsPrdtSeq;


    /**
     * 장바구니 번호
     */
    private Long cartNo;


    /**
     * 상품수량
     */
    private Integer prdtQty;


    /**
     * 주문금액
     */
    private Integer ordrAmt;


}
