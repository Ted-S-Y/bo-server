package com.bo.main.api.service;

import com.bo.main.api.repositories.jpa.CouponInfoRepository;
import com.bo.main.api.repositories.jpa.CouponIssueHistoryRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * packageName : com.bo.main.api.service
 * fileName : CouponService
 * author : sbyoon
 * date : 2022-06-10
 * description :
 * ===========================================================
 * DATE AUTHOR  NOTE
 * -----------------------------------------------------------
 * 2022-06-10  sbyoon 최초 생성
 */
@Service
@Transactional
@Slf4j
@RequiredArgsConstructor
public class CouponService {
    private final CouponInfoRepository couponInfoRepository;

    private final CouponIssueHistoryRepository couponIssueHistoryRepository;


}
