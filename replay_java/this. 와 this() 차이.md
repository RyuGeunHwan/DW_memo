# this. 와 this() 차이
```
this.전역변수 == 해당 클래스를 의미하는 것.
this(매개 변수) == 오버로딩을 의미하는 것.
```
```java
package 개인연습;

public class Flag {
	String 이름 = "한사장";
	int 나이 = 90;
	boolean isHugry = false;
	
	Flag(String name, int age, boolean isHungry){
		//아래 3줄의 중복코드가 발생함.
		this.이름 = name;
		this.나이 = age;
		this.isHugry = false;
	}
	
    //name,age
	Flag(String name, int age){
		//this()용법사용
		this(name, age, false);
	}

	//name
	Flag(String name){
		//this()용법사용
		this(name, 1, false);
	}
	

	Flag(){
		//아무 코드도 없으면 기존 멤버변수값(class의 필드변수를 말함)이 출력된다.
	}
	
	public static void main(String[] args) {
        //name,age
		Flag p1 = new Flag("하지", 3);
		System.out.printf("이름 : %s, 나이 : %d%n", p1.이름, p1.나이);
		
        //name
		Flag p2 = new Flag("뽀니");
		System.out.printf("이름 : %s, 나이 : %d%n", p2.이름, p2.나이);
		
		Flag p3 = new Flag();
		System.out.printf("이름 : %s, 나이 : %d%n", p3.이름, p3.나이);
	}
}

```