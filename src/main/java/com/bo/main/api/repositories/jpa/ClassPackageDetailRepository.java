package com.bo.main.api.repositories.jpa;

import com.bo.main.api.entities.ClassPackageDetailEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ClassPackageDetailRepository extends JpaRepository<ClassPackageDetailEntity, Long>, JpaSpecificationExecutor<ClassPackageDetailEntity> {

}
