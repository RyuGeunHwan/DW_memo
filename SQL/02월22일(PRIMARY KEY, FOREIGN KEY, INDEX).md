- ### PRIMARY KEY(PK)

```
: 중복 허용 X
: NULL값 허용 안됨.
: 자동으로 INDEX가 붙음
```

- ### FOREIGN KEY(FK)

```
: 원래 중복 허용 O -> 중복 허용 X으로 변경하려면 'UNIQE KEY' 설정
: NULL값 허용!
: INDEX가 없음
: INDEX가 없는 컬럼은 생성해야 함.
: FK를 PK처럼 사용하고 싶으면 FK에 INDEX와 UNIQE KEY를 설정 해주면 됨.
: INDEX 생성 문법)
CREATE INDEX <인덱스명>
ON <테이블명> (컬럼명1, 컬럼명2, ...);
```

- ### UNIQE KEY(고유 키, 유일 키)

```
: primary key와는 다른 개념
: 중복 허용 X
: NULL값 허용 O
: UNIQE KEY 생성 문법)
방법1)
CREATE TABLE emp(
deptno int,
UNIQE KEY emp(deptno)
)
방법2)
CREATE TABLE emp(
deptno int UNIQE KEY
)
```

- ### INDEX

```
: 데이터의 목차개념.
: 데이터를 검색할 때 더욱 효율적이게 해줌.
: 사용이유 - INDEX가 없으면 데이터 FULL SCAN을 해서 데이터를 찾아야함,
	        INDEX SCAN이 더 빠르고 효율적임.

```
