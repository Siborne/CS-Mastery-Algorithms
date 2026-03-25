package Day130;

import java.util.Scanner;

public class Demo10 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		long x1 = reader.nextLong();
		long y1 = reader.nextLong();
		long x2 = reader.nextLong();
		long y2 = reader.nextLong();

		if ((x1 + y1) % 2 != (x2 + y2) % 2) {
			System.out.println(-1);
		} else if (Math.abs(x1 - x2) % 2 == 0) {
			System.out.println(Math.abs(x1 - x2) + Math.abs(y1 - y2));
		} else {
			long option1 = Math.abs(x1 - (x2 + 1)) + Math.abs(y1 - (y2 + 1)) + 1;
			long option2 = Math.abs(x1 - (x2 - 1)) + Math.abs(y1 - (y2 - 1)) + 1;
			System.out.println(Math.min(option1, option2));
		}

		reader.close();
	}

}
