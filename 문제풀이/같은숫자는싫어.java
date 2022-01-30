package 문제풀이;

public class 같은숫자는싫어 {
	// 배열 arr가 주어집니다. 배열 arr의 각 원소는 숫자 0부터 9까지로 이루어져 있습니다. 이때, 배열 arr에서 연속적으로 나타나는
	// 숫자는 하나만 남기고 전부 제거하려고 합니다. 총 몇번을 제거 해야할까요?

	// arr = [1, 1, 3, 3, 0, 1, 1] 이면 3을 return 합니다.
	// arr = [4, 4, 4, 3, 3] 이면 3을 return 합니다.

	// 배열 arr의 크기(배열 길이) : 1,000,000 이하의 자연수
	// 아래 메소드 작성

	public static int solution(int[] arr) {
		int count = 0;// 제거할 횟수
		int firstNum = 0;// 비교할 전 숫자
		int nextNum = 0;// 비교할 다음 숫자
		int len = arr.length;// 배열의 길이
		if (len <= 1000000) {// 배열의 길이는 1,000,000 이하 자연수
			for (int i = 1; i < len; i++) {// for문을 이용한 인덱스 값 비교
				int firstIndex = i - 1;
				// first의 숫자를 비교하기 위하여 for문의 i를 1부터 시작하고 firstIndex를 0번쨰부터 비교해 준다.
				if (arr[i] >= 0 && arr[i] <= 9) {
					// arr[i]는 0~9까지의 자연수
					firstNum = arr[firstIndex];
					// firstNum을 인덱스0번쨰부터 비교하여 증감반복(배열의 길이가 끝날때까지)
					nextNum = arr[i];
					// nextNum은 firstNum다음 숫자를 비교
					if (firstNum == nextNum) {
						// 비교할 전 숫자와 다음 숫자가 같다면
						count++;
						// 카운트 증가 == 총 제거해야할 횟수
					}
				}
			}
		}
		System.out.println(count);
		return count;
	}

	public static void main(String[] args) {
		int array[] = { 4, 4, 4, 3, 3 };
		solution(array);
	}
}
