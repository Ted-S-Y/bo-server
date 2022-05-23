package com.bo.main.api.controller.vo.req;

import lombok.Data;


@Data
public class ReqRevwSearchVo {


    /**
     * 리뷰순번
     */
    private Long revwSeq;


    /**
     * 판매상품 순번
     */
    private Long slsPrdtSeq;


    /**
     * 리뷰
     */
    private String revw;


}
