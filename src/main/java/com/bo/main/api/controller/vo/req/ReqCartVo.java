package com.bo.main.api.controller.vo.req;

import com.bo.main.api.controller.vo.common.CommonVo;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.time.LocalDateTime;


@Data
public class ReqCartVo extends CommonVo {

    /**
     * 장바구니 번호
     */
    private Long cartNo;


    /**
     * 회원순번
     */
    private Long mbrSeq;


    /**
     * 장바구니 상태(주문전/주문완료)
     */
    private String cartStat;


    /**
     * 상품수
     */
    private Integer prdtCnt;


    /**
     * 주문합계금액
     */
    private Integer ordrSumAmt;

    ReqCartDetailVo cartDetailVo;
}
