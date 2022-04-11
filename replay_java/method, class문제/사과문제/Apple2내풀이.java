package 사과;

public class Apple {
		int count;
		int eatCount;
		int totalCount;
		
		public int getCount() {
			this.totalCount=this.count - this.eatCount;
			// 구매한사과 - 먹은사과 = totalCount;
			return totalCount;
			// totalCount를 리턴하면 결과적으로 
			// 구매하고 먹고 똥싸고 나머지 사과의 갯수만 남음
		}
		public void setCount(int count) { 
			this.count += count; //구매한 사과를 this.count에 누적
			System.out.println("구매한 사과의 갯수는? => "+this.count+"개");
		}
		public int getEatCount() {
			return eatCount;
		}
		public void setEatCount(int eatCount) {
			this.eatCount += eatCount; //먹은 사과를 this.eatCount에 누적
			System.out.println("먹은 사과의 갯수는? => "+this.eatCount+"개");
		}
		
}
