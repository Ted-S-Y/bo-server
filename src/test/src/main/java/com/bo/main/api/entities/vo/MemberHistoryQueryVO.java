package com.bo.main.api.entities.vo;


import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
@io.swagger.annotations.ApiModel("Retrieve by query ")
public class MemberHistoryQueryVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 기준일자
     */
    @io.swagger.annotations.ApiModelProperty("기준일자")
    private String stdDt;


    /**
     * 회원 아이디
     */
    @io.swagger.annotations.ApiModelProperty("회원 아이디")
    private Long mbrId;


    /**
     * 회원순번
     */
    @io.swagger.annotations.ApiModelProperty("회원순번")
    private Long mbrSeq;


    /**
     * 등록일시
     */
    @io.swagger.annotations.ApiModelProperty("등록일시")
    private Date crtDtm;


    /**
     * 등록자
     */
    @io.swagger.annotations.ApiModelProperty("등록자")
    private String CRTR;


    /**
     * 수정일시
     */
    @io.swagger.annotations.ApiModelProperty("수정일시")
    private Date updDtm;


    /**
     * 수정자
     */
    @io.swagger.annotations.ApiModelProperty("수정자")
    private String UPDTR;


    /**
     * 회원 명
     */
    @io.swagger.annotations.ApiModelProperty("회원 명")
    private String mbrNm;


    /**
     * 비밀번호
     */
    @io.swagger.annotations.ApiModelProperty("비밀번호")
    private String mbrPwd;


    /**
     * 전화번화
     */
    @io.swagger.annotations.ApiModelProperty("전화번화")
    private String MOBL;


    /**
     * 이메일
     */
    @io.swagger.annotations.ApiModelProperty("이메일")
    private String MAIL;


    /**
     * 성별
     */
    @io.swagger.annotations.ApiModelProperty("성별")
    private String SEX;


    /**
     * 마케팅 수신 동의
     */
    @io.swagger.annotations.ApiModelProperty("마케팅 수신 동의")
    private String mktYn;


    /**
     * 직업
     */
    @io.swagger.annotations.ApiModelProperty("직업")
    private String JOB;


    /**
     * 주소
     */
    @io.swagger.annotations.ApiModelProperty("주소")
    private String ADDR;


    /**
     * 회원가입일자
     */
    @io.swagger.annotations.ApiModelProperty("회원가입일자")
    private String joinDt;


    /**
     * 로그인시간
     */
    @io.swagger.annotations.ApiModelProperty("로그인시간")
    private Date lgnDtm;


    /**
     * 휴면여부
     */
    @io.swagger.annotations.ApiModelProperty("휴면여부")
    private String slprYn;


    /**
     * 이용정지여부
     */
    @io.swagger.annotations.ApiModelProperty("이용정지여부")
    private String sspdYn;


    /**
     * 이용정지사유
     */
    @io.swagger.annotations.ApiModelProperty("이용정지사유")
    private String sspdCd;

}
