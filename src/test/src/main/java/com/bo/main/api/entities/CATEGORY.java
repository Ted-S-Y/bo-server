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
@Table(name = "CATEGORY")
public class CATEGORY implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 카테고리 ID
     */
    @ApiModelProperty("카테고리 ID")
    @Column(name = "CTGR_ID", nullable = false)
    private Long ctgrId;

    /**
     * 대 카테고리 여부
     */
    @ApiModelProperty("대 카테고리 여부")
    @Column(name = "UPPER_CTGR_YN")
    private String upperCtgrYn;

    /**
     * 상위 카테고리 ID
     */
    @Column(name = "UPPER_CTGR_ID")
    @ApiModelProperty("상위 카테고리 ID")
    private Long upperCtgrId;

    /**
     * 노출여부
     */
    @Column(name = "SHOW_YN")
    @ApiModelProperty("노출여부")
    private String showYn;

    /**
     * 카테고리 타입
     */
    @Column(name = "CTGR_TYP")
    @ApiModelProperty("카테고리 타입")
    private String ctgrTyp;

    /**
     * 카테고리명
     */
    @Column(name = "CTGR_NM")
    @ApiModelProperty("카테고리명")
    private String ctgrNm;

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
