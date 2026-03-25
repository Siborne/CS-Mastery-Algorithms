package Day110;

import java.util.Scanner;

public class Demo5 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int n = reader.nextInt();

		Solction solution = new Solction();

		System.out.println(solution.lastNonZeroDigit(n));
		reader.close();
	}

	private static class Solction {
		private static int lastNonZeroDigit(int n) {
			int n2 = 0, n5 = 0;
			int ans = 1;
			for (int i = 1; i <= n; i++) {
				int temp = i;
				while (temp % 5 == 0) {
					n5++;
					temp /= 5;
				}
				while (temp % 2 == 0) {
					n2++;
					temp /= 2;
				}
				ans = (ans * temp) % 10;
			}

			for (int i = 0; i < n2 - n5; i++) {
				ans = (ans * 2) % 10;
			}
			return ans;
		}
	}

}
