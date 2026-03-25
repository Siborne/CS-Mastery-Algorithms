package week1.day2;

import java.util.Scanner;

public class T2 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int n = reader.nextInt();

		boolean[] isPrime = new boolean[n + 1];

		for (int i = 2; i <= n; i++) {
			isPrime[i] = true;
		}

		for (int i = 2; i * i <= n; i++) {
			if (isPrime[i]) {
				for (int j = i * i; j <= n; j += i) {
					isPrime[j] = false;
				}
			}
		}

		int cnt = 0;
		for (int i = 2; i < isPrime.length; i++) {
			cnt += isPrime[i] ? 1 : 0;
		}
		System.out.println(cnt);
		reader.close();
	}

}
