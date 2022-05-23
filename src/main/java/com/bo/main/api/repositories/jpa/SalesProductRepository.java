package com.bo.main.api.repositories.jpa;

import com.bo.main.api.entities.SalesProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface SalesProductRepository extends JpaRepository<SalesProductEntity, Void>, JpaSpecificationExecutor<SalesProductEntity> {

}