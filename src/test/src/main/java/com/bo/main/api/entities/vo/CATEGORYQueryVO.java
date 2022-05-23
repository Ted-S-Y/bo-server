package com.bo.main.api.entities.vo;


import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
@io.swagger.annotations.ApiModel("Retrieve by query ")
public class CATEGORYQueryVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 카테고리 ID
     */
    @io.swagger.annotations.ApiModelProperty("카테고리 ID")
    private Long ctgrId;


    /**
     * 대 카테고리 여부
     */
    @io.swagger.annotations.ApiModelProperty("대 카테고리 여부")
    private String upperCtgrYn;


    /**
     * 상위 카테고리 ID
     */
    @io.swagger.annotations.ApiModelProperty("상위 카테고리 ID")
    private Long upperCtgrId;


    /**
     * 노출여부
     */
    @io.swagger.annotations.ApiModelProperty("노출여부")
    private String showYn;


    /**
     * 카테고리 타입
     */
    @io.swagger.annotations.ApiModelProperty("카테고리 타입")
    private String ctgrTyp;


    /**
     * 카테고리명
     */
    @io.swagger.annotations.ApiModelProperty("카테고리명")
    private String ctgrNm;


    /**
     * 삭제여부
     */
    @io.swagger.annotations.ApiModelProperty("삭제여부")
    private String delYn;


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
