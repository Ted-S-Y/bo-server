package com.bo.main.api.entities.vo;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.time.LocalDateTime;


@Data
public class MemberHistoryVo implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 기준일자
     */
    private String stdDt;


    /**
     * 회원 아이디
     */
    private Long mbrId;


    /**
     * 회원순번
     */
    private Long mbrSeq;


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


    /**
     * 회원 명
     */
    @NotNull(message = "mbrNm can not null")
    private String mbrNm;


    /**
     * 비밀번호
     */
    @NotNull(message = "mbrPwd can not null")
    private String mbrPwd;


    /**
     * 전화번화
     */
    @NotNull(message = "MOBL can not null")
    private String mobl;


    /**
     * 이메일
     */
    @NotNull(message = "MAIL can not null")
    private String mail;


    /**
     * 성별
     */
    @NotNull(message = "SEX can not null")
    private String sex;


    /**
     * 마케팅 수신 동의
     */
    @NotNull(message = "mktYn can not null")
    private String mktYn;


    /**
     * 직업
     */
    private String job;


    /**
     * 주소
     */
    private String addr;


    /**
     * 회원가입일자
     */
    private String joinDt;


    /**
     * 로그인시간
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd hh:mm:ss")
    private LocalDateTime lgnDtm;


    /**
     * 휴면여부
     */
    private String slprYn;


    /**
     * 이용정지여부
     */
    private String sspdYn;


    /**
     * 이용정지사유
     */
    private String sspdCd;

}
