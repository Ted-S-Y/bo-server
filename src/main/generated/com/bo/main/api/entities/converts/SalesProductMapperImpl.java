package com.bo.main.api.entities.converts;

import com.bo.main.api.controller.vo.req.ReqProductVo;
import com.bo.main.api.controller.vo.res.ResProductVo;
import com.bo.main.api.entities.CartDetailEntity;
import com.bo.main.api.entities.SalesProductDetailEntity;
import com.bo.main.api.entities.SalesProductEntity;
import com.bo.main.api.entities.vo.CartDetailVo;
import com.bo.main.api.entities.vo.SalesProductVo;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-06-07T17:39:51+0900",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 11.0.6 (Oracle Corporation)"
)
@Component
public class SalesProductMapperImpl implements SalesProductMapper {

    @Autowired
    private SalesProductDetailMapper salesProductDetailMapper;

    @Override
    public List<SalesProductVo> toVos(List<SalesProductEntity> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<SalesProductVo> list = new ArrayList<SalesProductVo>( arg0.size() );
        for ( SalesProductEntity salesProductEntity : arg0 ) {
            list.add( toVo( salesProductEntity ) );
        }

        return list;
    }

    @Override
    public List<SalesProductEntity> toEntities(List<SalesProductVo> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<SalesProductEntity> list = new ArrayList<SalesProductEntity>( arg0.size() );
        for ( SalesProductVo salesProductVo : arg0 ) {
            list.add( toEntity( salesProductVo ) );
        }

        return list;
    }

    @Override
    public SalesProductVo toVo(SalesProductEntity salesProductEntity) {
        if ( salesProductEntity == null ) {
            return null;
        }

        SalesProductVo salesProductVo = new SalesProductVo();

        salesProductVo.setCartDetails( cartDetailEntityListToCartDetailVoList( salesProductEntity.getCartDetailEntityList() ) );
        salesProductVo.setSalesProductDetails( salesProductDetailMapper.toVos( salesProductEntity.getSalesProductDetailEntityList() ) );
        salesProductVo.setSlsPrdtSeq( salesProductEntity.getSlsPrdtSeq() );
        salesProductVo.setCtgrId( salesProductEntity.getCtgrId() );
        salesProductVo.setPrdtNm( salesProductEntity.getPrdtNm() );
        salesProductVo.setShipCls( salesProductEntity.getShipCls() );
        salesProductVo.setSlsCost( salesProductEntity.getSlsCost() );
        salesProductVo.setSlsPrc( salesProductEntity.getSlsPrc() );
        salesProductVo.setShipFee( salesProductEntity.getShipFee() );
        salesProductVo.setStock( salesProductEntity.getStock() );
        salesProductVo.setSlsStat( salesProductEntity.getSlsStat() );
        salesProductVo.setDelYn( salesProductEntity.getDelYn() );
        salesProductVo.setPrdtRepImg( salesProductEntity.getPrdtRepImg() );
        salesProductVo.setPrdtDesc( salesProductEntity.getPrdtDesc() );
        salesProductVo.setCrtDtm( salesProductEntity.getCrtDtm() );
        salesProductVo.setCrtr( salesProductEntity.getCrtr() );
        salesProductVo.setUpdDtm( salesProductEntity.getUpdDtm() );
        salesProductVo.setUpdtr( salesProductEntity.getUpdtr() );

        return salesProductVo;
    }

    @Override
    public SalesProductEntity toEntity(SalesProductVo salesProductVo) {
        if ( salesProductVo == null ) {
            return null;
        }

        SalesProductEntity salesProductEntity = new SalesProductEntity();

        salesProductEntity.setCartDetailEntityList( cartDetailVoListToCartDetailEntityList( salesProductVo.getCartDetails() ) );
        salesProductEntity.setSalesProductDetailEntityList( salesProductDetailMapper.toEntities( salesProductVo.getSalesProductDetails() ) );
        salesProductEntity.setSlsPrdtSeq( salesProductVo.getSlsPrdtSeq() );
        salesProductEntity.setCtgrId( salesProductVo.getCtgrId() );
        salesProductEntity.setPrdtNm( salesProductVo.getPrdtNm() );
        salesProductEntity.setShipCls( salesProductVo.getShipCls() );
        salesProductEntity.setSlsCost( salesProductVo.getSlsCost() );
        salesProductEntity.setSlsPrc( salesProductVo.getSlsPrc() );
        salesProductEntity.setShipFee( salesProductVo.getShipFee() );
        salesProductEntity.setStock( salesProductVo.getStock() );
        salesProductEntity.setSlsStat( salesProductVo.getSlsStat() );
        salesProductEntity.setDelYn( salesProductVo.getDelYn() );
        salesProductEntity.setPrdtRepImg( salesProductVo.getPrdtRepImg() );
        salesProductEntity.setPrdtDesc( salesProductVo.getPrdtDesc() );

        return salesProductEntity;
    }

