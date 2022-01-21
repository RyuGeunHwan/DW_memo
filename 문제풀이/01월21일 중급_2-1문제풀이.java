package 메소드_3일차;

public class 문제중급_2_1 {


		
		// 앞자리가 010이 아니라면 "핸드폰 번호를 변경해야 합니다." 출력.
		// 핸드폰 번호 중간자리와 끝자리가 4개이면 x4개, 3개면 x3개
		// ex) 010-333-0000 -> 010-xxx-xxxx
		   public static void main(String[] args) {
			   
		        String phone = "017-404-1234";
//		        String array[] = phone.split("-");
//		        	if(array[0].equals("010")) {
//		        	if(array[1].length()==3) {
//		        		array[1] ="-xxx";
//		        	}else if (array[1].length()==4) {
//		        		array[1] ="-xxxx";
//		        	}if(array[2].length()==3) {
//		        		array[2] ="-xxx";
//		        	}else if (array[2].length()==4) {
//		        		array[2] ="-xxxx";
//		        	}
//		        	}
//		        	else {
//		        		array[0]="핸드폰번호를 변경하여야 합니다.";
//		        		array[1]="";
//		        		array[2]="";
//		        	}
//		        	
//		        
//		        
				for(String str : array){
					System.out.print(str);
				}
		    }
		   //결과출력 = "핸드폰번호를 변경하여야 합니다." or 010-xxx-xxxx(핸드폰 번호 앞자리가 010이었을때)

}

