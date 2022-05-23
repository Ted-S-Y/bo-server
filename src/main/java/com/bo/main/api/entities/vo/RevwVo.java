package com.bo.main.api.entities.vo;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.time.LocalDateTime;


@Data
public class RevwVo implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 리뷰순번
     */
    @NotNull(message = "revwSeq can not null")
    private Long revwSeq;


    /**
     * 판매상품 순번
     */
    @NotNull(message = "slsPrdtSeq can not null")
    private Long slsPrdtSeq;


    /**
     * 리뷰
     */
    private String revw;


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


    RevwCnntsVo revwCnntsVo;

}
