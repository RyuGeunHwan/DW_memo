        private void getChange(int money) {

		System.out.println("잔돈: " + money + "원");

		int ocheon = 0;
		int cheon = 0;
		int obeak = 0;
		int beak = 0;

		ocheon = money / 5000;
		cheon = money % 5000 / 1000;
		obeak = money % 5000 % 1000 / 500;
		beak = money % 5000 % 1000 % 500 / 100;

		System.out.println("오천원 : " + ocheon);
		System.out.println("천원 : " + cheon);
		System.out.println("오백원 : " + obeak);
		System.out.println("백원 : " + beak);
	}
---
	public static void main(String[] args) {
		연습 getchange = new 연습();
		getchange.getChange(9700);
	}
