	   //데이터 타입 
		int x = 10;
		int y = 5;
        //1. 변수를 이용해서 결과 값을 받음.
		int result = (x + y);
		//2. 이미 선언된 변수를 재활용
		int z = x / y;  //나누기 할때 몫 값은
		int temp = 10 % 5;  //나머지 값은 %
		System.out.println(z);
		System.out.println(temp);
		int a = 10 * 2; //곱하기 = *
		System.out.println(a);
		
		//애플 주식에 100을 넣음
		int apple = 100;
		int samsung = 1000;
		apple = apple + samsung;
		or
		apple = apple + 1000;
        
        
        //조건1. 변수 선언 X
		//조건2. 사칙 연산을 이용해서 풀것
		int money = 57000;
		int man = 0; //만원
		int ocheon = 0; //오천원
		int temp = 0; //최종 거스름돈
		System.out.println("거스름돈 이전 금액"+ money);
		System.out.println("만원 몇 장"+ man);
		System.out.println("오천원 몇 장"+ ocheon);
		System.out.println("최종 남은 금액은"+ temp);
		
		man = money / 10000;
		System.out.println(man);
		temp = money % 10000;
		System.out.println(temp);
		ocheon = temp / 5000;
		System.out.println(ocheon);
		temp = temp % 5000;
		
		
		//man=5
		man = money / 10000;
		//temp=7000
		temp = money % 10000;
		//ocheon = 1
		ocheon = temp / 5000;
		//temp = 2000
		temp = temp % 5000;
		
		System.out.println("거스름 이전 돈:"+money);
		System.out.println("만원 수:"+man);
		System.out.println("오천원 수:"+ocheon);
		System.out.println("남은 돈:"+temp);
		
		//step1.
		int 콩나물국밥 = 5000;
		int 돼지국밥 = 7000;
		돼지국밥 = 콩나물국밥 + 돼지국밥;
		//돼지 국밥은 얼마 일까요?
		//=>돼지국밥 = 12,000
		
		//step2. 위에서 아래로 해석
		돼지국밥 = 1000;
		//=>돼지국밥 = 1,000
		돼지국밥 = 돼지국밥+돼지국밥;
		//=>돼지국밥 = 2,000
		돼지국밥 = 돼지국밥 * 3;
		//=>돼지국밥 = 6,000
		돼지국밥 = 돼지국밥 + (콩나물국밥 * 3);
		//=>돼지국밥 => 21,000
		
	


