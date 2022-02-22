- # EXISTS

```
1. WHERE 절에 온다
2. EXISTS의 서브쿼리에 결과가 나오면 true 결과가 나오지 않으면 false
3. EXISTS의 서브쿼리가 true면 메인쿼리 실행O / false면 실행X
4. EXIST는 true인지 false인지만 중요! 메인쿼리의 데이터출력 내용에는 영향을 끼치지 않음.
5. 서브쿼리 데이터 참/거짓 여부에 따라 실행 판단

SELECT
*
FROM
emp
WHERE
EXISTS(
    SELECT *
    FROM emp
    WHERE job = 'manager'
    )
```

- # NOT EXISTS

```
1. WHERE 절에 온다
2. NOT EXISTS의 서브쿼리에 결과가 나오면 false 결과가 나오지 않으면 true
3. NOT EXISTS의 서브쿼리가 false면 메인쿼리 실행O / true면 실행X
4. 서브쿼리 데이터 참/거짓 여부에 따라 실행 판단

SELECT
*
FROM
emp
WHERE
NOT EXISTS(
    SELECT *
    FROM emp
    WHERE job = 'manager'
    )
```
