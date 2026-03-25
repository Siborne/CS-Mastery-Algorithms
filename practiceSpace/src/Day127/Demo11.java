package Day127;

import java.util.Scanner;

public class Demo11 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int M = reader.nextInt();
		while (M-- > 0) {
			int a = reader.nextInt();
			int b = reader.nextInt();

			int sumA = 1;
			for (int i = 2; i * i <= a; i++) {
				if (a % i == 0) {
					sumA += i;
					if (a / i != i) {
						sumA += a / i;
					}
				}
			}
			if (sumA != b) {
				System.out.println("NO");
				continue;
			}

			int sumB = 1;
			for (int i = 2; i * i <= b; i++) {
				if (b % i == 0) {
					sumB += i;
					if (b / i != i) {
						sumB += b / i;
					}
				}
			}
			if (sumB != a) {
				System.out.println("NO");
				continue;
			}

			System.out.println("YES");
		}

		reader.close();
	}

}
