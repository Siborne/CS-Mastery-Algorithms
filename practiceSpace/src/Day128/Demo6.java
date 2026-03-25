package Day128;

import java.util.Scanner;

public class Demo6 {

	private static int a, b;

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int red = reader.nextInt();
		int black = reader.nextInt();
		boolean flag = false;
		for (int i = 1; i <= 6; i++) {
			for (int j = 1; j <= 6; j++) {
				for (int j2 = 1; j2 <= 6; j2++) {
					a = 0;
					b = 0;
					calc(i);
					calc(j);
					calc(j2);
					if (a == red && b == black) {
						flag = true;
						break;
					}
				}
				if (flag) {
					break;
				}
			}
			if (flag) {
				break;
			}
		}

		if (flag) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		reader.close();
	}

	private static void calc(int x) {
		if (x == 1 || x == 4) {
			a += x;
		} else {
			b += x;
		}
	}

}
