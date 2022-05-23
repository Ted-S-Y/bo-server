package com.bo.main.api.repositories;

import com.bo.main.api.entities.CATEGORY;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface CATEGORYRepository extends JpaRepository<CATEGORY, Void>, JpaSpecificationExecutor<CATEGORY> {

}