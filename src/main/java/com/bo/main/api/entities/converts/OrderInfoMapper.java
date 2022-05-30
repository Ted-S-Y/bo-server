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

    @Override @Mapping(target = "detail", source = "orderDetailEntity")
    OrderInfoVo toVo(OrderInfoEntity orderInfoEntity);

    @Override
    @Mapping(target = "orderDetailEntity", source = "detail")
    OrderInfoEntity toEntity(OrderInfoVo orderInfoVO);

    @Override
    List<OrderInfoVo> toVos(List<OrderInfoEntity> e);

    @Override
    List<OrderInfoEntity> toEntities(List<OrderInfoVo> d);


    OrderInfoVo toVo(ReqOrderInfoVo reqOrderInfoVO);

    ResOrderInfoVo toVo(OrderInfoVo orderInfoVO);

    @Mapping(target = "orderDetailEntity", source = "detail")
    void updateFromVo(OrderInfoVo dto, @MappingTarget OrderInfoEntity entity);

}
