package Day116;

import java.util.Scanner;

public class Demo7 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int n = reader.nextInt();
		long xorA = 0;
		long xorB = 0;
		long xorC = 0;
		for (int i = 0; i < n; i++) {
			xorA ^= reader.nextLong();
		}
		for (int i = 0; i < n - 1; i++) {
			xorB ^= reader.nextLong();
		}
		for (int i = 0; i < n - 2; i++) {
			xorC ^= reader.nextLong();
		}

		long firstMissingNumber = xorA ^ xorB;
		long secondMissingNumber = xorB ^ xorC;
		System.out.println(firstMissingNumber);
		System.out.println(secondMissingNumber);

		reader.close();
	}

}
