package com.bo.main.api.controller.vo.req;

import com.bo.main.api.controller.vo.common.CommonVo;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.time.LocalDateTime;


@Data
public class ReqRevwCnntsVo extends CommonVo {


    /**
     * 리뷰컨텐츠 순번
     */
    private Long revwCnntsSeq;


    /**
     * 리뷰순번
     */
    private Long revwSeq;


    /**
     * 파일명
     */
    private String fileNm;


    /**
     * 파일타입
     */
    private String fileTyp;


    /**
     * 삭제여부
     */
    private String delYn = "N";

}
