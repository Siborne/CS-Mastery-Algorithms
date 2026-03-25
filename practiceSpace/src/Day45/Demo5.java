package Day45;

import java.util.Scanner;

public class Demo5 {

	private static final int MOD = 2146516019;

	public static long powMod(long base, long exponent, int mod) {
		long res = 1;
		base %= mod;
		while (exponent > 0) {
			if ((exponent & 1) == 1)
				res = (res * base) % mod;
			base = (base * base) % mod;
			exponent >>= 1;
		}
		return res;
	}

	public static long inv(long a, int mod) {
        return powMod(a, mod - 2, mod);
    }

	private static void solve() {
		long ans = 0;
		for (int i = 1; i <= 233333333; ++i) {
			ans ^= inv(i, MOD);
		}
		System.out.println(ans);
	}

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		solve();
		reader.close();
	}

}