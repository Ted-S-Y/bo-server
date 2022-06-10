package com.bo.main.api.entities.converts;

import com.bo.main.api.controller.vo.req.ReqCouponInfoVo;
import com.bo.main.api.controller.vo.res.ResCouponInfoVo;
import com.bo.main.api.entities.CouponInfoEntity;
import com.bo.main.api.entities.CouponIssueHistoryEntity;
import com.bo.main.api.entities.vo.CouponInfoVo;
import com.bo.main.api.entities.vo.CouponIssueHistoryVo;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-06-10T18:01:18+0900",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 11.0.6 (Oracle Corporation)"
)
@Component
public class CouponInfoMapperImpl implements CouponInfoMapper {

    @Autowired
    private CouponIssueHistoryVo couponIssueHistoryVo;

    @Override
    public List<CouponInfoVo> toVos(List<CouponInfoEntity> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<CouponInfoVo> list = new ArrayList<CouponInfoVo>( arg0.size() );
        for ( CouponInfoEntity couponInfoEntity : arg0 ) {
            list.add( toVo( couponInfoEntity ) );
        }

        return list;
    }

    @Override
    public List<CouponInfoEntity> toEntities(List<CouponInfoVo> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<CouponInfoEntity> list = new ArrayList<CouponInfoEntity>( arg0.size() );
        for ( CouponInfoVo couponInfoVo : arg0 ) {
            list.add( toEntity( couponInfoVo ) );
        }

        return list;
    }

    @Override
    public CouponInfoVo toVo(CouponInfoEntity couponInfoEntity) {
        if ( couponInfoEntity == null ) {
            return null;
        }

        CouponInfoVo couponInfoVo = couponIssueHistoryVo.getCouponInfoVo();

        couponInfoVo.setConponIssueHistories( couponIssueHistoryEntityListToCouponIssueHistoryVoList( couponInfoEntity.getCouponIssueHistoryEntityList() ) );
        couponInfoVo.setCpnSeq( couponInfoEntity.getCpnSeq() );
        couponInfoVo.setCpnNo( couponInfoEntity.getCpnNo() );
        couponInfoVo.setCpnNm( couponInfoEntity.getCpnNm() );
        couponInfoVo.setIssueTyp( couponInfoEntity.getIssueTyp() );
        couponInfoVo.setIssueQty( couponInfoEntity.getIssueQty() );
        if ( couponInfoEntity.getIssueStDtm() != null ) {
            couponInfoVo.setIssueStDtm( LocalDateTime.ofInstant( couponInfoEntity.getIssueStDtm().toInstant(), ZoneId.of( "UTC" ) ) );
        }
        if ( couponInfoEntity.getIssueEdDtm() != null ) {
            couponInfoVo.setIssueEdDtm( LocalDateTime.ofInstant( couponInfoEntity.getIssueEdDtm().toInstant(), ZoneId.of( "UTC" ) ) );
        }
        couponInfoVo.setIssueUseDt( couponInfoEntity.getIssueUseDt() );
        couponInfoVo.setDsctAmt( couponInfoEntity.getDsctAmt() );
        couponInfoVo.setDsctRatio( couponInfoEntity.getDsctRatio() );
        couponInfoVo.setIssueSppdYn( couponInfoEntity.getIssueSppdYn() );
        couponInfoVo.setCrtDtm( couponInfoEntity.getCrtDtm() );
        couponInfoVo.setCrtr( couponInfoEntity.getCrtr() );
        couponInfoVo.setUpdDtm( couponInfoEntity.getUpdDtm() );
        couponInfoVo.setUpdtr( couponInfoEntity.getUpdtr() );

        return couponInfoVo;
    }

    @Override
    public CouponInfoEntity toEntity(CouponInfoVo couponInfoVo) {
        if ( couponInfoVo == null ) {
            return null;
        }

        CouponInfoEntity couponInfoEntity = new CouponInfoEntity();

        couponInfoEntity.setCouponIssueHistoryEntityList( couponIssueHistoryVoListToCouponIssueHistoryEntityList( couponInfoVo.getConponIssueHistories() ) );
        couponInfoEntity.setCpnSeq( couponInfoVo.getCpnSeq() );
        couponInfoEntity.setCpnNo( couponInfoVo.getCpnNo() );
        couponInfoEntity.setCpnNm( couponInfoVo.getCpnNm() );
        couponInfoEntity.setIssueTyp( couponInfoVo.getIssueTyp() );
        couponInfoEntity.setIssueQty( couponInfoVo.getIssueQty() );
        if ( couponInfoVo.getIssueStDtm() != null ) {
            couponInfoEntity.setIssueStDtm( Date.from( couponInfoVo.getIssueStDtm().toInstant( ZoneOffset.UTC ) ) );
        }
        if ( couponInfoVo.getIssueEdDtm() != null ) {
            couponInfoEntity.setIssueEdDtm( Date.from( couponInfoVo.getIssueEdDtm().toInstant( ZoneOffset.UTC ) ) );
        }
        couponInfoEntity.setIssueUseDt( couponInfoVo.getIssueUseDt() );
        couponInfoEntity.setDsctAmt( couponInfoVo.getDsctAmt() );
        couponInfoEntity.setDsctRatio( couponInfoVo.getDsctRatio() );
        couponInfoEntity.setIssueSppdYn( couponInfoVo.getIssueSppdYn() );

        return couponInfoEntity;
    }

