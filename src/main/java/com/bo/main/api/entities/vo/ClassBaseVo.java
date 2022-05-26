package com.bo.main.api.entities.vo;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;


@Data
public class ClassBaseVo implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 강의 순번
     */
    @NotNull(message = "clssSeq can not null")
    private Long clssSeq;


    /**
     * 강의코드
     */
    @NotNull(message = "clssCd can not null")
    private String clssCd;


    /**
     * 강의명
     */
    private String clssNm;


    /**
     * 강의설명
     */
    private String clssDesc;


    /**
     * 미리보기영상여부
     */
    private String prvYn;


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


    private List<ClassVideoVo> videos;

    private List<ClassPackageDetailVo> details;

    private List<LecturerClassVo> lecturerClasses;
}
