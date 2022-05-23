package com.bo.main.api.entities.vo;


import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
@io.swagger.annotations.ApiModel("Retrieve by query ")
public class RevwCnntsQueryVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 리뷰컨텐츠 순번
     */
    @io.swagger.annotations.ApiModelProperty("리뷰컨텐츠 순번")
    private Long revwCnntsSeq;


    /**
     * 리뷰순번
     */
    @io.swagger.annotations.ApiModelProperty("리뷰순번")
    private Long revwSeq;


    /**
     * 파일명
     */
    @io.swagger.annotations.ApiModelProperty("파일명")
    private String fileNm;


    /**
     * 파일타입
     */
    @io.swagger.annotations.ApiModelProperty("파일타입")
    private String fileTyp;


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
