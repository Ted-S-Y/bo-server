package com.bo.main.api.repositories.jpa;

import com.bo.main.api.entities.CategoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface CategoryRepository extends JpaRepository<CategoryEntity, Void>, JpaSpecificationExecutor<CategoryEntity> {

}