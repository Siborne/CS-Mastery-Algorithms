package week2.day5;

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

	private static int n, m;
	private static long k;
	private static int[] arr, brr;

	public static void main(String[] args) throws IOException {
		while (st.nextToken() != StreamTokenizer.TT_EOF) {
			n = (int) st.nval;
			st.nextToken();
			m = (int) st.nval;
			st.nextToken();
			k = (long) st.nval;
			arr = new int[n + 2];
			brr = new int[m + 2];
			long[] sumA = new long[n + 2];
			long[] sumB = new long[m + 2];
			for (int i = 1; i <= n; i++) {
				st.nextToken();
				arr[i] = (int) st.nval;
				sumA[i] = arr[i] + sumA[i - 1];
			}
			for (int i = 1; i <= m; i++) {
				st.nextToken();
				brr[i] = (int) st.nval;
				sumB[i] = brr[i] + sumB[i - 1];
			}

			int max = 0;
			for (int i = 0; i <= n; i++) {
				if (sumA[i] > k) {
					break;
				}
				int l = 0;
				int r = m;
				int j = 0;
				while (l <= r) {
					int mid = l + ((r - l) >> 1);
					if (sumA[i] + sumB[mid] <= k) {
						l = mid + 1;
						j = mid;
					} else {
						r = mid - 1;
					}
				}
				max = Math.max(max, i + j);
			}
			writer.println(max);
		}
		writer.flush();
		writer.close();
		reader.close();
	}

}
