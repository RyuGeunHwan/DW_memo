package 프로그래머스;

public class 평균구하기 {
	
//	정수를 담고 있는 배열 arr의 평균값을 return하는 함수, solution을 완성해보세요.
//	
//	1. 정수형 타입 배열이 파라미터에 있어야 함.
//	2. return 타입은 double.
//	3. 메소드 이름은 solution.
//	4. int형으로 나누면 소수점이 무시됩니다
//
//	arr : [1,2,3,4], return : 2.5
//			arr : [5,5], return : 5
	public double solution(int []arr) {
		double sum = 0;
		double avg = 0;
		for(int i=0; i<arr.length; i++) {
			sum+=arr[i];
			avg = sum/arr.length;
		}
		return avg;
	}
	
	public static void main(String[] args) {
		평균구하기 avg = new 평균구하기();
		int array[] = {5,5};
		System.out.println(avg.solution(array));
	}
}
