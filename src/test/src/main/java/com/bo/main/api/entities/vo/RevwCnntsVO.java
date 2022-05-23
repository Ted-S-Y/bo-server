package com.bo.main.api.entities.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;


@Data
@ApiModel("Save ")
public class RevwCnntsVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 리뷰컨텐츠 순번
     */
    @NotNull(message = "revwCnntsSeq can not null")
    @ApiModelProperty("리뷰컨텐츠 순번")
    private Long revwCnntsSeq;


    /**
     * 리뷰순번
     */
    @NotNull(message = "revwSeq can not null")
    @ApiModelProperty("리뷰순번")
    private Long revwSeq;


    /**
     * 파일명
     */
    @ApiModelProperty("파일명")
    private String fileNm;


    /**
     * 파일타입
     */
    @ApiModelProperty("파일타입")
    private String fileTyp;


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
