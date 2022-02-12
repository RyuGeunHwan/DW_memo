**between 
-- 범위 지정 할 때 씀
-- 초과,미만을 쓰지 못하는 단점
-- BETWEEN은 연산자가 오지 못한다.
-- between(이상) and(이하)
select *
from emp as e
where e.SAL 
between 1000 
and 3000

=

select
*
from
emp e 
where  
e.sal>=1000
and 
e.sal<=3000

-- 같은 말이다!!!