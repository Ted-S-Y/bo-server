package com.bo.main.api.controller.vo.req;

import com.bo.main.api.controller.vo.common.CommonVo;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;


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


    /**
     * 주문구분(주문/취소/반품/교환)
     */
    private String ordrCls;

    /**
     * 검색시작일자
     */
    private String stDt;

    /**
     * 검색종료일자
     */
    private String edDt;
}
