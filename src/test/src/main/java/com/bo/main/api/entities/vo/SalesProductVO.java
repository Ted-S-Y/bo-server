package com.bo.main.api.entities.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;


@Data
@ApiModel("Save ")
public class SalesProductVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 판매상품 순번
     */
    @NotNull(message = "slsPrdtSeq can not null")
    @ApiModelProperty("판매상품 순번")
    private Long slsPrdtSeq;


    /**
     * 카테고리
     */
    @ApiModelProperty("카테고리")
    private Long ctgrId;


    /**
     * 상품명
     */
    @ApiModelProperty("상품명")
    private String prdtNm;


    /**
     * 배송구분
     */
    @ApiModelProperty("배송구분")
    private String shipCls;


    /**
     * 판매원가
     */
    @ApiModelProperty("판매원가")
    private Integer slsCost;


    /**
     * 판매가
     */
    @ApiModelProperty("판매가")
    private Integer slsPrc;


    /**
     * 배송비
     */
    @ApiModelProperty("배송비")
    private Integer shipFee;


    /**
     * 재고
     */
    @ApiModelProperty("재고")
    private Integer STOCK;


    /**
     * 판매상태(SALE, STOP, SOLD OUT, END)
     */
    @ApiModelProperty("판매상태(SALE, STOP, SOLD OUT, END)")
    private String slsStat;


    /**
     * 삭제여부
     */
    @ApiModelProperty("삭제여부")
    private String delYn;


    /**
     * 상품대표이미지
     */
    @ApiModelProperty("상품대표이미지")
    private String prdtRepImg;


    /**
     * 상품 설명
     */
    @ApiModelProperty("상품 설명")
    private String prdtDesc;


    /**
     * 등록일시
     */
    @ApiModelProperty("등록일시")
    private Date crtDtm;


    /**
     * 등록자
     */
    @ApiModelProperty("등록자")
    private String CRTR;


    /**
     * 수정일시
     */
    @ApiModelProperty("수정일시")
    private Date updDtm;


    /**
     * 수정자
     */
    @ApiModelProperty("수정자")
    private String UPDTR;

}
