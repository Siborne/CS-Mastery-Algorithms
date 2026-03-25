package Day119;

import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int t = reader.nextInt();
		while (t-- > 0) {
			long n = reader.nextLong();
			long k = reader.nextLong();

			if (n % 2 == 0 || ((n - k) >= 0 && (n - k) % 2 == 0)) {
				System.out.println("YES");
				continue;
			} else {
				System.out.println("NO");
			}
		}

		reader.close();
	}

}
