package 상속;

public class Person {

	public static void main(String[] args) {
		Apple a = new Apple();
		
		int buyApple = a.buyApple(5);
//		buyApple = a.buyApple(0);
		int eatApple = a.eatApple(4);
		int result = a.resultApple(buyApple, eatApple);
//		int result = buyApple-eatApple;
		if(result>=0) {
		System.out.println("사과를 먹을 수 있는 개수는 "+buyApple+"개 입니다.");
		System.out.println("사과를 먹은 개수는 "+eatApple+"개 입니다.");
		System.out.println("사과를 먹고 남은 개수는 "+result+"개 입니다.");
		}else {
			System.out.println("사과를 구매해주세요!");
		}
	}

}
