package Day127;

import java.util.Scanner;

public class Demo4 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int x = reader.nextInt();
		int y = reader.nextInt();
		double ansX = 0.5 * x + 0.5 * y;
		double ansY = Math.sqrt(3) * x / 2 - Math.sqrt(3) * y / 2;

		System.out.printf("%.6f %.6f", ansX, ansY);

		reader.close();
	}

}
