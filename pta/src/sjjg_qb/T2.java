package sjjg_qb;

import java.util.ArrayList;
import java.util.List;
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

		List<Integer> primes = new ArrayList<>();
		for (int i = 2; i <= n; i++) {
			if (isPrime[i]) {
				primes.add(i);
			}
		}

		int count = 0;
		for (int i = 0; i < primes.size() - 1; i++) {
			if (primes.get(i + 1) - primes.get(i) == 2) {
				count++;
			}
		}
		System.out.println(count);
		reader.close();
	}

}
