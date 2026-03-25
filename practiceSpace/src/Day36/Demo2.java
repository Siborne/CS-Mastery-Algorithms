package Day36;

import java.util.Scanner;

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		solve();
		reader.close();
	}

	private static void solve() {
		int ans = 0;
		for(int i = 1;i<=2020;i++) {
			for(int j = i+1;j<=2020;j++) {
				if(gcd(i,j)==1) {
					ans++;
				}
			}
		}
		System.out.println(ans*2+1);
	}

	private static int gcd(int x, int y) {
		if (y == 0) {
			return x;
		}
		return gcd(y, x % y);
	}

}
