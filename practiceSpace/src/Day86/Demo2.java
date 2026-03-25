package Day86;

import java.util.Scanner;

public class Demo2 {

	private static final int MOD = 998244353;

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int n = reader.nextInt();
		long ans = 1;
		while (n-- > 0) {
			long x = reader.nextLong();
			ans *= x;
			ans %= MOD;
		}
		System.out.println(ans);

		reader.close();
	}

}
