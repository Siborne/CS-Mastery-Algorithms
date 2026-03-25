package Day88;

import java.util.Scanner;

public class Demo2 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int t = reader.nextInt();
		while (t-- > 0) {
			long n = reader.nextLong();
			long k = reader.nextLong();
			if (n >= k * k && (n % 2) == (k % 2)) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}

		reader.close();
	}

}
