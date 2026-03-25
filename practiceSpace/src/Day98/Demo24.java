package Day98;

import java.util.Scanner;

public class Demo24 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		for (int i = 1; i <= 100; i++) {
			int n = i;
			while (n < Math.pow(10, 7)) {
				if ((n & 1) == 1) {
					n = n * 5 - 1;
				} else {
					n /= 2;
				}
				if (n == 1) {
					System.out.print(i + " ");
					break;
				}
			}
		}

		reader.close();
	}

}
