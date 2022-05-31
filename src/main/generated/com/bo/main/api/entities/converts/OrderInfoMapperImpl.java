package com.bo.main.api.entities.converts;

import com.bo.main.api.controller.vo.req.ReqOrderInfoVo;
import com.bo.main.api.controller.vo.res.ResOrderInfoVo;
import com.bo.main.api.entities.OrderDetailEntity;
import com.bo.main.api.entities.OrderInfoEntity;
import com.bo.main.api.entities.vo.OrderInfoVo;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-05-30T17:15:06+0900",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 11.0.6 (Oracle Corporation)"
)
@Component
public class OrderInfoMapperImpl implements OrderInfoMapper {

    @Autowired
    private OrderDetailMapper orderDetailMapper;

    @Override
    public OrderInfoVo toVo(OrderInfoEntity orderInfoEntity) {
        if ( orderInfoEntity == null ) {
            return null;
        }

        OrderInfoVo orderInfoVo = new OrderInfoVo();

        orderInfoVo.setDetail( orderDetailMapper.toVo( orderInfoEntity.getOrderDetailEntity() ) );
        orderInfoVo.setOrdrNo( orderInfoEntity.getOrdrNo() );
        orderInfoVo.setOrdrAmt( orderInfoEntity.getOrdrAmt() );
        orderInfoVo.setCpnDsctAmt( orderInfoEntity.getCpnDsctAmt() );
        orderInfoVo.setOrdrStat( orderInfoEntity.getOrdrStat() );
        orderInfoVo.setPymtDt( orderInfoEntity.getPymtDt() );
        orderInfoVo.setCnclDt( orderInfoEntity.getCnclDt() );
        orderInfoVo.setRtrnDt( orderInfoEntity.getRtrnDt() );
        orderInfoVo.setCnclDtlList( orderInfoEntity.getCnclDtlList() );

        return orderInfoVo;
    }

    @Override
    public OrderInfoEntity toEntity(OrderInfoVo orderInfoVO) {
        if ( orderInfoVO == null ) {
            return null;
        }

        OrderInfoEntity orderInfoEntity = new OrderInfoEntity();

        orderInfoEntity.setOrderDetailEntity( orderDetailMapper.toEntity( orderInfoVO.getDetail() ) );
        orderInfoEntity.setOrdrNo( orderInfoVO.getOrdrNo() );
        orderInfoEntity.setOrdrAmt( orderInfoVO.getOrdrAmt() );
        orderInfoEntity.setCpnDsctAmt( orderInfoVO.getCpnDsctAmt() );
        orderInfoEntity.setOrdrStat( orderInfoVO.getOrdrStat() );
        orderInfoEntity.setPymtDt( orderInfoVO.getPymtDt() );
        orderInfoEntity.setCnclDt( orderInfoVO.getCnclDt() );
        orderInfoEntity.setRtrnDt( orderInfoVO.getRtrnDt() );
        orderInfoEntity.setCnclDtlList( orderInfoVO.getCnclDtlList() );

        return orderInfoEntity;
    }

    @Override
    public List<OrderInfoVo> toVos(List<OrderInfoEntity> e) {
        if ( e == null ) {
            return null;
        }

        List<OrderInfoVo> list = new ArrayList<OrderInfoVo>( e.size() );
        for ( OrderInfoEntity orderInfoEntity : e ) {
            list.add( toVo( orderInfoEntity ) );
        }

        return list;
    }

    @Override
    public List<OrderInfoEntity> toEntities(List<OrderInfoVo> d) {
        if ( d == null ) {
            return null;
        }

        List<OrderInfoEntity> list = new ArrayList<OrderInfoEntity>( d.size() );
        for ( OrderInfoVo orderInfoVo : d ) {
            list.add( toEntity( orderInfoVo ) );
        }

        return list;
    }

    @Override
    public OrderInfoVo toVo(ReqOrderInfoVo reqOrderInfoVO) {
        if ( reqOrderInfoVO == null ) {
            return null;
        }

        OrderInfoVo orderInfoVo = new OrderInfoVo();

        orderInfoVo.setOrdrNo( reqOrderInfoVO.getOrdrNo() );
        orderInfoVo.setCartNo( reqOrderInfoVO.getCartNo() );
        orderInfoVo.setOrdrAmt( reqOrderInfoVO.getOrdrAmt() );
        orderInfoVo.setCpnDsctAmt( reqOrderInfoVO.getCpnDsctAmt() );
        orderInfoVo.setOrdrStat( reqOrderInfoVO.getOrdrStat() );
        orderInfoVo.setPymtDt( reqOrderInfoVO.getPymtDt() );
        orderInfoVo.setCnclDt( reqOrderInfoVO.getCnclDt() );
        orderInfoVo.setRtrnDt( reqOrderInfoVO.getRtrnDt() );
        orderInfoVo.setCnclDtlList( reqOrderInfoVO.getCnclDtlList() );

        return orderInfoVo;
    }

    @Override
    public ResOrderInfoVo toVo(OrderInfoVo orderInfoVO) {
        if ( orderInfoVO == null ) {
            return null;
        }

        ResOrderInfoVo resOrderInfoVo = new ResOrderInfoVo();

        resOrderInfoVo.setOrdrNo( orderInfoVO.getOrdrNo() );
        resOrderInfoVo.setCartNo( orderInfoVO.getCartNo() );
        resOrderInfoVo.setOrdrAmt( orderInfoVO.getOrdrAmt() );
        resOrderInfoVo.setCpnDsctAmt( orderInfoVO.getCpnDsctAmt() );
        resOrderInfoVo.setOrdrStat( orderInfoVO.getOrdrStat() );
        resOrderInfoVo.setPymtDt( orderInfoVO.getPymtDt() );
        resOrderInfoVo.setCnclDt( orderInfoVO.getCnclDt() );
        resOrderInfoVo.setRtrnDt( orderInfoVO.getRtrnDt() );
        resOrderInfoVo.setCnclDtlList( orderInfoVO.getCnclDtlList() );

        return resOrderInfoVo;
    }

    @Override
    public void updateFromVo(OrderInfoVo dto, OrderInfoEntity entity) {
        if ( dto == null ) {
            return;
        }

        if ( dto.getDetail() != null ) {
            if ( entity.getOrderDetailEntity() == null ) {
                entity.setOrderDetailEntity( new OrderDetailEntity() );
            }
            orderDetailMapper.updateFromVo( dto.getDetail(), entity.getOrderDetailEntity() );
        }
        else {
            entity.setOrderDetailEntity( null );
        }
        entity.setOrdrNo( dto.getOrdrNo() );
        entity.setOrdrAmt( dto.getOrdrAmt() );
        entity.setCpnDsctAmt( dto.getCpnDsctAmt() );
        entity.setOrdrStat( dto.getOrdrStat() );
        entity.setPymtDt( dto.getPymtDt() );
        entity.setCnclDt( dto.getCnclDt() );
        entity.setRtrnDt( dto.getRtrnDt() );
        entity.setCnclDtlList( dto.getCnclDtlList() );
    }
}
