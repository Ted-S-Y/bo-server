package com.bo.main.api.entities.vo;


import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
@io.swagger.annotations.ApiModel("Retrieve by query ")
public class SalesProductDetailQueryVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 판매상품 순번
     */
    @io.swagger.annotations.ApiModelProperty("판매상품 순번")
    private Long slsPrdtSeq;


    /**
     * 배송상품 순번
     */
    @io.swagger.annotations.ApiModelProperty("배송상품 순번")
    private Long shipPrdtSeq;


    /**
     * 패키지 순번
     */
    @io.swagger.annotations.ApiModelProperty("패키지 순번")
    private Long packSeq;


    /**
     * 배송상품여부
     */
    @io.swagger.annotations.ApiModelProperty("배송상품여부")
    private String shipPrdtYn;


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
