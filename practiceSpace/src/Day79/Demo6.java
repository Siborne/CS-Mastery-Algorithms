package Day79;

import java.util.Scanner;

public class Demo6 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int t = reader.nextInt();
		while (t-- > 0) {
			int n = reader.nextInt();
			int tmp = n;
			int count = 0;
			int m = 0;

			while (tmp != 0) {
				count++;
				m = tmp % 10;
				tmp /= 10;
			}

			int temp = 0;
			int digit = m;
			for (int i = 0; i < count; i++) {
				temp = temp * 10 + digit;
			}
			if (n >= temp) {
				System.out.println((count - 1) * 9 + m);
			} else {
				System.out.println((count - 1) * 9 + m - 1);
			}
		}

		reader.close();
	}

}
