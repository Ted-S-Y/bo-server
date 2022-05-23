package com.bo.main.api.controller.vo.req;

import lombok.Data;


@Data
public class ReqSalesProductSearchVo {


    /**
     * 판매상품 순번
     */
    private Long slsPrdtSeq;


    /**
     * 카테고리
     */
    private Long ctgrId;


    /**
     * 상품명
     */
    private String prdtNm;


    /**
     * 배송구분
     */
    private String shipCls;


    /**
     * 판매상태(SALE, STOP, SOLD OUT, END)
     */
    private String slsStat;


    /**
     * 삭제여부
     */
    private String delYn;


    /**
     * 상품 설명
     */
    private String prdtDesc;

}
