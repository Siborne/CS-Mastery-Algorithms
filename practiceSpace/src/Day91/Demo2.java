package Day91;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.StreamTokenizer;
import java.util.Arrays;

public class Demo2 {

	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	private static StreamTokenizer st = new StreamTokenizer(reader);
	private static PrintWriter writer = new PrintWriter(new BufferedOutputStream(System.out));

	public static void main(String[] args) throws IOException {
		while (st.nextToken() != StreamTokenizer.TT_EOF) {
			int n = (int) st.nval;
			st.nextToken();
			int w = (int) st.nval;
			int[] coins = new int[n];
			for (int i = 0; i < n; i++) {
				st.nextToken();
				coins[i] = (int) st.nval;
			}
			int[] dp = new int[w + 1];
			Arrays.fill(dp, Integer.MAX_VALUE);
			dp[0] = 0;
			for (int i = 1; i <= w; i++) {
				for (int coin : coins) {
					if (i - coin >= 0 && dp[i - coin] != Integer.MAX_VALUE) {
						dp[i] = Math.min(dp[i], dp[i - coin] + 1);
					}
				}
			}
			writer.println(dp[w]);
		}

		writer.flush();
		writer.close();
		reader.close();
	}

}
