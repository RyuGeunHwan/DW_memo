package 컬렉션즈;

import java.util.ArrayList;

public class EmpMain {
	public static ArrayList<EmpVO> getEmpList(ArrayList<EmpVO> list){//EmpVO를 담고있는 ArrayList를 파라미터로 담고있다.
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i).ename);
			System.out.println(list.get(i).empno);
		}
		return list;
	}
	
	//static을 써주는 이유는 main함수에 static이 있으므로
	//static을 쓰지않고 main메소드에 호출을 하려면 new로 호출하기!
	public static String getValue(String name) {
		System.out.println("너의 이름은? "+name);
		return name;
	}

	public static void main(String[] args) {
		
		//오후 문제5개
		ArrayList<EmpVO> list = new ArrayList<EmpVO>();
		// list.add() 방법1. 호출 후 변수에 대입하는 방법
//		EmpVO empvo = new EmpVO(7369,"SMITH","CLERK","1980-12-17",800,20,0);
//		EmpVO empvo1 = new EmpVO(7499,"ALLEN","SALESMAN","1981-02-20",1600,30,300);
//		EmpVO empvo2 = new EmpVO(7521,"WARD","SALESMAN","1981-02-22",1250,30,500);
//		EmpVO empvo3 = new EmpVO(7566,"JONES","MANAGER","1981-04-02",2975,20,0);
//		EmpVO empvo4 = new EmpVO(7654,"MARTIN","SALESMAN","1981-09-28",1250,30,1400);
//		list.add(empvo);
//		list.add(empvo1);
//		list.add(empvo2);
//		list.add(empvo3);
//		list.add(empvo4);
		
		// list.add() 방법2. 호출과 동시에 add하는 방법
		list.add(new EmpVO(7369,"SMITH","CLERK","1980-12-17",800,20,0));//
		list.add(new EmpVO(7499,"ALLEN","SALESMAN","1981-02-20",1600,30,300));
		list.add(new EmpVO(7521,"WARD","SALESMAN","1981-02-22",1250,30,500));
		list.add(new EmpVO(7566,"JONES","MANAGER","1981-04-02",2975,20,0));//
		list.add(new EmpVO(7654,"MARTIN","SALESMAN","1981-09-28",1250,30,1400));
		list.add(new EmpVO(7698,"BLAKE","MANAGER","1981-05-01",2850,30,0));
		list.add(new EmpVO(7782,"CLARK","MANAGER","1981-06-09",2450,10,0));
		list.add(new EmpVO(7788,"SCOTT","ANALYST","1987-06-28",3000,20,0));//
		list.add(new EmpVO(7839,"KING","PRESIDENT","1981-11-17",5000,10,0));
		list.add(new EmpVO(7844,"TURNER","SALESMAN","1981-09-08",1500,30,0));
		list.add(new EmpVO(7876,"ADAMS","CLERK","1987-07-13",1100,20,0));//
		list.add(new EmpVO(7900,"JAMES","CLERK","1981-12-03",950,30,0));
		list.add(new EmpVO(7902,"FORD","ANALYST","1981-12-03",3000,20,0));//
		list.add(new EmpVO(7934,null,"CLERK","1982-01-23",1300,10,0));
		
		String name = "아이유";
		getValue(name);
		
		//method에 static 썼을때
		getEmpList(list);
		
		//method에 static 안썼을때
//		EmpMain getEmpList = new EmpMain();
//		getEmpList.getEmpList(list);
		
		
		System.out.println("-----------------------------------오후 문제 시작--------------------------------------");
		int commCount = 0;
		int sumAvg = 0;
		int sumSal = 0;
		int deptCount =0;
		for(int i=0; i<list.size(); i++) {
			//1. comm을 받은 사원 수와 직업,이름을 조회하시오.
			if(list.get(i).comm != 0) {
				commCount++;
				System.out.println("========1번=======");
				System.out.println("보너스를 받은 사원 직업 : "+list.get(i).job+", 보너스를 받은 사원 이름 : "+list.get(i).ename);
			}
			//2. emp에 있는 급여 평균을 구하시오.
			sumSal += list.get(i).sal;
			sumAvg = sumSal/list.size();
			//3. 사원번호가 7844, 7876인 사원에게 comm 200을 지급하시오.
			if(list.get(i).empno == 7844 || list.get(i).empno == 7876) {
				list.get(i).setComm(200);
				list.get(i).getComm();
			}
			//4. 사원이름이 null인 사원이름에 '데이터 없음' 으로 수정하시오. 
			String replaceEname = list.get(i).ename;
			if(replaceEname == null) {
				list.get(i).setEname("데이터 없음");
				System.out.println("========4번=======");
				System.out.println("이름이 null인 사원 : "+list.get(i).getEname());
			}
		}
//			5. 20번 부서가 올해 실적이 좋지 않습니다. 20번부서를 모두 해고(제거) 하십시오.
		for(int j=0; j<list.size(); j++) {
			if(list.get(j).deptno == 20) {
//				System.out.println("해고 당한 사원 : "+list.get(j).ename);
				list.remove(j);
			}
			System.out.println("========5번=======");
			System.out.println("해고 당하지 않은 사원 : "+list.get(j).ename);
			
		}
		System.out.println("보너스를 받은 사원의 수 ==> "+commCount+"명");
		System.out.println("급여 총 합 : "+sumSal+"만원");
		System.out.println("========2번=======");
		System.out.println("급여 평균 : "+sumAvg+"만원");
		System.out.println("");
		System.out.println("-----------------------------------오전 문제 시작--------------------------------------");
		
		
		
		
		
		
		
		
		//오전 문제8개
		ArrayList<EmpVO> list1 = new ArrayList<EmpVO>();
//		EmpVO e = new EmpVO(7369,"SMITH","CLERK","1980-12-17",800,20);
//		list.add(e);
		// 두개 같은 것
		list1.add(new EmpVO(7369,"SMITH","CLERK","1980-12-17",800,20));
		list1.add(new EmpVO(7499,"ALLEN","SALESMAN","1981-02-20",1600,30));
		list1.add(new EmpVO(7521,"WARD","SALESMAN","1981-02-22",1250,30));
		list1.add(new EmpVO(7566,"JONES","MANAGER","1981-04-02",2975,20));
		list1.add(new EmpVO(7654,"MARTIN","SALESMAN","1981-09-28",1250,30));
		
		int jobCount = 0;
		int salMax = 0;
		int salMaxIndex = 0;
		int deptnoCount = 0;
		int deptnoCount1 = 0;
		int hiredateCount = 0;
		//일반for문(반복문)
		for(int i=0; i<list1.size(); i++) {
			// 문제1. 사원 번호, 이름 출력
			int empno = list1.get(i).empno;
			String ename = list1.get(i).ename;
			String hiredate = list1.get(i).hiredate;
			System.out.println("사원번호 ==> "+empno);
			System.out.println("사원이름 ==> "+ename);
			// 문제2. 급여가 1300달러 이상을 받는 사원의 이름과 직업 조회
			if(list1.get(i).sal > 1300) {
				System.out.println("급여 1300달러 이상 사원번호 ==> "+empno);
				System.out.println("급여 1300달러 이상 사원이름 ==> "+ename);
			}
			// 문제3. 직업이 SALESMAN인 사원 중 급여가 1400달러 이상 받는 사원의 번호, 이름 조회
			if(list1.get(i).job.equals("SALESMAN")){
				if(list1.get(i).sal > 1400) {
					System.out.println("직업\"SALESMAN\" 급여1400달러 이상 사원번호 ==> "+empno);
					System.out.println("직업\"SALESMAN\" 급여1400달러 이상 사원이름 ==> "+ename);
				}
				
			}
			// 문제4. 입사년도가 1981년도인 사원의 번호,이름 조회
			String hireyear = list1.get(i).hiredate.substring(0, 4);
			if(hireyear.equals("1981")) {
				System.out.println("입사년도가 1981년도인 사원번호 ==> "+empno);
				System.out.println("입사년도가 1981년도인 사원이름 ==> "+ename);
			}
			// 문제5. 직업이 MANAGER인 사원 수 조회
			if(list1.get(i).job.equals("MANAGER")) {
				++jobCount;
			}
			// 문제6. 사원 중 급여를 가장 많이 받는 사원의 번호,이름,입사년도 조회
			if(list1.get(i).sal > salMax) {
				salMax = list1.get(i).sal;
				salMaxIndex = i;// for문 밖에서 출력을 하여야 하므로 index번호인 i를 변수에 대입 후 for문 밖에서 출력!
			}
			
			// 문제7. 부서번호별 수 조회 ex) 20 :2명, 30 : 3명
			if(list1.get(i).deptno == 20) {
				deptnoCount++;
			}
			if(list1.get(i).deptno == 30) {
				deptnoCount1++;
			}
			// 문제8. 입사월이 02월인 사원 수 조회 (split(문자메소드)으로 배열을 나눈뒤 [1]가 03인 사원 수 조회)
			String arrHiredate[] = list1.get(i).hiredate.split("-");
			if(arrHiredate[1].equals("02")) {
				hiredateCount++;
			}
		}
		System.out.println("==========6번==========");
		System.out.println("사원 중 급여를 가장많이 받는 사원 ==> "+list1.get(salMaxIndex).empno);
		System.out.println("사원 중 급여를 가장많이 받는 사원 ==> "+list1.get(salMaxIndex).ename);
		System.out.println("사원 중 급여를 가장많이 받는 사원 ==> "+list1.get(salMaxIndex).hiredate);
		System.out.println("직업이 MANAGER인 사원 수 ==> "+jobCount);
		System.out.println("부서번호 20인 인원수 : "+deptnoCount+"명");
		System.out.println("부서번호 30인 인원수 : "+deptnoCount1+"명");
		System.out.println("입사월이 02월인 사원 수 ==> "+hiredateCount+"명");
//		
//		
//		
//		//for-each(반복문)
//		// list의 길이만큼 반복
////		for(EmpVO vo : list) {
////			
////		}
	
	
	
	}

}
