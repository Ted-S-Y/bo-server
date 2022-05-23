package com.bo.main.api.controller.vo.req;

import com.bo.main.api.controller.vo.common.CommonVo;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.time.LocalDateTime;


@Data
public class ReqCartDetailVo extends CommonVo {

    /**
     * 장바구니상세순번
     */
    private Long cartDtlSeq;


    /**
     * 판매상품 순번
     */
    private Long slsPrdtSeq;


    /**
     * 장바구니 번호
     */
    private Long cartNo;


    /**
     * 상품수량
     */
    private Integer prdtQty;


    /**
     * 주문금액
     */
    private Integer ordrAmt;


}
