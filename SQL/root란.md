# root란 : 프로그래밍에서 최고 권한을 의미

```
1. root권한을 가져서 데이터베이스 생성, 삭제, 테이블 생성,삭제가 가능했음.
2. 대부분 회사에서 DML만 가능한 계정을 줌.
    (SELECT, UPDATE, INSERT, DELETE)
```

# root(최상위)계정에서 권한을 가지는(제한하는) 계정(사용자) 생성

```SQL
-- ALTER : 컬럼을 추가(add),수정(modify),삭제하고 싶을 때 사용
alter table board add column cnt integer(4) default 0

-- root 계정이 계정(사용자)을 생성함(create user)
-- '%' : 모든 IP허용 이라는 의미이다.
-- by '123' : 비밀번호를 이야기한다.
create user '추가할사용자명'@'localhost' identified by '비밀번호'
ex)
-- 본인 IP에서만 접속 가능한 계정
create user geunhwan@'localhost' identified by '123';
or
create user geunhwan@'%' identified by '123';
-- localhost대신 %를 입력하면 외부에서도 접속 가능한 계정

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
