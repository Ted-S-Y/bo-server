package com.bo.main.api.controller.vo.res;

import com.bo.main.api.controller.vo.common.CommonVo;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.NotBlank;

@EqualsAndHashCode(callSuper = true)
@Data
public class ResClassPackageVo extends CommonVo {

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
     * 패키지 썸네일
     */
    @NotBlank
    private String packThnl;

    /**
     * 강의 패키지 명
     */
    @NotBlank
    private String packNm;

    /**
     * 단가
     */
    @NotBlank
    private Integer PRC;

    /**
     * 사용여부
     */
    private String useYn;

}
