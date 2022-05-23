package com.bo.main.api.controller.vo.req;


import com.bo.main.api.controller.vo.common.CommonVo;
import lombok.Data;
import lombok.EqualsAndHashCode;


@EqualsAndHashCode(callSuper = true)
@Data
public class ReqOrderDetailVo extends CommonVo {

    /**
     * 주문번호
     */
    private Long ordrNo;


    /**
     * 주문구분(주문/취소/반품/교환)
     */
    private String ordrCls;


    /**
     * 주문금액
     */
    private Integer ordrAmt;

}
