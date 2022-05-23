package com.bo.main.api.controller.vo.req;

import com.bo.main.api.controller.vo.common.CommonVo;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.time.LocalDateTime;


@Data
public class ReqRevwVo extends CommonVo {


    /**
     * 리뷰순번
     */
    private Long revwSeq;


    /**
     * 판매상품 순번
     */
    private Long slsPrdtSeq;


    /**
     * 리뷰
     */
    private String revw;


    ReqRevwCnntsVo revwCnntsVo;

}
