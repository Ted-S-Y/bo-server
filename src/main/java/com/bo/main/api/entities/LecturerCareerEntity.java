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
@Table(name = "LECTURER_CAREER")
public class LecturerCareerEntity extends BaseTimeEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 경력순번
     */
    @Id
    @Column(name = "CARR_SEQ", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long carrSeq;

//    /**
//     * 강사순번
//     */
//    @Column(name = "LCTR_SEQ", nullable = false)
//    private Long lctrSeq;

    /**
     * 경력 명
     */
    @Column(name = "CARR_NM")
    private String carrNm;

    /**
     * 경력정렬순번
     */
    @Column(name = "CARR_NO")
    private Integer carrNo;

    /**
     * 강사순번
     */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "LCTR_SEQ", insertable = false, updatable = false, nullable = false)
    @JsonBackReference
    @ToString.Exclude
    private LecturerEntity lecturerEntity;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        LecturerCareerEntity that = (LecturerCareerEntity) o;
        return carrSeq != null && Objects.equals(carrSeq, that.carrSeq);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
