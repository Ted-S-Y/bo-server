package com.bo.main.api.repositories.jpa;

import com.bo.main.api.entities.CartDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface CartDetailRepository extends JpaRepository<CartDetail, Void>, JpaSpecificationExecutor<CartDetail> {

}