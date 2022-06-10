package com.bo.main.api.repositories.jpa;

import com.bo.main.api.entities.CouponIssueHistoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface CouponIssueHistoryRepository extends JpaRepository<CouponIssueHistoryEntity, Void>, JpaSpecificationExecutor<CouponIssueHistoryEntity> {

}