package week3.day5;

import java.util.Scanner;

public class T3 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int m = reader.nextInt();
		int n = reader.nextInt();

		System.out.println(fun(m, n));
		
		reader.close();
	}

	private static int fun(int m, int n) {
		if (m == 0) {
			return n + 1;
		} else if (m > 0 && n == 0) {
			return fun(m - 1, 1);
		} else {
			return fun(m - 1, fun(m, n - 1));
		}
	}

}
