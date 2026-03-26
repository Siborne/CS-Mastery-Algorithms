package week1.day3;

import java.util.Arrays;
import java.util.Scanner;

public class T3 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int l = reader.nextInt();
		int r = reader.nextInt();

		boolean[] isPrime = new boolean[r + 1];
		Arrays.fill(isPrime, 2, r + 1, true);
		for (int i = 2; i <= r; i++) {
			if (isPrime[i]) {
				for (int j = i * i; j <= r; j += i) {
					isPrime[j] = false;
				}
			}
		}

		int ans = 0;
		for (int i = l; i <= r; i++) {
			ans += isPrime[i] ? 1 : 0;
		}
		System.out.println(ans);
		reader.close();
	}

}
