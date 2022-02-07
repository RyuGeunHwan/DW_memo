-- ANIMAL_INS 테이블은 동물 보호소에 들어온 동물의 정보를 담은 테이블입니다. A
-- NIMAL_INS 테이블 구조는 다음과 같으며, ANIMAL_ID, ANIMAL_TYPE, DATETIME, INTAKE_CONDITION, NAME, SEX_UPON_INTAKE는 
--                             각각 동물의 아이디, 생물 종, 보호 시작일, 보호 시작 시 상태, 이름, 성별 및 중성화 여부를 나타냅니다.

-- ANIMAL_OUTS 테이블은 동물 보호소에서 입양 보낸 동물의 정보를 담은 테이블입니다. 
-- ANIMAL_OUTS 테이블 구조는 다음과 같으며, ANIMAL_ID, ANIMAL_TYPE, DATETIME, NAME, SEX_UPON_OUTCOME는 
--                              각각 동물의 아이디, 생물 종, 입양일, 이름, 성별 및 중성화 여부를 나타냅니다. 

-- ANIMAL_OUTS 테이블의 ANIMAL_ID는 ANIMAL_INS의 ANIMAL_ID의 외래 키입니다.


-- 보호소에서 중성화 수술을 거친 동물 정보를 알아보려 합니다. 
-- 보호소에 들어올 당시에는 중성화가 되지 않았지만, 보호소를 나갈 당시에는 중성화된 동물의 아이디와 생물 종, 이름을 조회하는 아이디 순으로 조회하는 SQL 문을 작성해주세요.
-- 중성화를 거치지 않은 동물은 성별 및 중성화 여부에 Intact, 중성화를 거친 동물은 Spayed 또는 Neutered라고 표시되어있습니다.

-- 전체 문제풀이.
-- 1. 보호소에 들어올때, 입양갈때(보호소를 나갈 당시) 두가지 테이블이 연결 되어있기 때문에  JOIN사용하기 

-- 방법1 문제풀이.
-- 보호소에 들어올 당시에는 중성화가 되지 않았지만, 보호소를 나갈 당시에는 중성화된 동물
-- 위의 문장의 조건(WHERE)절
-- 1) a테이블의 SEX_UPON_INTAKE의 중에 In이 들어간 문장과
-- = 보호소에 들어올때는 중성화 안되어있는 동물 In
-- 2) (b테이블의 SEX_UPON_OUTCOME의 중에 Sp or Ne가 들어가는 문장)
-- = 입양당시 중성화 된 동물 Sp or Ne

SELECT
a.ANIMAL_ID,
a.ANIMAL_TYPE,
a.NAME
FROM ANIMAL_INS as a
JOIN ANIMAL_OUTS as b
ON a.ANIMAL_ID = b.ANIMAL_ID
WHERE
a.SEX_UPON_INTAKE LIKE "In%"
and
(b.SEX_UPON_OUTCOME LIKE "Sp%"
or
b.SEX_UPON_OUTCOME LIKE "Ne%")

-----------------------------------

-- 방법2 문제풀이.
-- SEX_UPON_INTAKE와 SEX_UPON_OUTCOME중 달라진 것은 
-- 중성화를 안한 상태 -> 중성화를 한상태로 바뀐것 뿐이기 때문에
-- 두 데이터가 다른걸 비교

SELECT
a.ANIMAL_ID,
a.ANIMAL_TYPE,
a.NAME
FROM ANIMAL_INS as a
JOIN ANIMAL_OUTS as b
ON a.ANIMAL_ID = b.ANIMAL_ID
WHERE
a.SEX_UPON_INTAKE != b.SEX_UPON_OUTCOME