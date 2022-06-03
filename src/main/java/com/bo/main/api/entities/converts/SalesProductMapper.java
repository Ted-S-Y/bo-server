package com.bo.main.api.entities.converts;

import com.bo.main.api.controller.vo.req.ReqPackageVo;
import com.bo.main.api.controller.vo.req.ReqProductVo;
import com.bo.main.api.controller.vo.res.ResPackageVo;
import com.bo.main.api.controller.vo.res.ResProductVo;
import com.bo.main.api.entities.SalesProductEntity;
import com.bo.main.api.entities.vo.SalesProductVo;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

/**
 * packageName : com.bo.main.api.entities.converts
 * fileName : SalaProductMapper
 * author : sbyoon
 * date : 2022-06-03
 * description :
 * ===========================================================
 * DATE AUTHOR  NOTE
 * -----------------------------------------------------------
 * 2022-06-03  sbyoon 최초 생성
 */
@Mapper(
        uses = {
                SalesProductDetailMapper.class
        },
        componentModel = "spring"
)
public interface SalesProductMapper extends GenericMapper<SalesProductVo, SalesProductEntity> {
        @Override
        @Mapping(target = "cartDetails", source = "cartDetailEntityList")
        @Mapping(target = "salesProductDetails", source = "salesProductDetailEntityList")
        SalesProductVo toVo(SalesProductEntity salesProductEntity);

        @Override
        @Mapping(target = "cartDetailEntityList", source = "cartDetails")
        @Mapping(target = "salesProductDetailEntityList", source = "salesProductDetails")
        SalesProductEntity toEntity(SalesProductVo salesProductVo);

        SalesProductVo toVo(ReqProductVo reqProductVo);

        ResProductVo toVo(SalesProductVo salesProductVo);

        @Override
        @Mapping(target = "cartDetailEntityList", source = "cartDetails")
        @Mapping(target = "salesProductDetailEntityList", source = "salesProductDetails")
        void updateFromVo(SalesProductVo dto, @MappingTarget SalesProductEntity entity);
}
