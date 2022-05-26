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
@Table(name = "QUESTION_LIST")
public class QuestionListEntity extends BaseTimeEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 문의내역 순번
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Schema(description="문의내역 순번")
    @Column(name = "QUES_SEQ", nullable = false)
    private Long quesSeq;

//    /**
//     * 회원순번
//     */
//    @Schema(description="회원순번")
//    @Column(name = "MBR_SEQ", nullable = false)
//    private Long mbrSeq;

    /**
     * 문의내역 제목
     */
    @Column(name = "QUES_TTL")
    @Schema(description="문의내역 제목")
    private String quesTtl;

    /**
     * 문의내역 내용
     */
    @Column(name = "QUES_CNNTS")
    @Schema(description="문의내역 내용")
    private String quesCnnts;

    /**
     * 답변여부
     */
    @Column(name = "ANS_YN")
    @Schema(description="답변여부")
    private String ansYn;

    /**
     * 답변 내용
     */
    @Schema(description="답변 내용")
    @Column(name = "ANS_CNNTS")
    private String ansCnnts;

    /**
     * 답변완료일자
     */
    @Schema(description="답변완료일자")
    @Column(name = "ANS_CMPLT_DT")
    private String ansCmpltDt;


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
        QuestionListEntity that = (QuestionListEntity) o;
        return quesSeq != null && Objects.equals(quesSeq, that.quesSeq);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
