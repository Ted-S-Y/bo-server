package com.bo.main.api.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import io.swagger.v3.oas.annotations.media.Schema;
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
@Table(name = "REVW_CNNTS")
public class RevwCnntsEntity extends BaseTimeEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 리뷰컨텐츠 순번
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Schema(description="리뷰컨텐츠 순번")
    @Column(name = "REVW_CNNTS_SEQ", nullable = false)
    private Long revwCnntsSeq;

//    /**
//     * 리뷰순번
//     */
//    @Schema(description="리뷰순번")
//    @Column(name = "REVW_SEQ", nullable = false)
//    private Long revwSeq;

    /**
     * 파일명
     */
    @Schema(description="파일명")
    @Column(name = "FILE_NM")
    private String fileNm;

    /**
     * 파일타입
     */
    @Schema(description="파일타입")
    @Column(name = "FILE_TYP")
    private String fileTyp;

    /**
     * 삭제여부
     */
    @Column(name = "DEL_YN")
    @Schema(description="삭제여부")
    private String delYn;

    /**
     * 리뷰순번
     */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "REVW_SEQ", insertable = false, updatable = false, nullable = false)
    @JsonBackReference
    @ToString.Exclude
    private RevwEntity revwEntity;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        RevwCnntsEntity that = (RevwCnntsEntity) o;
        return revwCnntsSeq != null && Objects.equals(revwCnntsSeq, that.revwCnntsSeq);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
