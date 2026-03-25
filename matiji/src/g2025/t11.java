package g2025;

import java.util.Scanner;

public class t11 {

	private static final int MOD = 998244353;

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		long a = reader.nextLong();
		long n = reader.nextLong();
		long num = 0;
		long ans = 0;
		for (int i = 0; i < n; i++) {
			num = ((num * 10 % MOD) + a) % MOD;
			ans = (ans + num) % MOD;
		}
		System.out.println(ans);
		reader.close();
	}

}
