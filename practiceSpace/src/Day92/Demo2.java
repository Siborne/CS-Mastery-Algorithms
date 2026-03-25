package Day92;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.StreamTokenizer;

public class Demo2 {

	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	private static StreamTokenizer st = new StreamTokenizer(reader);
	private static PrintWriter writer = new PrintWriter(new BufferedOutputStream(System.out));

	private static int v, n;
	private static int[] arr, dp;

	public static void main(String[] args) throws IOException {
		while (st.nextToken() != StreamTokenizer.TT_EOF) {
			v = (int) st.nval;
			st.nextToken();
			n = (int) st.nval;
			arr = new int[n];
			for (int i = 0; i < n; i++) {
				st.nextToken();
				arr[i] = (int) st.nval;
			}
			dp = new int[v + 1];
			for (int i = 1; i <= v; i++) {
				dp[i] = i;
			}
			for (int a : arr) {
				for (int i = v; i >= a; i--) {
					dp[i] = Math.min(dp[i], dp[i-a]);
				}
			}
			writer.println(dp[v]);
		}
		writer.flush();
		writer.close();
		reader.close();
	}

}
