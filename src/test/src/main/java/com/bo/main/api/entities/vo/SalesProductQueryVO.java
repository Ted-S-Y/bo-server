package com.bo.main.api.entities.vo;


import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
@io.swagger.annotations.ApiModel("Retrieve by query ")
public class SalesProductQueryVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 판매상품 순번
     */
    @io.swagger.annotations.ApiModelProperty("판매상품 순번")
    private Long slsPrdtSeq;


    /**
     * 카테고리
     */
    @io.swagger.annotations.ApiModelProperty("카테고리")
    private Long ctgrId;


    /**
     * 상품명
     */
    @io.swagger.annotations.ApiModelProperty("상품명")
    private String prdtNm;


    /**
     * 배송구분
     */
    @io.swagger.annotations.ApiModelProperty("배송구분")
    private String shipCls;


    /**
     * 판매원가
     */
    @io.swagger.annotations.ApiModelProperty("판매원가")
    private Integer slsCost;


    /**
     * 판매가
     */
    @io.swagger.annotations.ApiModelProperty("판매가")
    private Integer slsPrc;


    /**
     * 배송비
     */
    @io.swagger.annotations.ApiModelProperty("배송비")
    private Integer shipFee;


    /**
     * 재고
     */
    @io.swagger.annotations.ApiModelProperty("재고")
    private Integer STOCK;


    /**
     * 판매상태(SALE, STOP, SOLD OUT, END)
     */
    @io.swagger.annotations.ApiModelProperty("판매상태(SALE, STOP, SOLD OUT, END)")
    private String slsStat;


    /**
     * 삭제여부
     */
    @io.swagger.annotations.ApiModelProperty("삭제여부")
    private String delYn;


    /**
     * 상품대표이미지
     */
    @io.swagger.annotations.ApiModelProperty("상품대표이미지")
    private String prdtRepImg;


    /**
     * 상품 설명
     */
    @io.swagger.annotations.ApiModelProperty("상품 설명")
    private String prdtDesc;


    /**
     * 등록일시
     */
    @io.swagger.annotations.ApiModelProperty("등록일시")
    private Date crtDtm;


    /**
     * 등록자
     */
    @io.swagger.annotations.ApiModelProperty("등록자")
    private String CRTR;


    /**
     * 수정일시
     */
    @io.swagger.annotations.ApiModelProperty("수정일시")
    private Date updDtm;


    /**
     * 수정자
     */
    @io.swagger.annotations.ApiModelProperty("수정자")
    private String UPDTR;

}
