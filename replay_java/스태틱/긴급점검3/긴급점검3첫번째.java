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
	
	public static List<Singer> getListSinger(){
		List<Singer> list = new ArrayList<Singer>();
		list.add(new Singer("김종국"));
		list.add(new Singer("서인국"));
		list.add(new Singer("방용국"));
		return list;
	}
	
	public static Singer getSinger(){
		String name = "";
		for(int i=0; i<getListSinger().size(); i++) {
			if(getListSinger().get(i).SingerName.equals("김종국")) {
				name = getListSinger().get(i).SingerName;
			}
		}
		// 방법1. s1
		Singer s1 = new Singer("김종국");
		// 방법2. s2
		Singer s2 = new Singer(name);
		return s2;
	}
	
	public static void main(String[] args) {
		//1. getListSinger()이용해서 김종국, 서인국, 방용국 list 출력!
		List<Singer> singer = getListSinger();
		for(int i=0; i<singer.size(); i++) {
			System.out.println(singer.get(i).SingerName);
		}
		//2. getSinger()이용해서 김종국만 출력!
		Singer s = getSinger();
		System.out.println(s.SingerName);
	}
}
