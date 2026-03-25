package g2025;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.StreamTokenizer;

public class T12 {

	private static final int MOD = 998244353;

	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	private static StreamTokenizer st = new StreamTokenizer(reader);
	private static PrintWriter writer = new PrintWriter(new BufferedOutputStream(System.out));

	private static int T, n, last;
	private static long ans, cnt, lastCnt, count;
	private static int[] arr;

	public static void main(String[] args) throws IOException {
		st.nextToken();
		T = (int) st.nval;
		while (T-- > 0) {
			st.nextToken();
			n = (int) st.nval;
			last = -1;
			ans = 0L;
			lastCnt = -1;
			arr = new int[n];
			count = 0;
			for (int i = 0; i < n; i++) {
				st.nextToken();
				arr[i] = (int) st.nval;
				if (last == arr[i]) {
					count += cnt;
					cnt++;
				} else {
					if (lastCnt != -1) {
						ans += count * lastCnt;
					}
					lastCnt = count;
					cnt = 1;
					count = 0;
				}
				if (last != arr[i] && last != -1) {
					ans = (ans + cnt) % MOD;
				}
				last = arr[i];
			}
			if (arr[n - 1] != arr[n - 2]) {
				ans = (ans + 1) % MOD;
			}
			ans = (ans + n + count * lastCnt) % MOD;
			writer.println(ans);
		}
		writer.flush();
		writer.close();
		reader.close();
	}

}
