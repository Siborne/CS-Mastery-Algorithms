package Day92;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.StreamTokenizer;

public class Demo3 {

	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	private static StreamTokenizer st = new StreamTokenizer(reader);
	private static PrintWriter writer = new PrintWriter(new BufferedOutputStream(System.out));

	private static int n, m;
	private static int[] arr, dp;

	public static void main(String[] args) throws IOException {
		while (st.nextToken() != StreamTokenizer.TT_EOF) {
			n = (int) st.nval;
			st.nextToken();
			m = (int) st.nval;
			arr = new int[n];
			for (int i = 0; i < n; i++) {
				st.nextToken();
				arr[i] = (int) st.nval;
			}
			dp = new int[m + 1];
			dp[0] = 1;
			for (int a : arr) {
				for (int i = m; i >= a; i--) {
					dp[i] += dp[i - a];
				}
			}
			writer.println(dp[m]);
		}
		writer.flush();
		writer.close();
		reader.close();
	}

}
