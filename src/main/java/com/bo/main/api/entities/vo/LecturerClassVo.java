package com.bo.main.api.entities.vo;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.time.LocalDateTime;


@Data
public class LecturerClassVo implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 매핑순번
     */
    @NotNull(message = "mapSeq can not null")
    private Long mapSeq;


    /**
     * 강사순번
     */
    @NotNull(message = "lctrSeq can not null")
    private Long lctrSeq;


    /**
     * 강의 순번
     */
    @NotNull(message = "clssSeq can not null")
    private Long clssSeq;

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

    private ClassBaseVo classBaseVo;
}
