# CHECK

```sql
1. COLUMN에 들어갈 수 있는 값을 제한
2. 부호, 숫자 비교, 문자 비교 등을 비교할 수 있다.
3. 입력되는 값이 CHECK 조건과 맞지 않으면 에러가 발생한다.

    ex) -- 제한조건
        -- 출생년도가 1900년 이후, 2023년 이전으로 제한
        -- 이름은 반드시 기입해야 한다.
    CREATE TABLE userTBL (
        userID CHAR(8) PRIMARY KEY,
        name VARCHAR(10),
        birthYear INT CHECK (birthYear >= 1900 AND birthYear <=2023), -- 출생년도 입력제한
        CONSTRAINT CK_name CHECK ( name IS NOT NULL ) -- 이름은 NULL 이면 안된다.
        );
-- 1. 출생년도 입력제한은 CHECK 에약어로 조건을 지정.
-- 2. 이름 입력제한은 열을 모두 정의한 후에, 마지막에 추가하는 방식 ( 제약 조건의 이름을 지정할 수 있다. )
-- 3. ALTER TABLE로 제약 조건을 추가할 수 있다.

    ex) -- 문자열 제약

    CREATE TABLE 회원가입(
        member_id INTEGER(5) AUTO_INCREMENT NOT NULL COMMENT '자동 1씩 증가',
        password varchar(200) NOT NULL COMMENT '비밀번호 단방향 암호화',
        member_name varchar(10) NOT NULL,
        gender varchar(1) CHECK (gender IN ('M','W')) COMMENT 'M : 남자 , W : 여자',
        -- gender의 입력제한 수 : 1글자
        -- gender의 입력데이터 안에 M or W 가 들어와야한다.
        phone_number varchar(15),
        email varchar(30),
        CONSTRAINT member_id_PK PRIMARY KEY (member_id)
    );

```
