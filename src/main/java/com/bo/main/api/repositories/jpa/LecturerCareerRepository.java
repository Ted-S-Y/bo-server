package com.bo.main.api.repositories.jpa;

import com.bo.main.api.entities.LecturerCareerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface LecturerCareerRepository extends JpaRepository<LecturerCareerEntity, Long>, JpaSpecificationExecutor<LecturerCareerEntity> {

}
