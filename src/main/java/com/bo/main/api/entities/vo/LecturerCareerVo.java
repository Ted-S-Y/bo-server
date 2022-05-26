package com.bo.main.api.entities.vo;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;


@Data
public class LecturerCareerVo implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 경력순번
     */
    private Long carrSeq;


    /**
     * 강사순번
     */
    private Long lctrSeq;


    /**
     * 경력 명
     */
    private String carrNm;


    /**
     * 경력정렬순번
     */
    private Integer carrNo;

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

    private LecturerVo lecturerVo;
}
