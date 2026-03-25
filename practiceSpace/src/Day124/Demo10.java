package Day124;

import java.util.Scanner;

public class Demo10 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		while (reader.hasNextInt()) {
			int n = reader.nextInt() - 1;
			int res = reader.nextInt();
			while (n-- > 0) {
				int x = reader.nextInt();
				res = lcm(res, x);
			}
			System.out.println(res);
		}
		reader.close();
	}

	private static int gcd(int a, int b) {
		while (b != 0) {
			int temp = b;
			b = a % b;
			a = temp;
		}
		return a;
	}

	private static int lcm(int a, int b) {
		return a / gcd(a, b) * b;
	}

}
