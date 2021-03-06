package com.bo.main.api.controller.vo.res;

import com.bo.main.api.controller.vo.common.CommonVo;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.NotEmpty;
import java.util.List;


@Data
@EqualsAndHashCode(callSuper = true)
public class ResOrderInfoVo extends CommonVo {

    /**
     * 주문번호
     */
    private Long ordrNo;


    /**
     * 장바구니 번호
     */
    private Long cartNo;


    /**
     * 주문금액
     */
    private Integer ordrAmt;


    /**
     * 쿠폰할인가
     */
    private Integer cpnDsctAmt;


    /**
     * 주문상태
     */
    private String ordrStat;


    /**
     * 결제일자
     */
    private String pymtDt;


    /**
     * 취소일자
     */
    private String cnclDt;


    /**
     * 반품일자
     */
    private String rtrnDt;


    /**
     * 취소상세내역
     */
    private String cnclDtlList;


    /**
     * 주문구분(주문/취소/반품/교환)
     */
    private String ordrCls;

}
