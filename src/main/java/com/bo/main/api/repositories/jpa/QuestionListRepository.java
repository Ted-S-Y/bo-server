package com.bo.main.api.repositories.jpa;

import com.bo.main.api.entities.QuestionListEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface QuestionListRepository extends JpaRepository<QuestionListEntity, Void>, JpaSpecificationExecutor<QuestionListEntity> {

}