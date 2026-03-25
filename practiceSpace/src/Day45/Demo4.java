package Day45;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Demo4 {

	private static final long MOD = 998244353;
	private static final long INF = (long) 1e18;

	private static long quickpow(long a, long b) {
		long ans = 1;
		while (b > 0) {
			if ((b & 1) == 1) {
				ans = ans * a % MOD;
			}
			a = a * a % MOD;
			b >>= 1;
		}
		return ans;
	}

	private static long BSGS(long a, long b, long p) {
		if (a % p == 0) {
			return -1;
		}
		Map<Long, Long> map = new HashMap<>();
		long cur = 1;
		long t = (long) Math.sqrt(p) + 1;

		for (long i = 1; i <= t; i++) {
			cur = cur * a % p;
			if (i < t) {
				map.put(b * cur % p, i);
			}
		}

		long temp = cur;
		cur = temp;
		for (long i = 1; i <= t; i++) {
			if (map.containsKey(cur)) {
				return i * t - map.get(cur);
			}
			cur = cur * temp % p;
		}

		return -1;
	}

	private static void solve() {
		Scanner reader = new Scanner(System.in);
		long n = reader.nextLong();
		long[] r = new long[10];
		Arrays.fill(r, INF);

		for (long i = 1; i <= 9; i++) {
			if (n % i != 0) {
				continue;
			}
			long cur = n / i;
			if (cur % 2 == 0 || cur % 5 == 0) {
				continue;
			}
			r[(int) i] = BSGS(10, 1, cur * 9);
		}

		long mi = INF;
		for(int i = 1;i<=9;i++) {
			if(r[i]<mi) {
				mi=r[i];
			}
		}
		
		if(mi==INF) {
			System.out.println(-1);
		}else {
			for(int i = 1;i<=9;i++) {
				if(r[i]==mi) {
					long res = i*(quickpow(10, mi%MOD)+MOD-1)%
							MOD * quickpow(9, MOD-2)%MOD;
					System.out.println(res);
					return;
				}
			}
		}

		reader.close();
	}

	public static void main(String[] args) {
		solve();
	}

}
