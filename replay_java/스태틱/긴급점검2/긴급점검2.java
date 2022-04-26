package test;

class Dw{
	String className;
	String studentName;
	int count;
	public Dw(int count) {// 오버로딩
		this.count = count;
	}
	// 생성자의 목적 : 초기화
	public Dw(String className, String studentName) {
		this.className = className;
		this.studentName = studentName;
	}
	public static Dw getInstance() {
		Dw d = new Dw("자바", "류근환");
		return d;
	}
	public static Dw count() {
		Dw d = new Dw(3);
		return d;
	}
}
	


public class 긴급점검2 {
	public static Dw printStudent() {
		Dw dw = new Dw("스마트웹&앱과정", "홍길동");
		return dw;
	}
	public static void main(String[] args) {
		//방법1. 
		Dw d = printStudent();
		//같은 class안에서 static인 메소드를 호출한다면 메소드명만 명시하면 된다.
		System.out.println(d.className +", "+d.studentName);
		//방법2. 
		System.out.println(printStudent().className+", "+printStudent().studentName);
		
		//번외
		System.out.println(d.className);
		System.out.println(Dw.count().count);


        Dw dw = Dw.getInstance();
        // Dw클래스에있는 메소드getInstance은 클래스가 public이 아니기 때문에 클래스명을 명시해주어야 한다.
        System.out.println(dw.className);
        System.out.println(dw.studentName);
	}
	

}
