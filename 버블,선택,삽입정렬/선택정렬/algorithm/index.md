// 자바스크립트 or 자바 선택해서 풀 것!
// 선택정렬을 이용해서 오름차순으로 정렬해보자.
// 선택정렬 관련해서 서치는 좋지만 코드는 직접 풀어봐요! 과정을 중요시 생각합니다 :)

# 선택정렬, 버블정렬

## 배열을 이용한 로직들은 경험을 하면 할 수록 좋음.(다다익선)

```
1. ***단순하고 비효율적이다.(성능이 좋지는 않다.)
```

```java
	package test;

public class 선택정렬 {

	public static void main(String[] args) {
		int array[] = {9, 6, 7, 3, 5};
		boolean isChange = false; // 회전 여부 판단!(처음부터 정렬이 되어있던 배열이라면 for문의 실행여부를 판단하기 위해서
		// 4회전을 해야하는구나.
		// 1회전 : 4번 배열값 체크하면서 최솟값을 찾자!
		// 최솟값을 찾아 회전마다 최솟값을 array[i]에 대입!
		// 회전을 할 때마다 i는 증가하고 j = i+1이기 때문에 비교하는 값이 점점 뒤로 갈 수록 줄어든다.
		// if(isChange)는 최솟값이 있어서 isChange가 true이면 if문 실행하여 최솟값을 앞으로 대입하는 로직이다!

		for(int i=0; i<(array.length-1); i++) {//4회전 세팅완료!
			int min = array[i]; // 0번째 원소를 초기값으로 세팅!
			int index = 0; //최솟값 위치변수.
			for(int j=i+1; j<array.length; j++) {
				if(array[j]<min) {
					min = array[j];
					index = j;
					isChange = true; // 최솟값이 있음!
				}
			}// j for end
			if(isChange) {// 최솟값이 있다면 if문 실행!
				int temp = array[i];
				array[i] = min;
				array[index]=temp;
			}
			System.out.println(array[i]);
		}// i for end

//		//최솟값을 구하기위해서 min에 배열0번째를 넣었기 때문에 i가 0부터 시작할 필요가 없다.
//		int min = array[0];// 최솟값을 구하기위해 비교할 수 있는 값을 넣어준다.
//		for(int i=1; i<array.length; i++) {
//			if(array[i]<min) {
//				min=array[i];
//			}
//		}
//		System.out.println(min);
	}
	}


```
