package global;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;
import java.util.Arrays;

public class T15 {

	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	private static StreamTokenizer st = new StreamTokenizer(reader);
	private static PrintWriter writer = new PrintWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		while (st.nextToken() != StreamTokenizer.TT_EOF) {
			int n = (int) st.nval;
			st.nextToken();
			int m = (int) st.nval;
			st.nextToken();
			long k = (long) st.nval;

			long[] arr = new long[n];
			long[] brr = new long[m];

			for (int i = 0; i < n; i++) {
				st.nextToken();
				arr[i] = (long) st.nval;
			}
			for (int i = 0; i < m; i++) {
				st.nextToken();
				brr[i] = (long) st.nval;
			}

			Arrays.sort(arr);
			Arrays.sort(brr);

			long left = arr[0] + brr[0];
			long right = arr[n - 1] + brr[m - 1];
			long ans = right;

			while (left <= right) {
				long mid = (left + right) >>> 1;
				if (count(arr, brr, mid) >= k) {
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

	private static long count(long[] arr, long[] brr, long mid) {
		long cnt = 0;
		int j = brr.length - 1;
		for (int i = 0; i < arr.length; i++) {
			while (j >= 0 && arr[i] + brr[j] > mid) {
				j--;
			}
			if (j < 0) {
				break;
			}
			cnt += j + 1;
		}
		return cnt;
	}

}
