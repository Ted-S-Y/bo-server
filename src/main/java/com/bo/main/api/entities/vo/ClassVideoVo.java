package com.bo.main.api.entities.vo;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;


@Data
public class ClassVideoVo implements Serializable {
    private static final long serialVersionUID = 1L;

    @NotNull(message = "vdSeq can not null")
    private Long vdSeq;

    /**
     * 강의 순번
     */
    @NotNull(message = "clssSeq can not null")
    private Long clssSeq;


    /**
     * 영상제목
     */
    private String vdTtl;


    /**
     * 영상 URL
     */
    private String vdUrl;


    /**
     * 삭제여부
     */
    private String delYn;


    /**
     * 미리보기여부
     */
    private String prvYn;


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


    private ClassBaseVo classBaseVo;
}
