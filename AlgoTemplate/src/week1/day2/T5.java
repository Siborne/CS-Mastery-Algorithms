package week1.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class T5 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int n = reader.nextInt();

		List<Integer> primes = searchPrime(n);

		for (int i = 4; i <= n; i += 2) {
			String res = addPrimes(i, primes);
			System.out.println(i + "=" + res);
		}

		reader.close();
	}

	private static List<Integer> searchPrime(int n) {
		boolean[] isPrime = new boolean[n + 1];

		Arrays.fill(isPrime, 2, n + 1, true);

		for (int i = 2; i * i <= n; i++) {
			if (isPrime[i]) {
				for (int j = i * i; j <= n; j += i) {
					isPrime[j] = false;
				}
			}
		}

		List<Integer> primes = new ArrayList<>();
		for (int i = 2; i < isPrime.length; i++) {
			if (isPrime[i]) {
				primes.add(i);
			}
		}
		return primes;
	}

	private static String addPrimes(int x, List<Integer> primes) {
		for (int prime : primes) {
			if (prime > x / 2) {
				break;
			}
			if (primes.contains(x - prime)) {
				return prime + "+" + (x - prime);
			}
		}
		return "";
	}

}
