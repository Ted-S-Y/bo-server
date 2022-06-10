package com.bo.main.api.entities.converts;

import com.bo.main.api.controller.vo.req.ReqCouponVo;
import com.bo.main.api.controller.vo.res.ResCouponVo;
import com.bo.main.api.entities.CouponIssueHistoryEntity;
import com.bo.main.api.entities.vo.CouponIssueHistoryVo;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

@Mapper(
        componentModel = "spring"
)
public interface CouponIssueHistoryMapper extends GenericMapper<CouponIssueHistoryVo, CouponIssueHistoryEntity> {

    @Override
    @Mapping(target = "couponInfoVo", ignore = true)
    CouponIssueHistoryVo toVo(CouponIssueHistoryEntity couponInfoEntity);

    @Override
    @Mapping(target = "couponInfoEntity", ignore = true)
    CouponIssueHistoryEntity toEntity(CouponIssueHistoryVo couponInfoVo);

    ResCouponVo toVo(CouponIssueHistoryVo couponInfoVo);

    CouponIssueHistoryVo toVo(ReqCouponVo reqCouponIssueHistoryVo);

    @Override
    @Mapping(target = "couponInfoEntity", ignore = true)
    void updateFromVo(CouponIssueHistoryVo dto, @MappingTarget CouponIssueHistoryEntity entity);

}
