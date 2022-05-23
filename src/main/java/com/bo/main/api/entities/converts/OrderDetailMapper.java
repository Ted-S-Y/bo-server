package com.bo.main.api.entities.converts;

import com.bo.main.api.controller.vo.req.ReqOrderDetailVo;
import com.bo.main.api.controller.vo.res.ResOrderDetailVo;
import com.bo.main.api.entities.OrderDetailEntity;
import com.bo.main.api.entities.vo.OrderDetailVo;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

import java.util.List;

@Mapper(
    componentModel = "spring"
)
public interface OrderDetailMapper extends GenericMapper<OrderDetailVo, OrderDetailEntity> {

    @Mapping(target = "orderInfoVo", ignore = true)
    @Override
    OrderDetailVo toVo(OrderDetailEntity OrderDetailEntity);

    @Mapping(target = "orderInfoEntity", ignore = true)
    @Override
    OrderDetailEntity toEntity(OrderDetailVo orderDetailVO);

    @Override
    List<OrderDetailVo> toVos(List<OrderDetailEntity> e);

    @Override
    List<OrderDetailEntity> toEntities(List<OrderDetailVo> d);

    @Mapping(target = "orderInfoVo", ignore = true)
    OrderDetailVo toVo(ReqOrderDetailVo reqOrderDetailVO);

    ResOrderDetailVo toVo(OrderDetailVo orderDetailVO);

    @Mapping(target = "orderInfoEntity", ignore = true)
    void updateFromVo(OrderDetailVo dto, @MappingTarget OrderDetailEntity entity);


}
