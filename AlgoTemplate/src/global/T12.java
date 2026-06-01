package global;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;

public class T12 {

	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	private static StreamTokenizer st = new StreamTokenizer(reader);
	private static PrintWriter writer = new PrintWriter(new OutputStreamWriter(System.out));

	private static long[] arr;
	private static int n, m;

	public static void main(String[] args) throws IOException {
		while (st.nextToken() != StreamTokenizer.TT_EOF) {
			n = (int) st.nval;
			st.nextToken();
			m = (int) st.nval;

			arr = new long[n];
			long maxL = 0;
			for (int i = 0; i < n; i++) {
				st.nextToken();
				arr[i] = (long) st.nval;
				maxL = Math.max(maxL, arr[i]);
			}

			long left = 1;
			long right = maxL;
			long ans = maxL;
			while (left <= right) {
				long mid = (left + right) >>> 1;
				if (check(mid)) {
					ans = mid;
					right = mid - 1;
				} else {
					left = mid + 1;
				}
			}
			writer.println(ans);
		}
		writer.flush();
		writer.close();
		reader.close();
	}

	private static boolean check(long x) {
		long cnt = 0;
		for (int i = 0; i < n; i++) {
			cnt += (arr[i] + x - 1) / x - 1;
			if (cnt > m) {
				return false;
			}
		}
		return cnt <= m;
	}

}
