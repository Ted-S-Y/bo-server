package com.bo.main.api.service;

import com.bo.main.api.controller.vo.req.ReqCouponSearchVo;
import com.bo.main.api.controller.vo.req.ReqCouponVo;
import com.bo.main.api.controller.vo.res.ResCouponVo;
import com.bo.main.api.entities.converts.CouponInfoMapper;
import com.bo.main.api.entities.vo.CouponInfoVo;
import com.bo.main.api.entities.vo.CouponInfoVo;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
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
//    private final CouponInfoService couponInfoService;
//    private final CouponInfoMapper couponInfoMapper;
//
//    public ResCouponVo findClassOneRetError(long cpnSeq) throws Exception{
//        return couponInfoMapper.toVo(couponInfoService.findCouponInfoByIdRetError(cpnSeq));
//    }
//
//    public Page<ResCouponVo> search(ReqCouponSearchVo searchVo, Pageable pageable) throws Exception {
//        Page<ResCouponVo> classBasePage = qClassManageRepository.findList(searchVo, pageable);
//        return new PageImpl<>(classBasePage.getContent(), pageable, classBasePage.getTotalElements());
//    }
//
//    public void update(ReqCouponVo reqCouponVo) throws Exception {
//        CouponInfoVo updateCouponInfoVo =couponInfoService.update(classBaseMapper.toVo(reqCouponVo));
//    }
//
//    public void add(ReqCouponVo reqCouponVo) throws Exception {
//        CouponInfoVo newCouponInfoVo = couponInfoService.add(classBaseMapper.toVo(reqCouponVo));
//    }
//
//    public void delete(long cpnSeq) throws Exception {
//        CouponInfoVo classBaseVo = couponInfoService.findCouponInfoByIdRetError(cpnSeq);
//        couponInfoService.delete(classBaseVo);
//    }


}
