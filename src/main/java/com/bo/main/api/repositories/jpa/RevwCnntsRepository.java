package com.bo.main.api.repositories.jpa;

import com.bo.main.api.entities.RevwCnntsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface RevwCnntsRepository extends JpaRepository<RevwCnntsEntity, Void>, JpaSpecificationExecutor<RevwCnntsEntity> {

}