    @Override
    public SalesProductVo toVo(ReqProductVo reqProductVo) {
        if ( reqProductVo == null ) {
            return null;
        }

        SalesProductVo salesProductVo = new SalesProductVo();

        salesProductVo.setSlsPrdtSeq( reqProductVo.getSlsPrdtSeq() );
        salesProductVo.setCtgrId( reqProductVo.getCtgrId() );
        salesProductVo.setPrdtNm( reqProductVo.getPrdtNm() );
        salesProductVo.setShipCls( reqProductVo.getShipCls() );
        salesProductVo.setSlsCost( reqProductVo.getSlsCost() );
        salesProductVo.setSlsPrc( reqProductVo.getSlsPrc() );
        salesProductVo.setShipFee( reqProductVo.getShipFee() );
        salesProductVo.setStock( reqProductVo.getStock() );
        salesProductVo.setSlsStat( reqProductVo.getSlsStat() );
        salesProductVo.setDelYn( reqProductVo.getDelYn() );
        salesProductVo.setPrdtRepImg( reqProductVo.getPrdtRepImg() );
        salesProductVo.setPrdtDesc( reqProductVo.getPrdtDesc() );
        salesProductVo.setCrtDtm( reqProductVo.getCrtDtm() );
        salesProductVo.setCrtr( reqProductVo.getCrtr() );
        salesProductVo.setUpdDtm( reqProductVo.getUpdDtm() );
        salesProductVo.setUpdtr( reqProductVo.getUpdtr() );

        return salesProductVo;
    }

    @Override
    public ResProductVo toVo(SalesProductVo salesProductVo) {
        if ( salesProductVo == null ) {
            return null;
        }

        ResProductVo resProductVo = new ResProductVo();

        resProductVo.setCrtDtm( salesProductVo.getCrtDtm() );
        resProductVo.setCrtr( salesProductVo.getCrtr() );
        resProductVo.setUpdDtm( salesProductVo.getUpdDtm() );
        resProductVo.setUpdtr( salesProductVo.getUpdtr() );
        resProductVo.setSlsPrdtSeq( salesProductVo.getSlsPrdtSeq() );
        resProductVo.setCtgrId( salesProductVo.getCtgrId() );
        resProductVo.setPrdtNm( salesProductVo.getPrdtNm() );
        resProductVo.setShipCls( salesProductVo.getShipCls() );
        resProductVo.setSlsCost( salesProductVo.getSlsCost() );
        resProductVo.setSlsPrc( salesProductVo.getSlsPrc() );
        resProductVo.setShipFee( salesProductVo.getShipFee() );
        resProductVo.setStock( salesProductVo.getStock() );
        resProductVo.setSlsStat( salesProductVo.getSlsStat() );
        resProductVo.setDelYn( salesProductVo.getDelYn() );
        resProductVo.setPrdtRepImg( salesProductVo.getPrdtRepImg() );
        resProductVo.setPrdtDesc( salesProductVo.getPrdtDesc() );

        return resProductVo;
    }

