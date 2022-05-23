package com.bo.main.api.entities.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;


@Data
@ApiModel("Save ")
public class CouponInfoVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 쿠폰순번
     */
    @NotNull(message = "cpnSeq can not null")
    @ApiModelProperty("쿠폰순번")
    private Long cpnSeq;


    /**
     * 쿠폰발급번호
     */
    @NotNull(message = "cpnNo can not null")
    @ApiModelProperty("쿠폰발급번호")
    private Long cpnNo;


    /**
     * 쿠폰명
     */
    @ApiModelProperty("쿠폰명")
    private String cpnNm;


    /**
     * 발급타입
     */
    @ApiModelProperty("발급타입")
    private String issueTyp;


    /**
     * 발급수량
     */
    @ApiModelProperty("발급수량")
    private Integer issueQty;


    /**
     * 발급가능 시작일시
     */
    @ApiModelProperty("발급가능 시작일시")
    private Date issueStDtm;


    /**
     * 발급가능 종료일시
     */
    @ApiModelProperty("발급가능 종료일시")
    private Date issueEdDtm;


    /**
     * 발급후 사용 가능 일자
     */
    @ApiModelProperty("발급후 사용 가능 일자")
    private String issueUseDt;


    /**
     * 할인급액
     */
    @ApiModelProperty("할인급액")
    private Integer dsctAmt;


    /**
     * 할인율
     */
    @ApiModelProperty("할인율")
    private Double dsctRatio;


    /**
     * 발급중단여부
     */
    @ApiModelProperty("발급중단여부")
    private String issueSppdYn;


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
