package com.bo.main.api.controller.vo.req;

import com.bo.main.api.controller.vo.common.CommonVo;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.time.LocalDateTime;


@Data
public class ReqConponIssueHistoryVo extends CommonVo {


    /**
     * 회원 아이디
     */
    private Long mbrId;


    /**
     * 쿠폰발급번호
     */
    private Long cpnNo;


    /**
     * 발급시간
     */
    private LocalDateTime issueDtm;


    /**
     * 사용시간
     */
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern = "yyyy-MM-dd hh:mm:ss")
    private LocalDateTime useDtm;


    /**
     * 사용중지시간
     */
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern = "yyyy-MM-dd hh:mm:ss")
    private LocalDateTime useSppdDtm;


    /**
     * 중지사유
     */
    private String useSppdCd;

}
