package com.bo.main.api.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Entity
@Table(name = "REVW")
public class RevwEntity extends BaseTimeEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 리뷰순번
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Schema(description="리뷰순번")
    @Column(name = "REVW_SEQ", nullable = false)
    private Long revwSeq;

    /**
     * 판매상품 순번
     */
    @Schema(description="판매상품 순번")
    @Column(name = "SLS_PRDT_SEQ", nullable = false)
    private Long slsPrdtSeq;

    /**
     * 리뷰
     */
    @Column(name = "REVW")
    @Schema(description="리뷰")
    private String revw;

    /**
     * 회원순번
     */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "MBR_SEQ", insertable = false, updatable = false)
    @JsonBackReference
    @ToString.Exclude
    private MemberEntity memberEntity;

    // 리뷰컨텐츠
    @OneToMany(mappedBy = "revwEntity", fetch = FetchType.LAZY)
    @JsonManagedReference
    @ToString.Exclude
    private List<RevwCnntsEntity> revwCnntsEntityList;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        RevwEntity that = (RevwEntity) o;
        return revwSeq != null && Objects.equals(revwSeq, that.revwSeq);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
