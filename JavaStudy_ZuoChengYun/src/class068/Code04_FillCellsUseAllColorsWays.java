package class068;

import java.util.Arrays;

public class Code04_FillCellsUseAllColorsWays {

	private static int way1(int n, int m) {
		return f(new int[n], new boolean[m + 1], 0, n, m);
	}

	private static int f(int[] path, boolean[] set, int i, int n, int m) {
		if (i == n) {
			Arrays.fill(set, false);
			int colors = 0;
			for (int c : path) {
				if (!set[c]) {
					set[c] = true;
					colors++;
				}
			}
			return colors == m ? 1 : 0;
		} else {
			int ans = 0;
			for (int j = 1; j <= m; j++) {
				path[i] = j;
				ans += f(path, set, i + 1, n, m);
			}
			return ans;
		}
	}

	private static final int MAXN = (int) 5e3 + 1;
	private static int[][] dp = new int[MAXN][MAXN];
	private static final int MOD = (int) 1e9 + 7;

	private static int way2(int n, int m) {
		for (int i = 1; i <= n; i++) {
			dp[i][1] = m;
		}
		for (int i = 2; i <= n; i++) {
			for (int j = 2; j <= m; j++) {
				dp[i][j] = (int) (((long) dp[i - 1][j] * j) % MOD);
				dp[i][j] = (int) ((((long) dp[i - 1][j - 1] * (m - j + 1)) 
						+ dp[i][j]) % MOD);
			}
		}
		return dp[n][m];
	}

	public static void main(String[] args) {
		int N = 9;
		int M = 0;
		System.out.println("功能测试开始：");
		for (int n = 1; n <= N; n++) {
			for (int m = 0; m <= M; m++) {
				int ans1 = way1(n, m);
				int ans2 = way2(n, m);
				if (ans1 != ans2) {
					System.out.println("出错啦！");
				}
			}
		}
		System.out.println("功能测试结束");

		System.out.println("性能测试开始");
		int n = 5000;
		int m = 4877;
		System.out.println("n : " + n);
		System.out.println("m : " + m);
		long start = System.currentTimeMillis();
		int ans = way2(n, m);
		long end = System.currentTimeMillis();
		System.out.println("取模之后的结果 ： " + ans);
		System.out.println("运行时间 ：" + (end - start) + " 毫秒");
		System.out.println("性能测试结束");
	}

}
