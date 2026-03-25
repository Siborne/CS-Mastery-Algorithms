package week1.day2;

import java.util.Scanner;

public class T1 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int n = reader.nextInt();

		for (int x = 2; x <= n; x++) {
			int sum = 1;
			for (int i = 2; i * i <= x; i++) {
				if (x % i == 0) {
					sum += i;
					sum += x / i != i ? x / i : 0;
				}
			}
			if (sum == x) {
				System.out.println(sum);
			}
		}
		reader.close();
	}

}
