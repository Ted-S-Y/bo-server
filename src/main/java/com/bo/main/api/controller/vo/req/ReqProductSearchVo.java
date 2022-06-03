package com.bo.main.api.controller.vo.req;

import com.bo.main.api.controller.vo.common.CommonVo;
import lombok.Data;


@Data
public class ReqProductSearchVo extends CommonVo {


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
     * 검색시작일자
     */
    private String stDt;

    /**
     * 검색종료일자
     */
    private String edDt;

}
