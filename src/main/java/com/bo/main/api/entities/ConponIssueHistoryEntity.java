package com.bo.main.api.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
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
@Table(name = "CONPON_ISSUE_HISTORY")
public class ConponIssueHistoryEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 이력 순번
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Schema(description="발급 순번")
    @Column(name = "ISSUE_SEQ", nullable = false)
    private Long issueSeq;

//    /**
//     * 회원 아이디
//     */
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Schema(description="회원 아이디")
//    @Column(name = "MBR_ID", nullable = false)
//    private Long mbrId;
//
//    /**
//     * 쿠폰발급번호
//     */
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Schema(description="쿠폰발급번호")
//    @Column(name = "CPN_NO", nullable = false)
//    private Long cpnNo;

    /**
     * 발급시간
     */
    @Schema(description="발급시간")
    @Column(name = "ISSUE_DTM")
    private Date issueDtm;

    /**
     * 사용시간
     */
    @Column(name = "USE_DTM")
    @Schema(description="사용시간")
    private Date useDtm;

    /**
     * 사용중지시간
     */
    @Schema(description="사용중지시간")
    @Column(name = "USE_SPPD_DTM")
    private Date useSppdDtm;

    /**
     * 중지사유
     */
    @Schema(description="중지사유")
    @Column(name = "USE_SPPD_CD")
    private String useSppdCd;

    /**
     * 회원 아이디
     */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "MBR_ID", insertable = false, updatable = false, nullable = false)
    @JsonBackReference
    @ToString.Exclude
    private MemberEntity memberEntity;

    /**
     * 쿠폰발급번호
     */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CPN_NO", insertable = false, updatable = false)
    @JsonBackReference
    @ToString.Exclude
    private CouponInfoEntity couponInfoEntity;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        ConponIssueHistoryEntity that = (ConponIssueHistoryEntity) o;
        return issueSeq != null && Objects.equals(issueSeq, that.issueSeq);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
