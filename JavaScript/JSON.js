// *JSON(JavaScript Object Notation)*
//  JSON : 데이터 형식(단순히 데이터를 표시하는 표현 방법)
//  java에서는 JSON을 Map이라고 함.

var information = {
    // 왼쪽에 오는 데이터 = key , 오른쪽에 오는 데이터 = value
    // key : value
    "name": "Ryu geun hwan",
    "age": 28,
    "address": "대전 서구 관저동",
    "isMarri": false

    // 데이터가 boolean(true, false)형 일 경우에는 변수이름 앞에 is+(명사) 옴!
    // ex) isLogin(로그인 여부) true , false
    //     isMeal(식사 여부)    true , false
};// JSON은 key와 value로 구성.

// 주의점!!!
// 1. key는 중복 불가능! / value는 중복 가능!
// 2. value에 숫자형(int, double), 문자형(string),
//    boolean형, 배열형(array), null 데이터 올 수 있음.
// 3. JSON은 중괄호로 감싼다.{}
var age = information.age;

    if(age>= 28) {
        console.log('★ 28살 입니다.★')
}else{
    console.log('28살이 아닙니다.')
}

// JavaScript에서의 상수
// const '변수이름' = 데이터
//배열
var array = [1,3,4,5,2,6];
console.log(array[0]); //배열 0번째 값 호출
var len = array.length;
// 짝수 구하기
const EVEN = 2;
for(var i=0; i<len; i++){
    var value = array[i]
    if(value%EVEN==0){
        console.log('짝수는? '+value)
    }
}

//최댓값 구하기
var max = 0;
for(var i=0; i<len; i++){
if(array[i]>max){
    max = array[i]
}
}console.log('최대값은~?===> '+max)
