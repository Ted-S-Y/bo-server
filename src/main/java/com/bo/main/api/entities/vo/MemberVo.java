package com.bo.main.api.entities.vo;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

/**
 * packageName : com.bo.main.api.entities.vo
 * fileName : MemberVo
 * author : sbyoon
 * date : 2022-05-16
 * description :
 * ===========================================================
 * DATE AUTHOR  NOTE
 * -----------------------------------------------------------
 * 2022-05-16  sbyoon 최초 생성
 */
@Data
public class MemberVo implements Serializable {
    private static final long serialVersionUID = 1L;
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
     */private String mbrNm;

    /**
     * 비밀번호
     */private String mbrPwd;

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
    private String JOB;

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

    private List<MemberDeviceVo> devices;

    private List<QuestionListVo> questionLists;

    private List<CartVo> carts;

    private List<RevwVo> revws;

    private List<CouponIssueHistoryVo> conponIssueHistorys;
}
