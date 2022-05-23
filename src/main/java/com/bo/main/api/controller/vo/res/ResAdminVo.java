package com.bo.main.api.controller.vo.res;

import com.bo.main.api.controller.vo.common.CommonVo;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class ResAdminVo  extends CommonVo {
    /**
     * 관리자 순번
     */
    private Long admSeq;

    /**
     * 관리자 아이디
     */
    private String admId;

    /**
     * 관리자 비번
     */
    private String admPwd;

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

    /**
     * 사용여부
     */
    private String useYn;
}
