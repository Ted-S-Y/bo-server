package com.bo.main.api.repositories.jpa;

import com.bo.main.api.entities.ClassBaseEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ClassBaseRepository extends JpaRepository<ClassBaseEntity, Long>, JpaSpecificationExecutor<ClassBaseEntity> {

}
