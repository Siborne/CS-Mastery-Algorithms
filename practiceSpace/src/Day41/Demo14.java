package Day41;

import java.util.Scanner;

public class Demo14 {

	private static int high;
	private static int a;
	private static int b;
	private static long ans;
	private static char[] arr = { 'A', 'B' };

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		a = reader.nextInt();
		b = reader.nextInt();

		high = (int) Math.sqrt((a + b) * 2);
		char[][] c = new char[high][high];
		dfs(c, 0);
		System.out.println(ans);

		reader.close();
	}

	private static void dfs(char[][] c, int step) {
		if (step == high) {
			if (check(c)) {
				ans++;
			}
			return;
		}
		for (int i = 0; i < 2; i++) {
			c[high - 1][step] = arr[i];
			dfs(c, step + 1);
		}
	}

	private static boolean check(char[][] c) {
		// TODO Auto-generated method stub
		for (int i = high - 2; i >= 0; i--) {
			for (int j = 0; j <= i; j++) {
				if (c[i + 1][j] == c[i + 1][j + 1]) {
					c[i][j] = 'A';
				} else {
					c[i][j] = 'B';
				}
			}
		}

		int sumA = 0;
		int sumB = 0;
		for (int i = 0; i < high; i++) {
			for (int j = 0; j <= i; j++) {
				if (c[i][j] == 'A') {
					sumA++;
				} else {
					sumB++;
				}
			}
		}

		return a == sumA && b == sumB;
	}

}
