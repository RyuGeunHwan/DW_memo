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