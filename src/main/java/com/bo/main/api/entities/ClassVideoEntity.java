package com.bo.main.api.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Data
@Entity
@EqualsAndHashCode(callSuper=false)
@Table(name = "CLASS_VIDEO")
public class ClassVideoEntity extends BaseTimeEntity  implements Serializable {

    private static final long serialVersionUID = 1L;
    /**
     * 강의 순번
     */
    @Id
    @Column(name = "VD_SEQ", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long vdSeq;

    /**
     * 강의 순번
     */
    @Column(name = "CLSS_SEQ", nullable = false)
    private Long clssSeq;

    /**
     * 영상제목
     */
    @Column(name = "VD_TTL")
    private String vdTtl;

    /**
     * 영상 URL
     */
    @Column(name = "VD_URL")
    private String vdUrl;

    /**
     * 삭제여부
     */
    @Column(name = "DEL_YN")
    private String delYn;

    /**
     * 미리보기여부
     */
    @Column(name = "PRV_YN")
    private String prvYn;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CLSS_SEQ", insertable = false, updatable = false)
    @JsonBackReference
    @ToString.Exclude
    private ClassBaseEntity classBaseEntity;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ClassVideoEntity that = (ClassVideoEntity) o;
        return clssSeq != null && Objects.equals(clssSeq, that.clssSeq);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
