package com.bo.main.api.repositories;

import com.bo.main.api.entities.OrderInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface OrderInfoRepository extends JpaRepository<OrderInfo, Void>, JpaSpecificationExecutor<OrderInfo> {

}