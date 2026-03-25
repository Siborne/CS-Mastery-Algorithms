package Day137;

import java.util.Scanner;

public class Demo5 {

	private static final int MOD = (int) 1e45 + 7;

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		String s = reader.nextLine();
		int n = s.length() / 5;
		long[] a = new long[n];
		for (int i = 0; i < n; i++) {
			char sign = s.charAt(i * 5 + 2);
			int d = s.charAt(i * 5 + 3) - '0';
			a[i] = sign == '-' ? (-d) : d;
			a[i] = (a[i] % MOD + MOD) % MOD;
		}

		long constant = a[0];
		long coef1 = 1;

		for (int i = 1; i < n; i++) {
			long newCoef1 = (constant + a[i] * coef1) % MOD;
			long newConstant = (a[i] * constant) % MOD;

			coef1 = newCoef1;
			constant = newConstant;
		}
		System.out.println(coef1 % MOD);
		reader.close();
	}

}
