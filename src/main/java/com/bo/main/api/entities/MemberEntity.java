package com.bo.main.api.entities;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Objects;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Entity
@Table(name = "MEMBER")
public class MemberEntity extends BaseTimeEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 회원순번
     */
    @Id
    @Column(name = "MBR_SEQ", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long mbrSeq;

    /**
     * 회원 아이디
     */
    @Column(name = "MBR_ID", nullable = false)
    private String mbrId;

    /**
     * 회원 명
     */
    @Column(name = "MBR_NM", nullable = false)
    private String mbrNm;

    /**
     * 비밀번호
     */
    @Column(name = "MBR_PWD", nullable = false)
    private String mbrPwd;

    /**
     * 전화번화
     */
    @Column(name = "mobl", nullable = false)
    private String mobl;

    /**
     * 이메일
     */
    @Column(name = "mail", nullable = false)
    private String mail;

    /**
     * 성별
     */
    @Column(name = "SEX", nullable = false)
    private String sex;

    /**
     * 마케팅 수신 동의
     */
    @Column(name = "MKT_YN", nullable = false)
    private String mktYn;

    /**
     * 직업
     */
    @Column(name = "JOB")
    private String job;

    /**
     * 주소
     */
    @Column(name = "ADDR")
    private String addr;

    /**
     * 회원가입일자
     */
    @Column(name = "JOIN_DT")
    private String joinDt;

    /**
     * 로그인시간
     */
    @Column(name = "LGN_DTM")
    private Date lgnDtm;

    /**
     * 휴면여부
     */
    @Column(name = "SLPR_YN")
    private String slprYn;

    /**
     * 이용정지여부
     */
    @Column(name = "SSPD_YN")
    private String sspdYn;

    /**
     * 이용정지사유
     */
    @Column(name = "SSPD_CD")
    private String sspdCd;


    // 사용자 기기
    @OneToMany(mappedBy = "memberEntity", fetch = FetchType.LAZY)
    @JsonManagedReference
    @ToString.Exclude
    private List<MemberDeviceEntity> memberDeviceEntityList;

    // 장바구니
    @OneToMany(mappedBy = "memberEntity", fetch = FetchType.LAZY)
    @JsonManagedReference
    @ToString.Exclude
    private List<CartEntity> cartEntityList;

    // 쿠폰이력
    @OneToMany(mappedBy = "memberEntity", fetch = FetchType.LAZY)
    @JsonManagedReference
    @ToString.Exclude
    private List<CouponIssueHistoryEntity> couponIssueHistoryEntityList;

    // 주문
    @OneToMany(mappedBy = "memberEntity", fetch = FetchType.LAZY)
    @JsonManagedReference
    @ToString.Exclude
    private List<RevwEntity> revwEntityList;

    // 문의내역
    @OneToMany(mappedBy = "memberEntity", fetch = FetchType.LAZY)
    @JsonManagedReference
    @ToString.Exclude
    private List<QuestionListEntity> questionListEntityList;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        MemberEntity that = (MemberEntity) o;
        return mbrSeq != null && Objects.equals(mbrSeq, that.mbrSeq);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
