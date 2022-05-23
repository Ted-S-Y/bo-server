package com.bo.main.api.repositories.jpa;

import com.bo.main.api.entities.RevwEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface RevwRepository extends JpaRepository<RevwEntity, Void>, JpaSpecificationExecutor<RevwEntity> {

}