package 프로그래머스;



public class 숫자_문자열과_영단어 {
	
	public static int solution(String s) {
		int answer = 0;
		String[] words = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
		if(s.length()>=1 && s.length()<=50) {
		for(int i=0; i<words.length; i++) {
			s = s.replace(words[i], String.valueOf(i));
			// int => String으로 변환 메소드 = String.valueOf(변환할 숫자) or Integer.toString(변환할 숫자)
		}
		}
		answer = Integer.parseInt(s);
		
		// String => int로 변환 메소드 = Integer.parseInt(변환할 문자)
		return answer;
	}
	
	public static void main(String[] args) {
		// indexOf 예시
//		String example = "one4seveneightnine";
//		System.out.println(example.indexOf("eight", example.indexOf("eight")+1));
//		// "eight"를 첫번째 찾은 index의 다음 index를 찾는 방법
//		// 결과가 없다면 -1로 출력
		
		
		int solution = solution("nine4seveneightnine");
		System.out.println(solution);
		
		
		
		

	}

}
