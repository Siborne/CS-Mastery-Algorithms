package Day73;

import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		long n = reader.nextLong();
		long l = 1;
		long r = n;
		long mid;
		while (l < r) {
			mid = (l + r) >>> 1;
			if (mid * (mid + 1) / 2 < n) {
				l = mid + 1;
			} else {
				r = mid;
			}
		}

		long a = n - l * (l - 1) / 2;

		if (l % 2 == 0) {
			System.out.println(a + "/" + (l + 1 - a));
		} else {
			System.out.println((l + 1 - a) + "/" + a);
		}

		reader.close();
	}

}
