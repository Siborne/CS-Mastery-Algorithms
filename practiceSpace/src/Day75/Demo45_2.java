package Day75;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Demo45_2 {
	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	private static PrintWriter writer = new PrintWriter(new BufferedOutputStream(System.out));

	public static void main(String[] args) throws IOException {

		int t = Integer.parseInt(reader.readLine());
		while (t-- > 0) {
			StringTokenizer st = new StringTokenizer(reader.readLine());
			int n = Integer.parseInt(st.nextToken());
			int k = Integer.parseInt(st.nextToken());
			int[] arr = new int[n];
			st = new StringTokenizer(reader.readLine());
			for (int i = 0; i < n; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}
			int[] brr = new int[n + 1];
			for (int i = 1; i <= n; i++) {
				brr[i] = arr[i - 1] + brr[i - 1];
			}
			int[] dp = new int[n + 1];
			dp[n] = 0;
			for (int i = n - 1; i >= 0; i--) {
				dp[i] = dp[i + 1];
				if (i <= n - k) {
					if (brr[i + k] - brr[i] == 0) {
						int next = i + k + 1;
						if (next <= n) {
							dp[i] = Math.max(dp[i], 1 + dp[next]);
						} else {
							dp[i] = Math.max(dp[i], 1);
						}
					}
				}
			}
			writer.println(dp[0]);
		}
		writer.flush();
		writer.close();
		reader.close();
	}
}
