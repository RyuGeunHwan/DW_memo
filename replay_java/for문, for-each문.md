# for문,for-each문

```java
package test;

import java.util.ArrayList;
import java.util.List;

class Pizza{
	public String pizzaName;
	public int pizzaMoney;
}


public class 긴급점검11 {

	public static void main(String[] args) {

		//for문, for-each문

				int array[] = {10, 20};

				//for문
				//1. 조건식O
				//2. 변수에 대입해주고 출력
				for(int i=0; i<array.length; i++) {
					int x = array[i];
					System.out.println("for문 ==> "+x);
				}

				//for-each문
				//1. 조건식 생략
				//2. 변수에 바로 대입
				for(int i:array) {
					System.out.println("for-each문 ==> "+i);
				}

				List<Pizza> pizzaList = new ArrayList<Pizza>();
				Pizza p1 = new Pizza();
				p1.pizzaMoney = 1000;
				p1.pizzaName = "불고기피자";

				Pizza p2 = new Pizza();
				p2.pizzaMoney = 2000;
				p2.pizzaName = "불고기치즈피자";

				pizzaList.add(p1);
				pizzaList.add(p2);


		//문제1. for문을 이용해서 피자이름과 피자가격을 출력할 것!
		for(int i=0; i<pizzaList.size(); i++) {
			int pizzaMoney = pizzaList.get(i).pizzaMoney;
			String pizzaName = pizzaList.get(i).pizzaName;
			System.out.println("pizza for문 ==> "+pizzaMoney);
			System.out.println("pizza for문 ==> "+pizzaName);
		}

		//문제2. for-each문을 이용해서 피자이름과 피자가격을 출력할 것!
		// list == pizzaList.get(i) 일반for문의 i가 붙은것과 같다.
		// List의 데이터 타입은 Pizza라는 클래스이기 때문에 list의 데이터 타입을 Pizza라는 클래스로 맞춰주어야한다.
		for(Pizza list : pizzaList) {
			int pizzaMoney = list.pizzaMoney;
			String pizzaName = list.pizzaName;
			System.out.println("pizza for-each문 ==> "+pizzaMoney);
			System.out.println("pizza for-each문 ==> "+pizzaName);
		}


		List<String> list = new ArrayList<String>();
		list.add("콩나물국밥");
		list.add("소머리국밥");
		// for-each문으로 출력할 것.
		// list == kukbab.get(i)
		for(String kukbab : list) {
			System.out.println(kukbab);
		}
	}

}

```
