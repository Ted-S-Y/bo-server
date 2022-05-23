package com.bo.main.api.controller.vo.res;

import com.bo.main.api.controller.vo.common.CommonVo;
import lombok.Data;


@Data
public class ResSalesProductDetailVo extends CommonVo {


    /**
     * 판매상품 순번
     */
    private Long slsPrdtSeq;


    /**
     * 배송상품 순번
     */
    private Long shipPrdtSeq;


    /**
     * 패키지 순번
     */
    private Long packSeq;


    /**
     * 배송상품여부
     */
    private String shipPrdtYn;

}
