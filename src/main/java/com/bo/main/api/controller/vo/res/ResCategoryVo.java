package com.bo.main.api.controller.vo.res;

import com.bo.main.api.controller.vo.common.CommonVo;
import lombok.Data;


@Data
public class ResCategoryVo extends CommonVo {

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
     * 노출여부
     */
    private String showYn;


    /**
     * 카테고리 타입
     */
    private String ctgrTyp;


    /**
     * 카테고리명
     */
    private String ctgrNm;


    /**
     * 삭제여부
     */
    private String delYn;
}
