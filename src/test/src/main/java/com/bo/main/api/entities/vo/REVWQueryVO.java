package com.bo.main.api.entities.vo;


import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
@io.swagger.annotations.ApiModel("Retrieve by query ")
public class REVWQueryVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 리뷰순번
     */
    @io.swagger.annotations.ApiModelProperty("리뷰순번")
    private Long revwSeq;


    /**
     * 판매상품 순번
     */
    @io.swagger.annotations.ApiModelProperty("판매상품 순번")
    private Long slsPrdtSeq;


    /**
     * 리뷰
     */
    @io.swagger.annotations.ApiModelProperty("리뷰")
    private String REVW;


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
