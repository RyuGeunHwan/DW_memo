    // 문제설명
	// 메소드 파라미터에 문자열 배열을 받는다.
	// 배열 인덱스값에 기호가 들어간 문자는 제거한다.
	// 배열 인덱스값을 문자에서 숫자로 변환한다.
	// 인덱스값 중 1번째 인덱스값이 200이하면 100을 리턴. 200 이상이면 200을 리턴 하시오.
	public static int getResult(String[] array) {
		// String x = "";
		// for (int i = 0; i < array.length; i++) {
		// x = array[i].replace("!", "");
		// x = x.replace("$", "");
		// int y = Integer.parseInt(x);
		// if (y <= 200) {
		// return 100;
		// } else {
		// return 200;
		// }
		// }
		return 0;
	}

	public static void main(String[] args) {
		String array[] = { "100", "1!30", "11$0", "200" };
		int result = getResult(array);
		System.out.println(result);
	}
	//결과값 = 100
