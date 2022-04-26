//이중for문, while문, 배열swap 서치해서 설명 작성하기, 알아보기
// 알아두어야 할 개념
	// 1. swap : swap(list, int i, int j)
	//			1-1) list : 교환이 필요한 배열 or list
	//			1-2) i : 교환할 인덱스
	//			1-3) j : 교환할 인덱스
	//			1-4) j : list에서 i와 j를 교환하다.
	
	// 2. while(조건문) : while 조건문안에 조건이 만족할 때 까지 계속에서 반복한다. 

package 삽입정렬;
// 버블정렬, 선택정렬, 삽입정렬 중에 성능이 제일 좋은 정렬은 삽입정렬이다.

public class InsertionSort {
	
	public static void main(String[] args) {
        // 이중 for문 사용! 
        //삽입정렬을 이용하여 오름차순 정렬!
		int array[] = {8, 5, 6, 2, 4};
	int len = array.length;
		int temp;
		int i,j;
		for(i=1; i<len; i++) {
			temp = array[i];
			for(j=i-1; j>=0; j--) {
				if(temp>array[i])
					break;
				array[i] = array[j];
			}
			array[i] = temp;
			System.out.println(array[i]);
		}
		        		
	// 이중for문 사용 i와 j를 비교하여 j가 작으면 j를 한칸 앞으로 i는 뒤로 한칸 미룬다.(j=i+1)
	// 단, j는 감소하면서 앞에 인덱스가 작은 수라면 계속 앞으로 가고 큰수는 한칸씩 뒤로 미룬다.
	}
}



// while문 사용한 삽입정렬 예제
package 삽입정렬;

public class 삽입정렬 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = {8, 5, 6, 2, 4};
        // 첫 번째 값은 정렬이 됐다고 생각하고 두 번째 인덱스 부터 정렬 시작
       for (int i = 0; i < array.length; i++) {
            // 현재 정렬대상 값
            int temp = array[i];
            // 1. 이미 정렬된 배열에서 현재 정렬대상 값이 삽입될 위치(인덱스)를 찾는다.
            // 2. 현재 정렬대상 값보다 큰 값은 뒤로 한 칸식 이동된다.
            while( (i > 0) && (array[i - 1] > temp) ) {
                array[i] = array[i -1];
                i--;
            }

            // 삽입될 위치에 tmp 삽입
            array[i] = temp;
        }
       for(int i=0; i<array.length; i++) {
    	   System.out.println(array[i]);
       }
    }
}

