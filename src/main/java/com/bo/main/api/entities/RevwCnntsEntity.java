package com.bo.main.api.entities;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Data
@Entity
@Table(name = "REVW_CNNTS")
public class RevwCnntsEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 리뷰컨텐츠 순번
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Schema(description="리뷰컨텐츠 순번")
    @Column(name = "REVW_CNNTS_SEQ", nullable = false)
    private Long revwCnntsSeq;

    /**
     * 리뷰순번
     */
    @Schema(description="리뷰순번")
    @Column(name = "REVW_SEQ", nullable = false)
    private Long revwSeq;

    /**
     * 파일명
     */
    @Schema(description="파일명")
    @Column(name = "FILE_NM")
    private String fileNm;

    /**
     * 파일타입
     */
    @Schema(description="파일타입")
    @Column(name = "FILE_TYP")
    private String fileTyp;

    /**
     * 삭제여부
     */
    @Column(name = "DEL_YN")
    @Schema(description="삭제여부")
    private String delYn;

    /**
     * 등록일시
     */
    @Column(name = "CRT_DTM")
    @Schema(description="등록일시")
    private Date crtDtm;

    /**
     * 등록자
     */
    @Column(name = "CRTR")
    @Schema(description="등록자")
    private String CRTR;

    /**
     * 수정일시
     */
    @Column(name = "UPD_DTM")
    @Schema(description="수정일시")
    private Date updDtm;

    /**
     * 수정자
     */
    @Column(name = "UPDTR")
    @Schema(description="수정자")
    private String UPDTR;

}
