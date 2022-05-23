package com.bo.main.api.controller.vo.req;

import com.bo.main.api.controller.vo.common.CommonVo;
import lombok.Data;
import lombok.EqualsAndHashCode;


@Data
@EqualsAndHashCode(callSuper = true)
public class ReqOrderInfoSearchVo extends CommonVo {

    /**
     * 주문번호
     */
    private Long ordrNo;


    /**
     * 장바구니 번호
     */
    private Long cartNo;


    /**
     * 주문상태
     */
    private String ordrStat;

}
