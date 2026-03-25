package week1.day2;

import java.util.Arrays;
import java.util.Scanner;

public class T4 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int start = reader.nextInt();
		int end = reader.nextInt();

		boolean[] isPrime = new boolean[end + 1];
		Arrays.fill(isPrime, 2, end + 1, true);

		for (int i = 2; i * i <= end; i++) {
			if (isPrime[i]) {
				for (int j = i * i; j <= end; j += i) {
					isPrime[j] = false;
				}
			}
		}

		StringBuilder sb = new StringBuilder();
		for (int i = start; i <= end; i++) {
			if (isPrime[i] && isPrimeNumber(getNum(i))) {
				sb.append(i).append(",");
			}
		}

		if (sb.length() > 0) {
			System.out.println(sb.substring(0, sb.length() - 1));
		} else {
			System.out.println("No");
		}

		reader.close();
	}

	private static int getNum(int num) {
		int res = 0;
		while (num > 0) {
			res = res * 10 + num % 10;
			num /= 10;
		}
		return res;
	}

	private static boolean isPrimeNumber(int num) {
		if (num < 2) {
			return false;
		}
		for (int i = 2; i * i <= num; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

}
