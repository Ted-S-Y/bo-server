package com.bo.main.api.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;

@Data
@Entity
@Table(name = "CLASS_BASE")
@EqualsAndHashCode(callSuper=false)
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

    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "CLSS_SEQ")
    @JsonBackReference
    @ToString.Exclude
    private List<ClassVideoEntity> classVideoEntityList;

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
