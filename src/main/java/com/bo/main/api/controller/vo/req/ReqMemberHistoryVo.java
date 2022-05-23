package com.bo.main.api.controller.vo.req;

import com.bo.main.api.controller.vo.common.CommonVo;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.time.LocalDateTime;


@Data
public class ReqMemberHistoryVo extends CommonVo {


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
     * 회원 명
     */
    private String mbrNm;


    /**
     * 비밀번호
     */
    private String mbrPwd;


    /**
     * 전화번화
     */
    private String mobl;


    /**
     * 이메일
     */
    private String mail;


    /**
     * 성별
     */
    private String sex;


    /**
     * 마케팅 수신 동의
     */
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
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
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
