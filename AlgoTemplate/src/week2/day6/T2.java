package week2.day6;

import java.util.Scanner;

public class T2 {

	private static long k;

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		k = reader.nextLong();

		long l = k * 3;
		long r = k * 5 + 1;

		while (l + 1 != r) {
			long mid = l + ((r - l) >> 1);
			int res = check(mid);
			if (res == 1) {
				l = mid;
			} else if (res == 2) {
				l = mid;
			} else {
				r = mid;
			}
		}

		if (check(l) == 2) {
			System.out.println(-1);
		} else if (l % 5 == 0) {
			System.out.println(l);
		} else {
			l -= l % 5;
			System.out.println(l);
		}

		reader.close();
	}

	private static int check(long x) {
		long sum = 0;
		while (x / 5 > 0) {
			sum += x / 5;
			x /= 5;
		}
		if (sum < k) {
			return 2;
		}
		return sum == k ? 1 : 0;
	}

}
