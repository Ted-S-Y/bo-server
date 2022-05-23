package com.bo.main.api.entities.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;


@Data
@ApiModel("Save ")
public class MemberHistoryVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 기준일자
     */
    @ApiModelProperty("기준일자")
    private String stdDt;


    /**
     * 회원 아이디
     */
    @ApiModelProperty("회원 아이디")
    private Long mbrId;


    /**
     * 회원순번
     */
    @ApiModelProperty("회원순번")
    private Long mbrSeq;


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


    /**
     * 회원 명
     */
    @NotNull(message = "mbrNm can not null")
    @ApiModelProperty("회원 명")
    private String mbrNm;


    /**
     * 비밀번호
     */
    @NotNull(message = "mbrPwd can not null")
    @ApiModelProperty("비밀번호")
    private String mbrPwd;


    /**
     * 전화번화
     */
    @NotNull(message = "MOBL can not null")
    @ApiModelProperty("전화번화")
    private String MOBL;


    /**
     * 이메일
     */
    @NotNull(message = "MAIL can not null")
    @ApiModelProperty("이메일")
    private String MAIL;


    /**
     * 성별
     */
    @NotNull(message = "SEX can not null")
    @ApiModelProperty("성별")
    private String SEX;


    /**
     * 마케팅 수신 동의
     */
    @NotNull(message = "mktYn can not null")
    @ApiModelProperty("마케팅 수신 동의")
    private String mktYn;


    /**
     * 직업
     */
    @ApiModelProperty("직업")
    private String JOB;


    /**
     * 주소
     */
    @ApiModelProperty("주소")
    private String ADDR;


    /**
     * 회원가입일자
     */
    @ApiModelProperty("회원가입일자")
    private String joinDt;


    /**
     * 로그인시간
     */
    @ApiModelProperty("로그인시간")
    private Date lgnDtm;


    /**
     * 휴면여부
     */
    @ApiModelProperty("휴면여부")
    private String slprYn;


    /**
     * 이용정지여부
     */
    @ApiModelProperty("이용정지여부")
    private String sspdYn;


    /**
     * 이용정지사유
     */
    @ApiModelProperty("이용정지사유")
    private String sspdCd;

}
