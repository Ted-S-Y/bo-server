package com.bo.main.api.entities.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;


@Data
@ApiModel("Save ")
public class REVWVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 리뷰순번
     */
    @NotNull(message = "revwSeq can not null")
    @ApiModelProperty("리뷰순번")
    private Long revwSeq;


    /**
     * 판매상품 순번
     */
    @NotNull(message = "slsPrdtSeq can not null")
    @ApiModelProperty("판매상품 순번")
    private Long slsPrdtSeq;


    /**
     * 리뷰
     */
    @ApiModelProperty("리뷰")
    private String REVW;


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
