package Day110;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Demo6 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		long n = reader.nextLong();

		List<Long> factors = primeFactorzation(n);
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < factors.size(); i++) {
			if (i > 0) {
				sb.append(" ");
			}
			sb.append(factors.get(i));
		}
		System.out.println(sb.toString());
		reader.close();
	}

	private static List<Long> primeFactorzation(long n) {
		List<Long> factors = new ArrayList<>();

		while (n % 2 == 0) {
			factors.add(2L);
			n /= 2;
		}
		for (long i = 3; i * i <= n; i += 2) {
			while (n % i == 0) {
				factors.add(i);
				n /= i;
			}
		}

		if (n > 1) {
			factors.add(n);
		}
		return factors;
	}

}