    @Override
    public void updateFromVo(SalesProductVo dto, SalesProductEntity entity) {
        if ( dto == null ) {
            return;
        }

        if ( entity.getCartDetailEntityList() != null ) {
            List<CartDetailEntity> list = cartDetailVoListToCartDetailEntityList( dto.getCartDetails() );
            if ( list != null ) {
                entity.getCartDetailEntityList().clear();
                entity.getCartDetailEntityList().addAll( list );
            }
            else {
                entity.setCartDetailEntityList( null );
            }
        }
        else {
            List<CartDetailEntity> list = cartDetailVoListToCartDetailEntityList( dto.getCartDetails() );
            if ( list != null ) {
                entity.setCartDetailEntityList( list );
            }
        }
        if ( entity.getSalesProductDetailEntityList() != null ) {
            List<SalesProductDetailEntity> list1 = salesProductDetailMapper.toEntities( dto.getSalesProductDetails() );
            if ( list1 != null ) {
                entity.getSalesProductDetailEntityList().clear();
                entity.getSalesProductDetailEntityList().addAll( list1 );
            }
            else {
                entity.setSalesProductDetailEntityList( null );
            }
        }
        else {
            List<SalesProductDetailEntity> list1 = salesProductDetailMapper.toEntities( dto.getSalesProductDetails() );
            if ( list1 != null ) {
                entity.setSalesProductDetailEntityList( list1 );
            }
        }
        entity.setSlsPrdtSeq( dto.getSlsPrdtSeq() );
        entity.setCtgrId( dto.getCtgrId() );
        entity.setPrdtNm( dto.getPrdtNm() );
        entity.setShipCls( dto.getShipCls() );
        entity.setSlsCost( dto.getSlsCost() );
        entity.setSlsPrc( dto.getSlsPrc() );
        entity.setShipFee( dto.getShipFee() );
        entity.setStock( dto.getStock() );
        entity.setSlsStat( dto.getSlsStat() );
        entity.setDelYn( dto.getDelYn() );
        entity.setPrdtRepImg( dto.getPrdtRepImg() );
        entity.setPrdtDesc( dto.getPrdtDesc() );
    }

    protected CartDetailVo cartDetailEntityToCartDetailVo(CartDetailEntity cartDetailEntity) {
        if ( cartDetailEntity == null ) {
            return null;
        }

        CartDetailVo cartDetailVo = new CartDetailVo();

        cartDetailVo.setCartDtlSeq( cartDetailEntity.getCartDtlSeq() );
        cartDetailVo.setCartNo( cartDetailEntity.getCartNo() );
        cartDetailVo.setPrdtQty( cartDetailEntity.getPrdtQty() );
        cartDetailVo.setOrdrAmt( cartDetailEntity.getOrdrAmt() );
        cartDetailVo.setCrtDtm( cartDetailEntity.getCrtDtm() );
        cartDetailVo.setCrtr( cartDetailEntity.getCrtr() );
        cartDetailVo.setUpdDtm( cartDetailEntity.getUpdDtm() );
        cartDetailVo.setUpdtr( cartDetailEntity.getUpdtr() );

        return cartDetailVo;
    }

    protected List<CartDetailVo> cartDetailEntityListToCartDetailVoList(List<CartDetailEntity> list) {
        if ( list == null ) {
            return null;
        }

        List<CartDetailVo> list1 = new ArrayList<CartDetailVo>( list.size() );
        for ( CartDetailEntity cartDetailEntity : list ) {
            list1.add( cartDetailEntityToCartDetailVo( cartDetailEntity ) );
        }

        return list1;
    }

    protected CartDetailEntity cartDetailVoToCartDetailEntity(CartDetailVo cartDetailVo) {
        if ( cartDetailVo == null ) {
            return null;
        }

        CartDetailEntity cartDetailEntity = new CartDetailEntity();

        cartDetailEntity.setCartDtlSeq( cartDetailVo.getCartDtlSeq() );
        cartDetailEntity.setCartNo( cartDetailVo.getCartNo() );
        cartDetailEntity.setPrdtQty( cartDetailVo.getPrdtQty() );
        cartDetailEntity.setOrdrAmt( cartDetailVo.getOrdrAmt() );

        return cartDetailEntity;
    }

    protected List<CartDetailEntity> cartDetailVoListToCartDetailEntityList(List<CartDetailVo> list) {
        if ( list == null ) {
            return null;
        }

        List<CartDetailEntity> list1 = new ArrayList<CartDetailEntity>( list.size() );
        for ( CartDetailVo cartDetailVo : list ) {
            list1.add( cartDetailVoToCartDetailEntity( cartDetailVo ) );
        }

        return list1;
    }
}
