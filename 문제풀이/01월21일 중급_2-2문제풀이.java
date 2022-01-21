package 메소드_3일차;

public class 문제중급_2_2 {
	// 문자열 평균구하기
	// 점수중에 100점이 있다면 "100점 만점에 100점!" 출력.
	// 평균 소수점 무시. (int형으로 받을 것)

	public static void main(String[] args) {
		String scores = "80, 70, 100, 31";
		// String result = scores.replace(" ", "");
        // // 방법 두번째!!! (배열로 먼저 나눈뒤 배열[i]는 앞뒤 공백이니 trim을 쓰는 방법도 있음)
		// String array[] = result.split(",");

		// int len = array.length;
		// int sum = 0;
		// int avg = 0;
		// int score = 0;

		// for (int i = 0; i < array.length; i++) {
		// 	score = Integer.parseInt(array[i]);// 문자가 숫자로 안바뀐 이유는 문자 중간중간 띄어쓰기가 있어서!!!
		// 	sum += score;
		// 	len = array.length;
		// 	avg = sum / len;
		// 	if (array[i].equals("100")) {
		// 		System.out.println("100점 만점에 100점!");
		// 	}
		// }
		System.out.println("총점 : " + sum);
		System.out.print("평균 : " + avg);

        //결과출력
        //100점 만점에 100점!
		//총점 : 281
		//평균 : 70
	}

}
