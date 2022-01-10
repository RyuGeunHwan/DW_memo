01월 05일 수업
#mySQL 설치방법
 -C++프로그램 설치(서버에 다운로드 안되어있을경우)
 -mySQL설치 비밀번호 입력을 제외한 나머지 all next클릭
-DBeaver 들어가서 상단 데이터베이스 클릭 후 새데이터베이스 연결->mySQL연결
-상단 SQL편집기 클릭
-좌측에 보이는 Databases 왼쪽마우스 클릭후 Create New Databases 들어가 데이터베이스 생성
-좌측에 보이는 localhost 왼쪽마우스 클릭 Edit connection 클릭 후 Database 에 이름설정
-테이블 생성하고(코드 입력 후 실행 한 다음 Alt + X 까지 입력) 작업시작!

*IP종류
-사설IP (private IP) 여러사람들이 공유 할 수 있는 장소에 설치되어 있는 IP
 특징 - 라우터(=공유기)가 사람들에게 주는 임의적인 IP주소는 모두 다르다 
-공인IP
 특징 - 라우터(=공유기)의 IP주소는 한개 이다.

 *로컬PC = 본인의 PC
 ###로컬주소(=본인pc의 IP주소)
 =ex)127.0.0.1 
 =pc디폴트값
 =컴퓨터를 설정하면 설정되어 있는 주소
 =localhost(=본인 pc의 IP주소)

 ex) ip주소를 적으시오!
 -> ip주소 = 192.168.0.15 or localhost(본인 IP를 의미)

*데이터베이스
->데이터 베이스 종류는 여러개지만 문법은 동일
->종류(오라클(공공기관) , MYSQL(대기업) , MariaDB(스타트업))
->데이터베이스를 잘배우면 (웹, 앱, IoT, 데이터분석분야, AI분야 = 공통점은 데이터가 있어야 한다.)를 갈 수 있는 길이 넓어진다.
->모든 어플리케이션의 시작점

*IT용어정리
#####port : 서버에 접속 할 수 있는 문#####
->서비스를 제공하기 위해서는 port번호가 있어야한다.
->IP주소가 집주소라하면 port번호는 상세주소이다.
 ex)192.168.0.32:80-> 192.168.0.32(IP주소)/32(호스트번호)/#(80 port번호)
 ex) 데이터 베이스 주소-> 호스트번호 + port번호

* 구글 검색팁
-구글 검색사이트 추천(되도록이면 영어로 검색하는거 추천)
 1순위 stackoverflow.com 2순위 velog.io 3순위 맨 위뜨는 추천 사이트 
(구글 검색->어떻게 하는지 how to ---- in -- / 무엇인지 what is ----)

### 
-mySQL안에는 많은 DB(데이터베이스)가 있고 
 DB안에는 많은 table들이 있고
 table안에 우리가 쓰는 data가 있는 것
 *DB=table을 저장하는장소
 *table(=엔티티)=data를 저장하는 장소

*엔티티 관계도
 -table안에 들어가면 엔티티 관계도 파악을 우선으로!
 -키모양 네모박스에 있는것이 #PK(=primary key) 라고 한다.
 --->pk는 고유값이다, 고유번호가 있다.
 -table박스 안에 있는 것들이 bata이고 그것을 컬럼 or 속성이라고 한다.
 

-DB안에 table들은 모두 관계가 있다
 [table=관계형 데이터 베이스(=### RDB ###)]

-블록체인은 비관계형 데이터 베이스다.

***데이터 타입
*int = 숫자
*VARCHAR = 문자

단위 크기
-byte > bit(=bit는 컴퓨터 저장공간의 최소단위)
-1byte = 8bit
-1byte = 8bit = 256(2의 8승 - 이차함수)

###DDL###(=Data Definition Language) 데이터 정의 언어
-CRATE TABLE <table_name> : table 생성
-DROP TABLE <table_name> : table 삭제
-ALTER TABLE <table_name> : table 수정(테이블 이름 변경할때 씀)

###DML###(=Data Manipulation Language) 데이터 조작 언어
-SELECT : 데이터 조회
-DELETE : 데이터 삭제
-UPDATE : 데이터 수정
-INSERT : 데이터 생성

*DCL (=Data Control Language) 데이터 제어 언어
-GRANT : 특정 사용자에게 권한 부여
-REVOKE : 특정 사용자 권한 회수

*데이터베이스 명령순서
-SELECT
 컬럼명
 -from  테이블 이름
 -where PK(Primary key))

 -컴퓨터가 쿼리 읽는 순서 from->where->SELECT

 ### 테이블 구성도
![](../images/table.PNG)

- PK(Primary Key)는 고유 컬럼으로 고유한 데이터만 올 수 있다.
    ex) 사원 번호, 주민
- 컬럼 : 테이블을 구성하는 각각의 열에 위치한 정보.
- 데이터 : 테이블에 최종으로 저장된 데이터들. (commit해야 데이터가 쌓임)

##DBeaver 명령순서
/* 사원번호가 7839인 사람의 직업 조회*/

    select job from emp where empno=7839;

/* 사원번호가 7900인 사람의 이름과 직업 조회*/

    select ename, job from emp where empno=7900;

/* 사원번호가 7369인 사람의 이름과 직업과 급여를 조회하시오 */

    select
	    ename, 
	    job, 
	    sal 
    from emp 
    where empno=7369; /*조건 조회*/
    /* 쿼리 순서 : from > where > select */

/*모든 컬럼 조회*/

    select * from emp;

# trollface :trollface:

* vscode emoticom
https://itinerant.tistory.com/60