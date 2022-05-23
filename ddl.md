## ADMIN
    -- auto-generated definition
    create table ADMIN
    (
        ADM_SEQ  bigint auto_increment comment '관리자 순번'
        primary key,
        ADM_ID   varchar(50)  null comment '관리자 아이디',
        CRT_DTM  datetime     null comment '등록일시',
        CRTR     varchar(255) null comment '등록자',
        UPD_DTM  datetime     null comment '수정일시',
        UPDTR    varchar(255) null comment '수정자',
        ADM_PWD  varchar(500) null comment '관리자 비번',
        ADM_NM   varchar(100) null comment '관리자명',
        ADM_MOBL varchar(11)  null comment '전화번호',
        ADM_MAIL varchar(100) null comment '이메일',
        USE_YN   char         null comment '사용여부',
        constraint ADMIN_ADM_ID_uindex
        unique (ADM_ID)
    );

##  LECTURER
    -- auto-generated definition
    create table LECTURER
    (
        LCTR_SEQ bigint auto_increment comment '강사순번'
        primary key,
        LCTR_CD  varchar(50)  null comment '강사코드',
        LCTR_NM  varchar(100) null comment '강사명',
        MOBL     varchar(11)  null comment '전화전호',
        MAIL     varchar(100) null comment '이메일',
        SEX      char         null comment '성별',
        LCTR_IMG varchar(500) null comment '강사이미지',
        CRT_DTM  datetime     null comment '등록일시',
        CRTR     varchar(255) null comment '등록자',
        UPD_DTM  datetime     null comment '수정일시',
        UPDTR    varchar(255) null comment '수정자'
    );

##  LECTURER_CAREER
    -- auto-generated definition
    create table LECTURER_CAREER
    (
    CARR_SEQ bigint auto_increment comment '강사경력순번(시컨스)'
    primary key,
    LCTR_SEQ bigint       not null comment '강사순번',
    CARR_NO  int          null comment '경력번호',
    CARR_NM  varchar(100) null comment '경력 명',
    CRT_DTM  datetime     null comment '등록일시',
    CRTR     varchar(255) null comment '등록자',
    UPD_DTM  datetime     null comment '수정일시',
    UPDTR    varchar(255) null comment '수정자'
    );



##  CLASS_BASE
    -- auto-generated definition
    create table CLASS_BASE
    (
    CLSS_SEQ  bigint auto_increment comment '강의 순번'
    primary key,
    CLSS_CD   varchar(50)   not null comment '강의코드',
    CLSS_NM   varchar(100)  null comment '강의명',
    CLSS_DESC varchar(2000) null comment '강의설명',
    PRV_YN    char          null comment '미리보기영상여부',
    USE_YN    char          null comment '사용여부',
    CRT_DTM   datetime      null comment '등록일시',
    CRTR      varchar(255)  null comment '등록자',
    UPD_DTM   datetime      null comment '수정일시',
    UPDTR     varchar(255)  null comment '수정자'
    );

##  CLASS_VIDEO

    -- auto-generated definition
    create table CLASS_VIDEO
    (
    VD_SEQ   bigint auto_increment comment '비디오 순번'
    primary key,
    CLSS_SEQ bigint       not null comment '강의 순번',
    VD_TTL   varchar(100) null comment '영상제목',
    VD_URL   varchar(500) null comment '영상 URL',
    DEL_YN   char         null comment '삭제여부',
    PRV_YN   char         null comment '미리보기여부',
    CRT_DTM  datetime     null comment '등록일시',
    CRTR     varchar(255) null comment '등록자',
    UPD_DTM  datetime     null comment '수정일시',
    UPDTR    varchar(255) null comment '수정자'
    );

##LECTURER_CLASS_MAPPING
    -- auto-generated definition
    create table LECTURER_CLASS_MAPPING
    (
    LCTR_SEQ bigint auto_increment comment '강사순번'
    primary key,
    CLSS_SEQ bigint       not null comment '강의 순번',
    CRT_DTM  datetime     null comment '등록일시',
    CRTR     varchar(255) null comment '등록자',
    UPD_DTM  datetime     null comment '수정일시',
    UPDTR    varchar(255) null comment '수정자'
    );



## CLASS_PACKAGE
    -- auto-generated definition
    create table CLASS_PACKAGE
    (
    PACK_SEQ  bigint auto_increment comment '패키지 순번'
    primary key,
    PACK_CD   varchar(50)  null comment '패키지 코드',
    CTGR_ID   bigint       null comment '카테고리ID',
    PACK_THNL varchar(500) null comment '패키지 썸네일',
    PACK_NM   varchar(100) null comment '강의 패키지 명',
    PRC       int          null comment '단가',
    USE_YN    char         null comment '사용여부',
    CRT_DTM   datetime     null comment '등록일시',
    CRTR      varchar(255) null comment '등록자',
    UPD_DTM   datetime     null comment '수정일시',
    UPDTR     varchar(255) null comment '수정자'
    );

