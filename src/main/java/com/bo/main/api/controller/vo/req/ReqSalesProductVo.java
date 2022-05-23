package com.bo.main.api.controller.vo.req;

import com.bo.main.api.controller.vo.common.CommonVo;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.time.LocalDateTime;


@Data
public class ReqSalesProductVo extends CommonVo {


    /**
     * 판매상품 순번
     */
    private Long slsPrdtSeq;


    /**
     * 카테고리
     */
    private Long ctgrId;


    /**
     * 상품명
     */
    private String prdtNm;


    /**
     * 배송구분
     */
    private String shipCls;


    /**
     * 판매원가
     */
    private Integer slsCost;


    /**
     * 판매가
     */
    private Integer slsPrc;


    /**
     * 배송비
     */
    private Integer shipFee;


    /**
     * 재고
     */
    private Integer stock;


    /**
     * 판매상태(SALE, STOP, SOLD OUT, END)
     */
    private String slsStat;


    /**
     * 삭제여부
     */
    private String delYn = "N";


    /**
     * 상품대표이미지
     */
    private String prdtRepImg;


    /**
     * 상품 설명
     */
    private String prdtDesc;

    ReqSalesProductDetailVo salesProductDetailVo;
}
