package 메소드4일차;

public class 문제초중급_2 {
	//문제.
	//철수의 계좌잔고는 현재 157000이 있다.  
	//은행가서 5만원, 만원, 5천원 으로 교환을 하고 싶다.  
	//157000은 5만원 3장, 만원 0장, 5천원 1장으로 교환이 가능할 것 이다.  
	
	//변수는 아래와 같이 선언.
	//잔고에 20만원이 넘으면 money에 0을 대입하시오.
	public static void main(String[] args) {
	    int money = 157000;
	    final int OMAN = 50000;
	    final int MAN = 10000;
	    final int OCHEON = 5000;
	    //final의 변수는 변수 값을 변경 할 수 없음!
	    //<->
	    //상수는 변수의 내용의 값을 변경 할 수 없음!
	    // int x=0;
	    // int y=0;
	    // int z=0;
	    // if(money>=200000) {
	    // 	money=0;
	    // }else {
	    // 	x = money/OMAN;
	    // 	y = money%OMAN/MAN;
	    // 	z = money%OMAN%MAN/OCHEON;
	    // }
	    // System.out.println("오만원 "+x+"장");
	    // System.out.println("만원 "+y+"장");
	    // System.out.println("오천원 "+z+"장");

        // 결과출력
        // 오만원 3장
        // 만원 0장
        // 오천원 1장


	}

}
