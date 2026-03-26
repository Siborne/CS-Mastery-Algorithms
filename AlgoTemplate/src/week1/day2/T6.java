package week1.day2;

import java.util.Scanner;

public class T6 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		long n = reader.nextLong();
		long totalZeros = 0;

		for (long i = 5; i <= n; i *= 5) {
			for (long j = i; j <= n; j += i) {
				totalZeros += (n - j + 1);
			}
		}
		System.out.println(totalZeros);
		reader.close();
	}

}
