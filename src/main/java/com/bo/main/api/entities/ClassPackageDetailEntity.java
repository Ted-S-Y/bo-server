package com.bo.main.api.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;
import lombok.ToString;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Data
@Entity
@Table(name = "CLASS_PACKAGE_DETAIL")
public class ClassPackageDetailEntity extends BaseTimeEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 패키지 순번
     */
    @Id
    @Column(name = "PACK_SEQ", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long packSeq;

    /**
     * 강의 순번
     */
    @Column(name = "CLSS_SEQ", nullable = false)
    private Long clssSeq;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PACK_SEQ", insertable = false, updatable = false)
    @JsonBackReference
    @ToString.Exclude
    private ClassPackageEntity classPackageEntity;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CLSS_SEQ", insertable = false, updatable = false)
    @JsonBackReference
    @ToString.Exclude
    private ClassBaseEntity classBaseEntity;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        ClassPackageDetailEntity that = (ClassPackageDetailEntity) o;
        return packSeq != null && Objects.equals(packSeq, that.packSeq);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
