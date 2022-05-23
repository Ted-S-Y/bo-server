package com.bo.main.api.repositories.jpa;

import com.bo.main.api.entities.MemberHistoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface MemberHistoryRepository extends JpaRepository<MemberHistoryEntity, Void>, JpaSpecificationExecutor<MemberHistoryEntity> {

}