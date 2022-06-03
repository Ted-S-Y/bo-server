package com.bo.main.api.controller.vo.req;

import com.bo.main.api.controller.vo.common.CommonVo;
import lombok.Data;

@Data
public class ReqPackageSearchVo extends CommonVo {

    /**
     * 패키지 순번
     */
    private Long packSeq;

    /**
     * 강의 순번
     */
    private Long clssSeq;

    /**
     * 패키지 코드
     */
    private String packCd;

    /**
     * 카테고리ID
     */
    private Long ctgrId;

    /**
     * 강의 패키지 명
     */
    private String packNm;

    /**
     * 사용여부
     */
    private String useYn;

    /**
     * 검색시작일자
     */
    private String stDt;

    /**
     * 검색종료일자
     */
    private String edDt;

}
