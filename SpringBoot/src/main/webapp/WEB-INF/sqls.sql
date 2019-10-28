CREATE SEQUENCE MEMBER_NO_SEQ;

CREATE TABLE BTS_MEMBER (
	MEMBER_NO			NUMBER				PRIMARY KEY, 
	MEMBER_ID			VARCHAR2(200)		UNIQUE NOT NULL,
	MEMBER_PW			VARCHAR2(200)		NOT NULL,
	MEMBER_ENABLE		NUMBER				NOT NULL,
	MEMBER_AUTHORITY	VARCHAR2(200)		NOT NULL,
	MEMBER_NICKNAME		VARCHAR2(200)		NOT NULL,
	MEMBER_EMAIL		VARCHAR2(200)		NOT NULL,
	MEMBER_IMAGE		VARCHAR2(200)		NULL,
	MEMBER_REGDATE		DATE				NOT NULL
);


SELECT MEMBER_NO AS NO FROM BTS_MEMBER
VALUES