package com.bo.main.api.entities.vo;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;


@Data
public class CategoryVo implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 카테고리 ID
     */
    @NotNull(message = "ctgrId can not null")
    private Long ctgrId;


    /**
     * 대 카테고리 여부
     */
    private String upperCtgrYn;


    /**
     * 상위 카테고리 ID
     */
    private Long upperCtgrId;


    /**
     * 노출여부
     */
    private String showYn;


    /**
     * 카테고리 타입
     */
    private String ctgrTyp;


    /**
     * 카테고리명
     */
    private String ctgrNm;


    /**
     * 삭제여부
     */
    private String delYn;


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

    private List<ClassPackageVo> classPackages;

}
