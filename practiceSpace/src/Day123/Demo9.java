package Day123;

import java.util.Scanner;

public class Demo9 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		while (reader.hasNextLong()) {
			long n = reader.nextLong();
			long sum = 1;
			for (int i = 0; i < n; i++) {
				long x = reader.nextLong();
				if ((x & 1) == 1) {
					sum *= x;
				}
			}
			System.out.println(sum);
		}

		reader.close();
	}

}
