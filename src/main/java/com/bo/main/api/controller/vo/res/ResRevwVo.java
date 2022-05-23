package com.bo.main.api.controller.vo.res;

import com.bo.main.api.controller.vo.common.CommonVo;
import lombok.Data;


@Data
public class ResRevwVo extends CommonVo {


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


    ResRevwCnntsVo revwCnntsVo;

}
