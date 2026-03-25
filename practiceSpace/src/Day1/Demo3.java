package Day1;

public class Demo3{
	
	public static void main(String[] args) {
		long money = 1000000L;
		int ans = 0;
		
		for(int k = 10;k>=0;k--) {
			long temp = money/(int)Math.pow(7, k);
			if(temp>5) {
				temp = 5;
			}
			ans+=(int)temp;
			money-=temp*(int)Math.pow(7, k);
		}
		System.out.println(ans);
	}
	
}