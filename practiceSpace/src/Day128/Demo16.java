package Day128;

import java.util.Scanner;

public class Demo16 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		long ans = 0;
		for (long i = 1; i <= 2025; i++) {
			ans += get3Num(i * i * i);
		}
		System.out.println(ans);

		reader.close();
	}

	private static int get3Num(long x) {
		int cnt = 0;
		if (x % 10 == 3) {
			cnt++;
		}
		return cnt;
	}
}
