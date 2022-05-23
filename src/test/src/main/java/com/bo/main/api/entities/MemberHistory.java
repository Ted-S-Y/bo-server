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
@Table(name = "MEMBER_HISTORY")
public class MemberHistory implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 기준일자
     */
    @Column(name = "STD_DT")
    @ApiModelProperty("기준일자")
    private String stdDt;

    /**
     * 회원 아이디
     */
    @Column(name = "MBR_ID")
    @ApiModelProperty("회원 아이디")
    private Long mbrId;

    /**
     * 회원순번
     */
    @Column(name = "MBR_SEQ")
    @ApiModelProperty("회원순번")
    private Long mbrSeq;

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

    /**
     * 회원 명
     */
    @ApiModelProperty("회원 명")
    @Column(name = "MBR_NM", nullable = false)
    private String mbrNm;

    /**
     * 비밀번호
     */
    @ApiModelProperty("비밀번호")
    @Column(name = "MBR_PWD", nullable = false)
    private String mbrPwd;

    /**
     * 전화번화
     */
    @ApiModelProperty("전화번화")
    @Column(name = "MOBL", nullable = false)
    private String MOBL;

    /**
     * 이메일
     */
    @ApiModelProperty("이메일")
    @Column(name = "MAIL", nullable = false)
    private String MAIL;

    /**
     * 성별
     */
    @ApiModelProperty("성별")
    @Column(name = "SEX", nullable = false)
    private String SEX;

    /**
     * 마케팅 수신 동의
     */
    @ApiModelProperty("마케팅 수신 동의")
    @Column(name = "MKT_YN", nullable = false)
    private String mktYn;

    /**
     * 직업
     */
    @Column(name = "JOB")
    @ApiModelProperty("직업")
    private String JOB;

    /**
     * 주소
     */
    @Column(name = "ADDR")
    @ApiModelProperty("주소")
    private String ADDR;

    /**
     * 회원가입일자
     */
    @Column(name = "JOIN_DT")
    @ApiModelProperty("회원가입일자")
    private String joinDt;

    /**
     * 로그인시간
     */
    @Column(name = "LGN_DTM")
    @ApiModelProperty("로그인시간")
    private Date lgnDtm;

    /**
     * 휴면여부
     */
    @Column(name = "SLPR_YN")
    @ApiModelProperty("휴면여부")
    private String slprYn;

    /**
     * 이용정지여부
     */
    @Column(name = "SSPD_YN")
    @ApiModelProperty("이용정지여부")
    private String sspdYn;

    /**
     * 이용정지사유
     */
    @Column(name = "SSPD_CD")
    @ApiModelProperty("이용정지사유")
    private String sspdCd;

}
