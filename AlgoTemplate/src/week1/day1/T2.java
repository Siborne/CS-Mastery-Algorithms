package week1.day1;

import java.util.Scanner;

public class T2 {

	private static final int MOD = 7;

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int a = reader.nextInt();
		int b = reader.nextInt();

		int base = (int) a % MOD;
		int now = quickMod(base, b, MOD);

		switch (now) {
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		case 0:
			System.out.println("Sunday");
			break;
		}

		reader.close();
	}

	private static int quickMod(int base, int exponent, int mod) {
		int result = 1;
		while (exponent > 0) {
			if ((exponent & 1) == 1) {
				result = (result * base) % mod;
			}
			exponent >>= 1;
			base = (base * base) % mod;
		}
		return result;
	}

}
