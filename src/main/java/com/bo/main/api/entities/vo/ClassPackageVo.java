package com.bo.main.api.entities.vo;

import com.bo.main.api.entities.BaseTimeEntity;
import lombok.*;
import org.hibernate.Hibernate;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;
import java.util.Objects;


@Data
public class ClassPackageVo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 패키지 순번
     */
    private Long packSeq;

    /**
     * 패키지 코드
     */
    private String packCd;

    /**
     * 카테고리ID
     */
    private Long ctgrId;

    /**
     * 패키지 썸네일
     */
    private String packThnl;

    /**
     * 강의 패키지 명
     */
    private String packNm;

    /**
     * 단가
     */
    private Integer PRC;

    /**
     * 사용여부
     */
    private String useYn;


    /**
     * 등록일시
     */

    @DateTimeFormat(pattern = "yyyy-MM-dd hh:mm:ss")
    private LocalDateTime crtDtm;

    /**
     * 등록자
     */
    private String crtr;

    /**
     * 수정일시
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd hh:mm:ss")
    private LocalDateTime updDtm;

    /**
     * 수정자
     */
    private String updtr;



    private List<ClassPackageDetailVo> classPackageDetails;

    private List<SalesProductDetailVo> salesProductDetails;

}
