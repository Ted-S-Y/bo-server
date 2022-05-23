package com.bo.main.api.entities.vo;


import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
@io.swagger.annotations.ApiModel("Retrieve by query ")
public class ConponIssueHistoryQueryVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 회원 아이디
     */
    @io.swagger.annotations.ApiModelProperty("회원 아이디")
    private Long mbrId;


    /**
     * 쿠폰발급번호
     */
    @io.swagger.annotations.ApiModelProperty("쿠폰발급번호")
    private Long cpnNo;


    /**
     * 발급시간
     */
    @io.swagger.annotations.ApiModelProperty("발급시간")
    private Date issueDtm;


    /**
     * 사용시간
     */
    @io.swagger.annotations.ApiModelProperty("사용시간")
    private Date useDtm;


    /**
     * 사용중지시간
     */
    @io.swagger.annotations.ApiModelProperty("사용중지시간")
    private Date useSppdDtm;


    /**
     * 중지사유
     */
    @io.swagger.annotations.ApiModelProperty("중지사유")
    private String useSppdCd;

}
