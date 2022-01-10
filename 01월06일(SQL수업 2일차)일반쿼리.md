#데이터베이스
> -데이터를 저장하는 프로그램  
-SQL이라는 문법을 통해서 데이터를 가져와야함.

 ###DDL###(=Data Definition Language) 데이터 정의 언어
 >공통점 : table을 관리하는 명령어  
 CRATE TABLE <table_name> : table 생성  
 DROP TABLE <table_name> : table 삭제  
 ALTER TABLE <table_name> : table 수정(테이블 이름 변경할때 씀)

#####DML#####(=Data Manipulation Language) 데이터 조작 언어
>공통점 : table안에 있는 데이터를 관리하는 명령어  
SELECT : 데이터 조회  
DELETE : 데이터 삭제  
UPDATE : 데이터 수정  
INSERT : 데이터 생성


*DCL (=Data Control Language) 데이터 제어 언어
>(=특징 : 팀장급에게 부여되는 권한)  
공통점 : 데이터베이스 관리  
-GRANT : 특정 사용자에게 권한 부여  
-REVOKE : 특정 사용자 권한 회수  


>* emp 테이블의 data명  
-MGR : 사수번호  
-HIREDATE : 입사일짜  
-SAL : 월급  
-COMM : 보너스  
-DEPTNO : 부서번호  
-DNAME 부서이름  
-LOC 근무지역

>- 연산자는 where 절에 온다!  
-관계 연산자, 논리 연산자, 문자 연산자
-!=, =, <=, >=, <, > / and, or / like

#####관계 연산자 (where절에 와야함)
>* <(미만), >(초과), <=(이하), >=(이상), =(같다),  
>* !=(아니다 라는 의미, 부정의 의미)

#####논리 연산자
>* and (두개가 참 일 경우),(무엇무엇에서 무엇무엇까지)  
ex)1981-02-20~1981-12-03에 입사한 사람들의 이름,직업,부서번호를 조회하시오.   
-select   
 ename as '이름',  
 job as '직업',  
 deptno as '부서번호'  
-from   emp   
-where   hiredate >=(이상) '1981-02-20'  
###and  
 hiredate <=(이하) '1981-12-03'    
 >- or (###코드 두개 중(A or B)에 하나만 맞아도 괜찮을 경우)  
 ex) smith나 adams의 직업을 조회하시오.  
-select   
job  
-from  
emp  
-where  
ename = 'smith'  
or  
ename = 'adams'  

- and, or    
where 조건에 동시 사용할때가 있을경우.  
>- 기존 쿼리 순서
> 1. and(먼저 실행)
> 2. or(다음 실행)  
>- ###or이 먼저 실행 되고 싶으면(  )를 이용해라###   
ex) where  
    (  
    deptno = 10  
    or  
    deptno = 30  
    )  
    and   
    sal > 1500   
    = or먼저 실행됨

 ###정렬 연산자  (쿼리 순서 제일 마지막에 해석)
 > - oder by (desc) or (asc)   
> - order by는 쿼리 순서가 select 다음이기 때문에 숫자로 써도 가능!  
 이때, 숫자는 select 절의 순서를 의미함   
=======
 - order by (desc) or (asc) 

 >- -desc : 내림차순  
 -asc : 오름차순 (입력을 하지않아도 디폴트값으로 저장 되어있음)  
 ##order by hiredate desc or (asc)  
 -order by(정렬 연산자)는 왠만하면 안쓰는게 좋다!
 
* 쿼리 순서-> 1. from-> 2. where-> 3. select-> 4. desc or asc


 >* null = 데이터를 넣지 않은것을 의미  (is null (null인것) / is not null(null이 아닌것))  
>--문제) emp table에서 보너스가 없는(null) 사람과 급여를 조회하시오.   
ex)comm이 null인(아닌) 사람을 조회하시오.   
-select  
ename,  
sal 
-from  
emp   
-where  
comm is (not) null    

* ex) COMM(보너스)이(가) NULL이 아닌 사원의 이름, 부서번호, 입사날짜를 입사날짜 오름차순으로 정렬 및 조회하시오.  
=  
select   
ename as '이름',  
deptno as '부서번호',  
hiredate as '입사날짜'  
from emp  
where   
comm is not null   
order by hiredate (asc) 

