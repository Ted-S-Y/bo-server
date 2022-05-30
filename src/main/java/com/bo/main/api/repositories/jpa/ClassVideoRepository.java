package com.bo.main.api.repositories.jpa;

import com.bo.main.api.entities.ClassBaseEntity;
import com.bo.main.api.entities.ClassVideoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.Optional;

public interface ClassVideoRepository extends JpaRepository<ClassVideoEntity, Long>, JpaSpecificationExecutor<ClassVideoEntity> {
//    Optional<ClassVideoEntity> findByclassBaseEntity(ClassBaseEntity classBaseEntity);
}
