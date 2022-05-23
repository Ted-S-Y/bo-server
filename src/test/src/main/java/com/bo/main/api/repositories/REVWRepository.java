package com.bo.main.api.repositories;

import com.bo.main.api.entities.REVW;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface REVWRepository extends JpaRepository<REVW, Void>, JpaSpecificationExecutor<REVW> {

}