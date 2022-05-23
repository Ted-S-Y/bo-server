package com.bo.main.api.controller.vo.req;

import com.bo.main.api.controller.vo.common.CommonVo;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

@EqualsAndHashCode(callSuper = true)
@Data
public class ReqAdminSearchVo extends CommonVo {

    /**
     * 관리자 아이디
     */
    private String admId;

    /**
     * 관리자명
     */
    private String admNm;

    /**
     * 전화번호
     */
    private String admMobl;

    /**
     * 이메일
     */
    private String admMail;

}
