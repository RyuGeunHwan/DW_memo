    //문제설명
	// 메소드 파라미터에 정수형 배열을 받는다.
	// 배열 인덱스 값중 짝수인 값은 0으로 대입한다.
	// 단, 인덱스 값중 짝수이고 300이 넘으면 0 대입을 무시한다.



	public static int[] getResult(int[] array) {
		// int x = 0;
		// for (int i = 0; i < array.length; i++) {
		// if (array[i] <= 300) {
		// if (array[i] % 2 == 0) {
		// array[i] = 0;
		// }
		// }
		// }
		return array;
	}

	public static void main(String[] args) {
		int array[] = { 120, 340, 200, 430, 33 };
		int result[] = getResult(array);
		for (int i : result) {
			System.out.print(i + ", ");
		}
	}
    //결과값 = 0, 340, 0, 430, 33, 