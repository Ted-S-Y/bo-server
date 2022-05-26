package com.bo.main.api.entities;

import lombok.Getter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@Getter
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public class BaseTimeEntity {

    /**
     * 등록일시
     */
    @Column(name = "CRT_DTM")
    @CreatedDate
    private LocalDateTime crtDtm;

    /**
     * 등록자
     */
    @Column(name = "CRTR")
    private String crtr;

    /**
     * 수정일시
     */
    @Column(name = "UPD_DTM")
    @LastModifiedDate
    private LocalDateTime updDtm;

    /**
     * 수정자
     */
    @Column(name = "UPDTR")
    private String updtr;
}
