package 카페;
class Point{
	int point;
	int coffeeCount = 10;
	String type;
	int totalPoint;
	
	public void useCoffeePoint(int coffeeCount){
		if(coffeeCount == 1) {//포인트를 사용하는 커피의 갯수가 1개라면(커피 개당 포인트 10점)
			if(this.totalPoint >= 10) {
			this.totalPoint -= (coffeeCount*this.coffeeCount);// 2*10
			System.out.println("point잔액은 "+this.totalPoint+"점 입니다.");
			}else {
				System.out.println("포인트가 부족합니다.");
			}
		}else {
			if(coffeeCount >= 2) {//포인트를 사용하는 커피의 갯수가 2개이상이라면(커피 개당 포인트 10점)
			if(this.totalPoint >= 20) {
				this.totalPoint -= (coffeeCount*this.coffeeCount);// 2*10
				System.out.println("point잔액은 "+this.totalPoint+"점 입니다.");
			}else {
				System.out.println("포인트가 부족합니다.");
			}
		}
		}
}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) { //리턴타입이 void이므로 리턴X 그래서 클래스필드변수에 파라미터값 대입.
		this.point += point; // +=는 파라미터값이 들어 올때마다 this.point(필드변수)는 계속 누적(합)
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
		public static void main(String[] args) {
			Point p = new Point();
			p.setPoint(15);
			p.setPoint(5);
			p.setPoint(12);
			p.useCoffeePoint(2);
			p.useCoffeePoint(2);



//커피를 사먹으면 포인트 누적으로 "회원등급"이 점해짐.
//포인트를 사용하여도 "회원등급"은 누적포인트를 사용하여 변함 없음.
			if(p.getPoint()> 0 && p.getPoint()<10) {
				p.setType("일반 회원");
				System.out.println(p.getType());
			}
			if(p.getPoint()>=10&& p.getPoint()<20) {
				p.setType("브론즈 회원");
				System.out.println(p.getType());
			}
			if(p.getPoint()>=20&& p.getPoint()<30) {
				p.setType("실버 회원");
				System.out.println(p.getType());
			}
			if(p.getPoint()>=30&& p.getPoint()<40) {
				p.setType("골드 회원");
				System.out.println(p.getType());
			}
			if(p.getPoint()>=40) {
				p.setType("왕");
				System.out.println(p.getType());
			}
						
			
		}

	}




