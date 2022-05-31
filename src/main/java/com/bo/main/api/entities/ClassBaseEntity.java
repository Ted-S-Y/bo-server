package com.bo.main.api.entities;

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
@Table(name = "CLASS_BASE")
public class ClassBaseEntity extends BaseTimeEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 강의 순번
     */
    @Id
    @Column(name = "CLSS_SEQ", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long clssSeq;

    /**
     * 강의코드
     */
    @Column(name = "CLSS_CD", nullable = false)
    private String clssCd;

    /**
     * 강의명
     */
    @Column(name = "CLSS_NM")
    private String clssNm;

    /**
     * 강의설명
     */
    @Column(name = "CLSS_DESC")
    private String clssDesc;

    /**
     * 미리보기영상여부
     */
    @Column(name = "PRV_YN")
    private String prvYn;

    /**
     * 사용여부
     */
    @Column(name = "USE_YN")
    private String useYn;

    // 강의 비디오
    @OneToMany(mappedBy = "classBaseEntity", fetch = FetchType.LAZY, cascade = CascadeType.REMOVE)
    @JsonManagedReference
    @ToString.Exclude
    private List<ClassVideoEntity> classVideoEntityList;

    // 강의 강사 매핑
    @OneToMany(mappedBy = "classBaseEntity", fetch = FetchType.LAZY, cascade = CascadeType.REMOVE)
    @JsonManagedReference
    @ToString.Exclude
    private List<LecturerClassEntity> lecturerClassEntityList;

    @OneToMany(mappedBy = "classBaseEntity", fetch = FetchType.LAZY, cascade = CascadeType.REMOVE)
    @JsonManagedReference
    @ToString.Exclude
    private List<ClassPackageDetailEntity> classPackageDetailEntityList;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        ClassBaseEntity that = (ClassBaseEntity) o;
        return clssSeq != null && Objects.equals(clssSeq, that.clssSeq);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
