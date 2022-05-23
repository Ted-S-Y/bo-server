package com.bo.main.api.controller.vo.res;

import com.bo.main.api.controller.vo.common.CommonVo;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.NotBlank;

@EqualsAndHashCode(callSuper = true)
@Data
public class ResClassVideoVo extends CommonVo {

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
    private String delYn;


    /**
     * 미리보기여부
     */
    private String prvYn;
}
