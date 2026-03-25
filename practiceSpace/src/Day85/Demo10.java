package Day85;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Demo10 {

	private static final int MOD = 998244353;

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int n = reader.nextInt();
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < n; i++) {
			int x = reader.nextInt();
			for (int j = 2; j * j <= x; j++) {
				if (x % j == 0) {
					int count = 0;
					while (x % j == 0) {
						x /= j;
						count++;
					}
					map.put(j, Math.max(map.getOrDefault(j, 0), count));
				}
			}
			if (x > 1) {
				map.put(x, Math.max(map.getOrDefault(x, 0), 1));
			}
		}
		long ans = 1;
		for (Entry<Integer, Integer> entry : map.entrySet()) {
			ans = ans * (int) modPow(entry.getKey(), entry.getValue(), MOD) % MOD;
		}
		System.out.println(ans);

		reader.close();
	}

	private static long modPow(long base, long exp, long mod) {
		long res = 1;
		base %= mod;
		while (exp > 0) {
			if (exp % 2 == 1) {
				res = (res * base) % mod;
			}
			base = (base * base) % mod;
			exp /= 2;
		}
		return res;
	}

}
