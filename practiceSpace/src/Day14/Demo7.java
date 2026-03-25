package Day14;

import java.util.Scanner;
//1:无需package
//2: 类名必须Main, 不可修改

public class Demo7 {
	public static long ans = 0L;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = 9;
		int b = 16;
		dfs(a, b, 0);
		System.out.println(ans);
		scan.close();
	}

	public static void dfs(int a, int b, int u) {
		if (u == 7) {
			if (a == 0 & b == 0) {
				ans++;
				return;
			}
		}

		for (int i = 0; i <= a; i++) {
			for (int j = 0; j <= b; j++) {
				int k = i + j;
				if (k >= 2 && k <= 5) {
					dfs(a - i, b - j, u + 1);
				}
			}
		}

	}
}