    @Override
    public ResCouponInfoVo toVo(CouponInfoVo couponInfoVo) {
        if ( couponInfoVo == null ) {
            return null;
        }

        ResCouponInfoVo resCouponInfoVo = new ResCouponInfoVo();

        resCouponInfoVo.setCrtDtm( couponInfoVo.getCrtDtm() );
        resCouponInfoVo.setCrtr( couponInfoVo.getCrtr() );
        resCouponInfoVo.setUpdDtm( couponInfoVo.getUpdDtm() );
        resCouponInfoVo.setUpdtr( couponInfoVo.getUpdtr() );
        resCouponInfoVo.setCpnSeq( couponInfoVo.getCpnSeq() );
        resCouponInfoVo.setCpnNo( couponInfoVo.getCpnNo() );
        resCouponInfoVo.setCpnNm( couponInfoVo.getCpnNm() );
        resCouponInfoVo.setIssueTyp( couponInfoVo.getIssueTyp() );
        resCouponInfoVo.setIssueQty( couponInfoVo.getIssueQty() );
        resCouponInfoVo.setIssueStDtm( couponInfoVo.getIssueStDtm() );
        resCouponInfoVo.setIssueEdDtm( couponInfoVo.getIssueEdDtm() );
        resCouponInfoVo.setIssueUseDt( couponInfoVo.getIssueUseDt() );
        resCouponInfoVo.setDsctAmt( couponInfoVo.getDsctAmt() );
        resCouponInfoVo.setDsctRatio( couponInfoVo.getDsctRatio() );
        resCouponInfoVo.setIssueSppdYn( couponInfoVo.getIssueSppdYn() );

        return resCouponInfoVo;
    }

    @Override
    public CouponInfoVo toVo(ReqCouponInfoVo reqCouponInfoVo) {
        if ( reqCouponInfoVo == null ) {
            return null;
        }

        CouponInfoVo couponInfoVo = couponIssueHistoryVo.getCouponInfoVo();

        couponInfoVo.setCpnSeq( reqCouponInfoVo.getCpnSeq() );
        couponInfoVo.setCpnNo( reqCouponInfoVo.getCpnNo() );
        couponInfoVo.setCpnNm( reqCouponInfoVo.getCpnNm() );
        couponInfoVo.setIssueTyp( reqCouponInfoVo.getIssueTyp() );
        couponInfoVo.setIssueQty( reqCouponInfoVo.getIssueQty() );
        couponInfoVo.setIssueStDtm( reqCouponInfoVo.getIssueStDtm() );
        couponInfoVo.setIssueEdDtm( reqCouponInfoVo.getIssueEdDtm() );
        couponInfoVo.setIssueUseDt( reqCouponInfoVo.getIssueUseDt() );
        couponInfoVo.setDsctAmt( reqCouponInfoVo.getDsctAmt() );
        couponInfoVo.setDsctRatio( reqCouponInfoVo.getDsctRatio() );
        couponInfoVo.setIssueSppdYn( reqCouponInfoVo.getIssueSppdYn() );
        couponInfoVo.setCrtDtm( reqCouponInfoVo.getCrtDtm() );
        couponInfoVo.setCrtr( reqCouponInfoVo.getCrtr() );
        couponInfoVo.setUpdDtm( reqCouponInfoVo.getUpdDtm() );
        couponInfoVo.setUpdtr( reqCouponInfoVo.getUpdtr() );

        return couponInfoVo;
    }

    @Override
    public void updateFromVo(CouponInfoVo dto, CouponInfoEntity entity) {
        if ( dto == null ) {
            return;
        }

        if ( entity.getCouponIssueHistoryEntityList() != null ) {
            List<CouponIssueHistoryEntity> list = couponIssueHistoryVoListToCouponIssueHistoryEntityList( dto.getConponIssueHistories() );
            if ( list != null ) {
                entity.getCouponIssueHistoryEntityList().clear();
                entity.getCouponIssueHistoryEntityList().addAll( list );
            }
        }
        else {
            List<CouponIssueHistoryEntity> list = couponIssueHistoryVoListToCouponIssueHistoryEntityList( dto.getConponIssueHistories() );
            if ( list != null ) {
                entity.setCouponIssueHistoryEntityList( list );
            }
        }
        if ( dto.getCpnSeq() != null ) {
            entity.setCpnSeq( dto.getCpnSeq() );
        }
        if ( dto.getCpnNo() != null ) {
            entity.setCpnNo( dto.getCpnNo() );
        }
        if ( dto.getCpnNm() != null ) {
            entity.setCpnNm( dto.getCpnNm() );
        }
        if ( dto.getIssueTyp() != null ) {
            entity.setIssueTyp( dto.getIssueTyp() );
        }
        if ( dto.getIssueQty() != null ) {
            entity.setIssueQty( dto.getIssueQty() );
        }
        if ( dto.getIssueStDtm() != null ) {
            entity.setIssueStDtm( Date.from( dto.getIssueStDtm().toInstant( ZoneOffset.UTC ) ) );
        }
        if ( dto.getIssueEdDtm() != null ) {
            entity.setIssueEdDtm( Date.from( dto.getIssueEdDtm().toInstant( ZoneOffset.UTC ) ) );
        }
        if ( dto.getIssueUseDt() != null ) {
            entity.setIssueUseDt( dto.getIssueUseDt() );
        }
        if ( dto.getDsctAmt() != null ) {
            entity.setDsctAmt( dto.getDsctAmt() );
        }
        if ( dto.getDsctRatio() != null ) {
            entity.setDsctRatio( dto.getDsctRatio() );
        }
        if ( dto.getIssueSppdYn() != null ) {
            entity.setIssueSppdYn( dto.getIssueSppdYn() );
        }
    }

