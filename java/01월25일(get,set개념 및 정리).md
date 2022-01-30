# 생성자를 실무에서 생성자 대신 사용하는 방법!!!!!!!!!
# get , set 사용!!!
## 일식당VO
```java
package 메소드5일차_생성자;

public class 일식당VO {
	// >>필드변수 접근지정자에 private로 선언<<

	// 1.실무에서 생성자로 필드변수 초기화 잘안함.

	// 2.set,get 함수 이용해서 필드변수 초기화.

	// ##3.set,get 함수가 있는 클래스에는 절대 다른메소드를 정의하지 않는다.##

	// 4. get,set함수가 있는 클래스는 이름 뒤에 
	// **VO(Value Object) or **DTO(Data Transfer Object)를 붙이자! 
	// ex) 일식당VO

	// 보일러 플레이트 코드 : 노가다 작업을 쉽게 해줌.
	// 상단 Source -> Generate getters and setters 클릭
	// -> 우측상단 select All클릭->Generate 클릭
	// 단축키 Alt + Shift + s

	//필드변수
	private String porkCutlet; // 돈까스<-필드변수
	private String price;// 돈까스 가격

	// 돈까스
	// get 함수
	public String getPorkCutlet() {
		return porkCutlet;
	}

	// set 함수
	public void setPorkCutlet(String porkCutlet) {
		this.porkCutlet = porkCutlet;
	}

	// 돈까스 가격
	// get 함수
	public String getPrice() {
		return price;
	}

	// set 함수
	public void setPrice(String price) {
		this.price = price;
	}

}
```
```java
package 메소드5일차_생성자;

public class 일식당호출 {

	public static void main(String[] args) {

		// set(대입)인지 get(호출)인지 구분 잘 하기!!!

		일식당VO a = new 일식당VO();
		// set 메소드 먼저
		a.setPorkCutlet("안심돈까스");// set으로 안심돈까스를 필드변수에 대입.
		// get 메소드로 리턴값 호출(리턴값이 있으면 무조건 변수로 받자!)
		String 돈까스 = a.getPorkCutlet();// set한 필드변수를 get으로 호출.
		System.out.println(돈까스);
		a.setPrice("25000");
		String 돈까스가격 = a.getPrice();
		System.out.println(돈까스가격);

	}

}
//결과출력 -> 안심돈까스 / 25000

```
## KoreaVO
```java
package 메소드5일차_생성자;

public class KoreaVO {
	// KoreaVO 클래스 생성
	// 필드변수 생성

	private String location; // 지역이름
	private String addr; // 주소
	private String name; // 지역 대표자
	private int count; // 지역 수

	// 지역이름
	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	// 주소
	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	// 대표자
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// 지역 수
	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

}
```
```java
package 메소드5일차_생성자;

public class Korea호출 {

	public static void main(String[] args) {
		KoreaVO KV = new KoreaVO();
		KV.setLocation("부산광역시");
		String 지역이름 = KV.getLocation();
		System.out.println(지역이름);

		KV.setAddr("대전광역시 서구 관저동");
		String addr = KV.getAddr();
		System.out.println(addr);

		KV.setName("류근환");
		String 대표자 = KV.getName();
		System.out.println(대표자);

		KV.setCount(15);
		int 지역수 = KV.getCount();
		System.out.println(지역수);

	}

}
// 결과 출력 -> 부산광역시 / 대전광역시 서구 관저동 / 류근환 / 15
```
## UML 보는법
<img width="733" alt="클래스_다이어그램_요소" src="https://user-images.githubusercontent.com/96895717/150724638-c8062250-7fbf-4169-be82-f8013dccc613.PNG">

	*사진속 왼쪽 표의 이름 UML(Unified Modeling Language)
	*통합 모델링 언어.
	*즉, 모델을 만드는 표준 언어.
	*소프트웨어 초기 스케치 작업

	사용하는 이유
	1. 다른 사람들과 의사소통 또는 설계 논의
	2. 전체 시스템 파악
	3. 유지보수를 위한 설계의 back-end 문서

	-는 private
	+는 public

	getSchedule() : Schedule
	*접근 지정자 public
	*리턴 타입 Schedule
	*메소드 이름 getSchedule
	*파라미터 없음

	intriduce(String) : void
	*접근 지정자 public
	*리턴 타입 없음
	*메소드 이름 intriduce
	*파라미터 String

---
# *User UML*
<img width="369" alt="UML_테스트" src="https://user-images.githubusercontent.com/96895717/150738196-36e0aec0-ec0c-4e5b-9fa1-ae18e65a1377.PNG">   

![image](https://user-images.githubusercontent.com/96895717/150738719-0dd0825b-9f80-43ea-9e01-c779e2cdcbaa.png) 

```java
package 메소드5일차_생성자;

public class UserVO {
	private int age;// 나이
	private String name;// 이름
	private String nickName;// 별명
	private String addr;// 주소

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

}
```
```java
package 메소드5일차_생성자;

public class User {
	private int count;

	public boolean setUser(UserVO vo) {
		System.out.println(vo.getNickName());
		System.out.println(vo.getName());
		System.out.println(vo.getAddr());
		System.out.println(vo.getAge());
		return true;
	}

	public int getUserCount() {
		return 0;
	}

	public int updateUser(UserVO vo) {
		return 0;
	}

	public int deleteUser(UserVO vo) {
		return 0;
	}

	public UserVO getUser(int x) {
		return null;
		// 리턴타입에 클래스타입이 왔을때 초기값은 null을 넣어준다.
	}
}
```
```java
package 메소드5일차_생성자;

public class UserCall {
	private User user;

	public static void main(String[] args) {
		User u = new User();// User클래스를 u에 대입
		UserVO vo = new UserVO();// UserVo클래스를 vo에 대입
		vo.setAge(28);
		vo.setAddr("대전 서구 관저동");
		vo.setName("류근환");
		vo.setNickName("나니");
		int 나이 = vo.getAge();
		String 주소 = vo.getAddr();
		String 이름 = vo.getName();
		String 별명 = vo.getNickName();
		System.out.println(나이);
		System.out.println(주소);
		System.out.println(이름);
		System.out.println(별명); 

		// or

		u.setUser(vo);
		//User클래스의 setUser메소드에 UserVO의 데이터를 대입
		// User클래스의 메소드이름이 setUser인 메소드를 불러옴
		// 만약 위에 출력이 없다면 u.setUser(vo);메소드 안의 함수들이 출력됨
		// 이유->User클래스의 메소드이름이 setUser인 메소드안에 출력데이터들이 있기때문에

	}

}
```