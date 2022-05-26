package com.bo.main.api.entities.converts;

import com.bo.main.api.controller.vo.req.ReqOrderDetailVo;
import com.bo.main.api.controller.vo.req.ReqOrderInfoVo;
import com.bo.main.api.controller.vo.res.ResOrderDetailVo;
import com.bo.main.api.controller.vo.res.ResOrderInfoVo;
import com.bo.main.api.entities.OrderDetailEntity;
import com.bo.main.api.entities.OrderInfoEntity;
import com.bo.main.api.entities.vo.OrderDetailVo;
import com.bo.main.api.entities.vo.OrderInfoVo;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-05-25T13:24:48+0900",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 11.0.6 (Oracle Corporation)"
)
@Component
public class OrderInfoMapperImpl implements OrderInfoMapper {

    @Autowired
    private OrderDetailMapper orderDetailMapper;

    @Override
    public OrderInfoVo toVo(OrderInfoEntity classBaseEntity) {
        if ( classBaseEntity == null ) {
            return null;
        }

        OrderInfoVo orderInfoVo = new OrderInfoVo();

        orderInfoVo.setDetails( orderDetailMapper.toVos( classBaseEntity.getOrderDetailEntityList() ) );
        orderInfoVo.setOrdrNo( classBaseEntity.getOrdrNo() );
        orderInfoVo.setCartNo( classBaseEntity.getCartNo() );
        orderInfoVo.setOrdrAmt( classBaseEntity.getOrdrAmt() );
        orderInfoVo.setCpnDsctAmt( classBaseEntity.getCpnDsctAmt() );
        orderInfoVo.setOrdrStat( classBaseEntity.getOrdrStat() );
        orderInfoVo.setPymtDt( classBaseEntity.getPymtDt() );
        orderInfoVo.setCnclDt( classBaseEntity.getCnclDt() );
        orderInfoVo.setRtrnDt( classBaseEntity.getRtrnDt() );
        orderInfoVo.setCnclDtlList( classBaseEntity.getCnclDtlList() );

        return orderInfoVo;
    }

    @Override
    public OrderInfoEntity toEntity(OrderInfoVo orderInfoVO) {
        if ( orderInfoVO == null ) {
            return null;
        }

        OrderInfoEntity orderInfoEntity = new OrderInfoEntity();

        orderInfoEntity.setOrderDetailEntityList( orderDetailMapper.toEntities( orderInfoVO.getDetails() ) );
        orderInfoEntity.setOrdrNo( orderInfoVO.getOrdrNo() );
        orderInfoEntity.setCartNo( orderInfoVO.getCartNo() );
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
        orderInfoVo.setDetails( reqOrderDetailVoListToOrderDetailVoList( reqOrderInfoVO.getDetails() ) );

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
        resOrderInfoVo.setDetails( orderDetailVoListToResOrderDetailVoList( orderInfoVO.getDetails() ) );

        return resOrderInfoVo;
    }

    @Override
    public void updateFromVo(OrderInfoVo dto, OrderInfoEntity entity) {
        if ( dto == null ) {
            return;
        }

        if ( entity.getOrderDetailEntityList() != null ) {
            List<OrderDetailEntity> list = orderDetailMapper.toEntities( dto.getDetails() );
            if ( list != null ) {
                entity.getOrderDetailEntityList().clear();
                entity.getOrderDetailEntityList().addAll( list );
            }
            else {
                entity.setOrderDetailEntityList( null );
            }
        }
        else {
            List<OrderDetailEntity> list = orderDetailMapper.toEntities( dto.getDetails() );
            if ( list != null ) {
                entity.setOrderDetailEntityList( list );
            }
        }
        entity.setOrdrNo( dto.getOrdrNo() );
        entity.setCartNo( dto.getCartNo() );
        entity.setOrdrAmt( dto.getOrdrAmt() );
        entity.setCpnDsctAmt( dto.getCpnDsctAmt() );
        entity.setOrdrStat( dto.getOrdrStat() );
        entity.setPymtDt( dto.getPymtDt() );
        entity.setCnclDt( dto.getCnclDt() );
        entity.setRtrnDt( dto.getRtrnDt() );
        entity.setCnclDtlList( dto.getCnclDtlList() );
    }

    protected List<OrderDetailVo> reqOrderDetailVoListToOrderDetailVoList(List<ReqOrderDetailVo> list) {
        if ( list == null ) {
            return null;
        }

        List<OrderDetailVo> list1 = new ArrayList<OrderDetailVo>( list.size() );
        for ( ReqOrderDetailVo reqOrderDetailVo : list ) {
            list1.add( orderDetailMapper.toVo( reqOrderDetailVo ) );
        }

        return list1;
    }

    protected List<ResOrderDetailVo> orderDetailVoListToResOrderDetailVoList(List<OrderDetailVo> list) {
        if ( list == null ) {
            return null;
        }

        List<ResOrderDetailVo> list1 = new ArrayList<ResOrderDetailVo>( list.size() );
        for ( OrderDetailVo orderDetailVo : list ) {
            list1.add( orderDetailMapper.toVo( orderDetailVo ) );
        }

        return list1;
    }
}
