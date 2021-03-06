>JAVA  
-목적  
>1. 프로그램을 만들기 위해서 코딩  
>2. 프로그램 데이터가 있으니까 변수라는 개념을 이용해서 데이터를 대입  
>3. 숫자=int, 문자=string (데이터 타입) X(변수 이름) =(대입) 데이터;  
>4. 변수를 너무 많이 사용하면 자바 메모리가 꽉차서 변수는 재활용 가능 한것  
>5. 컴퓨터는 오른쪽에서 왼쪽 순서대로 읽음, 위에서 아래로 읽음  

        // 문제1.
		// A학점 100~91
		// B학점 80~89
		// C학점 70~79
		// D학점 69 이하
		int myScore = 67; // C학점
		// if은 () 안에 조건이 와야한다.
		// ex)if(만약에 내가 ~~이라면) syso("~~")로 나타내줘!
-----------------------------------------------------------------------------

        // 문제4.
		// 프로그램조건
		// 1.조건 if/else로 풀것
		// 2.변수선언은 한번만!
		// 3.사칙연산을 이용해서 풀 것
		// 4. 사칙연산 중에 %을 사용 할 것
		int value = 100;
		// 짝수인지 홀수인지 구별하는 프로그램 구현!!
-----------------------------------------------------------------------------

        //짝수홀수 프로그램
		Scanner scan = new Scanner(System.in); //ctrl + shift + o
		// 프로그램조건
		// 1.조건 if/else로 풀것
		// 2.변수선언은 한번만!
		// 3.사칙연산을 이용해서 풀 것
		// 4. 사칙연산 중에 %을 사용 할 것
		System.out.print("숫자를 입력하세요==>");
		int value = scan.nextInt();
		// 짝수인지 홀수인지 구별하는 프로그램 구현!!
		if ((value % 2) == 0) {
			System.out.println("짝수입니다.");
		} else {
			System.out.println("홀수입니다.");
		}

-----------------------------------------------------------------------------
        int num = 30 ;
		if(num==20) {
			System.out.println("Hello");
		}else if(num==40) {//조건식을 한번 더 사용, else if=if가 아니라 ~라면
			System.out.println("Hello World");
		}else{ 
			System.out.println("Hello Worlds");
		}
-----------------------------------------------------------------------------		
		//90점 초과 A, 80점 초과 B, 70점 초과 C, 70점 이하 F
		int score = 88;
		if (score > 90) {
			System.out.println("A");
		}else if (score <= 90 && score >80) {
			System.out.println("B");
		}
		else if (score <= 80 && score >70) {
			System.out.println("C");
		}else {
			System.out.println("F");
		}
		
-----------------------------------------------------------------------------		
		
		int value = scan.nextInt();
		//점수가 90점 이상이면 A
		//점수가 95점 이상이면 S
		//조건 1.if/else를 사용할 것 
		if(value >= 90 && value < 95) {
			System.out.println("A등급");
		}
		if(value >= 95 && value <= 100) {
			System.out.println("S등급");
		}
-----------------------------------------------------------------------------		
		// 문제 : 1~100 사이 숫자를 입력할것
		// 조건 : 100이 넘어가면 100이 넘었습니다 출력
		// 조건 : 1~100안에 있는 숫자면 2의 배수인지 3의 배수인지 출력
		// 조건 : if/else를 사용할것, 사칙연산을 사용할것, 변수는 value만

	    if (value >= 101) {
			System.out.println("100이 넘었습니다.");
		} else {
			if ((value % 2) == 0)
				System.out.println("2의배수");
			if ((value % 3) == 0)
				System.out.println("3의배수");
		}


#        =


		if (value <= 100) {
			// 2의배수 3의배수
			if ((value % 2) == 0)
				System.out.println("2의배수");
			if ((value % 3) == 0)
				System.out.println("3의배수");
		}else {
			if(value > 100)
			System.out.println("100이 넘었습니다.");
		}
---
        // 반복문=for(int i)->for안의 변수 i는 정해진 룰
## for문 무엇에서~ 무엇까지! 일 경우 for문을 사용한다.

		// (if/else) , (반복문)
		// 코드의 중복을 제거하고자 반복문 등장!
		// for(int i=0) i는 0으로 한다.
		// (int i=0; i<10; ++i)
		// ##1. int i = 0 (초기문 or 선언문), 첫번째 실행
		// ##2. i < 10;(조건식), 두번째 실행(i의 조건식에 충족 할때까지 계속 실행)
		// ##3. ++i(반복 작업식), 마지막 실행
		// ##4. for(int i = 0; i < 10; ++i){코드들...}, 중괄호안에 있는 코드들을 세번째로 실행
		for (int i = 0; i < 10; ++i) {// i를 1씩 증가 시켜 10미만까지 반복하겠다.
			System.out.println("i=>" + i);
		}
---        
		// 문제1.
		// 1~10까지의 짝수를 판별
		// 조건. for문 사용
		for (int i = 1; i <= 10; ++i) {
			if ((i % 2) == 0) {
				System.out.println("짝수는?" + i);
			}
		}
		for (int i = 1; i <= 20; ++i) {
			if ((i % 2) == 0)
				System.out.println("구구단 2단은?" + i);
		}

		for (int i = 1; i <= 30; ++i) {
			if ((i % 3) == 0)
				System.out.println("구구단 3단은?" + i);
		}
---
		// 조건. for문과 if문을 사용할 것
		// 조건. 변수는 딱 2번만 허용(for문안에 있는 i는 변수 제외)
		// 문제1. 1~10까지 중 짝수, 홀수 출력
		// 문제2. 1~100까지 중 짝수가 몇개인지 출력
		// 문제3. 1~10 총합은?
		// 문제1.
		for (int i = 1; i <= 10; ++i) {
			if ((i % 2) == 0) {
				System.out.println("짝수" + i);
			} else {
				System.out.println("홀수" + i);
			}
		}

		for (int i = 1; i <= 10; ++i) {
			if ((i % 2) == 0) {
				System.out.println("짝수" + i);
			} else {
				System.out.println("홀수" + i);
			}
		}
---
		// 문제2. 1~100까지 중 짝수가 몇개인지 출력
		// 문제2.
		int 짝 = 0;
		for (int i = 1; i <= 100; ++i) {
			if ((i % 2) == 0) {
				짝++;
			}
		}
		System.out.println("짝수는 몇개인가 " + 짝);
		
---		
		// 문제3. 1~10 총합은?
		// 문제3.
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			sum = i+sum;
		} 
		System.out.println("총합은" + sum + "입니다.");