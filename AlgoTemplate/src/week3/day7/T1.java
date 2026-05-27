package week3.day7;

import java.util.Scanner;

public class T1 {

	private static int n, ans;
	private static int[] digits = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

	private static int toNum(int l, int r) {
		int res = 0;
		for (int i = l; i < r; i++) {
			res = res * 10 + digits[i];
		}
		return res;
	}

	private static void check() {
		for (int i = 0; i <= 7; i++) {
			int a = toNum(0, i);
			if (a >= n) {
				continue;
			}
			for (int j = i + 1; j <= 8; j++) {
				int b = toNum(i, j);
				int c = toNum(j, 9);
				if (b % c != 0) {
					continue;
				}
				if (a + b / c == n) {
					ans++;
				}
			}
		}
	}

	private static void dfs(int pos) {
		if (pos == 9) {
			check();
			return;
		}
		for (int i = pos; i < 9; i++) {
			int tmp = digits[pos];
			digits[pos] = digits[i];
			digits[i] = tmp;

			dfs(pos + 1);

			tmp = digits[pos];
			digits[pos] = digits[i];
			digits[i] = tmp;
		}
	}

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		n = reader.nextInt();
		ans = 0;
		
		dfs(0);
		System.out.println(ans);
		
		reader.close();
	}

}
