package 컬렉션즈;

import java.util.ArrayList;

class Student{
	String name;
	int age;
	String addr; //사는 곳
	
	public Student() {//기본 생성자
		
	}
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}
	//생성자는 클래스 이름과 동일하여야한다.
	public Student(String name, int age, String addr) { //파라미터가 있는 생성자
		// this == Student
		this.name = name;
		this.age = age;
		this.addr = addr;
	}
	
	public int setAge(int age) {
		this.age = age;
		return this.age;
	}
	
	public int getAge() {
		return this.age;
	}
	
}

public class ArrayList_study2 {

	public static void main(String[] args) {
//		Student s2 = new Student("류근환", 27);
//		ArrayList<Student> list2 = new ArrayList<Student>();
//		list2.add(s2);
//		String myName = list2.get(0).name;
//		int Myage = list2.get(0).age;
//		list2.get(0).setAge(20);
//		int studentAge = list2.get(0).getAge();
//		System.out.println(myName);
//		System.out.println(Myage);
//		System.out.println(studentAge);
//		System.out.println("*************************************************");
//		
		
		
	Student s1 = new Student("홍길동", 26, "부산");//오버로딩
	Student s2 = new Student("류근환", 27);//오버로딩
	
	// 컬렉션즈로 Student클래스 대입
	ArrayList<Student> list = new ArrayList<Student>();
	list.add(s1); // Student클래스 추가!
	//list 0번째에 s1(Student)클래스를 통째로 추가!
	list.add(s2);
	//list 0번째에 s2(Student)클래스를 통째로 추가!
	
	String myName = list.get(1).name;
	int myAge = list.get(1).age;
	list.get(1).setAge(10);//setAge메소드를 통해 필드변수 age를 10으로 바꿔주기
	int studentGetAge = list.get(1).getAge();
	System.out.println(myName);
	System.out.println(myAge);
	System.out.println(studentGetAge);
	System.out.println("*************************************************");
	
	String name = list.get(0).name; // Student클래스의 필드변수 name을 불러옴!
	int age = list.get(0).age; // Student클래스의 필드변수 age을 불러옴!
	String addr = list.get(0).addr; // Student클래스의 필드변수 addr을 불러옴!
	System.out.println(name);
	System.out.println(age);
	System.out.println(addr);
	
	// list 0번째에 있는 index = s1(Student 클래스)안에 있는 setAge함수
	list.get(0).setAge(15);
	int getAge = list.get(0).getAge(); // Student클래스에 있는 메소드(함수) 불러옴!
	System.out.println(getAge);
	
	}
	
	

}
