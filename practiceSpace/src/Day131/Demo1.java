package Day131;

import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int n = reader.nextInt();
		long xEnd = reader.nextLong();
		long yEnd = reader.nextLong();

		long res = 0;

		for (int i = 0; i < n; i++) {
			long x = reader.nextLong();
			long y = reader.nextLong();
			if (xEnd < x) {
				res += x - xEnd;
			} else if (xEnd > x + i) {
				res += xEnd - (x + i);
			}

			if (yEnd > y) {
				res += yEnd - y;
			} else if (yEnd < y - i) {
				res += (y - i) - yEnd;
			}

		}

		System.out.println(res);
		reader.close();
	}

}
