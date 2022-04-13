package 상속2;
class Manager{
	
	public Manager() {//디폴트 생성자
		System.out.println("hello word!");
		System.out.println("Good Bye word!");
	}
	
	public int 급여를주다(int 월급){
		return 월급;
	}
	public String 요리를하다(String 식자재){
		return 식자재;
	}
}
class Chef extends Manager{
	
	public Chef(){ // 디폴트 생성자
		super(); //super라는 메소드가 디폴트로 생성
		//super는 부모클래스의 생성자를 의미함
	}
	
	@Override 
	//@Override는 디폴트 값이라서 슈퍼클래스의 메소드,이름,타입 모두 같은 것을 
	// 서브클래스에서 재정의를 하게 되면 오버라이딩이 된다.
	public int 급여를주다(int 월급){//오버라이딩
		return 월급*3;
	}
	public String 요리를하다(String 식자재){//오버라이딩
		return 식자재;
	}
	public String 요리를하다(String 식자재, String 비밀소스){//오버로딩
		return 식자재+비밀소스;
	}
}
public class Restaurant {
	public static void main(String[] args) {
		Chef chef = new Chef();
		Manager manager = new Manager();
		
	}
}