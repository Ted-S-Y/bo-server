package com.bo.main.api.controller.vo.req;

import com.bo.main.api.controller.vo.common.CommonVo;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class ReqClassVideoSearchVo extends CommonVo {

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
     * 삭제여부
     */
    private String delYn;


    /**
     * 미리보기여부
     */
    private String prvYn;
}
