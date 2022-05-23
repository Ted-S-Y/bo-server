package com.bo.main.api.repositories;

import com.bo.main.api.entities.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface OrderDetailRepository extends JpaRepository<OrderDetail, Void>, JpaSpecificationExecutor<OrderDetail> {

}