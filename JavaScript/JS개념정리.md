# JSON(JavaScript Object Notation)

```
 1. JSON : 데이터 형식
 (단순히 데이터를 표시하는 표현 방법)(모든 프로그래밍 언어에 쓰임(C언어 빼고))(파일 형식도 가능 '파일이름'.JSON)
 2. java에서는 JSON을 Map이라고 함.
 3. 데이터를 전송할 때 많이 사용되는 경량(한번에 묶는다.)의 DATA 교환 형식
 4. 장점
    4-1) 문서화를 할 수 있다.
    4-2) 재사용 가능.
```

## JSON을 하는 이유

```
1. 복잡한 함수를 한번에 묶어서 정리할 수 있음
2. 프론트엔드와 백엔드의 의사소통을 위해서
```

## javaScript

```
- 상수타입
    const '변수이름' = '데이터내용'
```

## JSON 주의점!!!

```
 1. key는 중복 불가능!(같은 JSON에서만 중복 불가능.) / value는 중복 가능!
    1-1) java와 같다 -> 변수명은 중복안되지만 데이터는 중복 가능!
 2. value에 숫자형(int, double), 문자형(string),
    boolean형, 배열형(array), null 데이터 올 수 있음.
 3. 중괄호로 감싼다.{}
 4. JSON은 ' = '
 5. JSON안에 value들은 ' : '
```

## JSON DATA형식

```
1. 중괄호
2. key(중복X), value(중복O) 구성
3. value(문자형,정수형,논리형,배열,JSON...올 수 있다.)
```

### JSON문법

```JS
var information(변수이름) = {
    name: "Ryu geun hwan",
    age: 28,
    address: "대전 서구 관저동",
    isMarri: false
};

    왼쪽에 오는 변수이름 = key , 오른쪽에 오는 데이터 = value
    key(변수이름) : value(데이터)
    데이터가 boolean(true, false)형 일 경우에는 변수이름 앞에 is+(명사) 옴!
    ex) isLogin(로그인 여부) true , false
        isMeal(식사 여부)    true , false
    JSON은 key와 value로 구성.
```

# 리눅스(운영체제) 명령어

```
(*주니어 개발자가 알아야 하는 필수 명령어)
1. ls : 현재 경로 파일 및 폴더 확인
2. cd : 현재폴더
    2-1) 뒤로가기 = cd .. -> .. 뒤로가기 명령어
    2-2) 폴더 선택 = cd 폴더이름
3. pwd : 현재 경로 확인
4. clear : 명령어 내용 삭제
```
