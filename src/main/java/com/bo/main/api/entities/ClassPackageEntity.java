package com.bo.main.api.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
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
@Table(name = "CLASS_PACKAGE")
public class ClassPackageEntity extends BaseTimeEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 패키지 순번
     */
    @Id
    @Column(name = "PACK_SEQ", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long packSeq;

    /**
     * 패키지 코드
     */
    @Column(name = "PACK_CD")
    private String packCd;

//    /**
//     * 카테고리ID
//     */
//    @Column(name = "CTGR_ID")
//    private Long ctgrId;

    /**
     * 패키지 썸네일
     */
    @Column(name = "PACK_THNL")
    private String packThnl;

    /**
     * 강의 패키지 명
     */
    @Column(name = "PACK_NM")
    private String packNm;

    /**
     * 단가
     */
    @Column(name = "PRC")
    private Integer PRC;

    /**
     * 사용여부
     */
    @Column(name = "USE_YN")
    private String useYn;

    /**
     * 카테고리ID
     */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CTGR_ID", insertable = false, updatable = false)
    @JsonBackReference
    @ToString.Exclude
    private CategoryEntity categoryEntity;

    // 패키지상세
    @OneToMany(mappedBy = "classPackageEntity", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JsonManagedReference
    @ToString.Exclude
    private List<ClassPackageDetailEntity> classPackageDetailEntityList;

    // 판매상품상세
    @OneToMany(mappedBy = "classPackageEntity", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JsonManagedReference
    @ToString.Exclude
    private List<SalesProductDetailEntity> salesProductDetailEntityList;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        ClassPackageEntity that = (ClassPackageEntity) o;
        return packSeq != null && Objects.equals(packSeq, that.packSeq);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
