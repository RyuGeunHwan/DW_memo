package test;

import java.util.ArrayList;
import java.util.List;

class Singer{
	public String SingerName; //가수 이름
	public Singer(String singerName) {
		this.SingerName = singerName;
	}
}

public class 긴급점검3 {
	public static List<Singer> getListSinger(List<Singer> list){
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i).SingerName);
		}
		return list;
	}
	public static Singer getSinger(Singer s) {
		System.out.println(s.SingerName);
		return s;
	}
	
	public static void main(String[] args) {
		
//		getListSinger(List<Singer> list) 파라미터값이 존재하기 때문에 메소드 안에 List를 만들어주는것이 아니라
		// 밖에 만들고 파라미터로 list를 넣어주어야 한다.
		List<Singer> list = new ArrayList<Singer>();
		list.add(new Singer("김종국"));
		list.add(new Singer("서인국"));
		list.add(new Singer("방용국"));
		
		
		getListSinger(list);
		getSinger(new Singer("김종국"));
	}
}
