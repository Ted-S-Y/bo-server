package com.bo.main.api.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@EqualsAndHashCode(callSuper=false)
@Table(name = "MEMBER_DEVICE")
public class MemberDeviceEntity extends BaseTimeEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 기기순번
     */
    @Id
    @Column(name = "DV_SEQ", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long dvSeq;

    /**
     * 회원순번
     */
    @Column(name = "MBR_SEQ", nullable = false)
    private Long mbrSeq;

    /**
     * 기기명
     */
    @Column(name = "DV_NM")
    private String dvNm;

    /**
     * OS
     */
    @Column(name = "OS")
    private String OS;

    /**
     * 기기타입
     */
    @Column(name = "DV_TYP")
    private String dvTyp;

    /**
     * 삭제여부
     */
    @Column(name = "DEL_YN")
    private String delYn;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "MBR_SEQ", insertable = false, updatable = false)
    @JsonBackReference
    @ToString.Exclude
    private MemberEntity memberEntity;

}
