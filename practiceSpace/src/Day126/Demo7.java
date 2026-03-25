package Day126;

import java.util.Scanner;

public class Demo7 {

	private static final int MOD = (int) 1e3;

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		while (reader.hasNextInt()) {
			long A = reader.nextLong();
			long B = reader.nextLong();
			if (A == 0 && B == 0) {
				break;
			}

			long res = powMod(A, B, MOD);
			System.out.println(res);
		}

		reader.close();
	}

	private static long powMod(long base, long exp, long mod) {
		long res = 1;
		base %= mod;
		while (exp > 0) {
			if ((exp & 1) == 1) {
				res = (res * base) % mod;
			}
			base = (base * base) % mod;
			exp >>= 1;
		}

		return res;
	}

}
