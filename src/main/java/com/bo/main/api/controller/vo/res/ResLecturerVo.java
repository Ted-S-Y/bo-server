package com.bo.main.api.controller.vo.res;

import com.bo.main.api.controller.vo.common.CommonVo;
import com.bo.main.api.entities.vo.LecturerCareerVo;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
public class ResLecturerVo extends CommonVo {

    private Long lctrSeq;

    /**
     * 강사코드
     */
    private String lctrCd;

    /**
     * 강사명
     */
    private String lctrNm;


    /**
     * 전화전호
     */
    private String mobl;

    /**
     * 이메일
     */
    private String mail;


    /**
     * 성별
     */
    private String SEX;


    /**
     * 강사이미지
     */
    private String lctrImg;


    List<LecturerCareerVo> lecturerCareers;
}
