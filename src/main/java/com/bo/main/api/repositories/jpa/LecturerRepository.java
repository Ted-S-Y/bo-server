package com.bo.main.api.repositories.jpa;

import com.bo.main.api.entities.AdminEntity;
import com.bo.main.api.entities.LecturerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.math.BigDecimal;
import java.util.Optional;

public interface LecturerRepository extends JpaRepository<LecturerEntity, Long>, JpaSpecificationExecutor<LecturerEntity> {
    Optional<LecturerEntity> findByLctrSeq(Long lctrSeq);
    Optional<LecturerEntity> findByLctrCd(String lctrCd);

}
