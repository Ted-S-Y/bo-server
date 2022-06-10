package com.bo.main.api.service;

import com.bo.main.api.entities.CouponInfoEntity;
import com.bo.main.api.entities.converts.CouponInfoMapper;
import com.bo.main.api.entities.vo.CouponInfoVo;
import com.bo.main.api.repositories.jpa.CouponInfoRepository;
import com.bo.main.core.util.StringUtils;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

/**
 * packageName : com.bo.main.api.service
 * fileName : CouponInfoService
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
public class CouponInfoService {
    private final CouponInfoRepository couponInfoRepository;
    private final CouponInfoMapper couponInfoMapper;


    public Optional<CouponInfoEntity> findCouponInfoById(long cpnSeq) {
        return couponInfoRepository.findById(cpnSeq);
    }

    public CouponInfoVo findCouponInfoByIdRetError(long cpnSeq) throws Exception{
        Optional<CouponInfoEntity> opt = findCouponInfoById(cpnSeq);
        return couponInfoMapper.toVo(opt.orElseThrow(() -> new Exception(StringUtils.message("등록된 Coupon 정보({})가 없습니다.", cpnSeq+""))));
    }

    public CouponInfoVo update(CouponInfoVo couponInfoVo) throws Exception {
        Optional<CouponInfoEntity> opt = findCouponInfoById(couponInfoVo.getCpnSeq());

        CouponInfoEntity loadClassBase = opt.orElseThrow(() -> new Exception(StringUtils.message("등록된 Coupon 정보({})가 없습니다.", couponInfoVo.getCpnSeq() + "")));
        couponInfoMapper.updateFromVo(couponInfoVo, loadClassBase);

        return couponInfoMapper.toVo(couponInfoRepository.save(loadClassBase));
    }

    public CouponInfoVo add(CouponInfoVo couponInfoVo) throws Exception {

        Optional<CouponInfoEntity> opt = findCouponInfoById(couponInfoVo.getCpnSeq());

        if (opt.isPresent()) {
            throw new Exception(StringUtils.message("이미등록된 Coupon({}) 입니다.", couponInfoVo.getCpnSeq() + ""));
        }

        CouponInfoEntity loadClassBase = new CouponInfoEntity();
        couponInfoMapper.updateFromVo(couponInfoVo, loadClassBase);

        return couponInfoMapper.toVo(couponInfoRepository.save(loadClassBase));
    }


    public void delete(CouponInfoVo couponInfoVo) throws Exception {
        Optional<CouponInfoEntity> opt = findCouponInfoById(couponInfoVo.getCpnSeq());
        CouponInfoEntity loadClassBase = opt.orElseThrow(() -> new Exception(StringUtils.message("등록된 Coupon 정보({})가 없습니다.", couponInfoVo.getCpnSeq() + "")));
        couponInfoMapper.updateFromVo(couponInfoVo, loadClassBase);

        couponInfoRepository.delete(loadClassBase);
    }
}
