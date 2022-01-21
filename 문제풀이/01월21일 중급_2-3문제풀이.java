package 메소드_3일차;

public class 문제중급_2_3 {


	public static void main(String[] args) {
	    // 문제 - 이름,주소,나이 알아내기
		// split을 두번 해야하는 상황 -> 배열 2번 -> 결국 이중for문
		String query = "name=brian&addr=daejeon&age=30";
		String name = "";
		String addr = "";
		int age = 0;
//		String array[] = query.split("&");
//		for (int i = 0; i < array.length; i++) {
//			String x[] = array[i].split("=");
//			for (int j = 0; j < x.length; j++) {
//				if (i == 0) { // array[0]={name=brian}
//					name = x[j];// x[0]=name / x[1]=brain
//				}
//				if (i == 1) { // array[1]={addr=daejeon}
//					addr = x[j]; // x[0]=addr / x[1]=daejeon
//				}
//				if (i == 2) { // array[2]={age=30}
//					age = Integer.parseInt(x[j]);
//					// 문자열이니 숫자로 바꾼 후 x[0]=age / x[1]=30
//				}
//
//			}
//		}
		System.out.print("name : " + name);
		System.out.print("addr : " + addr);
		System.out.print("age : " + age);
	}
	//결과 출력 
	//name : brian
	//addr : daejeon
	//age : 30

}
