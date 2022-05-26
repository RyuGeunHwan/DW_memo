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

# root(최상위)계정에서 권한을 가지는(제한하는) 계정(사용자) 생성

```SQL
-- ALTER : 컬럼을 추가(add),수정(modify),삭제하고 싶을 때 사용
alter table board add column cnt integer(4) default 0

-- root 계정이 계정(사용자)을 생성함(create user)
-- '%' : 모든 IP허용 이라는 의미이다.
-- by '123' : 비밀번호를 이야기한다.
create user geunhwan@'%' identified by '123';

-- grant로 권한(select,insert,update 세가지만) 부여
-- on 데이터베이스이름.테이블이름 => on dw.* (* : 모든것을 의미함)
grant select,insert,update on dw.* to geunhwan@'%';
-- 해석 : geunhwan이라는 username을 가진 사람에게 grant로 select,insert,update의 권한만 주겠다. 데이터베이스(dw)안에 있는 모든(*) table의 권한만 주겠다.
-- select,insert,update외 delete,create,alter등의 권한을 가지지 못함.
```

## 제한적인 권한을 받은 계정으로 로그인

```SQL
-- Edit Connection에 들어가 Username : geunhwan, Password : 123을 이용하여 다시 로그인
select *
from board


-- root가 아닌 select,insert,update의 권한만을 가진 사용자가 로그인했을 경우 select는 가능하지만 권한 이외의 것을 실행할 수는 없다.


alter table board add column x integer(4) default 0;
-- ALTER command denied to user 'geunhwan'@'localhost' for table 'board' 메세지가 뜨면 권한이 없다는것.
```
