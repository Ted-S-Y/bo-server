package com.bo.main.api.repositories.jpa;

import com.bo.main.api.entities.ConponIssueHistoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ConponIssueHistoryRepository extends JpaRepository<ConponIssueHistoryEntity, Void>, JpaSpecificationExecutor<ConponIssueHistoryEntity> {

}