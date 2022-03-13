// json출력 함수 (터미널에)
// console.log();

var student = ['오승택', '류근환안녕하세요', '강인석', '김보겸', '이인서', '나정수', '정지유', '김민영', '이규성', '이승섭', '이상협', '홍준호', '유영준']
var student_count = 16
var teacher = '현상원'
var today = '2022-03-08'
var subject = ['SQL', 'JAVA', 'HTML']
//여러개의 변수들을 하나의 큰상자(JSON)에 묶어주는 것이 JSON이다.


// json포맷
//JSON에서의 Value값 = key : 중복X , Value : 값(중복 가능, 데이터 타입)
// dwAcademy라는 변수로 {student, student_count, teacher, today, subject}를 묶어서 한번에 사용하는 것을 json이라고 한다.
var dwAcademy = {
 student : ['오승택', '류근환안녕하세요', '강인석', '김보겸','이인서','나정수','정지유','김민영','이규성','이승섭','이상협','홍준호','유영준'],
 student_count : 16,
 teacher : '현상원',
 today : '2022-03-08',
 subject : ['SQL', 'JAVA', 'HTML']
};

// json 값 호출
console.log(dwAcademy.student_count);
// json 배열호출
console.log(dwAcademy.student[1]);
// 문제1. student_count가 15이하면 '학생 수 부족', 15초과면 '학생 수 정상'
var count = dwAcademy.student_count;
if (count <= 15) {
 console.log('학생 수 부족 ');
} else {
 console.log('학생 수 정상 ');
}
// 문제2. 학생 이름에 성이 '이'씨인 사람 count!
var array = dwAcademy.student;
var len = array.length;
var count = 0;
var searchWorld = '이';
var firstName = '';
for (var i = 0; i < len; i++){
 firstName = array[i].substring(2, 3);
 if (firstName == searchWorld) {
     count++;
 }
 console.log(firstName);
}
console.log(count);
// substring

var 영화 = { //JSON
 배급사 : 'CJ',
 // 영화이름 : ['스파이더맨','인터스텔라','신세계']
 영화이름: [
     { //영화 JSON안에 JSON
     name: '스파이더맨 노웨이 홈',
     actor: ['톰 홀랜드', '젠데이아'],
     time : 148
     },
     {
     name: '인터스텔라',
     actor: ['앤 해서웨이', '매슈 매커너히'],
     time: 169
     },
     {
     name: '신세계',
     actor: ['이정재', '송지효','황정민'],
     time: 200
     }
 ]
}
var 이름 = 영화.영화이름[1].actor;
console.log(이름);
// for (var i = 0; i < 영화.영화이름.length; i++){
//     if(영화.영화이름[i])
// }

var emp = {
 empno: '3450',
 ename: 'SMITH',
 sal: 3400,
 dname: [{
     id:1,
     name: '개발',
     count: 5,
     부서장 : '홍길동'
 }, {
     id:1,
     name: '영업',
     count: 13,
     부서장 : '박길동'
 }],
 hiredate: '21-12-31',
 상사이름 : ['BRIAN','KING']
}

var dept = {
 dname: [
     {
         name: '개발',
         // 부서이름이 '개발'인 부서에
         //소속되어 있는 소속인원들의 신상정보를 JSON으로 묶어서
         //소속인원의 배열로 묶었다.
         소속인원 : [ {
     empno : '3450',
     name: 'SMITH',
     sal: 3400,
     mgr : '1201'
 },{
     empno : '2880',
     name: 'KING',
     sal: 4300,
     mgr : '0847'
 },{
     empno : '4566',
     name: 'ALLAN',
     sal: 3000,
     mgr : '2117'
 }],
     count: 5,
     loc : 'Dajeon'
 }, {
         name: '영업',
      소속인원 : [ {
     empno : '0000',
     name: 'SMITH',
     sal: 3400,
     mgr : '1201'
 },{
     empno : '1111',
     name: 'KING',
     sal: 4300,
     mgr : '0847'
 },{
     empno : '2222',
     name: 'ALLAN',
     sal: 3000,
     mgr : '2117'
 }],
     count: 13,
     loc : 'Busan'
     }, {
         name: '기획',
          소속인원 : [ {
     empno : '3333',
     name: 'SMITH',
     sal: 3400,
     mgr : '1201'
 },{
     empno : '4444',
     name: 'KING',
     sal: 4300,
     mgr : '0847'
 },{
     empno : '5555',
     name: 'ALLAN',
     sal: 3000,
     mgr : '2117'
 }],
     count: 10,
     loc : 'Incheon'
     }
 ],
}
for (var i = 0; i < dept.dname.length; i++){
     if (dept.dname[i].name == '영업') {
         console.log(dept.dname[i].소속인원)
     }
}
// var count = 0;
// for (var i = 0; i < dept.소속인원.length; i++){
//     if (dept.소속인원[i].dname == '개발') {
//         console.log(dept.dname[i],dept.소속인원[i])
//         count++;
//     }
// }
// console.log(count)
