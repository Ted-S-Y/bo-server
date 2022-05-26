package com.bo.main.api.entities.vo;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
public class ClassPackageDetailVo  implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 매핑 순번
     */
    private Long mapSeq;

    /**
     * 패키지 순번
     */
    private Long packSeq;

    /**
     * 강의 순번
     */
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


    private ClassBaseVo classBaseVo;


    private ClassPackageVo classPackageVo;
}
