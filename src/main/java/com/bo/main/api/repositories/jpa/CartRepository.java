package com.bo.main.api.repositories.jpa;

import com.bo.main.api.entities.CartEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface CartRepository extends JpaRepository<CartEntity, Void>, JpaSpecificationExecutor<CartEntity> {

}