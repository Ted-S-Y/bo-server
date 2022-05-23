package com.bo.main.api.entities.converts;

import java.util.List;


public interface GenericMapper<D, E> {

    D toVo(E e);
    E toEntity(D d);

    List<D> toVos(List<E> e);
    List<E> toEntities(List<D> d);

//    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
//    void updateFromDto(D dto, @MappingTarget E entity);
}
