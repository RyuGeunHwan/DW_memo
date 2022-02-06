-- 아직 입양을 못 간 동물 중, 가장 오래 보호소에 있었던 동물 3마리의 이름과 보호 시작일을 조회하는 SQL문을 작성해주세요. 
-- 이때 결과는 보호 시작일 순으로 조회해야 합니다.
-- ANIMAL_INS 테이블은 동물 보호소에 들어온 동물의 정보를 담은 테이블입니다. 
-- ANIMAL_INS 테이블 구조는 다음과 같으며, ANIMAL_ID, ANIMAL_TYPE, DATETIME, INTAKE_CONDITION, NAME, SEX_UPON_INTAKE는 
--                             각각 동물의 아이디, 생물 종, 보호 시작일, 보호 시작 시 상태, 이름, 성별 및 중성화 여부를 나타냅니다.

-- ANIMAL_OUTS 테이블은 동물 보호소에서 입양 보낸 동물의 정보를 담은 테이블입니다. ANIMAL_OUTS 테이블 구조는 다음과 같으며, ANIMAL_ID, ANIMAL_TYPE, DATETIME, NAME, SEX_UPON_OUTCOME는 
--                             각각 동물의 아이디, 생물 종, 입양일, 이름, 성별 및 중성화 여부를 나타냅니다.
-- FK=ANIMAL_ID
문제풀이 
1.ins와 outs테이블 중에 보호소에 가장 오래있던 동물들을 비교하는 문제이므로 
보호시작일이 있는 ins테이블을 JOIN하기 위해 LEFT JOIN
2.ON은 두 테이블의  FK인 ANIMAL_ID을 비교
3.아직 입양을 못 간 동물 이라는 조건이 있기때문에 입양일이 있는 outs테이블의 datetime의 데이터가 null인것을 찾음
4.가장 오래 보호소에 있었던 동물 3마리의 이름(ins.name)과 보호 시작일(ins.datetime)을 조회 이 문장의 의미는 
가장오래동안 보호소에 있던 동물들을 오름차순(ORDER BY ins.datetime )으로 
5.하여 LIMIT을 이용해 제일 오래된 3마리만 출력

SELECT
ins.name,
ins.datetime
FROM
ANIMAL_INS as ins
left JOIN
ANIMAL_OUTS as outs
ON
outs.ANIMAL_ID = ins.ANIMAL_ID
WHERE outs.datetime is null
ORDER BY ins.datetime 
LIMIT 3