package com.bo.main.api.entities;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Data
@Entity
@Table(name = "REVW_CNNTS")
public class RevwCnnts implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 리뷰컨텐츠 순번
     */
    @ApiModelProperty("리뷰컨텐츠 순번")
    @Column(name = "REVW_CNNTS_SEQ", nullable = false)
    private Long revwCnntsSeq;

    /**
     * 리뷰순번
     */
    @ApiModelProperty("리뷰순번")
    @Column(name = "REVW_SEQ", nullable = false)
    private Long revwSeq;

    /**
     * 파일명
     */
    @ApiModelProperty("파일명")
    @Column(name = "FILE_NM")
    private String fileNm;

    /**
     * 파일타입
     */
    @ApiModelProperty("파일타입")
    @Column(name = "FILE_TYP")
    private String fileTyp;

    /**
     * 삭제여부
     */
    @Column(name = "DEL_YN")
    @ApiModelProperty("삭제여부")
    private String delYn;

    /**
     * 등록일시
     */
    @Column(name = "CRT_DTM")
    @ApiModelProperty("등록일시")
    private Date crtDtm;

    /**
     * 등록자
     */
    @Column(name = "CRTR")
    @ApiModelProperty("등록자")
    private String CRTR;

    /**
     * 수정일시
     */
    @Column(name = "UPD_DTM")
    @ApiModelProperty("수정일시")
    private Date updDtm;

    /**
     * 수정자
     */
    @Column(name = "UPDTR")
    @ApiModelProperty("수정자")
    private String UPDTR;

}
