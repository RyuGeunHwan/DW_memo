package final_test;
import java.util.ArrayList;
import java.util.List;

public class EmpMain {

	public static void main(String[] args) {
		List<EmpVO> list = new ArrayList<EmpVO>();
		list.add(new EmpVO(100, "ALLEN", 100));
		list.add(new EmpVO(110, "SMITH", 100));
		list.add(new EmpVO(120, "WILLSON", 200));
		list.add(new EmpVO(130, "SANGWON", 50));
		list.add(new EmpVO(140, "BRIAN", 600));
		list.add(new EmpVO(150, "KING", 3000));

		EmpServiceImpl service = new EmpService();
		//1번. 전체 사원 200달러 급여 인상하고 사원 리스트를 리턴 하시오. 
		service.getEmpList(list);
		for(EmpVO e : list) {
			System.out.println("문제1. "+e.getSal());
		}
		//2번. 급여가 가장 높은 사원을 리턴 하시오. (단, 급여 중복이 없다고 가정)
		System.out.println("문제2. "+service.getEmp(list).getEname());
		//3번. 사원 중 급여를 300이하로 받고 있는 사원 수를 구하시오.
		System.out.println("문제3. "+service.getCount(list, 300)+"명");
		//4번. 특정 사원에 부서번호 10, 부서이름 SALES 부서를 추가하고 사원을 리턴하시오.
		EmpVO emp = service.setDept(list.get(3));
		for(int i=0; i<list.size(); i++) {
			for(int j=0; j<service.setDept(emp).getList().size(); j++) {
				if(list.get(i).getList() != null) {
					int deptNo = list.get(i).getList().get(j).getDeptno();
					String dName = list.get(i).getList().get(j).getDname();
				System.out.println("문제4. "+list.get(i).getEname()+","+deptNo+","+dName);
			}
			}
		}
	}
}
	