package com.bo.main.api.repositories.jpa;

import com.bo.main.api.entities.MemberEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.Optional;

public interface MemberRepository extends JpaRepository<MemberEntity, Long>, JpaSpecificationExecutor<MemberEntity> {
    Optional<MemberEntity> findByMbrId(String mbrId);
}
