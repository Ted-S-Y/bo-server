package com.bo.main.api.controller.vo.res;

import com.bo.main.api.controller.vo.common.CommonVo;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * packageName : com.bo.main.api.entities.vo
 * fileName : MemberDeviceVo
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
public class ResMemberDeviceVo extends CommonVo {

    /**
     * 기기순번
     */
    private Long dvSeq;

    /**
     * 회원순번
     */
    private Long mbrSeq;

    /**
     * 기기명
     */
    private String dvNm;

    /**
     * OS
     */
    private String OS;

    /**
     * 기기타입
     */
    private String dvTyp;

    /**
     * 삭제여부
     */
    private String delYn;

}
