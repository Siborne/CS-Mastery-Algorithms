package week1.day1;

import java.util.Scanner;

public class T5 {

	private static final long MOD = 722733748;

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		long k = reader.nextLong();
		long a = reader.nextLong();
		long q = reader.nextLong();

		System.out.println((quickMod(a, k, MOD) * quickMod(q, k * (k - 1) / 2, MOD)) % MOD);

		reader.close();
	}

	private static long quickMod(long base, long exp, long mod) {
		long result = 1;
		while (exp > 0) {
			if ((exp & 1) == 1) {
				result = (result * base) % mod;
			}
			exp >>= 1;
			base = (base * base) % mod;
		}
		return result;
	}

}
