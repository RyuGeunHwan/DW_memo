package final_test;

import java.util.ArrayList;
import java.util.List;

public class EmpService implements EmpServiceImpl{

//	1번. 전체 사원 200달러 급여 인상하고 사원 리스트를 리턴 하시오. 
	public List<EmpVO> getEmpList(List<EmpVO> list) {
		int bonusSal = EmpCode.SPECIAL_BONUS;
		for(int i=0; i<list.size(); i++) {
			list.get(i).setSal(list.get(i).getSal()+bonusSal);
		}
		return list;
	}

//	2번. 급여가 가장 높은 사원을 리턴 하시오. (단, 급여 중복이 없다고 가정)
	public EmpVO getEmp(List<EmpVO> list) {
		int maxSal = 0;
		for(int i=0; i<list.size();i++) {
			if(list.get(i).getSal()>maxSal) {
				maxSal = list.get(i).getSal();
			}
		}
		for(int i=0;i<list.size(); i++) {
			if(list.get(i).getSal() == maxSal) {
				return list.get(i);
			}
		}
		return null;
	}

//	3번. 사원 중 급여를 300이하로 받고 있는 사원 수를 구하시오.
	public int getCount(List<EmpVO> list, int sal) {
		int count =0;
		for(int i=0; i<list.size(); i++) {
			int empSal = list.get(i).getSal();
			if(empSal<=sal) {
				count++;
			}
		}
		return count;
	}

//	4번. 특정 사원에 부서번호 10, 부서이름 SALES 부서를 추가하고 사원을 리턴하시오.
	public EmpVO setDept(EmpVO empVO) {
		DeptVO dept = new DeptVO(10, "SALES");
		List<DeptVO> list = new ArrayList<DeptVO>();
		list.add(dept);
		empVO.setList(list);
		return empVO;
	}

}