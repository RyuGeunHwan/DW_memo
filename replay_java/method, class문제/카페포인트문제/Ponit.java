package 상속;
class Point{
	int point;
	int coffeeCount;
	String type;
	int totalPoint;
	
	public void useCoffeePoint(int coffeeCount){
		if(this.totalPoint>=10) {
			this.totalPoint = this.totalPoint-10*coffeeCount;
			System.out.println("point잔액은 "+this.totalPoint+"점 입니다.");
		}
		if(this.totalPoint<10){
			System.out.println("포인트를 사용할 수 없습니다.");
		}
	//커피 1잔당 포인트 10점
	// 커피 한잔을 포인트로 사용 하면 totalPoint에서 -10을 해야한다.
}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point += point;
		this.totalPoint += point;
	}

	public String getType() {
		
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
}
public class 알로하녹 {
	// 알로하녹 카페는 회원제로 운영한다.

	// 커피 10잔을 마시면 브론즈 회원
	// 커피 20잔을 마시면 실버 회원
	// 커피 30잔을 마시면 골드 회원

	// 심화 과정 : 회원 이름이 류근환이면 함수 A를 가져와서 point 적립.

	

		

		public static void main(String[] args) {
			Point p = new Point();
			p.setPoint(15);
			p.setPoint(5);
			p.setPoint(12);

			if(p.getPoint()> 0 && p.getPoint()<10) {
				p.setType("일반 회원");
				System.out.println(p.type);
			}
			if(p.getPoint()>=10&& p.getPoint()<20) {
				p.setType("브론즈 회원");
				System.out.println(p.type);
			}
			if(p.getPoint()>=20&& p.getPoint()<30) {
				p.setType("실버 회원");
				System.out.println(p.type);
			}
			if(p.getPoint()>=30&& p.getPoint()<40) {
				p.setType("골드 회원");
				System.out.println(p.type);
			}
			if(p.getPoint()>=40) {
				p.setType("왕");
				System.out.println(p.type);
			}
			p.useCoffeePoint(2);
			p.useCoffeePoint(1);			
			
		}

	}




