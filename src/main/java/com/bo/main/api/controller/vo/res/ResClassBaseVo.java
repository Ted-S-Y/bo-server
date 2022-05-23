package com.bo.main.api.controller.vo.res;

import com.bo.main.api.controller.vo.common.CommonVo;
import com.bo.main.api.controller.vo.req.ReqClassVideoVo;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.NotBlank;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
public class ResClassBaseVo extends CommonVo {
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
    private String prvYn;

    /**
     * 사용여부
     */
    private String useYn;

    List<ResClassVideoVo> videos;

}
