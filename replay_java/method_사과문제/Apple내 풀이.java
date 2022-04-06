package 상속;

public class Apple {
		int count;
		
		public int buyApple(int buy){//구매한 사과
			int sum = this.count+=buy;
			return sum;
			
		}
		public int eatApple(int eat){//먹은 사과
			int result = this.count = eat;
			return result;
		}
		
		public int resultApple(int buy, int eat) {//먹고 남은 사과
			int result = buy - eat;
			return result ;
		}
}
