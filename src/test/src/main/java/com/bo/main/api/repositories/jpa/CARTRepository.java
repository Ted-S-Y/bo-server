package com.bo.main.api.repositories.jpa;

import com.bo.main.api.entities.CART;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface CARTRepository extends JpaRepository<CART, Void>, JpaSpecificationExecutor<CART> {

}