package test;

public class 연습 {

	public static void main(String[] args) {
		// 같은 package안에
		// main함수도 static
		// 클래스를 호출할 수 있는 함수도 static이기 때문에
		// static을 포함한 함수를 불러들이기 위해 new(인스턴스화)로 호출할 필요는 없다.
		// why? static끼리 공유할 수 있기 때문에 어느 클래스에 어떤 함수를
		// 사용할 것인지만 명시해주면 된다.
		
		// 변수 활용
		Dw dw = 긴급점검2.printStudent();
		//긴급점검2에 있는 함수 printStudent()의 **리턴타입이 Dw이기 때문에
		// 변수의 타입을 Dw로 한것!
		Dw d = Dw.getInstance();
		System.out.println(dw.className +", "+dw.studentName);
		System.out.println(d.className +", "+d.studentName);
	}

}
