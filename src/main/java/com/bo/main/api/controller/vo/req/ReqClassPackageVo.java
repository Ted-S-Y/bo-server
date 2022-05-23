package com.bo.main.api.controller.vo.req;

import com.bo.main.api.controller.vo.common.CommonVo;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
public class ReqClassPackageVo extends CommonVo {

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
    private String useYn= "Y";

}
