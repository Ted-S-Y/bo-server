package com.bo.main.api.entities.converts;

import com.bo.main.api.controller.vo.req.ReqCouponVo;
import com.bo.main.api.controller.vo.res.ResCouponVo;
import com.bo.main.api.entities.CouponInfoEntity;
import com.bo.main.api.entities.vo.CouponInfoVo;
import com.bo.main.api.entities.vo.CouponIssueHistoryVo;
import org.mapstruct.*;

@Mapper(
        uses = { CouponIssueHistoryVo.class },
        componentModel = "spring"
)
public interface CouponInfoMapper extends GenericMapper<CouponInfoVo, CouponInfoEntity> {

    @Override
    @Mapping(target = "conponIssueHistories", source = "couponIssueHistoryEntityList")
    CouponInfoVo toVo(CouponInfoEntity couponInfoEntity);

    @Override
    @Mapping(target = "couponIssueHistoryEntityList", source = "conponIssueHistories")
    CouponInfoEntity toEntity(CouponInfoVo couponInfoVo);

    ResCouponVo toVo(CouponInfoVo couponInfoVo);

    CouponInfoVo toVo(ReqCouponVo reqCouponVo);

    ReqCouponVo ReqToVo(CouponInfoVo couponInfoVo);

    @Override
    @Mapping(target = "couponIssueHistoryEntityList", source = "conponIssueHistories")
    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void updateFromVo(CouponInfoVo dto, @MappingTarget CouponInfoEntity entity);

}
