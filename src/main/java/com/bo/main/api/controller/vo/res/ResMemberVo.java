package com.bo.main.api.controller.vo.res;

import com.bo.main.api.controller.vo.common.CommonVo;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;

/**
 * packageName : com.bo.main.api.controller.vo.res
 * fileName : ResMemberVo
 * author : sbyoon
 * date : 2022-05-16
 * description :
 * ===========================================================
 * DATE AUTHOR  NOTE
 * -----------------------------------------------------------
 * 2022-05-16  sbyoon 최초 생성
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class ResMemberVo extends CommonVo {
    /**
     * 회원순번
     */
    private Long mbrSeq;

    /**
     * 회원 아이디
     */
    private String mbrId;

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
   private String SEX;

    /**
     * 마케팅 수신 동의
     */
    private String mktYn;

    /**
     * 직업
     */
    private String JOB;

    /**
     * 주소
     */
    private String ADDR;

    /**
     * 회원가입일자
     */
    private String joinDt;

    /**
     * 로그인시간
     */
    private Date lgnDtm;

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
