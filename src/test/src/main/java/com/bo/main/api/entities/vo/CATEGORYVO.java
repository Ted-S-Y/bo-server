package com.bo.main.api.entities.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;


@Data
@ApiModel("Save ")
public class CATEGORYVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 카테고리 ID
     */
    @NotNull(message = "ctgrId can not null")
    @ApiModelProperty("카테고리 ID")
    private Long ctgrId;


    /**
     * 대 카테고리 여부
     */
    @ApiModelProperty("대 카테고리 여부")
    private String upperCtgrYn;


    /**
     * 상위 카테고리 ID
     */
    @ApiModelProperty("상위 카테고리 ID")
    private Long upperCtgrId;


    /**
     * 노출여부
     */
    @ApiModelProperty("노출여부")
    private String showYn;


    /**
     * 카테고리 타입
     */
    @ApiModelProperty("카테고리 타입")
    private String ctgrTyp;


    /**
     * 카테고리명
     */
    @ApiModelProperty("카테고리명")
    private String ctgrNm;


    /**
     * 삭제여부
     */
    @ApiModelProperty("삭제여부")
    private String delYn;


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
