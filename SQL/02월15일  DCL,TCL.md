- ## DCL(Data Control Language)

1. GRANT(권한*부여*)
2. REVOKE(권한*회수*)
3. ROLE(다양한 권한과 사용자 사이에서 중개역할)

- # TCL(Transaction Control Language)

1. COMMIT
   (DML은 커밋 미포함, DDL은 커밋 포함)
2. ROLLBACK
   홍길동이가 DB접속 INSERT 5번 날리고 COMMIT.  
   길동이가 실수로 DELETE.  
   그러면 ROLLBACK을 이용해서 최신 COMMIT상태로 돌아감.  
   (COMMIT을 한 다음으로 돌아감, COMMIT이전까지의 데이터는 저장)

---

- 관계형 데이터베이스(R(관계)DBMS)

  1.  데이터를 더욱 안전하게 저장(신뢰할 수 있는 데이터만 저장).
  2.  관계형 데이터 베이스는 JOIN이 있다.
  3.  부모테이블과 자식테이블이 존재
      ex) emp테이블에 deptno 컬럼이 있음.
      deptno컬럼은 dept테이블에서!  
      -> emp테이블(자식)은 dept(부모)를 참조하고 있음.  
      ->참조를 하는 쪽=자식테이블 / 참조를 해주는 쪽=부모테이블

- 비관계형 데이터베이스(NoSQL)
  1.  대표적인 프로그램 : \*DynamoDB, MongoDB
  2.  비관계형 데이터 베이스는 JOIN이 없다.
  3.  \*\*\*분석이 목적(데이터면 일단 저장).
