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
@Table(name = "LECTURER_CLASS_MAPPING")
public class LecturerClassEntity extends BaseTimeEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 강사순번
     */
    @Id
    @Column(name = "LCTR_SEQ", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long lctrSeq;

    /**
     * 강의 순번
     */
    @Column(name = "CLSS_SEQ", nullable = false)
    private Long clssSeq;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "LCTR_SEQ", insertable = false, updatable = false)
    @JsonBackReference
    @ToString.Exclude
    private LecturerClassEntity lecturerClassEntity;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CLSS_SEQ", insertable = false, updatable = false)
    @JsonBackReference
    @ToString.Exclude
    private ClassBaseEntity classBaseEntity;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        LecturerClassEntity that = (LecturerClassEntity) o;
        return lctrSeq != null && Objects.equals(lctrSeq, that.lctrSeq);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
