package com.bo.main.api.controller.vo.req;

import com.bo.main.api.controller.vo.common.CommonVo;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import java.util.List;

@Data
public class ReqClassBaseVo extends CommonVo {

    /**
     * 강의 순번
     */
    private Long clssSeq;

    /**
     * 강의코드
     */
    @NotBlank
    private String clssCd;

    /**
     * 강의명
     */
    @NotBlank
    private String clssNm;

    /**
     * 강의설명
     */
    @NotBlank
    private String clssDesc;

    /**
     * 미리보기영상여부
     */
    private String prvYn = "N";

    /**
     * 사용여부
     */
    private String useYn= "Y";

    @NotEmpty
    List<ReqClassVideoVo> videos;
}
