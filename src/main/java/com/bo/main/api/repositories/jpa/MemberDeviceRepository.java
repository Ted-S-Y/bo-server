package com.bo.main.api.repositories.jpa;

import com.bo.main.api.entities.MemberDeviceEntity;
import com.bo.main.api.entities.vo.MemberDeviceVo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.List;

public interface MemberDeviceRepository extends JpaRepository<MemberDeviceEntity, Long>, JpaSpecificationExecutor<MemberDeviceEntity> {
}
