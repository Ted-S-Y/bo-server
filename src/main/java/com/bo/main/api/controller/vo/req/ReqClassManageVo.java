package com.bo.main.api.controller.vo.req;

import com.bo.main.api.controller.vo.common.CommonVo;
import com.bo.main.api.entities.vo.ClassVideoVo;
import com.bo.main.api.entities.vo.LecturerClassVo;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import java.util.List;

@Data
public class ReqClassManageVo extends CommonVo {
    /**
     * 강의 순번
     */
    private Long clssSeq;

    /**
     * 강의코드
     */
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
    List<ClassVideoVo> videos;

    @NotEmpty
    LecturerClassVo lecturerClassVo;
}
