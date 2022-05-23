package com.bo.main.api.repositories.jpa;

import com.bo.main.api.entities.OrderInfoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface OrderInfoRepository extends JpaRepository<OrderInfoEntity, Long>, JpaSpecificationExecutor<OrderInfoEntity> {

}