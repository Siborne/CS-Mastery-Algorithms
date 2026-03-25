package Day84;

import java.util.Scanner;

public class Demo11 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int t = reader.nextInt();
		while (t-- > 0) {
			long n = reader.nextLong();
			long k = reader.nextLong();
			long x = reader.nextLong();
			if (k * (1 + k) / 2 > x) {
				System.out.println("NO");
			} else if (k * (n - k + 1 + n) / 2 < x) {
				System.out.println("NO");
			} else {
				System.out.println("YES");
			}
		}

		reader.close();
	}

}