    protected CouponIssueHistoryVo couponIssueHistoryEntityToCouponIssueHistoryVo(CouponIssueHistoryEntity couponIssueHistoryEntity) {
        if ( couponIssueHistoryEntity == null ) {
            return null;
        }

        CouponIssueHistoryVo couponIssueHistoryVo = new CouponIssueHistoryVo();

        couponIssueHistoryVo.setIssueSeq( couponIssueHistoryEntity.getIssueSeq() );
        if ( couponIssueHistoryEntity.getIssueDtm() != null ) {
            couponIssueHistoryVo.setIssueDtm( LocalDateTime.ofInstant( couponIssueHistoryEntity.getIssueDtm().toInstant(), ZoneId.of( "UTC" ) ) );
        }
        if ( couponIssueHistoryEntity.getUseDtm() != null ) {
            couponIssueHistoryVo.setUseDtm( LocalDateTime.ofInstant( couponIssueHistoryEntity.getUseDtm().toInstant(), ZoneId.of( "UTC" ) ) );
        }
        if ( couponIssueHistoryEntity.getUseSppdDtm() != null ) {
            couponIssueHistoryVo.setUseSppdDtm( LocalDateTime.ofInstant( couponIssueHistoryEntity.getUseSppdDtm().toInstant(), ZoneId.of( "UTC" ) ) );
        }
        couponIssueHistoryVo.setUseSppdCd( couponIssueHistoryEntity.getUseSppdCd() );

        return couponIssueHistoryVo;
    }

    protected List<CouponIssueHistoryVo> couponIssueHistoryEntityListToCouponIssueHistoryVoList(List<CouponIssueHistoryEntity> list) {
        if ( list == null ) {
            return null;
        }

        List<CouponIssueHistoryVo> list1 = new ArrayList<CouponIssueHistoryVo>( list.size() );
        for ( CouponIssueHistoryEntity couponIssueHistoryEntity : list ) {
            list1.add( couponIssueHistoryEntityToCouponIssueHistoryVo( couponIssueHistoryEntity ) );
        }

        return list1;
    }

    protected CouponIssueHistoryEntity couponIssueHistoryVoToCouponIssueHistoryEntity(CouponIssueHistoryVo couponIssueHistoryVo) {
        if ( couponIssueHistoryVo == null ) {
            return null;
        }

        CouponIssueHistoryEntity couponIssueHistoryEntity = new CouponIssueHistoryEntity();

        couponIssueHistoryEntity.setIssueSeq( couponIssueHistoryVo.getIssueSeq() );
        if ( couponIssueHistoryVo.getIssueDtm() != null ) {
            couponIssueHistoryEntity.setIssueDtm( Date.from( couponIssueHistoryVo.getIssueDtm().toInstant( ZoneOffset.UTC ) ) );
        }
        if ( couponIssueHistoryVo.getUseDtm() != null ) {
            couponIssueHistoryEntity.setUseDtm( Date.from( couponIssueHistoryVo.getUseDtm().toInstant( ZoneOffset.UTC ) ) );
        }
        if ( couponIssueHistoryVo.getUseSppdDtm() != null ) {
            couponIssueHistoryEntity.setUseSppdDtm( Date.from( couponIssueHistoryVo.getUseSppdDtm().toInstant( ZoneOffset.UTC ) ) );
        }
        couponIssueHistoryEntity.setUseSppdCd( couponIssueHistoryVo.getUseSppdCd() );

        return couponIssueHistoryEntity;
    }

    protected List<CouponIssueHistoryEntity> couponIssueHistoryVoListToCouponIssueHistoryEntityList(List<CouponIssueHistoryVo> list) {
        if ( list == null ) {
            return null;
        }

        List<CouponIssueHistoryEntity> list1 = new ArrayList<CouponIssueHistoryEntity>( list.size() );
        for ( CouponIssueHistoryVo couponIssueHistoryVo : list ) {
            list1.add( couponIssueHistoryVoToCouponIssueHistoryEntity( couponIssueHistoryVo ) );
        }

        return list1;
    }
}