*** count(*)
>* count(*) -> 총 합을 계산, 리스트를 조회하는것이 아닌 총 합를 조회하는것  
(table의 총 리스트를 조회 하는것 = * )   
manager의 총 급여와 총인원수를 조회하시오  
-select  
count(*)  
sum(sal),  
ename  
-from  
emp   
-where(table에서 조건을 필터링)  
job = 'manager';   
(<컬럼명> = <데이터>  데이터에 문자,년도 등을 조회 할경우 '  ' or "  " , 정수(200,100,1500 등)을 조회할 경우 ''or""필요없음)  
>* count(* as '별칭', count(*) as '별칭', count(*) as '별칭' = 데이터명이 '별칭' 으로 조회된다.  

like(문자 연산자)  
사용법(해당단어에 특정 글자를 찾아 낼떄 많이 사용 (ex) 성이 박씨인 사람 혹은 성이 김씨인사람)
>* 코드에서 중복된 코드는 좋지않은 코드다 (ename 2번)  
-select   
job,  
ename  
-from emp  
-where   
ename = 'adams'    
or   
ename = 'allen'     
>* --이름이 A(adams,allen)로 시작하는 사람을 조회 하시오  
->  
select   
job,  
ename  
from emp  
where ename like 'A%'  
>* --이름에 L(allen,miller)이두번 들어가는 사람을 조회 하시오  
-> 
 select   
job,  
ename  
from emp  
where ename like '%L%L%'  
>- ename like 'A%'= 이름이 'A'로 시작하는 사람 검색   
>- ename like '%A%'= 이름에 'A'가 들어가는 사람 검색
>- ename like '%A%A%'= 이름에 'A'가 두번 들어가는 사람  검색 


insert into(생성하다)
>* insert into(어? 너 어디 테이블에 데이터 insert(생성)할거야)  
>* (insert와 values의 순서를 맞춰줘야 한다)   
insert into emp   
(empno(사원번호), ename, job, mgr(사수번호), hiredate, sal, comm(보너스), deptno(부서번호))  
values  
(7970,'류근환','salesman',7369,'2022-01-06',5000,1000,30)  
>* Ex)  
insert into emp   
(empno(사원번호),ename,job,mgr(사수번호),hiredate,sal,comm(보너스))  
values  
(7970,'류근환','salesman',7369,'2022-01-06',5000,1000)   
(deptno가 빠지면 deptno는 null(데이터를 넣지 않는것)이 된다)

update(업데이트)
>*  사원번호 7971번인 사원의 이름을 정우성으로 바꾸시오.  
->update   
emp (어떤 table을 업데이트 할 것인지)  
set(데이터명 = '바꿀내용')  
ename = '정우성',   
 sal= 5000    
where(조건)  
 empno = 7971;  
=> emp table에 있는 7971이라는 사원번호를 가진 사람은 '정우성'이라는 이름과 '5000'이라는 급여가 바뀌는것  
(set=setting의 줄임말)   
>* 정우성이 직업하고 월급 변경요청  
-update  
emp  
-set     
job = 'manager',  
sal = 8000  
-where    ename = '정우성';  
=>emp table에 있는 정우성은 직업은 manager 급여는 8000으로 바뀐것이다.

통계함수 = sum / avg / max / min / count(*)
>* 총 합(sum)  
select   
sum(comm) as '보너스 총 합'  
from  emp  

>* 평균(avg)  
select   
avg(comm) as '보너스 평균'  
from emp  

>* 최대값(max)  
select   
max(sal) as '월급 최대'  
from emp

>* 최소값(min)  
select   
min(sal) as '월급 최소'  
from emp

group by (그룹핑),(여러가지 목록을 그룹화 하는것)
>- gorup by   
-group by 는 where 다음에 나온다.  
-group by를 할 경우에는 select절에는 group이 되는 컬럼(데이타)이 와야함.   
-group by 와 통계 함수는 친구 사이  
>- having(통계함수와 같이 쓰이는 코드)  
   1.group by한 애들에서의 필터링하는 코드  
   2.group by 뒤에 나와야함    
   -select  
   <컬럼 이름>  
   -from  
   <데이터이름>  
   -where  
   <조건 식>  
   -group by  
   <컬럼 이름>  
   -having  
   <sum, avg ,max, min>  
   -order by   
   <정렬할 컬럼> desc / asc  
