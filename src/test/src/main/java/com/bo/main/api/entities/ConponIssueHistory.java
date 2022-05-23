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
@Table(name = "CONPON_ISSUE_HISTORY")
public class ConponIssueHistory implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 회원 아이디
     */
    @ApiModelProperty("회원 아이디")
    @Column(name = "MBR_ID", nullable = false)
    private Long mbrId;

    /**
     * 쿠폰발급번호
     */
    @ApiModelProperty("쿠폰발급번호")
    @Column(name = "CPN_NO", nullable = false)
    private Long cpnNo;

    /**
     * 발급시간
     */
    @ApiModelProperty("발급시간")
    @Column(name = "ISSUE_DTM")
    private Date issueDtm;

    /**
     * 사용시간
     */
    @Column(name = "USE_DTM")
    @ApiModelProperty("사용시간")
    private Date useDtm;

    /**
     * 사용중지시간
     */
    @ApiModelProperty("사용중지시간")
    @Column(name = "USE_SPPD_DTM")
    private Date useSppdDtm;

    /**
     * 중지사유
     */
    @ApiModelProperty("중지사유")
    @Column(name = "USE_SPPD_CD")
    private String useSppdCd;

}
