package com.bo.main.api.controller.vo.req;

import com.bo.main.api.controller.vo.common.CommonVo;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import java.util.Date;
import java.util.List;

/**
 * packageName : com.bo.main.api.controller.vo.req
 * fileName : ReqMemberVo
 * author : sbyoon
 * date : 2022-05-16
 * description :
 * ===========================================================
 * DATE AUTHOR  NOTE
 * -----------------------------------------------------------
 * 2022-05-16  sbyoon 최초 생성
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class ReqMemberVo extends CommonVo {
    /**
     * 회원순번
     */
    private Long mbrSeq;

    /**
     * 회원 아이디
     */
    @NotBlank
    private String mbrId;

    /**
     * 회원 명
     */
    @NotBlank
    private String mbrNm;

    /**
     * 비밀번호
     */
    @NotBlank
    private String mbrPwd;

    /**
     * 전화번화
     */
    @NotBlank
    @Pattern(regexp = "^\\d{2,3}\\d{3,4}\\d{4}$", message = "핸드폰 번호의 양식과 맞지 않습니다. 01xxxx(x)xxxx")
    private String mobl;

    /**
     * 이메일
     */
    @NotBlank
    @Email
    private String mail;

    /**
     * 성별
     */
    @NotBlank
    private String SEX;

    /**
     * 마케팅 수신 동의
     */
    @NotBlank
    private String mktYn;

    /**
     * 직업
     */
    @NotBlank
    private String JOB;

    /**
     * 주소
     */
    @NotBlank
    private String ADDR;

    /**
     * 회원가입일자
     */
    @NotBlank
    private String joinDt;

    /**
     * 로그인시간
     */
    @NotBlank
    private Date lgnDtm;

    /**
     * 휴면여부
     */
    @NotBlank
    private String slprYn;

    /**
     * 이용정지여부
     */
    @NotBlank
    private String sspdYn;

    /**
     * 이용정지사유
     */
    @NotBlank
    private String sspdCd;


    @NotEmpty
    List<ReqMemberDeviceVo> devices;

}
