package com.bo.main.api.entities;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Entity
@Table(name = "ADMIN")
public class AdminEntity extends BaseTimeEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 관리자 순번
     */
    @Id
    @Column(name = "ADM_SEQ", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long admSeq;

    /**
     * 관리자 아이디
     */
    @Column(name = "ADM_ID")
    private String admId;

    /**
     * 관리자 비번
     */
    @Column(name = "ADM_PWD")
    private String admPwd;

    /**
     * 관리자명
     */
    @Column(name = "ADM_NM")
    private String admNm;

    /**
     * 전화번호
     */
    @Column(name = "ADM_MOBL")
    private String admMobl;

    /**
     * 이메일
     */
    @Column(name = "ADM_MAIL")
    private String admMail;

    /**
     * 사용여부
     */
    @Column(name = "USE_YN")
    private String useYn;

}
