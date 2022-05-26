package com.bo.main.api.entities;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Entity
@Table(name = "CATEGORY")
public class CategoryEntity extends BaseTimeEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 카테고리 ID
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Schema(description="카테고리 ID")
    @Column(name = "CTGR_ID", nullable = false)
    private Long ctgrId;

    /**
     * 대 카테고리 여부
     */
    @Schema(description="대 카테고리 여부")
    @Column(name = "UPPER_CTGR_YN")
    private String upperCtgrYn;

    /**
     * 상위 카테고리 ID
     */
    @Column(name = "UPPER_CTGR_ID")
    @Schema(description="상위 카테고리 ID")
    private Long upperCtgrId;

    /**
     * 노출여부
     */
    @Column(name = "SHOW_YN")
    @Schema(description="노출여부")
    private String showYn;

    /**
     * 카테고리 타입
     */
    @Column(name = "CTGR_TYP")
    @Schema(description="카테고리 타입")
    private String ctgrTyp;

    /**
     * 카테고리명
     */
    @Column(name = "CTGR_NM")
    @Schema(description="카테고리명")
    private String ctgrNm;

    /**
     * 삭제여부
     */
    @Column(name = "DEL_YN")
    @Schema(description="삭제여부")
    private String delYn;


    // 패키지
    @OneToMany(mappedBy = "categoryEntity", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JsonManagedReference
    @ToString.Exclude
    private List<ClassPackageEntity> classPackageEntityList;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        CategoryEntity that = (CategoryEntity) o;
        return ctgrId != null && Objects.equals(ctgrId, that.ctgrId);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
