package Day92;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.StreamTokenizer;

public class Demo1 {

	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	private static StreamTokenizer st = new StreamTokenizer(reader);
	private static PrintWriter writer = new PrintWriter(new BufferedOutputStream(System.out));

	private static int n, ans, temp;
	private static int[] dp;

	public static void main(String[] args) throws IOException {
		while (st.nextToken() != StreamTokenizer.TT_EOF) {
			n = (int) st.nval;
			ans = Integer.MIN_VALUE;
			dp = new int[n+1];
			for (int i = 1; i <= n; i++) {
				st.nextToken();
				temp = (int) st.nval;
				dp[i] = Math.max(dp[i-1]+temp, temp);
				ans = Math.max(ans, dp[i]);
			}
			writer.println(ans);
		}
		writer.flush();
		writer.close();
		reader.close();
	}

}
