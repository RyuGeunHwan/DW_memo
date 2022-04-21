package shopping;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public class ShoppingService implements ShoppingServiceImpl{
	
	@Override
	public List<UserVO> getUserList(List<UserVO> list) {
		for(int i=0; i<list.size(); i++) {
			
		}
		return null;
	}

	@Override
	public List<UserVO> getFindByName(List<UserVO> list, String word) {
		for(int i=0; i<list.size(); i++) {
			String name = list.get(i).getUserName().substring(0, 1);
			if(name.equals(word)) {
				System.out.println("S로 시작하는 사람 이름 => "+list.get(i).getUserName());
			}
		}
		return null;
	}

	@Override
	public int getSleeperUserCount(List<UserVO> list) {
		int count = 0;
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).isSleeper() == true) {
				count++;
			}
		}
		System.out.println("휴면계정 인원 수 => "+count);
		return count;
	}

	@Override
	public List<UserVO> updateNotSleeperToSleeper(List<UserVO> list, int days) {
		//선생님 풀이
		Date d = new Date();
		//1. 오늘날짜 구해야함.
		// 자바에서는 날짜를 계산할 때에는 SimpleDateFormat을 사용!
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd", Locale.KOREA);
		// 한국시간으로 가져와야 하는 것이 키포인트(Locale.KOREA)
		String strToday = formatter.format(Calendar.getInstance().getTime()); //오늘날짜 리턴
		Date today = null; //오늘날짜를 구하기 위한 변수
		Date visit = null; //방문날짜를 구하기 위한 변수
		try {
			//성공하면 try안에 로직 실행
		for(int i=0; i<list.size(); i++) {
			String strVisitAt = list.get(i).getVisitAt();
			today = formatter.parse(strToday);
			//parse에 들어가보면 return타입이 Date이고 파라미터로 String을 받는 것을 알 수 있다.
			visit = formatter.parse(strVisitAt);
			long diffDays = (today.getTime() - visit.getTime()) / (1000*60*60*24); //일 수로 구하기
			if(diffDays >= days) {// 휴먼 계정이라면
				list.get(i).setSleeper(true);
			}else {
				list.get(i).setSleeper(false);
			}
		  }
		} catch (ParseException e) {
			//에러를 발견하면 catch해주겠다는 의미
			e.printStackTrace();//에러를 추적하겠다!
		}
		for(int i=0; i<list.size(); i++) {
			System.out.println("userName : "+list.get(i).getUserName()+", 휴먼 계정여부 : "+list.get(i).isSleeper());
		}
		return list;
	}

	@Override
	public List<UserVO> updatePoint(List<UserVO> list, int point) {
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).isSleeper() != true) {
				list.get(i).setPoint(list.get(i).getPoint()+point);
//			System.out.println("휴먼계정이 아닌 회원에게 포인트+100 => "+list.get(i).getPoint()+"점");
			}
		}
		
		return list;
	}

	@Override
	public UserVO getPointRankerUser(List<UserVO> list) {
		int max = 0;
		String name = "";
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getPoint() > max) {
				max = list.get(i).getPoint();
				name = list.get(i).getUserName();
			}
		}
		System.out.println("포인트가 가장 많은 사람 => "+name+", "+max);
		return null;
	}

	@Override
	public List<UserVO> getPurchaseRankerUser(List<UserVO> list, ProductVO vo, int userNo) {
		double db= 0.05;
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getUserNo() == userNo) {
				list.get(i).setPoint(list.get(i).getPoint()+(int)(vo.getPrice()*db));
				int point = list.get(i).getPoint();
				System.out.println("가격의 5% 인 " +(int)(vo.getPrice()*db)+"를 포인트로 적립, 총 포인트 점수 = "+list.get(i).getPoint());
			}
		}
		return null;
	}

}
