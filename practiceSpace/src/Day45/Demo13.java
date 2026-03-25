package Day45;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Demo13 {

	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	private static PrintWriter writer = new PrintWriter(new BufferedOutputStream(System.out));

	public static void main(String[] args) throws IOException {
		int t = Integer.parseInt(reader.readLine());
		while (t-- > 0) {
			solve();
		}
		writer.flush();
		writer.close();
		reader.close();
	}

	private static void solve() throws IOException {
		StringTokenizer st = new StringTokenizer(reader.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int q = Integer.parseInt(st.nextToken());
		long[][] arr = new long[n][m];
		long[][] brr = new long[n + 2][m + 2];
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(reader.readLine());
			for (int j = 0; j < m; j++) {
				arr[i][j] = Long.parseLong(st.nextToken());
			}
		}

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= m; j++) {
				brr[i][j] = arr[i - 1][j - 1] + brr[i - 1][j] + brr[i][j - 1] - brr[i - 1][j - 1];
			}
		}

		long ans = 0;
		while (q-- > 0) {
			st = new StringTokenizer(reader.readLine());
		    int u = Integer.parseInt(st.nextToken());
		    int v = Integer.parseInt(st.nextToken());
		    int x = Integer.parseInt(st.nextToken());
		    int y = Integer.parseInt(st.nextToken());

		    long sum = brr[x][y] - brr[u - 1][y] - brr[x][v - 1] + brr[u - 1][v - 1];
		    ans ^= sum;
		}
		writer.println(ans);
	}
}
