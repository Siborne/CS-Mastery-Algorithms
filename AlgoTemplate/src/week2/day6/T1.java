package week2.day6;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.StreamTokenizer;

public class T1 {

	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	private static StreamTokenizer st = new StreamTokenizer(reader);
	private static PrintWriter writer = new PrintWriter(new BufferedOutputStream(System.out));

	public static void main(String[] args) throws IOException {
		while (st.nextToken() != StreamTokenizer.TT_EOF) {
			int n = (int) st.nval;
			st.nextToken();
			int k = (int) st.nval;
			int[] h = new int[n];
			int[] w = new int[n];

			int maxLen = 0;
			for (int i = 0; i < n; i++) {
				st.nextToken();
				h[i] = (int) st.nval;
				st.nextToken();
				w[i] = (int) st.nval;
				maxLen = Math.max(maxLen, Math.max(h[i], w[i]));
			}

			int left = 1;
			int right = maxLen;
			int ans = 0;

			while (left <= right) {
				int mid = left + ((right - left) >> 1);

				if (check(h, w, mid, k)) {
					ans = mid;
					left = mid + 1;
				} else {
					right = mid - 1;
				}

			}
			writer.println(ans);
		}
		writer.flush();
		writer.close();
		reader.close();
	}

	private static boolean check(int[] h, int[] w, int len, int k) {
		long total = 0;

		for (int i = 0; i < h.length; i++) {
			long row = h[i] / len;
			long col = w[i] / len;
			total += row * col;
			if (total >= k) {
				return true;
			}
		}
		return total >= k;
	}

}
