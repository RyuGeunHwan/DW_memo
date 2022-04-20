package user;

import java.util.List;

public class UserService implements UserServiceImple {
    // UserService클래스에서 interface UserServiceImple를 상속한다.
    // implements : interface상속의 키워드(= extends)

	@Override
	public List<UserVO> updateSal(List<UserVO> list, String dname) {
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getDname().equals(dname)) {
				// String을 비교할 경우에는 == X, equals O로 비교!
				System.out.println("부서이름이 DEVELOP인 직원의 급여 인상 => " +list.get(i).getSal()*2);
			}
		}
		return list;
	}

	@Override
	public List<UserVO> updateLv(List<UserVO> list) {
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getSal() >= 0 && list.get(i).getSal() <= 100) {
				list.get(i).setLv(1);
			}else if(list.get(i).getSal() >= 101 && list.get(i).getSal() <= 1000) {
				list.get(i).setLv(2);
			}else if(list.get(i).getSal() >= 1000) {
				list.get(i).setLv(3);
			}
			System.out.println("사원 이름 => "+list.get(i).getEname()+" 사원 레벨 => "+ list.get(i).getLv());
		}
		return list;
	}

	@Override
	public List<UserVO> deleteUser(List<UserVO> list, int lv) {
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getLv() == lv) {
				System.out.println("레벨 3이상 해고 직원 => "+list.remove(i).getEname());
			}
			
		}
		return list;
	}

	@Override
	public UserVO selectUserByEname(List<UserVO> list, String ename) {
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getEname().equals(ename)) {
				System.out.println(list.get(i).getDname()+","+list.get(i).getLv()+","+list.get(i).getSal());
			}
		}
		return null;
	}

}
