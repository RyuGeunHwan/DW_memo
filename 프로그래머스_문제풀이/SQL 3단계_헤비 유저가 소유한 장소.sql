-- PLACES 테이블은 공간 임대 서비스에 등록된 공간의 정보를 담은 테이블입니다.
--  PLACES 테이블의 구조는 다음과 같으며 ID, NAME, HOST_ID는 
--  각각 공간의 아이디, 이름, 공간을 소유한 유저의 아이디를 나타냅니다. ID는 기본키입니다.

--  이 서비스에서는 공간을 둘 이상 등록한 사람을 "헤비 유저"라고 부릅니다. 
--  헤비 유저가 등록한 공간의 정보를 아이디 순으로 조회하는 SQL문을 작성해주세요.


*서브쿼리(하나의 SQL 문에 포함되어 있는 또 다른 SQL 문을 말합니다.) 사용*
SELECT
*
FROM
PLACES
WHERE
HOST_ID IN (SELECT HOST_ID FROM PLACES GROUP BY HOST_ID HAVING COUNT(*)>1)

결과 출력
 ID	                            NAME	                         HOST_ID
4431977	    BOUTIQUE STAYS - Somerset Terrace, Pet Friendly	    760849
5194998	    BOUTIQUE STAYS - Elwood Beaches 3, Pet Friendly 	760849
16045624	Urban Jungle in the Heart of Melbourne	            30900122
17810814	Stylish Bayside Retreat with a Luscious Garden	    760849
22740286	FREE PARKING - The Velvet Lux in Melbourne CBD  	30900122



***IN 연산자***
-- WHERE 절 내에서 특정값 여러개를 선택하는 SQL 연산자
-- 사용방법
-- WHERE 컬럼명 IN (/괄호 내의 값 중 일치하는 것이 있으면 TRUE/)
-- EX)
-- SELECT
-- *
-- FROM
-- 테이블명
-- WHERE 컬럼명=[조건1] or 컬럼명=[조건2] or 컬럼명=[조건3] or 컬럼명=[조건4] 
-- ->WHERE in ("[조건1]","[조건2]","[조건3]","[조건4]")

문제풀이
-- IN을 사용하지 않고 GROUP BY를 하게 되면 HOST_ID가 GROUP이 되어서 중복되는 HOST_ID가 하나씩으로 밖에 안나옴
-- ID	                            NAME	                    HOST_ID
-- 4431977	    BOUTIQUE STAYS - Somerset Terrace, Pet Friendly	760849
-- 16045624	Urban Jungle in the Heart of Melbourne      	30900122


