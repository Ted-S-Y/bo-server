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
@Table(name = "MEMBER_DEVICE")
public class MemberDeviceEntity extends BaseTimeEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 기기순번
     */
    @Id
    @Column(name = "DV_SEQ", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long dvSeq;

//    /**
//     * 회원순번
//     */
//    @Column(name = "MBR_SEQ", nullable = false)
//    private Long mbrSeq;

    /**
     * 기기명
     */
    @Column(name = "DV_NM")
    private String dvNm;

    /**
     * OS
     */
    @Column(name = "OS")
    private String OS;

    /**
     * 기기타입
     */
    @Column(name = "DV_TYP")
    private String dvTyp;

    /**
     * 삭제여부
     */
    @Column(name = "DEL_YN")
    private String delYn;

    /**
     * 회원순번
     */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "MBR_SEQ", insertable = false, updatable = false, nullable = false)
    @JsonBackReference
    @ToString.Exclude
    private MemberEntity memberEntity;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        MemberDeviceEntity that = (MemberDeviceEntity) o;
        return dvSeq != null && Objects.equals(dvSeq, that.dvSeq);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
