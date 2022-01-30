		//money == 총합
        private void getChange(int money) {

		System.out.println("잔돈: " + money + "원");

		int ocheon = 0;
		int cheon = 0;
		int obeak = 0;
		int beak = 0;

		ocheon = money / 5000; 
		//총합 나누기 5000의 몫값
		cheon = money % 5000 / 1000;
		//총합 나누기 5000의 나머지 값 나누기 1000의 몫값
		obeak = money % 5000 % 1000 / 500;
		//총합 나누기 5000의 나머지 값 나누기 1000의 나머지 값 나누기 500의 몫값
		beak = money % 5000 % 1000 % 500 / 100;
		//총합 나누기 5000의 나머지 값 나누기 1000의 나머지 값 나누기 500의 나머지 값 나누기 100의 몫값

		System.out.println("오천원 : " + ocheon);
		System.out.println("천원 : " + cheon);
		System.out.println("오백원 : " + obeak);
		System.out.println("백원 : " + beak);
	}
	//결과출력 오천원 1 / 천원 4 / 오백원 1 /백원 2
---
	public static void main(String[] args) {
		연습 getchange = new 연습();
		getchange.getChange(9700);
	}
