package Day114;

import java.util.Arrays;
import java.util.Scanner;

public class Demo6 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int[] x = new int[4];
		int[] y = new int[4];
		for (int i = 0; i < x.length; i++) {
			x[i] = reader.nextInt();
		}
		for (int i = 0; i < y.length; i++) {
			y[i] = reader.nextInt();
		}

		int[] z = new int[6];
		z[0] = squareDistance(x[0], y[0], x[1], y[1]);
		z[1] = squareDistance(x[0], y[0], x[2], y[2]);
		z[2] = squareDistance(x[0], y[0], x[3], y[3]);
		z[3] = squareDistance(x[1], y[1], x[2], y[2]);
		z[4] = squareDistance(x[1], y[1], x[3], y[3]);
		z[5] = squareDistance(x[2], y[2], x[3], y[3]);

		Arrays.sort(z);
		if (z[0] > 0 && z[0] == z[1] && z[1] == z[2] && z[1] == z[2] && z[2] == z[3] && z[4] == z[5]
				&& z[4] == 2 * z[0]) {
			System.out.println("It's a square");
		} else {
			System.out.println("Not a square");
		}

		reader.close();
	}

	private static int squareDistance(int x1, int y1, int x2, int y2) {
		return (x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2);
	}

}
