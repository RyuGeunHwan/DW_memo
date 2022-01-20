	// 문제설명
	// 철수는 명부작성에 이름과 온도를 쓰려고 한다.
	// 해당 명부에는 1페이지에 10명만 작성할 수 있다.
	// 명부에 58명이 작성했다고 가정하면 총 몇 페이지 명부가 작성되었을까?
	//
	// 제한사항
	// 아래 메소드 생성
	// 명부는 100명 이하까지 작성 가능합니다.
	// calcPage()함수 코드라인 10줄 이하로 작성.

	public static int calcPage(int totalCount, int rows) {
		// 근환이 풀이
		// int x = 0;
		// int y = 0;
		// int temp = 0;
		// int pages = 0;
		// if (totalCount <= 100) {
		// x = totalCount / rows;
		// y = totalCount % rows //8
		// y = rows/temp;
		// pages = x+y;
		// return pages;
		// }
---
		// 선생님 풀이
		// int totalPage = 0; //메소드 리턴값 변수
		// if(totalCount <= 100) {
		// //로직구현
		// totalPage = totalCount / rows;//5
		// if((totalCount % rows) >0){
		// ++totalPage;//5+1
		// return totalPage;
		// //풀이!!!
		// //totalCount % rows=8은 0보다 크니까 {} 실행
		// //totalPage가 5였고 아래 if절의 ++totalPage는 5+1이 되므로
		// //totalPage 총6페이지가 된다.
		// }
		//
		// }

		return 0;
	}
---
	public static void main(String[] args) {
		int totalCount = 58; // 총 인원값
		int rows = 10; // 1페이지에 작성할 수 있는 기준값
		int pages = calcPage(totalCount, rows);
		System.out.println(pages + " 페이지");
	}
	//결과값 = 6 페이지