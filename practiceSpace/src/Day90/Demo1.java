package Day90;

import java.util.Scanner;

public class Demo1 {

	private final static int MAXN = 10000002;

	private static long[] fp = new long[MAXN];

	private static long m;

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		m = reader.nextLong();
		long n = 1;
		while (f(n) != 0 || f(n + 1) != 1) {
			n++;
		}
		System.out.println(n);
		reader.close();
	}

	private static long f(long n) {
		if (fp[(int) n] != 0) {
			return fp[(int) n];
		}
		if (n == 1 || n == 2) {
			return fp[(int) n] = 1 % m;
		} else {
			return fp[(int) n] = (f(n - 1) + f(n - 2)) % m;
		}
	}

}