## CLASS_PACKAGE_DETAIL
    -- auto-generated definition
    create table CLASS_PACKAGE_DETAIL
    (
    PACK_SEQ bigint auto_increment comment '패키지 순번'
    primary key,
    CLSS_SEQ bigint       not null comment '강의 순번',
    CRT_DTM  datetime     null comment '등록일시',
    CRTR     varchar(255) null comment '등록자',
    UPD_DTM  datetime     null comment '수정일시',
    UPDTR    varchar(255) null comment '수정자'
    );

## ORDER_INFO
    -- auto-generated definition
    CREATE TABLE ORDER_INFO (
    ORDR_NO bigint NOT NULL COMMENT '주문번호',
    CART_NO bigint NOT NULL COMMENT '장바구니 번호',
    ORDR_AMT int DEFAULT NULL COMMENT '주문금액',
    CPN_DSCT_AMT int DEFAULT NULL COMMENT '쿠폰할인가',
    ORDR_STAT varchar(2) DEFAULT NULL COMMENT '주문상태',
    PYMT_DT varchar(8) DEFAULT NULL COMMENT '결제일자',
    CNCL_DT varchar(8) DEFAULT NULL COMMENT '취소일자',
    RTRN_DT varchar(8) DEFAULT NULL COMMENT '반품일자',
    CNCL_DTL_LIST varchar(1000) DEFAULT NULL COMMENT '취소상세내역'
    );

## ORDER_DETAIL
    CREATE TABLE ORDER_DETAIL (
    ORDR_NO bigint NOT NULL COMMENT '주문번호',
    ORDR_CLS varchar(2) DEFAULT NULL COMMENT '주문구분(주문/취소/반품/교환)',
    ORDR_AMT int DEFAULT NULL COMMENT '주문금액'
    ) ;

## MEMBER_HISTORY
    CREATE TABLE MEMBER_HISTORY (
    STD_DT varchar(8) DEFAULT NULL COMMENT '기준일자',
    MBR_ID bigint DEFAULT NULL COMMENT '회원 아이디',
    MBR_SEQ bigint DEFAULT NULL COMMENT '회원순번',
    CRT_DTM datetime DEFAULT NULL COMMENT '등록일시',
    CRTR varchar(255) DEFAULT NULL COMMENT '등록자',
    UPD_DTM datetime DEFAULT NULL COMMENT '수정일시',
    UPDTR varchar(255) DEFAULT NULL COMMENT '수정자',
    MBR_NM varchar(100) NOT NULL COMMENT '회원 명',
    MBR_PWD varchar(500) NOT NULL COMMENT '비밀번호',
    MOBL varchar(11) NOT NULL COMMENT '전화번화',
    MAIL varchar(100) NOT NULL COMMENT '이메일',
    SEX char(1) NOT NULL COMMENT '성별',
    MKT_YN char(1) NOT NULL COMMENT '마케팅 수신 동의',
    JOB varchar(50) DEFAULT NULL COMMENT '직업',
    ADDR varchar(200) DEFAULT NULL COMMENT '주소',
    JOIN_DT varchar(8) DEFAULT NULL COMMENT '회원가입일자',
    LGN_DTM datetime DEFAULT NULL COMMENT '로그인시간',
    SLPR_YN char(1) DEFAULT NULL COMMENT '휴면여부',
    SSPD_YN char(1) DEFAULT NULL COMMENT '이용정지여부',
    SSPD_CD varchar(2) DEFAULT NULL COMMENT '이용정지사유'
    ) ;


### QUESTION_LIST
    CREATE TABLE QUESTION_LIST (
    QUES_SEQ bigint NOT NULL COMMENT '문의내역 순번',
    MBR_SEQ bigint NOT NULL COMMENT '회원순번',
    QUES_TTL varchar(100) DEFAULT NULL COMMENT '문의내역 제목',
    QUES_CNNTS varchar(2000) DEFAULT NULL COMMENT '문의내역 내용',
    ANS_YN char(1) DEFAULT NULL COMMENT '답변여부',
    ANS_CNNTS varchar(2000) DEFAULT NULL COMMENT '답변 내용',
    ANS_CMPLT_DT varchar(8) DEFAULT NULL COMMENT '답변완료일자',
    CRT_DTM datetime DEFAULT NULL COMMENT '등록일시',
    CRTR varchar(255) DEFAULT NULL COMMENT '등록자',
    UPD_DTM datetime DEFAULT NULL COMMENT '수정일시',
    UPDTR varchar(255) DEFAULT NULL COMMENT '수정자'
    ) ;