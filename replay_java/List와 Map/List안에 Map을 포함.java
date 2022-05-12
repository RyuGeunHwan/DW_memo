package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

class EmpVO{
	private int empNo;
	private String ename;
	public int getEmpNo() {
		return empNo;
	}
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	
}


class 햄버거{
	private String 햄버거이름;
	private int 햄버거가격;
	private String 매장이름;
	
	public String get매장이름() {
		return 매장이름;
	}
	public void set매장이름(String 매장이름) {
		this.매장이름 = 매장이름;
	}
	public String get햄버거이름() {
		return 햄버거이름;
	}
	public void set햄버거이름(String 햄버거이름) {
		this.햄버거이름 = 햄버거이름;
	}
	public int get햄버거가격() {
		return 햄버거가격;
	}
	public void set햄버거가격(int 햄버거가격) {
		this.햄버거가격 = 햄버거가격;
	}
	
	
}

public class 긴급점검50 {

	
	// List와 Map을 알아보자!
	public static void main(String[] args) {
		// 자식은 부모를 포함 할 수 있다. <-> 부모는 자식을 포함할 수 없다.
		ArrayList<String> list = new ArrayList<String>();
		
		List<String> list2 = new ArrayList<String>();
		list2.add("hello");
		list2.add("name");
		//List<>안에는 ArrayList<>,LinkedList<>,Vector<>를 포함하고 있기때문에 변수(list2)를 활용할 수 있다.
		list2 = new LinkedList<String>();
		
		//point : 제네릭안에 컬렉션도 포함됨!
		//컬렉션도 클래스니까 가능!
		List<ArrayList<String>> list4 = new ArrayList<ArrayList<String>>();
		
		List<햄버거> list3 = new ArrayList<햄버거>();
		햄버거 불고기버거 = new 햄버거();
		불고기버거.set햄버거가격(3000);
		불고기버거.set햄버거이름("불고기버거");
		불고기버거.set매장이름("매그도나르도르");
		list3.add(불고기버거);
		
		System.out.println("가격 : "+list3.get(0).get햄버거가격());
		System.out.println("버거이름 : "+list3.get(0).get햄버거이름());
		System.out.println("매장이름 : "+list3.get(0).get매장이름());
		
		

		Map<String,Object> map = new HashMap<String,Object>();
		//모든 class의 부모는 Object이기 때문에 Value값에 String, Integer등 사용가능
		map.put("햄버거이름", "다당버거");
		map.put("햄버거가격", 3500);
		map.put("매장이름", "버거킹");
		
		System.out.println("------------");
		
		//Map에서 key의 value를 가져오고 싶으면 'Map변수이름.get(해당 key이름)'를 가져오면 된다.
		System.out.println(map.get("햄버거이름"));
		System.out.println(map.get("햄버거가격"));
		System.out.println(map.get("매장이름"));
		System.out.println("Map 출력 : "+map);
		
		System.out.println("------------");
		
		Map<String,Object> map2 = new HashMap<String,Object>();
		map2.put("피자이름", "페퍼로니");
		map2.put("피자가격", "25000");
		map2.put("매장이름", "시그니처랩");
		
		List<Map<String,Object>> mapList = new ArrayList<Map<String,Object>>();
		mapList.add(map2);
		// 타입은 Object이다.
		Object pizzaName = mapList.get(0).get("피자이름");
		Object pizzaPrice = mapList.get(0).get("피자가격");
		Object storeName = mapList.get(0).get("매장이름");
		System.out.println("피자이름 : "+pizzaName);
		System.out.println("피자가격 : "+pizzaPrice);
		System.out.println("매장이름 : "+storeName);
		System.out.println("Map을 품은 List 출력 : "+mapList);
		
		System.out.println("------------");
		
		List<EmpVO> empList = new ArrayList<EmpVO>();
		
		EmpVO empVO = new EmpVO();
		empVO.setEmpNo(7369);
		empVO.setEname("SMITH");
		empList.add(empVO);
		
		EmpVO empVO2 = new EmpVO();
		empVO2.setEmpNo(7499);
		empVO2.setEname("ALLEN");
		empList.add(empVO2);
		
		for(EmpVO vo : empList) {
			System.out.println(vo.getEmpNo());
			System.out.println(vo.getEname());
		}
		
		System.out.println("------------");
		
		List<Map<String,Object>> empMapList = new ArrayList<Map<String,Object>>();
		Map<String,Object> empMap = new HashMap<String,Object>();
		empMap.put("empNo", 123);
		empMap.put("ename", "류근환");
		empMapList.add(empMap);
		System.out.println(empMapList.get(0).get("empNo"));
		System.out.println(empMapList.get(0).get("ename"));
				
		Map<String,Object> SMITH = new HashMap<String,Object>();
		SMITH.put("empNo", 7369);
		SMITH.put("ename", "SMITH");
		empMapList.add(SMITH);
		System.out.println(empMapList.get(1).get("empNo"));
		System.out.println(empMapList.get(1).get("ename"));
		
		Map<String,Object> ALLEN = new HashMap<String,Object>();
		ALLEN.put("empNo", 7499);
		ALLEN.put("ename", "ALLEN");
		empMapList.add(ALLEN);
		System.out.println(empMapList.get(2).get("empNo"));
		System.out.println(empMapList.get(2).get("ename"));
		
		System.out.println("------------");
		
		System.out.println(empMapList.get(0).get("ename"));
		System.out.println(empMapList.get(1).get("ename"));
		System.out.println(empMapList.get(2).get("ename"));
		
	}

}
