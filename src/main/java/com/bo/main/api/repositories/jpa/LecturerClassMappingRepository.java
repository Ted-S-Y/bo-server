package com.bo.main.api.repositories.jpa;

import com.bo.main.api.entities.LecturerClassEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface LecturerClassMappingRepository extends JpaRepository<LecturerClassEntity, Long>, JpaSpecificationExecutor<LecturerClassEntity> {

}
