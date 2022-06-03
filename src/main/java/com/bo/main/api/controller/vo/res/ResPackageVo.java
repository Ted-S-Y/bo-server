package com.bo.main.api.controller.vo.res;

import com.bo.main.api.controller.vo.common.CommonVo;
import com.bo.main.api.entities.vo.ClassBaseVo;
import com.bo.main.api.entities.vo.LecturerClassVo;
import com.bo.main.api.entities.vo.LecturerVo;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.NotBlank;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
public class ResPackageVo extends CommonVo {

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
    private Integer prc;

    /**
     * 사용여부
     */
    private String useYn;

    /**
     * 강의 수
     */
    private Long clssCnt;

    /**
     * 카테고리타입
     */
    private String ctgrTyp;

    /**
     * 카테고리명
     */
    private String ctgrNm;

    private List<ClassBaseVo> classBases;

}
