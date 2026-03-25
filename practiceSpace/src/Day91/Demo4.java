package Day91;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.StreamTokenizer;

public class Demo4 {

	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	private static StreamTokenizer st = new StreamTokenizer(reader);
	private static PrintWriter writer = new PrintWriter(new BufferedOutputStream(System.out));

	private static int n, w;
	private static int[] coins, dp;

	private static final int MOD = (int) 1e9 + 7;

	public static void main(String[] args) throws IOException {
		while (st.nextToken() != StreamTokenizer.TT_EOF) {
			n = (int) st.nval;
			st.nextToken();
			w = (int) st.nval;
			coins = new int[n];
			for (int i = 0; i < n; i++) {
				st.nextToken();
				coins[i] = (int) st.nval;
			}
			dp = new int[w + 1];
			dp[0] = 1;
			for (int i = 0; i < n; i++) {
				for (int j = coins[i]; j <= w; j++) {
					dp[j] = (dp[j] + dp[j - coins[i]]) % MOD;
				}
			}
			writer.println(dp[w]);
		}
		writer.flush();
		writer.close();
		reader.close();
	}

}
