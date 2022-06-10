package com.bo.main.api.service;

import com.bo.main.api.controller.vo.req.ReqCouponVo;
import com.bo.main.api.entities.ClassVideoEntity;
import com.bo.main.api.entities.CouponIssueHistoryEntity;
import com.bo.main.api.entities.converts.CouponIssueHistoryMapper;
import com.bo.main.api.entities.vo.ClassVideoVo;
import com.bo.main.api.entities.vo.CouponIssueHistoryVo;
import com.bo.main.api.repositories.jpa.CouponIssueHistoryRepository;
import com.bo.main.api.repositories.querydsl.QCouponIssueHistoryRepository;
import com.bo.main.core.util.StringUtils;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

/**
 * packageName : com.bo.main.api.service
 * fileName : CouponIssueHistoryService
 * author : sbyoon
 * date : 2022-06-13
 * description :
 * ===========================================================
 * DATE AUTHOR  NOTE
 * -----------------------------------------------------------
 * 2022-06-13  sbyoon 최초 생성
 */
@Service
@Transactional
@Slf4j
@RequiredArgsConstructor
public class CouponIssueHistoryService {
    private final CouponIssueHistoryRepository couponIssueHistoryRepository;
    private final CouponIssueHistoryMapper couponIssueHistoryMapper;

    private final QCouponIssueHistoryRepository qCouponIssueHistoryRepository;

    public Optional<CouponIssueHistoryEntity> findCouponIssueHistoryById(long issueSeq) {
        return couponIssueHistoryRepository.findById(issueSeq);
    }

    public CouponIssueHistoryVo findCouponIssueHistoryByIdRetError(long issueSeq) throws Exception{
        Optional<CouponIssueHistoryEntity> opt = findCouponIssueHistoryById(issueSeq);
        return couponIssueHistoryMapper.toVo(opt.orElseThrow(() -> new Exception(StringUtils.message("등록된 Coupon 정보({})가 없습니다.", issueSeq+""))));
    }

    public List<CouponIssueHistoryVo> findCouponIssueHistoryByIdRetError(ReqCouponVo reqCouponVo) throws Exception {
        Optional<List<CouponIssueHistoryEntity>> opt = qCouponIssueHistoryRepository.findByCpnNo(reqCouponVo);
        return couponIssueHistoryMapper.toVos(opt.orElseThrow(() -> new Exception(StringUtils.message("등록된 Coupon 정보({})가 없습니다.", reqCouponVo.getCpnSeq()+""))));
    }
    
    
    public CouponIssueHistoryVo update(CouponIssueHistoryVo couponIssueHistoryVo) throws Exception {
        Optional<CouponIssueHistoryEntity> opt = findCouponIssueHistoryById(couponIssueHistoryVo.getIssueSeq());

        CouponIssueHistoryEntity loadCouponIssueHistory = opt.orElseThrow(() -> new Exception(StringUtils.message("등록된 Coupon 정보({})가 없습니다.", couponIssueHistoryVo.getIssueSeq() + "")));
        couponIssueHistoryMapper.updateFromVo(couponIssueHistoryVo, loadCouponIssueHistory);

        return couponIssueHistoryMapper.toVo(couponIssueHistoryRepository.save(loadCouponIssueHistory));
    }

    public CouponIssueHistoryVo add(CouponIssueHistoryVo couponIssueHistoryVo) throws Exception {

        Optional<CouponIssueHistoryEntity> opt = findCouponIssueHistoryById(couponIssueHistoryVo.getIssueSeq());

        if (opt.isPresent()) {
            throw new Exception(StringUtils.message("이미등록된 Coupon({}) 입니다.", couponIssueHistoryVo.getIssueSeq() + ""));
        }

        CouponIssueHistoryEntity loadCouponIssueHistory = new CouponIssueHistoryEntity();
        couponIssueHistoryMapper.updateFromVo(couponIssueHistoryVo, loadCouponIssueHistory);

        return couponIssueHistoryMapper.toVo(couponIssueHistoryRepository.save(loadCouponIssueHistory));
    }


    public void delete(CouponIssueHistoryVo couponIssueHistoryVo) throws Exception {
        Optional<CouponIssueHistoryEntity> opt = findCouponIssueHistoryById(couponIssueHistoryVo.getIssueSeq());
        CouponIssueHistoryEntity loadCouponIssueHistory = opt.orElseThrow(() -> new Exception(StringUtils.message("등록된 Coupon 정보({})가 없습니다.", couponIssueHistoryVo.getIssueSeq() + "")));
        couponIssueHistoryMapper.updateFromVo(couponIssueHistoryVo, loadCouponIssueHistory);

        couponIssueHistoryRepository.delete(loadCouponIssueHistory);
    }
}
