- VARCHAR

1. 데이터타입이 문자형인 VACHAR 컬럼에 정수형 데이터가 INSERT가능
   (하지만 실제로 저장 되는 것은 정수형이 아닌 문자형으로 저장)
2. 정수형이 오기 때문에 \*CHECK 제약조건으로 필터링 가능.

- CHECK

1. CHECK는 특정 컬럼의 입력 가능한 값의 범위를 지정할 때 사용한다.(조건을 지정)
2. 만약 어느 한 컬럼에 CHECK 제약조건을 설정한다면, 그 컬럼은 특정한 범위 안에서의 값만 허용한다.
3. 만약 어느 한 테이블에 CHECK 제약조건을 설정한다면, 그 레코드의 다른 컬럼을 기반으로 특정 컬럼의 값을 제한할 수도 있다.
   > ex) MySQL->Age라는 컬럼에 18세 이상만 데이터를 넣을 수 있도록 하는 CHECK 제약조건을 가진 Customer  
   > CREATE TABLE Customer  
   > (  
   > ID int NOT NULL,  
   > LastName varchar(255) NOT NULL,  
   > FirstName varchar(255),  
   > Age int,  
   > CHECK (Age>=18)  
   > );
