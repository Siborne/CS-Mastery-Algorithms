package Day123;

import java.util.Scanner;

public class Demo15 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		while (reader.hasNextInt()) {
			int x = reader.nextInt();
			int y = reader.nextInt();
			if (x == 0 && y == 0) {
				break;
			}
			boolean flag = true;
			for (int i = x; i <= y; i++) {
				int num = i * i + i + 41;
				if (!isPrime(num)) {
					flag = false;
					break;
				}
			}
			System.out.println(flag?"OK":"Sorry");
		}
		reader.close();
	}

	private static boolean isPrime(int n) {
		if (n <= 1) {
			return false;
		}
		for (int i = 2; i * i <= n; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

}
