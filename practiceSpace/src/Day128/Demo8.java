package Day128;

import java.util.Scanner;

public class Demo8 {

	private static final int MOD = (int) 1e9 + 7;

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int t = reader.nextInt();

		while (t-- > 0) {
			long l = reader.nextLong();
			long r = reader.nextLong();

			if (r - l >= 100) {
				System.out.println(0);
				continue;
			}

			long ans = 1;
			for (long i = l; i <= r; i++) {
				long f = getf(i);
				ans = (ans * f) % MOD;
				if (ans == 0) {
					break;
				}
			}
			System.out.println(ans);
		}

		reader.close();
	}

	private static long getf(long x) {
		long ans = 1;
		while (x > 0) {
			ans *= x % 10;
			if (ans == 0) {
				break;
			}
			x /= 10;
		}
		return ans;
	}

}
