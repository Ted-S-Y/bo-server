package com.bo.main.api.controller;

import com.bo.main.api.controller.vo.req.ReqClassManageSearchVo;
import com.bo.main.api.controller.vo.req.ReqCouponSearchVo;
import com.bo.main.api.controller.vo.req.ReqCouponVo;
import com.bo.main.api.controller.vo.res.ResCouponVo;
import com.bo.main.api.controller.vo.res.ResCouponVo;
import com.bo.main.api.entities.converts.CouponInfoMapper;
import com.bo.main.api.entities.converts.CouponIssueHistoryMapper;
import com.bo.main.api.entities.vo.CouponIssueHistoryVo;
import com.bo.main.api.service.CouponInfoService;
import com.bo.main.api.service.CouponIssueHistoryService;
import com.bo.main.api.service.CouponService;
import com.bo.main.core.wapper.ResultResponse;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.Map;

/**
 * packageName : com.bo.main.api.controller
 * fileName : BoCouponController
 * author : sbyoon
 * date : 2022-06-10
 * description :
 * ===========================================================
 * DATE AUTHOR  NOTE
 * -----------------------------------------------------------
 * 2022-06-10  sbyoon 최초 생성
 */
@RestController
@RequestMapping("/bo/admin/coupon")
@RequiredArgsConstructor
public class BoCouponController {

    private final CouponInfoService couponInfoService;
    private final CouponInfoMapper couponInfoMapper;

    private final CouponIssueHistoryService couponIssueHistoryService;
    private final CouponIssueHistoryMapper couponIssueHistoryMapper;

    private final ObjectMapper objectMapper;

    @GetMapping("/{cpnSeq}")
    public ResultResponse<?> searchCoupon(
            HttpServletRequest req, HttpServletResponse resp,
            @Valid @NotNull(message = "cpnSeq is required") @PathVariable(name = "cpnSeq") long cpnSeq
    ) throws Exception {
        ResCouponVo resCouponVo = couponInfoMapper.toVo(couponInfoService.findOne(cpnSeq));
        return new ResultResponse<>(resCouponVo);
    }

    @GetMapping("/list")
    public ResultResponse<?> searchCoupons(
            HttpServletRequest req, HttpServletResponse resp,
            @Valid @RequestParam Map<String, String> parameterMap,
            @PageableDefault(page = 0, size = 10) Pageable pageable
    ) throws Exception {
        ReqCouponSearchVo searchVo = objectMapper.convertValue(parameterMap, ReqCouponSearchVo.class);

        return new ResultResponse<>(couponInfoService.search(searchVo, pageable));
    }

    @PostMapping("/management")
    public ResultResponse<?> register(
            HttpServletRequest req, HttpServletResponse resp,
            @Valid @RequestBody ReqCouponVo reqCouponVo
    ) throws Exception {

        couponInfoService.add(couponInfoMapper.toVo(reqCouponVo));
        return new ResultResponse<>(HttpStatus.CREATED);
    }

    @PutMapping("/management")
    public ResultResponse<?> modify(
            HttpServletRequest req, HttpServletResponse resp,
            @Valid @RequestBody ReqCouponVo reqCouponVo
    ) throws Exception {
        couponInfoService.update(couponInfoMapper.toVo(reqCouponVo));
        return new ResultResponse<>(HttpStatus.CREATED);
    }

    @DeleteMapping("/{cpnSeq}")
    public ResultResponse<?> delete(
            HttpServletRequest req, HttpServletResponse resp,
            @Valid @NotNull(message = "cpnSeq is required") @PathVariable(name = "cpnSeq") long cpnSeq
    ) throws Exception {
        couponInfoService.delete(cpnSeq);
        return new ResultResponse<>(HttpStatus.OK);
    }

    @PostMapping("/use/management")
    public ResultResponse<?> useRegister(
            HttpServletRequest req, HttpServletResponse resp,
            @Valid @RequestBody ReqCouponVo reqCouponVo
    ) throws Exception {

        couponIssueHistoryService.add(couponIssueHistoryMapper.toVo(reqCouponVo));
        return new ResultResponse<>(HttpStatus.CREATED);
    }

    @PutMapping("/use/management")
    public ResultResponse<?> useUpdate(
            HttpServletRequest req, HttpServletResponse resp,
            @Valid @RequestBody ReqCouponVo reqCouponVo
    ) throws Exception {

        couponIssueHistoryService.update(couponIssueHistoryMapper.toVo(reqCouponVo));
        return new ResultResponse<>(HttpStatus.CREATED);
    }

    @DeleteMapping("/use/{cpnSeq}")
    public ResultResponse<?> useDelete(
            HttpServletRequest req, HttpServletResponse resp,
            @Valid @RequestBody CouponIssueHistoryVo couponIssueHistoryVo
    ) throws Exception {
        couponIssueHistoryService.delete(couponIssueHistoryVo);
        return new ResultResponse<>(HttpStatus.OK);
    }
}
