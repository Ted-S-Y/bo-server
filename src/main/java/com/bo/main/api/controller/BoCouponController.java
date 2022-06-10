package com.bo.main.api.controller;

import com.bo.main.api.service.CouponService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

    private final CouponService couponService;


}
