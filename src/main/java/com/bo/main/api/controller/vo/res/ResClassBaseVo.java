package com.bo.main.api.controller.vo.res;

import com.bo.main.api.controller.vo.common.CommonVo;
import com.bo.main.api.controller.vo.req.ReqClassVideoVo;
import com.bo.main.api.entities.vo.ClassPackageDetailVo;
import com.bo.main.api.entities.vo.ClassVideoVo;
import com.bo.main.api.entities.vo.LecturerClassVo;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.NotBlank;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ResClassBaseVo extends CommonVo {
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
    private String clssNm;

    /**
     * 강의설명
     */
    private String clssDesc;

    /**
     * 미리보기영상여부
     */
    private String prvYn;

    /**
     * 강사명
     */
    private String lctrNm;

    /**
     * 사용여부
     */
    private String useYn;

    /**
     * 영상 수
     */
    private Long vdCnt;

    private List<ClassVideoVo> videos;

    private List<ClassPackageDetailVo> details;

    private List<LecturerClassVo> lecturerClasses;
}
