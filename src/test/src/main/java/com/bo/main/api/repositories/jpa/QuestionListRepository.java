package com.bo.main.api.repositories.jpa;

import com.bo.main.api.entities.QuestionList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface QuestionListRepository extends JpaRepository<QuestionList, Void>, JpaSpecificationExecutor<QuestionList> {

}