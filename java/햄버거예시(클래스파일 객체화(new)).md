## 자바 main함수에는 static함수와 new선언으로 만든 클래스 메소드가 올 수 있다.
*new를 선언하면 다른 클래스 파일에 있어도 객체화(인스턴스화) 가능  

    public class 햄버거 { //햄버거라는 클래스 파일 생성

	public void 참깨빵(String 빵) {
		System.out.print(빵+"위에 ");
	}
	public String 패티추가하다 (String 패티이름) {
		System.out.print(패티이름+" 패티 두장 ");
		return 패티이름;
	}
	public void 특별한소스넣다(String 소스) {
		 System.out.print(소스);
	}
	public void 양상추추가하다() {
		System.out.print("양상추~~  ");
	} 
	public void 나머지재료추가하다(String 재료) {
		System.out.print(재료+"까지~ ");
	}
	public String 햄버거나오다 (String 효과음) {
		System.out.print(효과음+"~~ ");
		return 효과음;
	}
	public String 햄버거나왔다 (String 종류) {
		System.out.println(종류);
		return 종류;
	}
	public int 주문수량 (int 주문수량) {
		System.out.println("햄버거 "+주문수량+"개 나왔어요!");
		return 주문수량;
	}
---
     public class 햄버거인스턴스 { //햄버거인스턴스라는 클래스 파일 생성

	public static void main(String[] args) {
		햄버거 햄버거만들자 = new 햄버거();//앞의 햄버거는 클래스타입 / new 햄버거();가 햄버거 클래스를 불러오는것.
		햄버거만들자.참깨빵("참깨빵");
		햄버거만들자.패티추가하다("순쇠고기");
		햄버거만들자.특별한소스넣다("특별한소스 ");
		햄버거만들자.양상추추가하다();
		햄버거만들자.나머지재료추가하다("치즈피클양파");
		햄버거만들자.햄버거나오다("빰빠빠라밤");
		햄버거만들자.햄버거나왔다("빅맥 햄버거");
		햄버거만들자.주문수량(5);
		//결과 출력
		참깨빵위에 순쇠고기 패티 두장 특별한소스 양상추~~  치즈피클양파까지~ 빰빠빠라밤~~ 빅맥 햄버거
        햄버거 5개 나왔어요!

	}
---