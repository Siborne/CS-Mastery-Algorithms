package class041;

public class Code02_NthMagicalNumber {

	private static final int MOD = (int) 1e9 + 7;

	private static long lcm, ans;

	public int nthMagicalNumber(int n, int a, int b) {
		lcm = lcm(a, b);
		ans = 0;
		for (long l = 0, r = (long) n * Math.min(a, b), m = 0; l <= r;) {
			m = (l + r) / 2;
			if (m / a + m / b - m / lcm >= n) {
				ans = m;
				r = m - 1;
			} else {
				l = m + 1;
			}
		}
		return (int) (ans % MOD);
	}

	private static long gcd(long a, long b) {
		return b == 0 ? a : gcd(b, a % b);
	}

	private static long lcm(long a, long b) {
		return (long) a / gcd(a, b) * b;
	}

}
