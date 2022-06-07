# foreign key

```sql
    -- 외래키 옵션
    on delete : 부모 데이터에 삭제 이벤트가 발생하면 자식 데이터에 이벤트 발생
    on update : 부모 데이터에 수정 이벤트가 발생하면 자식 데이터에 이벤트 발생
    -- 이벤트 종류
    -- cascade : 자식 데이터 삭제or 수정
    -- set null : 자식 데이터 null로 업데이트
    -- set default : 자식 데이터 참조 컬럼을 Default 값으로 업데이트
    -- restrict(default) : 자식 테이블이 참조하고 있을 경우, 데이터 삭제or 수정 불가
    -- no action : 자식 테이블의 데이터는 변경되지 않습니다.
```

### foreign key 특징

```sql
    foreign key : 외래 키(FK)
    -- what : 외래키는 테이블간 관계를 엄격하게 다룬다. NULL이 올 수 있고, INDEX 기능은 없다.
    -- why : 관계형 데이터베이스 이므로, 관계가 엄격함.
    -- when : 교집합을 할 수 있는 컬럼에 외래키 설정.
    -- where : 컬럼에
    -- how : 아래 2가지 방법을 많이 사용.
    -- 1. FOREIGN KEY (dept_id) REFERENCES  department(id) (관리 힘듬..)
    -- 2. CONSTRAINT student_id_fk FOREIGN KEY (dept_id) REFERENCES  department(id) (테이블이 많아질 때 관리할 수 있음)
    -- * 외래 키를 기본 키처럼 사용하고 싶으면 외래 키 컬럼에 unique key 적용하면 된다.
    unique key : 유니크 키
    -- PK 와 마찬가지로 중복성이 허용되지 않지만 NULL 허용.
    -- 여러컬럼에 사용하는 방법
    CREATE TABLE emp(deptno int,mgr int, UNIQUE KEY emp(deptno, mgr));
    -- 단일컬럼에 사용하는 방법
    CREATE TABLE emp(deptno int UNIQUE KEY);
```

### foreign key 제약 조건 삭제 및 수정

```sql
alter table 테이블명 drop foreign key fk명(제약조건명)
-- 아래 쿼리만 실행하게 되면 FK이름이 중복되었다는 에러가 뜨기 때문에 FK를 삭제 한 후 다시 추가 하는 형식으로 실행 하여야 한다.

alter table fk를 포함하는 테이블명 add constraint foreign key명 foreign key (컬럼명) references 부모테이블(PK컬럼명) on delete cascade on update cascade;
-- 두가지 references(참조)를 해준다. (1. on delete cascade, 2. on update cascade)
```
