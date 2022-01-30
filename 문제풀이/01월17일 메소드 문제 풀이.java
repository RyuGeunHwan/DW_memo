	// 1. 메소드를 활용해서 1~10까지(무조건 for문!!!)의 짝수 출력
	// 조건. 인자값 하고 리턴값이 없음.
	public static void 짝수판단() {
		int count = 0;
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				++count;
				System.out.println(i);
			}
		} return 0;
		}
---
	// 2.메소드를 활용해서 최대값 구하기.
	// 조건. 인덱스 값이 50이 넘으면 최대값 비교를 하지 않습니다.
	// 조건. 배열길이가 5를 넘으면 return 0을 합니다.
	public static int 최대값구하기(int[] array) {
		int max = 0;
		if (array.length > 5)
			return 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] < 50) {
				if (array[i] > max) {
					max = array[i];
				}
			}
		}

		return max;
	}
---
	// 3. 메소드를 활용해서 거스름돈 풀기.
	// 조건. 파라미터값에 만원을 입력하면 만원 몇장
	// 오천원을 입력하면 오천원 몇장을 출력.
	public static int 최대값구하기(String money, int totalMoney) {
		int MAN = 10000;
		int OCHEON = 5000;
		int result = 0;
		if (money.equals("만원")) {// 문자 비교는 equals로 비교
			result = totalMoney / MAN;
			return result;
		}
		if (money.equals("오천원")) {
			result = totalMoney / OCHEON;
			return result;
		}
		return result; 

	}
---
	public static void main(String[] args) {
		// 1.
		짝수판단();

		// 2.
		int[] array = { 3, 6, 2, 1, 51 };
		System.out.println("인덱스 최대값은?" + 최대값구하기(array));

		// 3.
		System.out.println(최대값구하기("만원",50000));
		System.out.println(최대값구하기("오천원",50000));

	}
}
