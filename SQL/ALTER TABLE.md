## ALTER : 컬럼을 추가(add),수정(modify),삭제(drop)하고 싶을 때 사용

```SQL
1. ALTER는 컬럼관련 실행을 하기 위해 사용한다.
2. 컬럼 추가
ex)
alter table [테이블명] add [컬럼명] varchar(100) not null default '0'; 

3. 컬럼 삭제
ex)
alter table [테이블명] drop [컬럼명];

4. 컬럼명 변경 및 타입 변경
ex)
alter table [테이블명] change [컬럼명] or [변경할컬럼명] varchar(12);

5. 컬럼 타입 수정
ex)
alter table [테이블명] modify [컬럼명] varchar(14);

6. 테이블명 수정
ex)
alter table [테이블명] rename [변경할테이블명];

7. 테이블 삭제
ex)
drop table [테이블명];
```
