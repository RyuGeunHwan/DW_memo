package 사과;

public class Person {

	public static void main(String[] args) {
		Apple a = new Apple();
		
		a.setCount(10);
		a.setEatCount(1);
		a.setEatCount(5);
		a.setCount(17);
		if(a.getCount() <= 0 ) {
			System.out.println("사과가 부족합니다.");
			return;
		}else {
			System.out.println("잔여 사과 갯수는? => "+a.totalCount+"개");
		}
	}

}