>ex) 직업별로 급여가 제일 높은 사람을 조회 하시오 (단,  6000만원 이상 사람만)  
    -select  
    job,  
    ename  
    -from emp  
    -group by  
    JOB   
    -having  
    sum(sal) >= 6000  
>- 쿼리순서 -from->where->group by->having->select
>- grouping 문제  
>1. 각 부서별(deptno) 그룹화 하여 최고로 급여가 높은 사람의 이름과 직업을 나타내시오.    
(=각 부서별, 각 팀별 처럼 각 이 나오면 group by 사용)  
-select   
max(sal),  
ename,  
job  
-from  
emp  
-group by   
deptno  
>2. 각 부서별(deptno) 그룹화 하여 세일즈맨을 제외한  5000만원 이상인 사람의 이름과 직업을 나타내시오.  
-select   
max(sal),  
ename,  
job  
-from  
emp   
-where job != 'salesman'  
-group by   
deptno  
-having   
max(sal) >= 5000  
>3. 각 부서번호별(deptno) 평균급여, 총 인원, 최고 급여, 최소 급여 조회하시오.  
select   
deptno,  
avg(sal) as '평균 급여',  
count(*) as '총 인원',   
max(sal) as '최고 급여',  
min(sal) as '최소 급여'  
from   
emp  
group by  
deptno  
>4. 부서별 직책별 최대 급여와 인원수, 최소 급여를 추출  
단, 10번 부서와 사원은 제외하고,  
인원수는 3명 이하인 것으로 인원수가 적은 순서대로 추출  
-select   
deptno,  
job,  
max(sal) as '최고 급여',  
count(*) as '인원 수',  
min(sal) as '최소 급여'  
-from emp  
-where   
deptno != 10  
-group by  
deptno,   
job  
-having   
count(*) <= 3  
order by count(*)asc  
>5. 부서별로 급여합계  
단, 10,30번 부서와 급여 합계가 5000이상인 부서만 추출  
-select  
deptno as '부서',  
sum(sal) as ' 급여 합계'  
-from emp  
-where   
deptno = 10   
or  
deptno = 30   
-group by   
deptno  
-having   
sum(sal) >= 5000  
>6. 직책별로 급여합계와 평균급여를 추출  
단, manager는 제외하고 평균sal가 1000이상인 것만 추출  
-select   
job,  
sum(sal) as '급여합계',  
avg(sal) as '평균급여'  
-from emp  
-where   
job != 'manager'  
-group by   
job  
-having   
avg(sal) >= 1000  


- 문제  
>- --직업이 manager인 사람들의 급여 평균을 조회하시오.  
-select  
avg(sal) as '월급 평균'  
-from emp  
-where job = 'manager';   
>- --입사날짜가 1987-06-28 이상인 사람들의 
  수와 급여 평균을 조회하시오.  
-select  
count(*) as'총 인원',  
avg(sal) as '급여 평균'  
-from emp  
-where hiredate >= '1987-06-28';  
>- --직업이CLERK인 사원 중 최소급여를 받고 있는 
  사원의 이름과 입사날짜를 조회하시오.  
-select   
ename as '이름',  
hiredate as '입사날짜',  
min(sal) as '최소 급여'  
-from emp  
-where job = 'clerk';  
>- --comm이NULL이 아니면서 직업이 salesman이고, 
입사날짜가 1987-02-22이후에 들어온 사원의 comm의 
총 합을 조회 하시오.  
-select   
sum(comm) as '보너스 총 합'  
-from emp  
-where
hiredate >= '1987-02-22  '  
and   
JOB = 'salesman'   
and    
comm is not null;   

- ###limit### : 출력되는 결과 행의 수를 제한  
> limit문법(쿼리는 맨 뒤 order by 보다 뒤)  
 (게시판 짤 때 limit을 사용)  
----ex)10줄 이상이 나와도 10줄까지만 보고 싶다  
 select    
(*)  
from emp   
limit 0, 10  

- 쿼리순서 읽는법
1. from->where->select
2. from->where->select->*order by
3. from-> where-> *group by-> *having-> select-> order by
