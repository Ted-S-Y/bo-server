package com.bo.main.api.controller.vo.req;

import com.bo.main.api.controller.vo.common.CommonVo;
import lombok.Data;
import lombok.EqualsAndHashCode;

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
public class ReqMemberSearchVo extends CommonVo {
    /**
     * 회원 아이디
     */
    private String mbrId;

    /**
     * 회원 명
     */
    private String mbrNm;

    /**
     * 전화번화
     */
  private String mobl;

    /**
     * 이메일
     */
   private String mail;

    /**
     * 휴면여부
     */
    private String slprYn;

    /**
     * 이용정지여부
     */
    private String sspdYn;

    /**
     * 검색시작일자
     */
    private String stDt;

    /**
     * 검색종료일자
     */
    private String edDt;
}

