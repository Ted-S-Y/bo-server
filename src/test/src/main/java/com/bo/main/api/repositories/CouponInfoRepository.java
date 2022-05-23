package com.bo.main.api.repositories;

import com.bo.main.api.entities.CouponInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface CouponInfoRepository extends JpaRepository<CouponInfo, Void>, JpaSpecificationExecutor<CouponInfo> {

}