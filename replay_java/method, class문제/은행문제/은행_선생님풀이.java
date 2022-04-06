
//---- 은행프로그램 개발----
//지유는 총 입금금액, 출금금액, 잔고금액을 보고싶다.
//(주)상원IT에 프로그램개발을 의뢰했다.
//총 입금금액, 출금금액, 잔고금액을
//확인할 수 있게 해야한다.
//조건)
//출금은 현재잔고보다 많은 수 없다.
//한번 입금할 때 50만원 이하로 할 수 있다.
//최종 잔고가 100만원이 넘으면 이자 10%를 지급한다.(잔고  += 최종 잔고 / 10)

package 상속;

class Acconut{//계좌
	int deposit;//입금
	int withdraw;//출금
	int totalMoney;//잔고
	
	//getter,setter
	public int getDeposit() {
		return deposit;
	}
	public void setDeposit(int deposit) {//입금
		if(deposit <= 500000) {
		System.out.println("입금한 금액 => "+deposit+"원 입니다.");
		this.deposit += deposit;//총 입금금액
		this.totalMoney+=deposit;//내 잔액
		}else {
			System.out.println("입금은 500000원 이하로 가능합니다.");
		}
	}
	public int getWithdraw() {
		return withdraw;
	}
	public void setWithdraw(int withdraw) {//출금
	if(this.totalMoney<withdraw) {
		System.out.println("출금할 수 없습니다.");
	}else {
		System.out.println("출금 금액 => "+withdraw+"원 입니다.");
		this.withdraw += withdraw;
		this.totalMoney -= withdraw;
	}
	}
	public int getTotalMoney() {
		return totalMoney;
	}
	public void setTotalMoney(int interest) {// 잔액에서 이자를 더해줌
		this.totalMoney += interest;
	}
	
	
}

public class 선생님풀이Bank {//은행
	
	//이자를 구해주는 함수 생성
	public static double paidInterestOnAccount(int money) {
		final double INTEREST_RATE = 0.1;
		return money * INTEREST_RATE;
	}
	
	
public static void main(String[] args) {
	Acconut acconut = new Acconut();
	acconut.setDeposit(1000);
	if(acconut.getTotalMoney()>0) {
		System.out.println("현재 잔고 ==> "+ acconut.getTotalMoney()+"원 입니다.");
		acconut.setWithdraw(500);
		System.out.println("현재 잔고 ==> "+ acconut.getTotalMoney()+"원 입니다.");
		acconut.setDeposit(500000); //월급 50만원
		acconut.setDeposit(500000); //보너스 50만원
		acconut.setDeposit(500000);	//야근수당 50만원
		System.out.println("현재 잔고 ==> "+ acconut.getTotalMoney()+"원 입니다.");
		int myMoney = acconut.getTotalMoney();
		if(myMoney>= 1000000) {//입금 후 잔액이 백만원 이상이면
			int interestMoney =  (int)paidInterestOnAccount(myMoney);// (int)paidInterestOnAccount의 앞에 int는 형변환을 의미함(double->int)
			System.out.println("이자율 ==> "+ interestMoney+"원 입니다.");
			acconut.setTotalMoney(interestMoney);
			System.out.println("현재 잔고 ==> "+ acconut.getTotalMoney()+"원 입니다.");
		}
	}
}
}
