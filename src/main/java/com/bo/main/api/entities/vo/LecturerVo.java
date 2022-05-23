package com.bo.main.api.entities.vo;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;


@Data
public class LecturerVo implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 강사순번
     */
    private Long lctrSeq;


    /**
     * 강사코드
     */
    private String lctrCd;


    /**
     * 강사명
     */
    private String lctrNm;


    /**
     * 전화전호
     */
    private String mobl;


    /**
     * 이메일
     */
    private String mail;


    /**
     * 성별
     */
    private String SEX;


    /**
     * 강사이미지
     */
    private String lctrImg;

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

    private List<LecturerCareerVo> lecturerCareerVos;

}
