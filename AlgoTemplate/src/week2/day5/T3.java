package week2.day5;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.StreamTokenizer;

public class T3 {

	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	private static StreamTokenizer st = new StreamTokenizer(reader);
	private static PrintWriter writer = new PrintWriter(new BufferedOutputStream(System.out));

	private static int MOD = (int) 1e9 + 7;
	private static int MAXN = (int) 2e5 + 10;

	private static long[] arr = new long[MAXN];
	private static long[] brr = new long[MAXN];
	private static long[] sum = new long[MAXN];
	private static long[] cnt = new long[MAXN];
	private static long[] d = new long[MAXN];

	private static int t;

	public static void main(String[] args) throws IOException {
		while (st.nextToken() != StreamTokenizer.TT_EOF) {
			t = (int) st.nval;
			while (t-- > 0) {
				solve();
			}
		}
		writer.flush();
		writer.close();
		reader.close();
	}

	private static void solve() throws IOException {
		st.nextToken();
		int n = (int) st.nval;

		for (int i = 1; i <= n; i++) {
			cnt[i] = 0;
			d[i] = 0;
		}

		for (int i = 1; i <= n; i++) {
			st.nextToken();
			arr[i] = (long) st.nval;
		}

		for (int i = 1; i <= n; i++) {
			st.nextToken();
			brr[i] = (long) st.nval;
		}

		for (int i = 1; i <= n; i++) {
			sum[i] = sum[i - 1] + brr[i];
		}

		for (int i = 1; i <= n; i++) {
			if (brr[i] >= arr[i]) {
				d[i] += arr[i];
				continue;
			}

			int l = i, r = n;
			while (l < r) {
				int mid = (l + r + 1) >> 1;  
				if (sum[mid] - sum[i - 1] <= arr[i]) {
					l = mid;
				} else {
					r = mid - 1;
				}
			}

			cnt[i]++;
			cnt[l + 1]--;
			d[l + 1] += arr[i] - (sum[l] - sum[i - 1]);
		}

		StringBuilder sb = new StringBuilder();
		for (int i = 1; i <= n; i++) {
			cnt[i] += cnt[i - 1];
			long ans = cnt[i] * brr[i] + d[i];
			sb.append(ans).append(" ");
		}
		writer.println(sb.toString().trim());
	}

}
