# 인터페이스(= interface)(기본 설계도)

```
(인터페이스 안에 추상메서드는 로직구현X, 선언만O)
1. 데이터를 제공하는 규격(공통기능을 제공하는 것)

2. *** 인터페이스는 다중상속을 제공

3. 인터페이스를 상속받으면 무조건 오버라이딩을 해야한다.(인터페이스를 상속하는 클래스가 있다면 무조건 서브클래스에 구현을 하여야한다.)
4. 인터페이스 안에 있는 모든 메소드는 모두 추상메소드(public abstract : 생략가능)이다.
5. 인터페이스 안에 있는 모든 필수 변수는 public static final 이어야하며, 생략할 수 있다.
6. 추상메소드는 public이어야 한다.(private X)

7. *** 인터페이스도 인스턴스화(new 호출) 불가능.
	7-1) ***인터페이스는 인스턴스화할 수 없지만 인터페이스를 상속받은 클래스(서브클래스)를 이용하면 인스턴스화가 가능하다.
	ex) UserServiceImple(인터페이스) service = new UserService()(interface인 UserServiceImple을 상속받는 클래스);
		(인터페이스명 뒤에는 "Imple"이라는 단어를 붙여 준다.)

8. 어떠한 클래스가 인터페이스를 상속할 경우에는 extends가 아니라 implements라는 키워드 사용!
	단, 인터페이스끼리 상속을 할 경우에는 일반클래스끼리 상속할 때 처럼 extends를 사용한다!
9. 인터페이스의 접근지정자는 아예 없거나 public이거나 아님 abstract만 가능하다.
10. 클래스가 다른 클래스를 상속하면서 인터페이스를 구현(상속)하는 것도 가능하다.
	10-1) 이럴 경우에는 클래스를 상속하는 extends먼저 선언 후 다음으로 implements를 선언한다.
	ex) public class1 extends class2 implements interfaceImple
```

```
ex)
A 프로젝트 :
과장 1명(테이블설계, 인터페이스 설계, 클라이언트 요구사항 정리)
        (코드 구현 : 핵심 로직만)
대리 1명(소스통합 & 배포)
사원 2명(코드 구현)
```

```java
//서비스를 제공해주는 기능 제공
public interface ServiceImple {
// 인터페이스 안에 있는 모든 메소드는 모두 추상메소드이다.
// 추상메소드는 public이어야 한다.
	public abstract void 라면끓이는방법(); //추상메소드
	void 찌개끓이는방법();// public abstract는 생략가능. why? 인터페이스 안에 있는 메소드는 모두 추상메소드이기 때문에.
}
```

```java
public interface UserImple { //interface를 알 수 있는 것은 iterface이름에 Imple이라는 단어가 있다.
	void 요리를맛보다();
	void 요리를평가하다();
}
```

```java
package 추상화;

public class 백종원의요리교실 implements ServiceImple, UserImple{
	//implements interface이름 = interface를 상속
    // implements : interface를 상속하는 키워드( == extends)

	@Override
	public void 라면끓이는방법() {
		// TODO Auto-generated method stub

	}

	@Override
	public void 찌개끓이는방법() {
		// TODO Auto-generated method stub

	}

	@Override
	public void 요리를맛보다() {
		// TODO Auto-generated method stub

	}

	@Override
	public void 요리를평가하다() {
		// TODO Auto-generated method stub

	}
}

```
