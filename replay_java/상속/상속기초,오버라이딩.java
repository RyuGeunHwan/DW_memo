package 상속2;

//모든 클래스는 Object의 자식이기 때문에 모든 클래스는 Object 메소드를 사용할 수 있다.
// 상속을 받는 자식클래스(서브클래스)는 부모뿐만 아니라 그 위 조부모,조상 클래스의 필드변수와 메소드를 사용할 수 있다.
// 자식클래스(서브클래스)는 하나의 부모클래스만 상속 받을 수 있다, 슈퍼클래스는 여러 서브클래스를 상속할 수 있다.

class Study extends Object{//extends Object = default;
	public void doSleep() {
		System.out.println("꿀잠을 자다 Zzz");
	}
	
	public void doStudy(String subjects) {
		System.out.println(subjects+"를 공부하다.");
	}
}

class StudentC extends Study{ //extends를 기준으로 왼쪽은 자식클래스(서브클래스) 오른쪽은 부모클래스(슈퍼클래스)
	//studentC는 클래스Study를 상속받는다.
	//상속을 받으면 부모클래스의 필드변수와 메소드를 사용할 수 있다.
	//단, public일 때만
	public void doStudy() {//오버로딩
//		System.out.println("JAVA를 공부하다.");
	}
	public void doStudy(int x) {//오버로딩
		
	}
	public void doStudy(int x, int y) {//오버로딩
		
	}
	
	//슈퍼클래스의 메소드를 사용하기 싫을경우(오버라이딩을 하면 된다.)
	// @(= "어노테이션") :
	@Override //Overriding == 슈퍼클래스의 메소드를 서브클래스에서 재정의 하다.
	public void doSleep() { //오버라이딩
		System.out.println("저는 열심히 공부를 합니다!");
		
	//오버로딩
		// 개념 : 같은 클래스 or 상속 관계에서 동일한 이름의 메소드 중복 가능
		//		단, 파라미터값이 달라야한다.(갯수 or 타입)
		// 조건 : 메소드 이름은 동일해야 함. 파라미터(인수,인자,매개변수)개수, 타입은 달라야한다.
		// 사용하는 이유 : 이름이 같은 여러 개의 메소드를 선언하려고.
		
	//***오버라이딩
		// 개념 : 자식클래스(서브클래스)에서 부모클래스(슈퍼클래스)에 있는 동일한 이름의 메소드를 재정의
		// 조건 : 메소드 이름은 동일해야 함. ***파라미터(인수,인자,매개변수)개수, 타입도 동일해야한다.
		// 사용하는 이유 : 부모클래스 메소드 무시하고 자식클래스에서 재정의 하려고.
		// 사용 방법 : @Override 명시 후 슈퍼클래스와 같은 메소드를 명시
		//ex) @Override public void doSleep() {}
	}
	public void doStudy(String subjects){ //오버라이딩
		System.out.println(subjects+" 공부하기 싫어요!");
	}
	
	
}


class StudentB extends Study{

	public void doStudy() {
//		System.out.println("SQL을 공부하다.");
	}
}


class StudentA extends Study{

	public void doStudy() {
//		System.out.println("CSS를 공부하다.");
	}
}


public class School {

	public static void main(String[] args) {
		//방법1. 
		StudentC c = new StudentC();
		StudentB b = new StudentB();
		StudentA a = new StudentA();
		c.doStudy();
		b.doStudy();
		a.doStudy();
		System.out.println("************슈퍼클래스를 활용!************");
		a.doStudy("씨에스에스");
		b.doStudy("에스큐엘");
		c.doStudy("자바");//슈퍼클래스Study의 메소드를 무시하고 서브클래스의 오버라이딩(@Override)한 메소드doStudy를 가져옴.
		c.doSleep();// 오버라이딩한 메소드
		System.out.println("************");
		
		// 방법2. 
		new StudentC().doStudy();
		new StudentB().doStudy();
		new StudentA().doStudy();
		// 방법2의 문제점 : 같은 기능을 하는 메소드가 중복됨
		// 해결책 : 상속을 이용해서 중복된 코드(메소드)를 제거
	}

}
