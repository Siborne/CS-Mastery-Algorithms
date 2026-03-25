package Day40;

import java.util.Arrays;

public class Demo7 {

	private static final int N = 11;
	private static final int J = 305;
	private static String[][] dp = new String[N][J];

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] mp = { 6, 2, 5, 5, 4, 5, 6, 3, 7, 6 };
		for (int i = 0; i < N; i++) {
			Arrays.fill(dp[i], "");
		}

		for (int i = 1; i < 10; i++) {
			for (int j = 1; j < J; j++) {
				dp[i][j] = maxString(dp[i][j - 1], dp[i - 1][j]);

				for (int k = 1; k * mp[i] <= j && k <= 10; k++) {
					String candidate = get((char)('0'+i),k)+dp[i-1][j-k*mp[i]];
					dp[i][j] = maxString(dp[i][j], candidate);
				}
			}
		}

		System.out.println(dp[9][300]);
	}

	private static String maxString(String str1, String str2) {
		if (str1.length() > str2.length()) {
			return str1;
		} else if (str1.length() < str2.length()) {
			return str2;
		} else {
			return str1.compareTo(str2) > 0 ? str1 : str2;
		}
	}

	private static String get(char c, int k) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < k; i++) {
			sb.append(c);
		}
		return sb.toString();
	}

}
