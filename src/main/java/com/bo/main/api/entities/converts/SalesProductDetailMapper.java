package com.bo.main.api.entities.converts;

import com.bo.main.api.entities.ClassPackageDetailEntity;
import com.bo.main.api.entities.SalesProductDetailEntity;
import com.bo.main.api.entities.vo.ClassPackageDetailVo;
import com.bo.main.api.entities.vo.ClassPackageVo;
import com.bo.main.api.entities.vo.SalesProductDetailVo;
import com.bo.main.api.entities.vo.SalesProductVo;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

/**
 * packageName : com.bo.main.api.entities.converts
 * fileName : SalesProductDetailMapper
 * author : sbyoon
 * date : 2022-06-03
 * description :
 * ===========================================================
 * DATE AUTHOR  NOTE
 * -----------------------------------------------------------
 * 2022-06-03  sbyoon 최초 생성
 */
@Mapper(
        uses = { SalesProductMapper.class },
        componentModel = "spring"
)
public interface SalesProductDetailMapper extends GenericMapper<SalesProductDetailVo, SalesProductDetailEntity> {
    @Mapping(target = "salesProductVo", ignore = true)
    @Mapping(target = "classPackageVo", source = "classPackageEntity")
    @Override
    SalesProductDetailVo toVo(SalesProductDetailEntity salesProductDetailEntity);

    @Mapping(target = "salesProductEntity", ignore = true)
    @Mapping(target = "classPackageEntity", source = "classPackageVo")
    @Override
    SalesProductDetailEntity toEntity(SalesProductDetailVo salesProductDetailVo);

    SalesProductDetailVo toVo(SalesProductVo salesProductVo);
}
