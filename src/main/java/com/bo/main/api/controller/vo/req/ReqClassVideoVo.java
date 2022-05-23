package com.bo.main.api.controller.vo.req;

import com.bo.main.api.controller.vo.common.CommonVo;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@EqualsAndHashCode(callSuper = true)
@Data
public class ReqClassVideoVo extends CommonVo {

    /**
     * 비디오 순번
     */
    private Long vdSeq;
    /**
     * 강의 순번
     */
    private Long clssSeq;


    /**
     * 영상제목
     */
    private String vdTtl;


    /**
     * 영상 URL
     */
    private String vdUrl;


    /**
     * 삭제여부
     */
    private String delYn = "N";


    /**
     * 미리보기여부
     */
    private String prvYn = "N";
}
