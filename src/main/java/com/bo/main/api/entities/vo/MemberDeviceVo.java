package com.bo.main.api.entities.vo;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Column;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * packageName : com.bo.main.api.entities.vo
 * fileName : MemberDeviceVo
 * author : sbyoon
 * date : 2022-05-16
 * description :
 * ===========================================================
 * DATE AUTHOR  NOTE
 * -----------------------------------------------------------
 * 2022-05-16  sbyoon 최초 생성
 */
@Data
public class MemberDeviceVo implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 기기순번
     */
    @NotNull(message = "dvSeq can not null")
    private Long dvSeq;

    /**
     * 회원순번
     */
    @NotNull(message = "mbrSeq can not null")
    private Long mbrSeq;

    /**
     * 기기명
     */
    @Column(name = "DV_NM")
    private String dvNm;

    /**
     * OS
     */
    private String OS;

    /**
     * 기기타입
     */
    private String dvTyp;

    /**
     * 삭제여부
     */
    private String delYn;

    private MemberVo memberVo;


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
}
