package week1.day3;

import java.util.Arrays;
import java.util.Scanner;

public class T2 {

	private static final boolean[] isPrime;

	private static final int MAXN;

	static {
		MAXN = (int) 2e5 + 1;
		isPrime = new boolean[MAXN];
		Arrays.fill(isPrime, 2, MAXN, true);
		for (int i = 2; i * i < MAXN; i++) {
			if (isPrime[i]) {
				for (int j = i * i; j < MAXN; j += i) {
					isPrime[j] = false;
				}
			}
		}
	}

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int n = reader.nextInt();

		if (n - 4 >= 2 && isPrime[n - 4]) {
			System.out.println("2 2 " + (n - 4));
		} else {
			boolean flag = false;
			for (int i = 3; i <= n / 3; i += 2) {
				if (isPrime[i]) {
					int temp = n - i;
					for (int j = 3; j <= temp; j += 2) {
						if (isPrime[j] && isPrime[temp - j]) {
							System.out.println(i + " " + j + " " + (temp - j));
							flag = true;
							break;
						}
					}
					if (flag) {
						break;
					}
				}
			}
		}
		reader.close();
	}

}
