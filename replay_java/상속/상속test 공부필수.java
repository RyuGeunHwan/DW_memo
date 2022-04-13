package 상속3;

import java.util.ArrayList;
import java.util.List;

class UserVO{
	private String name;
	private int sal; //급여
	
	public UserVO(String name, int sal){
		this.name = name;
		this.sal = sal;
//		System.out.println(this.name);
//		System.out.println(this.sal);
	}
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSal() {
		return sal;
	}

	public void setSal(int sal) {
		this.sal = sal;
	}
}

class MainUtil{

	public List<UserVO> getAllUsers(List<UserVO> list){ //전체 유저 호출
		for(int i =0; i<list.size();++i) {
			System.out.println("전체 유저 호출 => "+list.get(i).getName());
		}
		return list;
	}
	
	public String getUser(List<UserVO> list, String name){ //특정 유저 호출
		for(int i =0; i<list.size();++i) {
			if(list.get(i).getName().equals(name)) {
				System.out.println("특정 유저 호출 => "+name);
			}
		}
		return name;
	}
	
	public List<UserVO> deleteUser(List<UserVO> list, int index){
		list.remove(index);
		return list;
		
	}
	
	public int getUserTotalSal(List<UserVO> list){
		int sum = 0;
		for(int i=0; i<list.size(); i++) {
			sum+=list.get(i).getSal();
		}
		System.out.println("인덱스 getSal의 총합 => "+sum);
		return sum;
	}
	
}
public class MainService extends MainUtil{
	
	public static void main(String[] args) {
		//위에 MainUtil함수를 이용해서 문제풀 것.
		//1. 전체 유저 호출
		//2. 특정 유저 호출
		//3. 특정 유저 삭제
		//4. 모든 유저 급여 합 구하기
		List<UserVO> list = new ArrayList<UserVO>();
		list.add(new UserVO("SMITH", 100));// list에 클래스UserVO를 대입(클래스UserVO의 필드변수와 메소드 사용가능)
		//ex) list.get(0).getName(); => UserVO의매개변수가 UserVO의 필드변수에 대입하여 getName으로 가져올 수 있다.
		// 필드변수로 가져오면 되는데 왜 굳이 어렵게? => 필드변수의 접근지정자가 private이기 때문에 getter를 사용하는 것.
		list.add(new UserVO("BRIAN", 300));
		list.add(new UserVO("ALLEN", 600));
		list.add(new UserVO("KING", 2000));
		MainService main = new MainService();
		main.getAllUsers(list);
		main.getUser(list, "ALLEN");
		main.getUserTotalSal(list);
		main.deleteUser(list, 0);
		for(int i=0; i<list.size(); i++) {
			System.out.println("삭제한 인덱스(SMITH) 제외한 나머지 => "+list.get(i).getName());
		}
	}
}