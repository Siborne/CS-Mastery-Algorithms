package class067;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;

public class Code05_NodenHeightNotLargerThanm {

	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	private static StreamTokenizer st = new StreamTokenizer(reader);
	private static PrintWriter writer = new PrintWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		while (st.nextToken() != StreamTokenizer.TT_EOF) {
			int n = (int) st.nval;
			st.nextToken();
			int m = (int) st.nval;
			writer.println(compute3(n, m));
		}
		writer.flush();
		writer.close();
		reader.close();
	}

	private static final int MAXN = 51;
	private static final int MOD = (int) 1e9 + 7;

	private static long[][] dp1 = new long[MAXN][MAXN];

	static {
		for (int i = 0; i < MAXN; i++) {
			for (int j = 0; j < MAXN; j++) {
				dp1[i][j] = -1;
			}
		}
	}

	private static int compute1(int n, int m) {
		if (n == 0) {
			return 1;
		}
		if (m == 0) {
			return 0;
		}
		if (dp1[n][m] != -1) {
			return (int) dp1[n][m];
		}
		long ans = 0;
		for (int k = 0; k < n; k++) {
			ans = (ans + ((long) compute1(k, m - 1) * (long) compute1(n - k - 1, m - 1)) % MOD) % MOD;
		}
		dp1[n][m] = ans;
		return (int) ans;
	}

	private static long[][] dp2 = new long[MAXN][MAXN];

	private static int compute2(int n, int m) {
		for (int j = 0; j <= m; j++) {
			dp2[0][j] = 1;
		}
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= m; j++) {
				dp2[i][j] = 0;
				for (int k = 0; k < i; k++) {
					dp2[i][j] = (dp2[i][j] + dp2[k][j - 1] * dp2[i - k - 1][j - 1] % MOD) % MOD;
				}
			}
		}
		return (int) dp2[n][m];
	}

	private static long[] dp3 = new long[MAXN];

	private static int compute3(int n, int m) {
		dp3[0] = 1;
		for (int i = 1; i <= n; i++) {
			dp3[i] = 0;
		}
		for (int j = 1; j <= m; j++) {
			for (int i = n; i >= 1; i--) {
				dp3[i] = 0;
				for (int k = 0; k < i; k++) {
					dp3[i] = (dp3[i] + dp3[k] * dp3[i - k - 1] % MOD) % MOD;
				}
			}
		}
		return (int) dp3[n];
	}

}
