package Day128;

import java.util.Scanner;

public class Demo7 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int t = reader.nextInt();
		while (t-- > 0) {
			long x = reader.nextInt();
			long y = reader.nextInt();
			long z = reader.nextInt();

			if (x + y < z) {
				System.out.println(-1);
				continue;
			}

			long c = x + y - z;
			long m = Math.max(x, z);

			if (c == 0) {
				System.out.println(m + 1);
			} else {
				if (c > m) {
					System.out.println(c);
				} else {
					System.out.println(-1);
				}
			}

		}

		reader.close();
	}

}
