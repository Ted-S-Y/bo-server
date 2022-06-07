package com.bo.main.api.controller.vo.req;

import com.bo.main.api.controller.vo.common.CommonVo;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.Email;
import javax.validation.constraints.Pattern;
import java.util.Date;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
public class ReqLecturerSearchVo extends CommonVo {
    /**
     * 강사순번
     */
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
     * 검색시작일자
     */
    private String stDt;

    /**
     * 검색종료일자
     */
    private String edDt;

}
