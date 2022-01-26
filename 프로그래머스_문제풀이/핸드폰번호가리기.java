package 프로그래머스;

public class 핸드폰가리기 {
	// 전화번호가 문자열 phone_number로 주어졌을 때,
	// 전화번호의 뒷 4자리를 제외한 나머지 숫자를
	// 전부 *으로 가린 문자열을 리턴하는 함수(메소드), solution을 완성해주세요.

	// 1. 문자형(String) phone_number을 받는 파라미터가 있어야 함.
	// 2. return 타입은 String.
	// 3. 메소드 이름은 solution.
	// 4. 특정문자 추출 메소드를 사용할 것.
	// 5. 문자길이 구하는 메소드는 length() 입니다.

	// String str = "ABCDEFG";
	// str.substring(0, 3);
	// /* substring(int, int) : String
	// 결과값 : ABC
	// 모든 문자 순서는 0부터 시작합니다.
	// (0, 3)의 의미는 0번째 A부터 3번째 D 이전까지 문자를 자르겠다 라는 의미 입니다.
	// (0, 100) 처럼 마지막 정수를 문자 길이 이상 만큼 지정하면 오류 발생. */

	// phone_number : "01033334444", return : "*******4444"
	// phone_number : "027778888", return : "*****8888"
	public String solution(String phone_number) {
		String answer = "";
		int COUNT = 4;
		int phoneNumberLen = phone_number.length();
		int change = phoneNumberLen - COUNT;
		String firstAndSecondPhoneNumber = phone_number.substring(0, change);
		String lastPhoneNumber = phone_number.substring(change, change + COUNT);
		String star = "";
		for (int i = 0; i < firstAndSecondPhoneNumber.length(); i++) {
			star += "*";
		}
		answer = star + lastPhoneNumber;
		return answer;

	//		 배열사용
	//		String answer = "";
	//		String number[] = phone_number.split("");for(
	//		int i = 0;i<number.length;i++)
	//		{
	//			if (i < (number.length - 4)) {
	//				answer += "*";
	//			} else {
	//				answer += number[i];
	//			}
	//			return answer;
	//		}
	}

	public static void main(String[] args) {
		핸드폰가리기 phone = new 핸드폰가리기();
		String phone_number = "01053064635";
		phone.solution(phone_number);
		System.out.println(phone.solution(phone_number));
	}
}
