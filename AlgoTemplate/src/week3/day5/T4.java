package week3.day5;

import java.util.Scanner;

public class T4 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int n = reader.nextInt();
		int x = reader.nextInt();

		System.out.println(fun(n, x));

		reader.close();
	}

	private static long fun(long n, long x) {
		if (n == 0) {
			return 1;
		} else if (n == 1) {
			return 2 * x;
		} else {
			return 2 * x * fun(n - 1, x) - 2 * (n - 1) * fun(n - 2, x);
		}
	}

}
