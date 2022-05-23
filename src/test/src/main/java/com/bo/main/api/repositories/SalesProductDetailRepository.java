package com.bo.main.api.repositories;

import com.bo.main.api.entities.SalesProductDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface SalesProductDetailRepository extends JpaRepository<SalesProductDetail, Void>, JpaSpecificationExecutor<SalesProductDetail> {

}