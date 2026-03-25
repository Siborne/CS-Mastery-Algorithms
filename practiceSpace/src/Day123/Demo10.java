package Day123;

import java.util.Scanner;

public class Demo10 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		while (reader.hasNextLong()) {
			long n = reader.nextLong();
			long m = reader.nextLong();
			if (n > m) {
				long temp = n;
				n = m;
				m = temp;
			}
			long oddSum = 0;
			long evenSum = 0;
			for (long i = n; i <= m; i++) {
				if ((i & 1) == 1) {
					oddSum += (i * i * i);
				} else {
					evenSum += (i * i);
				}
			}
			System.out.println(evenSum + " " + oddSum);
		}

		reader.close();
	}

}
