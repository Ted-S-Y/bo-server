package com.bo.main.api.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Objects;

@Data
@Entity
@EqualsAndHashCode(callSuper=false)
@Table(name = "LECTURER")
public class LecturerEntity extends BaseTimeEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 강사순번
     */
    @Id
    @Column(name = "LCTR_SEQ", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long lctrSeq;

    /**
     * 강사코드
     */
    @Column(name = "LCTR_CD")
    private String lctrCd;

    /**
     * 강사명
     */
    @Column(name = "LCTR_NM")
    private String lctrNm;

    /**
     * 전화전호
     */
    @Column(name = "mobl")
    private String mobl;

    /**
     * 이메일
     */
    @Column(name = "mail")
    private String mail;

    /**
     * 성별
     */
    @Column(name = "SEX")
    private String SEX;

    /**
     * 강사이미지
     */
    @Column(name = "LCTR_IMG")
    private String lctrImg;


    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "LCTR_SEQ", insertable = false, updatable = false)
    @JsonBackReference
    @ToString.Exclude
    private List<LecturerCareerEntity> lecturerCareerEntityList;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        LecturerEntity that = (LecturerEntity) o;
        return lctrSeq != null && Objects.equals(lctrSeq, that.lctrSeq);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
