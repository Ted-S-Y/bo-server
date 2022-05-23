package com.bo.main.api.entities.converts;

import com.bo.main.api.controller.vo.req.ReqOrderInfoVo;
import com.bo.main.api.controller.vo.res.ResOrderInfoVo;
import com.bo.main.api.entities.OrderInfoEntity;
import com.bo.main.api.entities.vo.OrderInfoVo;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

import java.util.List;

@Mapper(
    uses = {
            OrderDetailMapper.class
    },
    componentModel = "spring"
)
public interface OrderInfoMapper extends GenericMapper<OrderInfoVo, OrderInfoEntity> {

    @Mapping(target = "details", source = "orderDetailEntityList")
    @Override
    OrderInfoVo toVo(OrderInfoEntity classBaseEntity);

    @Mapping(target = "orderDetailEntityList", source = "details")
    @Override
    OrderInfoEntity toEntity(OrderInfoVo orderInfoVO);

    @Override
    List<OrderInfoVo> toVos(List<OrderInfoEntity> e);

    @Override
    List<OrderInfoEntity> toEntities(List<OrderInfoVo> d);


    OrderInfoVo toVo(ReqOrderInfoVo reqOrderInfoVO);

    ResOrderInfoVo toVo(OrderInfoVo orderInfoVO);

    @Mapping(target = "orderDetailEntityList", source = "details")
    void updateFromVo(OrderInfoVo dto, @MappingTarget OrderInfoEntity entity);

}
