package Day148;

import java.util.Scanner;

public class Demo7 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int t = reader.nextInt();
		while (t-- > 0) {
			solve(reader);
		}
		reader.close();
	}

	private static void solve(Scanner reader) {
		int n = reader.nextInt();
		int k = reader.nextInt();
		String s = reader.next();

		if (n < 3) {
			System.out.println(0);
			return;
		}

		// 在字符串前加空格，使下标从1开始
		s = " " + s;

		// dp[i][j]: 考虑前 i 个字符，最多修改 j 次，能得到的最多 "ovo" 子串数量
		int[][] dp = new int[n + 1][k + 1];

		// 初始化为极小值
		for (int i = 0; i <= n; i++) {
			for (int j = 0; j <= k; j++) {
				dp[i][j] = Integer.MIN_VALUE / 2; // 避免加法溢出
			}
		}

		// 初始状态：前0、1、2个字符无法构成"ovo"
		dp[0][0] = dp[1][0] = dp[2][0] = 0;

		// 动态规划
		for (int i = 3; i <= n; i++) {
			// 先继承不选当前三元组的情况
			for (int j = 0; j <= k; j++) {
				dp[i][j] = dp[i - 1][j];
			}

			// 计算将 s[i-2], s[i-1], s[i] 改为 "o", "v", "o" 的代价
			int cost = (s.charAt(i - 2) != 'o' ? 1 : 0) + (s.charAt(i - 1) != 'v' ? 1 : 0)
					+ (s.charAt(i) != 'o' ? 1 : 0);

			// 如果可以承担这个 cost，尝试选择这个三元组
			for (int j = cost; j <= k; j++) {
				if (dp[i - 3][j - cost] != Integer.MIN_VALUE / 2) {
					dp[i][j] = Math.max(dp[i][j], dp[i - 3][j - cost] + 1);
				}
			}
		}

		// 找 dp[n][0..k] 中的最大值
		int ans = 0;
		for (int j = 0; j <= k; j++) {
			ans = Math.max(ans, dp[n][j]);
		}
		System.out.println(ans);
	}
}
