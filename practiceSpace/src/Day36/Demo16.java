package Day36;

import java.util.Scanner;

public class Demo16 {
	
	public static void main(String[] args) {
		solve();
	}
	
	private static void solve() {
		Scanner reader = new Scanner(System.in);
		int n = reader.nextInt();
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		int sum = 0;
		for(int i = 0;i<n;i++) {
			int x = reader.nextInt();
			if(x>max) {
				max =x;
			}
			if(min>x) {
				min = x;
			}
			sum+=x;
		}
		System.out.println(max);
		System.out.println(min);
		double ans = (sum*1.0)/n;
		System.out.printf("%.2f",ans);
		reader.close();
	}
	
}
