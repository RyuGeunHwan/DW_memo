package 프로그래머스;

import java.util.Scanner;

public class 직사각형별찍기 {
	// 이 문제에는 표준 입력으로 두 개의 정수 n과 m이 주어집니다.
	// 별(*) 문자를 이용해 가로의 길이가 n, 세로의 길이가 m인 직사각형 형태를 출력해보세요.
	//
	// 1. n과 m은 각각 1000 이하인 자연수입니다.
	// 2. System.out.print()를 사용하면 가로로 출력됩니다.(한줄로 쭉 작성)
	// 3. System.out.println()는 개행문자(엔터를 입력한 것 처럼).

	// a : 5, b : 3
	// *****
	// *****
	// *****
	// a : 2, b : 2
	// **
	// **

	// int x = 10;
	// int y = 10;
	// System.out.print(x);
	// System.out.print(y);
	// //결과 1010
	// System.out.println(x);
	// System.out.println(y);
	// /* 결과
	// 10
	// 10
	// */
    
	public static void main(String[] args) {
		int n = 5;
		int m = 3;
		String x = "";
		String y = "";
		System.out.println("x: " + m + " y: " + n);
		if (n <= 1000 && m <= 1000) {
			for (int i = 0; i < m; i++) {// 세로 줄 = x축
				x = "*";
				for (int j = 1; j < n; j++) {// 가로 줄 = y축
					y = "*";
					System.out.print(y);
				}
				System.out.println(x);
			}
		}
	}
	
	//	 프로그래머스 직사각형 별찍기
	//	class Solution {
	//		public static void main(String[] args) {
	//			Scanner sc = new Scanner(System.in);
	//			int a = sc.nextInt();
	//			int b = sc.nextInt();
	//			for (int i = 0; i < b; i++) {
	//				for (int j = 0; j < a; j++) {
	//					System.out.print("*");
	//				}
	//				System.out.println("");
	//			}
	//		}
	//	}

}
