package com.bo.main.api.controller.vo.req;

import com.bo.main.api.controller.vo.common.CommonVo;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.time.LocalDateTime;


@Data
public class ReqCategoryVo extends CommonVo {

    /**
     * 카테고리 ID
     */
    private Long ctgrId;


    /**
     * 대 카테고리 여부
     */
    private String upperCtgrYn;


    /**
     * 상위 카테고리 ID
     */
    private Long upperCtgrId;


    /**
     * 카테고리 타입
     */
    private String ctgrTyp;


    /**
     * 삭제여부
     */
    private String delYn = "N";
}
