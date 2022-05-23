package com.bo.main.api.repositories;

import com.bo.main.api.entities.SalesProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface SalesProductRepository extends JpaRepository<SalesProduct, Void>, JpaSpecificationExecutor<SalesProduct> {

}