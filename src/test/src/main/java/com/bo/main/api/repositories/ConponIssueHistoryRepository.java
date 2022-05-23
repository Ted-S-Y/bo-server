package com.bo.main.api.repositories;

import com.bo.main.api.entities.ConponIssueHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ConponIssueHistoryRepository extends JpaRepository<ConponIssueHistory, Void>, JpaSpecificationExecutor<ConponIssueHistory> {

}