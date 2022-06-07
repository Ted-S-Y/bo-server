package com.bo.main.api.controller.vo.req;

import com.bo.main.api.controller.vo.common.CommonVo;
import com.bo.main.api.entities.vo.LecturerCareerVo;
import com.bo.main.api.entities.vo.LecturerClassVo;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
public class ReqLecturerVo extends CommonVo {
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
    @Pattern(regexp = "^\\d{2,3}\\d{3,4}\\d{4}$", message = "핸드폰 번호의 양식과 맞지 않습니다. 01xxxx(x)xxxx")
    private String mobl;


    /**
     * 이메일
     */
    @Email
    private String mail;


    /**
     * 성별
     */
    private String SEX;


    /**
     * 강사이미지
     */
    private String lctrImg;


    List<LecturerCareerVo> lecturerCareerVoList;

    LecturerClassVo lecturerClassVo;

}
