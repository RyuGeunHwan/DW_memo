package 컬렉션즈;

import java.util.ArrayList;

public class ArrayList_study {

	public static void main(String[] args) {
		
		//ctrl + shift + o (단축키 = ArrayList사용 한다는것)
		ArrayList<String> list = new ArrayList<String>(); //() = 생성자를 의미한다.
		// ArrayList<> = 클래스
		
		//add : 데이터를 list에 삽입
		list.add("시금치 파스타");
		list.add("곱창 파스타");
		list.add("곱창 파스타");
		list.add("곱창 파스타");
		list.add("곱창 파스타");
		
//		int len = list.size(); // list.size() = list의 길이 호출
//		System.out.println("list 길이는 ===> "+ len);
		
//		String value = list.get(0); // list.get() = list의 index내용을 호출
//		System.out.println(value);
		
		// 문제 : list에 저장된 곱창 파스타는 몇개?
		int count = 0;
		for(int i=0; i<list.size(); i++) {
			String value = list.get(i);// list.get(index번호)
			System.out.println(value);
			if(list.get(i).equals("곱창 파스타")) {
				// 자바는 문자 비교할때 == 사용X, ***equals 사용O
				count++;
			}
		}
		System.out.println(count);
		
		
		//int를 담는 ArrayList
		//Integer = int형의 클래스타입
		ArrayList<Integer> list2 = new ArrayList<Integer>(); //()생성자

		list2.add(10);//add = list에 index추가
		list2.add(40);
		list2.add(60);
		list2.add(80);
		list2.add(30);
//		list2.remove(1); //.remove(index번호) => list의 index삭제
		
		// 문제1. list2에 추가된 총합 구하기(40제외)
		int sum = 0;
		for(int i=0; i<list2.size(); i++) {
			int value = list2.get(i); // 여기서 알 수 있는 것은 클래스 타입인(Integer)가 아닌 int형 변수에도 대입을 할 수 있다.
			if(value != 40) {
			sum += value;
			}
		}
		System.out.println("40을 제외한 총합은? "+sum);
	}

}
