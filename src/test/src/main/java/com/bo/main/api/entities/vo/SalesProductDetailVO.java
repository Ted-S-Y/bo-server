package com.bo.main.api.entities.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;


@Data
@ApiModel("Save ")
public class SalesProductDetailVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 판매상품 순번
     */
    @NotNull(message = "slsPrdtSeq can not null")
    @ApiModelProperty("판매상품 순번")
    private Long slsPrdtSeq;


    /**
     * 배송상품 순번
     */
    @NotNull(message = "shipPrdtSeq can not null")
    @ApiModelProperty("배송상품 순번")
    private Long shipPrdtSeq;


    /**
     * 패키지 순번
     */
    @NotNull(message = "packSeq can not null")
    @ApiModelProperty("패키지 순번")
    private Long packSeq;


    /**
     * 배송상품여부
     */
    @ApiModelProperty("배송상품여부")
    private String shipPrdtYn;


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
