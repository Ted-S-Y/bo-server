package com.bo.main.api.entities.converts;

import com.bo.main.api.controller.vo.req.ReqOrderDetailVo;
import com.bo.main.api.controller.vo.res.ResOrderDetailVo;
import com.bo.main.api.entities.OrderDetailEntity;
import com.bo.main.api.entities.vo.OrderDetailVo;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-05-19T18:06:33+0900",
    comments = "version: 1.4.2.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-7.4.jar, environment: Java 11.0.6 (Oracle Corporation)"
)
@Component
public class OrderDetailMapperImpl implements OrderDetailMapper {

    @Override
    public OrderDetailVo toVo(OrderDetailEntity OrderDetailEntity) {
        if ( OrderDetailEntity == null ) {
            return null;
        }

        OrderDetailVo orderDetailVo = new OrderDetailVo();

        orderDetailVo.setOrdrNo( OrderDetailEntity.getOrdrNo() );
        orderDetailVo.setOrdrCls( OrderDetailEntity.getOrdrCls() );
        orderDetailVo.setOrdrAmt( OrderDetailEntity.getOrdrAmt() );

        return orderDetailVo;
    }

    @Override
    public OrderDetailEntity toEntity(OrderDetailVo orderDetailVO) {
        if ( orderDetailVO == null ) {
            return null;
        }

        OrderDetailEntity orderDetailEntity = new OrderDetailEntity();

        orderDetailEntity.setOrdrNo( orderDetailVO.getOrdrNo() );
        orderDetailEntity.setOrdrCls( orderDetailVO.getOrdrCls() );
        orderDetailEntity.setOrdrAmt( orderDetailVO.getOrdrAmt() );

        return orderDetailEntity;
    }

    @Override
    public List<OrderDetailVo> toVos(List<OrderDetailEntity> e) {
        if ( e == null ) {
            return null;
        }

        List<OrderDetailVo> list = new ArrayList<OrderDetailVo>( e.size() );
        for ( OrderDetailEntity orderDetailEntity : e ) {
            list.add( toVo( orderDetailEntity ) );
        }

        return list;
    }

    @Override
    public List<OrderDetailEntity> toEntities(List<OrderDetailVo> d) {
        if ( d == null ) {
            return null;
        }

        List<OrderDetailEntity> list = new ArrayList<OrderDetailEntity>( d.size() );
        for ( OrderDetailVo orderDetailVo : d ) {
            list.add( toEntity( orderDetailVo ) );
        }

        return list;
    }

    @Override
    public OrderDetailVo toVo(ReqOrderDetailVo reqOrderDetailVO) {
        if ( reqOrderDetailVO == null ) {
            return null;
        }

        OrderDetailVo orderDetailVo = new OrderDetailVo();

        orderDetailVo.setOrdrNo( reqOrderDetailVO.getOrdrNo() );
        orderDetailVo.setOrdrCls( reqOrderDetailVO.getOrdrCls() );
        orderDetailVo.setOrdrAmt( reqOrderDetailVO.getOrdrAmt() );

        return orderDetailVo;
    }

    @Override
    public ResOrderDetailVo toVo(OrderDetailVo orderDetailVO) {
        if ( orderDetailVO == null ) {
            return null;
        }

        ResOrderDetailVo resOrderDetailVo = new ResOrderDetailVo();

        resOrderDetailVo.setOrdrNo( orderDetailVO.getOrdrNo() );
        resOrderDetailVo.setOrdrCls( orderDetailVO.getOrdrCls() );
        resOrderDetailVo.setOrdrAmt( orderDetailVO.getOrdrAmt() );

        return resOrderDetailVo;
    }

    @Override
    public void updateFromVo(OrderDetailVo dto, OrderDetailEntity entity) {
        if ( dto == null ) {
            return;
        }

        entity.setOrdrNo( dto.getOrdrNo() );
        entity.setOrdrCls( dto.getOrdrCls() );
        entity.setOrdrAmt( dto.getOrdrAmt() );
    }
}
