package Day36;

import java.util.Scanner;

public class Demo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		solve();
		reader.close();
	}

	private static void solve() {
		int ans = 2;
		int count = 0;
		while(count<100) {
			int res = 0;
			String str = String.valueOf(ans);
			for(int i = 0;i<str.length();i++) {
				res += Math.pow(str.charAt(i)-'0', 2);
			}
			ans = Math.max(res, ans);
			count++;
		}
		System.out.println(ans);
	}
	
}
