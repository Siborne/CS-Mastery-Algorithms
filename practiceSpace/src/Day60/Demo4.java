package Day60;

import java.util.Scanner;

public class Demo4 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int a = reader.nextInt();
		int b = reader.nextInt();
		int c = reader.nextInt();
		int d = reader.nextInt();
		int max = Math.max(a, Math.max(b, Math.max(c, d)));
		int x1 = 0, x2 = 0, x3 = 0, x4 = 0;
		if (max == a) {
			x4 = a;
			x1 = b;
			x2 = c;
			x3 = d;
		} else if (max == b) {
			x4 = b;
			x1 = a;
			x2 = c;
			x3 = d;
		} else if (max == c) {
			x4 = c;
			x1 = a;
			x2 = b;
			x3 = d;
		} else if (max == d) {
			x4 = d;
			x1 = a;
			x2 = b;
			x3 = c;
		}

		a = x4 - x3;
		b = x4 - x2;
		c = x4 - x1;
		System.out.println(a + " " + b + " " + c);
		reader.close();
	}

}
