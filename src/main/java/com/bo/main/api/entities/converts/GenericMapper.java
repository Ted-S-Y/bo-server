package com.bo.main.api.entities.converts;

import org.mapstruct.BeanMapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;

import java.util.List;


public interface GenericMapper<D, E> {

    D toVo(E e);
    E toEntity(D d);

    List<D> toVos(List<E> entityList);
    List<E> toEntities(List<D> dtoList);

    // vo 변화가 있을 경우 Entity를 Update. 단, null 값이 전달될경우 변화시켜주지 않음
    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void updateFromVo(D dto, @MappingTarget E entity);
}
