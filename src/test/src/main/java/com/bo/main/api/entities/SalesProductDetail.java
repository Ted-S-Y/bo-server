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
@Table(name = "SALES_PRODUCT_DETAIL")
public class SalesProductDetail implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 판매상품 순번
     */
    @ApiModelProperty("판매상품 순번")
    @Column(name = "SLS_PRDT_SEQ", nullable = false)
    private Long slsPrdtSeq;

    /**
     * 배송상품 순번
     */
    @ApiModelProperty("배송상품 순번")
    @Column(name = "SHIP_PRDT_SEQ", nullable = false)
    private Long shipPrdtSeq;

    /**
     * 패키지 순번
     */
    @ApiModelProperty("패키지 순번")
    @Column(name = "PACK_SEQ", nullable = false)
    private Long packSeq;

    /**
     * 배송상품여부
     */
    @ApiModelProperty("배송상품여부")
    @Column(name = "SHIP_PRDT_YN")
    private String shipPrdtYn;

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
