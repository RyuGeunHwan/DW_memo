# \*\*\*DML

- insert : 데이터 저장

- 작성법.
  > 1.  INSERT INTO emp(ename(String), sal(int), job(String))
      VALUES('홍길동', 3000, 'manager')

> 2.  해당 테이블(emp)에 데이터(ename,sal,job,...를 모두 넣으면 ,테이블 뒤 괄호 생략

     INSERT INTO emp
     VALUES('홍길동', 3000, 'manager',...)

## insert할 때 주의 할점 :

> 1.  테이블에 job컬럼이 not null이면,

    insert  할때 무조건 데이터를 넣어야 함.

> 2.  테이블에 기본키 설정이 auto increment가 아니라면,

    기본키 데이터를 넣어야 함.
