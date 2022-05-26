package com.bo.main.api.entities.vo;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.time.LocalDateTime;


@Data
public class SalesProductDetailVo implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 판매상품 순번
     */
    @NotNull(message = "slsPrdtSeq can not null")
    private Long slsPrdtSeq;


    /**
     * 배송상품 순번
     */
    @NotNull(message = "shipPrdtSeq can not null")
    private Long shipPrdtSeq;


    /**
     * 패키지 순번
     */
    @NotNull(message = "packSeq can not null")
    private Long packSeq;


    /**
     * 배송상품여부
     */
    private String shipPrdtYn;


    /**
     * 등록일시
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd hh:mm:ss")
    private LocalDateTime crtDtm;


    /**
     * 등록자
     */
    private String crtr;


    /**
     * 수정일시
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd hh:mm:ss")
    private LocalDateTime updDtm;


    /**
     * 수정자
     */
    private String updtr;

    SalesProductVo salesProductVo;

    ClassBaseVo classBaseVo;
}
