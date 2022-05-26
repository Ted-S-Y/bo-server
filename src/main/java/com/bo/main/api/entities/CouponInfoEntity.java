package com.bo.main.api.entities;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import io.swagger.v3.oas.annotations.media.Schema;
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
@Table(name = "COUPON_INFO")
public class CouponInfoEntity extends BaseTimeEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 쿠폰순번
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Schema(description="쿠폰순번")
    @Column(name = "CPN_SEQ", nullable = false)
    private Long cpnSeq;

    /**
     * 쿠폰발급번호
     */
    @Schema(description="쿠폰발급번호")
    @Column(name = "CPN_NO", nullable = false)
    private Long cpnNo;

    /**
     * 쿠폰명
     */
    @Column(name = "CPN_NM")
    @Schema(description="쿠폰명")
    private String cpnNm;

    /**
     * 발급타입
     */
    @Schema(description="발급타입")
    @Column(name = "ISSUE_TYP")
    private String issueTyp;

    /**
     * 발급수량
     */
    @Schema(description="발급수량")
    @Column(name = "ISSUE_QTY")
    private Integer issueQty;

    /**
     * 발급가능 시작일시
     */
    @Column(name = "ISSUE_ST_DTM")
    @Schema(description="발급가능 시작일시")
    private Date issueStDtm;

    /**
     * 발급가능 종료일시
     */
    @Column(name = "ISSUE_ED_DTM")
    @Schema(description="발급가능 종료일시")
    private Date issueEdDtm;

    /**
     * 발급후 사용 가능 일자
     */
    @Column(name = "ISSUE_USE_DT")
    @Schema(description="발급후 사용 가능 일자")
    private String issueUseDt;

    /**
     * 할인급액
     */
    @Schema(description="할인급액")
    @Column(name = "DSCT_AMT")
    private Integer dsctAmt;

    /**
     * 할인율
     */
    @Schema(description="할인율")
    @Column(name = "DSCT_RATIO")
    private Double dsctRatio;

    /**
     * 발급중단여부
     */
    @Schema(description="발급중단여부")
    @Column(name = "ISSUE_SPPD_YN")
    private String issueSppdYn;

    // 쿠폰발급이력
    @OneToMany(mappedBy = "couponInfoEntity", fetch = FetchType.LAZY)
    @JsonManagedReference
    @ToString.Exclude
    private List<ConponIssueHistoryEntity> conponIssueHistoryEntityList;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        CouponInfoEntity that = (CouponInfoEntity) o;
        return cpnSeq != null && Objects.equals(cpnSeq, that.cpnSeq);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
