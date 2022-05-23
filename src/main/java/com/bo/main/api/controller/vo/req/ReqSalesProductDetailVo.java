package com.bo.main.api.controller.vo.req;

import com.bo.main.api.controller.vo.common.CommonVo;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.time.LocalDateTime;


@Data
public class ReqSalesProductDetailVo extends CommonVo {


    /**
     * 판매상품 순번
     */
    private Long slsPrdtSeq;


    /**
     * 배송상품 순번
     */
    private Long shipPrdtSeq;


    /**
     * 패키지 순번
     */
    private Long packSeq;


    /**
     * 배송상품여부
     */
    private String shipPrdtYn;

}
