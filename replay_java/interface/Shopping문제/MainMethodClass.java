package shopping;

import java.util.ArrayList;
import java.util.List;

public class MainMethodClass {
	
	
	public static void main(String[] args) {
		
		List<UserVO> userList = new ArrayList<UserVO>();
		userList.add(new UserVO(110,500,"BRIAN","2019-07-01 08:14:31"));
		userList.add(new UserVO(1000,500,"ALLEN","2020-03-01 14:30:31"));
		userList.add(new UserVO(120,800,"SANGWON","2021-05-11 18:20:31"));
		userList.add(new UserVO(130,1100,"KING","2022-04-21 09:10:31"));
		userList.add(new UserVO(140,300,"SMITH","2022-04-21 09:00:31"));
		userList.add(new UserVO(150,200,"SCOTT","2022-04-21 09:20:31"));
		userList.add(new UserVO(160,900,"WILLSON","2022-04-21 09:17:31"));
		userList.add(new UserVO(50,770,"SAM","2022-04-21 10:57:00"));
		//번호, 포인트, 이름, 최근방문날짜, 휴먼계정 여부(true: 휴먼 , false : 휴먼 아님), 구매한상품(구매이력)
		
		ShoppingServiceImpl shopping = new ShoppingService();
		shopping.getUserList(userList);
		//1. 회원 중 포인트가 가장 많은 회원 정보 조회.(단, 중복데이터는 없다고 가정)
		shopping.getPointRankerUser(userList);
		//2. 회원 중 앞글자에 S가 들어간 회원 정보 조회.
		shopping.getFindByName(userList, "S");
		//3. 현재날짜 기준으로 90일동안 방문 없었던 회원 휴먼 계정으로 수정. new Date ,  getTime 사용!
		shopping.updateNotSleeperToSleeper(userList, 90);
		//4. 휴먼계정 인원 수 조회.
		shopping.getSleeperUserCount(userList);
		//5. 휴먼계정이 아닌 회원에게 100포인트 추가 지급.
		shopping.updatePoint(userList, 100);
		//6. 포인트가 가장 높은 회원 조회.(단, 중복데이터는 없다고 가정)
		
		//7. 특정 회원에게 상품구매 발생.
		//   구매한 상품의 가격 5%가 포인트로 지급. 
//		ProductVO vo = new ProductVO();
		shopping.getPurchaseRankerUser(userList, new ProductVO("헤드셋", 1000), 150);
		shopping.getPurchaseRankerUser(userList, new ProductVO("전기장판", 5000), 120);
		shopping.getPurchaseRankerUser(userList, new ProductVO("간식", 6000), 110);
		//8. 구매이력이 있는 회원만 조회.
		// pvoList.add 에 추가할 정보 : 
		// shopping.getPurchaseRankerUser(pvoList.get(i)해서 3가지를 한번에 파라미터로 받을 수 있는지 확인! 그러면 내일 다시 만나요!);
		for(int i=0; i<userList.size(); i++) {
			if(userList.get(i).getList() != null) {
				System.out.println(userList.get(i).getUserName());
			}
		}
	}
}
