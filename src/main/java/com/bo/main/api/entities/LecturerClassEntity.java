package com.bo.main.api.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Entity
@Table(name = "LECTURER_CLASS_MAPPING")
public class LecturerClassEntity extends BaseTimeEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 매핑순번
     */
    @Id
    @Column(name = "MAP_SEQ", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long mapSeq;

//    /**
//     * 강사순번
//     */
//    @Column(name = "LCTR_SEQ", nullable = false)
//    private Long lctrSeq;
//
//    /**
//     * 강의 순번
//     */
//    @Column(name = "CLSS_SEQ", nullable = false)
//    private Long clssSeq;

    /**
     * 강사순번
     */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "LCTR_SEQ", insertable = false, updatable = false, nullable = false)
    @JsonBackReference
    @ToString.Exclude
    private LecturerEntity lecturerEntity;

    /**
     * 강의 순번
     */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CLSS_SEQ", insertable = false, updatable = false, nullable = false)
    @JsonBackReference
    @ToString.Exclude
    private ClassBaseEntity classBaseEntity;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        LecturerClassEntity that = (LecturerClassEntity) o;
        return mapSeq != null && Objects.equals(mapSeq, that.mapSeq);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
