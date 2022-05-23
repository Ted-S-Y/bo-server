package com.bo.main.api.controller.vo.req;

import com.bo.main.api.controller.vo.common.CommonVo;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

@EqualsAndHashCode(callSuper = true)
@Data
public class ReqAdminVo extends CommonVo {
    /**
     * 관리자 순번
     */

    private Long admSeq;

    /**
     * 관리자 아이디
     */
    @NotBlank
    private String admId;

    /**
     * 관리자 비번
     */
    @NotBlank
    private String admPwd;

    /**
     * 관리자명
     */
    @NotBlank
    private String admNm;

    /**
     * 전화번호
     */
    @NotBlank
    @Pattern(regexp = "^\\d{2,3}\\d{3,4}\\d{4}$", message = "핸드폰 번호의 양식과 맞지 않습니다. 01xxxx(x)xxxx")
    private String admMobl;

    /**
     * 이메일
     */
    @NotBlank
    @Email
    private String admMail;


    private String useYn = "Y";
}
