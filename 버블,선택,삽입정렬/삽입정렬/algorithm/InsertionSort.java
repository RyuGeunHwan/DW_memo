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

public class 삽입정렬 {
	
	public static void main(String[] args) {
        // 이중 for문 사용! 
        //삽입정렬을 이용하여 오름차순 정렬!
    		int array[] = {8, 5, 6, 2, 4};
		int len = array.length;
		int temp;
		int i,j;
		for(i=1; i<len; i++) {
			j=i;
			while(j>0 && array[j-1]>array[j]) {
				temp = array[j];
				array[j] = array[j-1];
				array[j-1] = temp;
				j--;
			}
		}
		for(i=0; i<len; i++) {
			System.out.println(array[i]);
		}
	//풀이
	// i는 계속 증감하지만 while문안에 두가지 조건을 다 갖춰야 하기 때문에
	// j가 while문을 돌때 마다 1씩 작아지지만 0보다 크고 
	// [j-1]의 index가 [j]의 index보다 크다면 while문은 계속 반복실행
	
	// for문이 돌아 i가 증감할 때 ++회전수;
		
	// for문 1회전 array[] = {5,8,6,2,4}
		
	// for문 2회전 array[] = {5,6,8,2,4}
	// for문 2회전 까지는 while문 1번씩만 실행 
		
	// for문 3회전 while문 첫번째 실행했을경우 array[]={5,6,2,8,4}
	// for문 3회전 while문 두번째 실행했을경우 array[]={5,2,6,8,4}
	// for문 3회전 while문 세번째 실행했을경우 array[]={2,5,6,8,4}
	// for문 3회전 while문 세번째 실행했을경우 while문의 조건이 false이므로 break;
		//(2가 최솟값이기 때문에 j는 감소하여 0이 되므로 전자 조건부(j>0)가 맞지않음.
	// for문 3회전 while문 전체 실행 후 -> array[]={2,5,6,8,4}
	
	// for문 4회전때는 3회전때와 마찬가지로 j가 감소하며 while문 반복실행
		// 3회전 때와의 차이점 while문의 조건부 중에 전자 조건부가 아닌 
		// 후자 조건부(array[j-1]>array[j])로 인해 j가 2까지 갔을 때 while문 break;
		// 4회전때 j가 2일 경우 후자 조건부 => 2 > 4 이므로 실행X
	// for문 4회전 while문 전체 실행 후 -> array[]={2,4,5,6,8}	
		
		
	// 의문점...선택정렬과 무엇이 다른가....


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

            // 삽입될 위치에 temp 삽입
            array[i] = temp;
        }
       for(int i=0; i<array.length; i++) {
    	   System.out.println(array[i]);
       }
    }
}

