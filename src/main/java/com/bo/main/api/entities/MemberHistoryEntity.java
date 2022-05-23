package com.bo.main.api.entities;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Data
@Entity
@Table(name = "MEMBER_HISTORY")
public class MemberHistoryEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 기준일자
     */
    @Column(name = "STD_DT")
    @Schema(description="기준일자")
    private String stdDt;

    /**
     * 회원 아이디
     */
    @Column(name = "MBR_ID")
    @Schema(description="회원 아이디")
    private Long mbrId;

    /**
     * 회원순번
     */
    @Column(name = "MBR_SEQ")
    @Schema(description="회원순번")
    private Long mbrSeq;

    /**
     * 등록일시
     */
    @Column(name = "CRT_DTM")
    @Schema(description="등록일시")
    private Date crtDtm;

    /**
     * 등록자
     */
    @Column(name = "CRTR")
    @Schema(description="등록자")
    private String CRTR;

    /**
     * 수정일시
     */
    @Column(name = "UPD_DTM")
    @Schema(description="수정일시")
    private Date updDtm;

    /**
     * 수정자
     */
    @Column(name = "UPDTR")
    @Schema(description="수정자")
    private String UPDTR;

    /**
     * 회원 명
     */
    @Schema(description="회원 명")
    @Column(name = "MBR_NM", nullable = false)
    private String mbrNm;

    /**
     * 비밀번호
     */
    @Schema(description="비밀번호")
    @Column(name = "MBR_PWD", nullable = false)
    private String mbrPwd;

    /**
     * 전화번화
     */
    @Schema(description="전화번화")
    @Column(name = "MOBL", nullable = false)
    private String MOBL;

    /**
     * 이메일
     */
    @Schema(description="이메일")
    @Column(name = "MAIL", nullable = false)
    private String MAIL;

    /**
     * 성별
     */
    @Schema(description="성별")
    @Column(name = "SEX", nullable = false)
    private String SEX;

    /**
     * 마케팅 수신 동의
     */
    @Schema(description="마케팅 수신 동의")
    @Column(name = "MKT_YN", nullable = false)
    private String mktYn;

    /**
     * 직업
     */
    @Column(name = "JOB")
    @Schema(description="직업")
    private String JOB;

    /**
     * 주소
     */
    @Column(name = "ADDR")
    @Schema(description="주소")
    private String ADDR;

    /**
     * 회원가입일자
     */
    @Column(name = "JOIN_DT")
    @Schema(description="회원가입일자")
    private String joinDt;

    /**
     * 로그인시간
     */
    @Column(name = "LGN_DTM")
    @Schema(description="로그인시간")
    private Date lgnDtm;

    /**
     * 휴면여부
     */
    @Column(name = "SLPR_YN")
    @Schema(description="휴면여부")
    private String slprYn;

    /**
     * 이용정지여부
     */
    @Column(name = "SSPD_YN")
    @Schema(description="이용정지여부")
    private String sspdYn;

    /**
     * 이용정지사유
     */
    @Column(name = "SSPD_CD")
    @Schema(description="이용정지사유")
    private String sspdCd;

}
