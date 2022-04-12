# Hash Map

# Hash -> entry,set,get,values 구글링해보기!

```
1. Hash란?
    key와 Value()로 이루어진 자료구조(json하고 같음)
    key 중복X
```

```java
package 컬렉션즈;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

class OneSoju extends Object{
//class OneSoju는 디폴트로 Object를 상속받는다.
}

public class Hash_Study {

	public static void main(String[] args) {

		//import -> ctrl + shift + o
		HashMap<String,String> map = new HashMap<String,String>();
		//HashMap
		//<String,String> == <key , value>

        // <key , value> == <"1" , "참이슬">
		map.put("1", "참이슬");//HashMap에 데이터 넣는 방법 = put()
		map.put("2", "처음처럼");
		map.put("a", "한라산");

		// map의 접근 방법 = get("map의 key값")
        // get은 호출 함수, 호출할 때는 key값으로 호출(json과 같음)
        // 지정된 key의 값(없으면 null)을 반환한다.
		System.out.println(map.get("1"));
        //결과값 : key값이 "1"인 HashMap의 value = "참이슬"을 출력

		// 문제1. 한라산 출력하기
		System.out.println(map.get("a"));
        //결과값 : key값이 "a"인 HashMap의 value = "한라산"을 출력



		// Object
		//<String,Object> == <key , value>
		HashMap<String,Object> map2 = new HashMap<String,Object>();
		//HashMap Value에 Objext를 하는 이유!
		// 1.Value에 어떤 값(데이터타입)이 올지 예상불가능하기 때문에
		// 		그래서 Object로 데이터타입을 모두 받을 수 있게 만들어준다.

        OneSoju onesoju = new OneSoju();

        //put = 지정된 키("b")와 값(13)을 저장한다.
		map2.put("b", 13);
		map2.put("1", "참이슬");
		map2.put("2", "처음처럼");
		map2.put("a", "한라산");
		map2.put("b", onesoju);
		// value값에 타입이 클래스인 onesoju를 받을 수 있었던 이유는
		// 모든 클래스는 디폴트로 Object를 상속받는다.(class OneSoju extends Object{ })
		System.out.println(map2.get("b"));
		//객체지향언어에서 모든 클래스의 부모는 Object이다.
	}

}
```

## 실무에서 사용하는 방법

```java
		//실무에서 사용하는 ArrayList<> , HashMap<> 사용방법

		//ArrayList<>
		List<String> list = new ArrayList<String>();
		list = new LinkedList<String>();
		// List는 최상위부모이기 때문에 list라는 변수를 재활용하여 자식들을 활용 할 수 있기때문에
		// 	실무에서는 List<>를 사용하여 준다.

		//HashMap<>
		Map<String,Object> map = new HashMap<String,Object>();
        // Map는 최상위부모이기 때문에 map라는 변수를 활용하여 자식들을 활용 할 수 있기때문에
		// 	실무에서는 Map<>을 사용하여 준다.
```
