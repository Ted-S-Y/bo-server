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
@Table(name = "REVW")
public class REVW implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 리뷰순번
     */
    @ApiModelProperty("리뷰순번")
    @Column(name = "REVW_SEQ", nullable = false)
    private Long revwSeq;

    /**
     * 판매상품 순번
     */
    @ApiModelProperty("판매상품 순번")
    @Column(name = "SLS_PRDT_SEQ", nullable = false)
    private Long slsPrdtSeq;

    /**
     * 리뷰
     */
    @Column(name = "REVW")
    @ApiModelProperty("리뷰")
    private String REVW;

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
