****DML
1. SELECT
2. DELETE
3. UPDATE
4. INSURT

--테이블 : 실제 데이터를 저장하는공간
--데이터베이스 : 실제 테이블을 저장하는 공간
--데이터베이스 -> 테이블 -> 데이터

SELECT  컬럼들,
FROM 테이블 이름
WHERE 필터링 조건
(연산자 >, =, <, like, and, or)
GROUP BY 데이터를 그룹화 할 때
HAVING 그룹된 데이터에서 집계함수(sum, avg, min, max) 사용할 때
ORDER BY  정렬 asc(디폴트값, 오름차순) / desc(내림차순)
LIMIT 데이터 row 강제로 자를 때 (break와 같은 의미)

SQL 쿼리 실행 순서
from -> where -> group by -> having -> select -> order by 

--------

GROUP BY 는 SELECT절에 무적권 집계 함수와 같이 사용(sum(), avg(), max(), min(), count())
***SQl 중복제거!
GROUP BY를 사용하지 않고 중복만 제거하고 싶다.
SELECT 
*distinct(컬럼명)

---------

문제에 **~~별로 (조회 하시오.), **~~별 (~~을 조회하시오.)
별로, 별 이 들어간 문제면 무조건 GROUP BY 사용!!!

---------

**ORDER BY에 숫자가 오는 것은 SELECT절의 몇번째 컬럼 순서로 정렬 할것 인지 말하는것!
이유 - ORDER BY의 쿼리 순서가 제일 늦기 때문에 SELECT절에 무엇이 몇번째 인지 알기 때문에.

---------

SQL or관련
단어를 세가지 이상 사용할 때
***in('류근환','홍길동','아이유','호랑이')
= 같은 의미
ex) name = '류근환' or name = '홍길동' or name = '아이유' or name = '호랑이'