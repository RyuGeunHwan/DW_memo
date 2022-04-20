package user;

import java.util.ArrayList;
import java.util.List;

public class MainController{
    public static void main(String args[]){

        List<UserVO> list = new ArrayList<UserVO>();
        list.add(new UserVO("Alex","DEVELOP",200));
        list.add(new UserVO("Max","DEVELOP",80));
        list.add(new UserVO("Brian","DEVELOP",100));
        list.add(new UserVO("mr.Hyun","MANAGER",300));
        list.add(new UserVO("Allen","DEVELOP",110));
        list.add(new UserVO("Katter","DEVELOP",220));
        list.add(new UserVO("Hooker","MANAGER",1500));
        list.add(new UserVO("King","MASTER",0));
        
        UserService us = new UserService();
        //여기서 문제 풀 것
        // 1. 부서이름이 DEVELOP인 사원 급여를 2배 인상하시오.
        us.updateSal(list, "DEVELOP");
        
        // 2. 급여가 0 ~ 100 : 1 레벨, 101 ~ 1000 : 2 레벨, 1001 이상부터는 3 레벨로 수정하시오.
        us.updateLv(list);
        
        // 3. 레벨 3이상 직원을 모두 해고하시오.
        us.deleteUser(list, 3);
        
        // 4. 이름이 King인 직원의 모든 정보 조회.
        us.selectUserByEname(list, "King");
    }
}