package week1.day3;

import java.util.Arrays;
import java.util.Scanner;

public class T4 {

	private static final int MAXN = (int) 1e7 + 1;

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int l = reader.nextInt();
		int r = reader.nextInt();

		boolean[] isPrime = new boolean[MAXN];
		int[] primeNumber = new int[MAXN];
		int ans = 0;
		Arrays.fill(isPrime, 2, MAXN, true);
		for (int i = 2; i < MAXN; i++) {
			if (isPrime[i]) {
				for (int j = i ; j < MAXN; j += i) {
					isPrime[j] = false;
					int k = j;
					while (k%i==0) {
						k/=i;
						primeNumber[j]++;
					}
				}
			}
		}
		for (int i = l; i <= r; i++) {
			ans = Math.max(ans, primeNumber[i]);
		}
		System.out.println(ans);
		reader.close();
	}

}
