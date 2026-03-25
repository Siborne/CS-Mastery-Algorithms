package Day63;

import java.util.Scanner;

public class Demo2 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int Y = reader.nextInt();
		int W = reader.nextInt();
		int max = Math.max(Y, W);
		int kn = 6 - max + 1;
		int gcd = gcd(6, kn);
		System.out.println((kn / gcd) + "/" + (6 / gcd));

		reader.close();
	}

	private static int gcd(int a, int b) {
		return b == 0 ? a : gcd(b, a % b);
	}

}
