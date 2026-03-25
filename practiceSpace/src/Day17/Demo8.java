package Day17;

public class Demo8 {
	
	public static void main(String[] args) {
		int day = 1;
		int now = 0;
		int ans = 0;
		while(ans<=108) {
			now=-1+day*2;
			ans+=now;
			day++;
		}
		System.out.println(day);
	}
	
}
