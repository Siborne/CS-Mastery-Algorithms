package week2.day8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;
import java.util.Arrays;

public class T5 {

	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	private static StreamTokenizer st = new StreamTokenizer(reader);
	private static PrintWriter writer = new PrintWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		while (st.nextToken() != StreamTokenizer.TT_EOF) {
			int T = (int) st.nval;
			while (T-- > 0) {
				st.nextToken();
				int n = (int) st.nval;
				long[] rawArr = new long[n];
				long[] rawBrr = new long[n];
				for (int i = 0; i < n; i++) {
					st.nextToken();
					rawArr[i] = (long) st.nval;
					st.nextToken();
					rawBrr[i] = (long) st.nval;
				}

				Integer[] ord = new Integer[n];
				for (int i = 0; i < n; i++) {
					ord[i] = i;
				}
				Arrays.sort(ord, (i, j) -> Long.compare(rawArr[i], rawArr[j]));
				long[] arr = new long[n];
				long[] brr = new long[n];
				for (int i = 0; i < n; i++) {
					arr[i] = rawArr[ord[i]];
					brr[i] = rawBrr[ord[i]];
				}

				long ans = 0;

				for (int i = 0; i < n; i++) {
					if (brr[i] >= 3) {
						ans++;
					}
				}
				int pos = 0;
				for (int i = 0; i < n; i++) {
					if (brr[i] < 2) {
						continue;
					}
					long limit = 2L * arr[i];
					while (pos < n && arr[pos] < limit) {
						pos++;
					}
					ans += pos - 1 - i;
				}
				for (int j = 0; j < n; j++) {
					if (brr[j] < 2) {
						continue;
					}
					ans += j;
				}

				for (int k = 0; k < n; k++) {
					int i = 0;
					for (int j = k - 1; j > 0; j--) {
						while (i < j && arr[i] + arr[j] <= arr[k]) {
							i++;
						}
						if (i < j) {
							ans += j - i;
						}
					}
				}
				writer.println(ans);
			}
		}
		writer.flush();
		writer.close();
		reader.close();
	}

}
