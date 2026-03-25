package Day42;

import java.util.Scanner;

public class Demo7 {

	public static long f(int n, int x, int y) {
		if (n == 0)
			return 1;
		int m = 1 << (n - 1);
		if (x <= m && y <= m) {
			return f(n - 1, y, x);
		}
		if (x > m && y <= m) {
			return 3L * m * m + f(n - 1, m - y + 1, m * 2 - x + 1); // 填空
		}
		if (x <= m && y > m) {
			return 1L * m * m + f(n - 1, x, y - m);
		}
		if (x > m && y > m) {
			return 2L * m * m + f(n - 1, x - m, y - m);
		}
		return -1;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int x = in.nextInt();
		int y = in.nextInt();

		System.out.println(f(n, x, y));
	}
}