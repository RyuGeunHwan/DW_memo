package 프로그래머스;

public class 짝수홀수 {
	// 정수 num이 짝수일 경우 "Even"을 반환하고 홀수인 경우 "Odd"를 반환하는 함수(메소드),
	// solution을 완성해주세요.

	// 1. 정수 num을 받는 파라미터가 있어야 함.
	// 2. return 타입은 String.
	// 3. 메소드 이름은 solution.

	// num : 3, return : "Odd"
	// num : 4, return : "Even"
	public String solution(int num) {
		if (num % 2 == 0) {
			System.out.println("Even");
		} else {
			System.out.println("Odd");
		}
		return "";
	}

	public static void main(String[] args) {
		짝수홀수 s = new 짝수홀수();
		s.solution(3);

	}
}
