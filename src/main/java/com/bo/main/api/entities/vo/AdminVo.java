package com.bo.main.api.entities.vo;

import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;


@Data
public class AdminVo implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 관리자 순번
     */
    private Long admSeq;


    /**
     * 관리자 아이디
     */
    private String admId;

    /**
     * 관리자 비번
     */
    private String admPwd;


    /**
     * 관리자명
     */
    private String admNm;


    /**
     * 전화번호
     */
    private String admMobl;


    /**
     * 이메일
     */
    private String admMail;


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

}
