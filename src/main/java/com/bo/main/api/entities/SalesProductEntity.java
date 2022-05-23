package com.bo.main.api.entities;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Data
@Entity
@Table(name = "SALES PRODUCT")
public class SalesProductEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 판매상품 순번
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Schema(description="판매상품 순번")
    @Column(name = "SLS_PRDT_SEQ", nullable = false)
    private Long slsPrdtSeq;

    /**
     * 카테고리
     */
    @Column(name = "CTGR_ID")
    @Schema(description="카테고리")
    private Long ctgrId;

    /**
     * 상품명
     */
    @Schema(description="상품명")
    @Column(name = "PRDT_NM")
    private String prdtNm;

    /**
     * 배송구분
     */
    @Schema(description="배송구분")
    @Column(name = "SHIP_CLS")
    private String shipCls;

    /**
     * 판매원가
     */
    @Schema(description="판매원가")
    @Column(name = "SLS_COST")
    private Integer slsCost;

    /**
     * 판매가
     */
    @Schema(description="판매가")
    @Column(name = "SLS_PRC")
    private Integer slsPrc;

    /**
     * 배송비
     */
    @Schema(description="배송비")
    @Column(name = "SHIP_FEE")
    private Integer shipFee;

    /**
     * 재고
     */
    @Column(name = "STOCK")
    @Schema(description="재고")
    private Integer STOCK;

    /**
     * 판매상태(SALE, STOP, SOLD OUT, END)
     */
    @Column(name = "SLS_STAT")
    @Schema(description="판매상태(SALE, STOP, SOLD OUT, END)")
    private String slsStat;

    /**
     * 삭제여부
     */
    @Column(name = "DEL_YN")
    @Schema(description="삭제여부")
    private String delYn;

    /**
     * 상품대표이미지
     */
    @Schema(description="상품대표이미지")
    @Column(name = "PRDT_REP_IMG")
    private String prdtRepImg;

    /**
     * 상품 설명
     */
    @Schema(description="상품 설명")
    @Column(name = "PRDT_DESC")
    private String prdtDesc;

    /**
     * 등록일시
     */
    @Column(name = "CRT_DTM")
    @Schema(description="등록일시")
    private Date crtDtm;

    /**
     * 등록자
     */
    @Column(name = "CRTR")
    @Schema(description="등록자")
    private String CRTR;

    /**
     * 수정일시
     */
    @Column(name = "UPD_DTM")
    @Schema(description="수정일시")
    private Date updDtm;

    /**
     * 수정자
     */
    @Column(name = "UPDTR")
    @Schema(description="수정자")
    private String UPDTR;

}
