package com.bo.main.api.repositories.jpa;

import com.bo.main.api.entities.SalesProductDetailEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface SalesProductDetailRepository extends JpaRepository<SalesProductDetailEntity, Void>, JpaSpecificationExecutor<SalesProductDetailEntity> {

}