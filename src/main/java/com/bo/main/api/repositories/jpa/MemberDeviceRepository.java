package com.bo.main.api.repositories.jpa;

import com.bo.main.api.entities.MemberDeviceEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface MemberDeviceRepository extends JpaRepository<MemberDeviceEntity, Long>, JpaSpecificationExecutor<MemberDeviceEntity> {
}
