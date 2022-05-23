package com.bo.main.api.controller.vo.req;

import com.bo.main.api.controller.vo.common.CommonVo;
import com.bo.main.api.entities.vo.MemberVo;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Column;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.time.LocalDateTime;

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
public class ReqMemberDeviceVo extends CommonVo {

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
    private String delYn = "N";

}
