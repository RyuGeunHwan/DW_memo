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
        
        UserServiceImple service = new UserService();
        // 인터페이스는 인스턴스화 할 수 없지만 부모는 자식을 포함 할 수 있는 특징을 살려서
        // UserServiceImple는 자식클래스(서브클래스)인 UserService를 포함시켜 인터페이스를 인스턴스화 할 수 있다!



        //여기서 문제 풀 것
        // 1. 부서이름이 DEVELOP인 사원 급여를 2배 인상하시오.
        service.updateSal(list, "DEVELOP");
        
        // 2. 급여가 0 ~ 100 : 1 레벨, 101 ~ 1000 : 2 레벨, 1001 이상부터는 3 레벨로 수정하시오.
        service.updateLv(list);
        
        // 3. 레벨 3이상 직원을 모두 해고하시오.
        service.deleteUser(list, 3);
        
        // 4. 이름이 King인 직원의 모든 정보 조회.
        service.selectUserByEname(list, "King");
    }
}