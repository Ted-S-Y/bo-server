package com.bo.main.api.controller.vo.req;

import com.bo.main.api.controller.vo.common.CommonVo;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.NotBlank;

@EqualsAndHashCode(callSuper = true)
@Data
public class ReqClassPackageSearchVo extends CommonVo {

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
    @NotBlank
    private String packCd;

    /**
     * 카테고리ID
     */
    @NotBlank
    private Long ctgrId;

    /**
     * 강의 패키지 명
     */
    @NotBlank
    private String packNm;

    /**
     * 사용여부
     */
    private String useYn;

}
