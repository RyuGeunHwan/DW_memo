package 삽입정렬;

public class 선생님정렬 {

	public static void main(String[] args) {
		int array[] = {8, 5, 6, 2, 4};
		
		for(int i=0; i<(array.length-1); i++){ //4회전=> index의 길이가 5이기 떄문에 -1을 해준다.
			for(int j=i+1; j>0; j--){
				// j는 i다음 index와 비교할 수 있도록해줌
				// 회전수가 올라 갈 수록 i와j의 수도 올라 가겠지만 j--로 인해 inner-for는 결국 0번째 index까지 비교!
				if(array[j] < array[j-1]){
					//  array[j-1] == 비교대상 중 앞index , array[j] == 비교대상 중 다음index
					// j-1은 결국 i와 같지만 i를 사용 하지 않는 이유는 inner-for가 반복될때마다 값이 다른것들을 비교해야하는데 i로
					// 작성할 경우 outer-for에 있는 값(==array[i])이 고정되기 때문에
					int temp = array[j];
					array[j] = array[j-1];
					array[j-1] = temp;
					// 16,17,18행의 로직은 선택정렬과 같은 구문!
				}
			}
		}
		
		for(int i : array){
			System.out.print(i+" ");
		}
	}
}
//결과값 : 2 4 5 6 8