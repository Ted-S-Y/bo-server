package com.bo.main.api.entities;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Entity
@Table(name = "MEMBER_HISTORY")
public class MemberHistoryEntity extends BaseTimeEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 이력 순번
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Schema(description="이력 순번")
    @Column(name = "HIST_SEQ", nullable = false)
    private Long histSeq;

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
    private String mbrId;

    /**
     * 회원순번
     */
    @Column(name = "MBR_SEQ")
    @Schema(description="회원순번")
    private Long mbrSeq;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        MemberHistoryEntity that = (MemberHistoryEntity) o;
        return histSeq != null && Objects.equals(histSeq, that.histSeq);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
