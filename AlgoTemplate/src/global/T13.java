package global;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;

public class T13 {

	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	private static StreamTokenizer st = new StreamTokenizer(reader);
	private static PrintWriter writer = new PrintWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		while (st.nextToken() != StreamTokenizer.TT_EOF) {
			int n = (int) st.nval;
			st.nextToken();
			long m = (long) st.nval;
			long[] arr = new long[n];
			for (int i = 0; i < n; i++) {
				st.nextToken();
				arr[i] = (long) st.nval;
			}
			long left = 1;
			long right = arr[n - 1];
			long ans = right;
			while (left <= right) {
				long mid = (left + right) >>> 1;
				if (check(arr, m, mid)) {
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

	private static boolean check(long[] arr, long m, long L) {
		long sum = 0;
		long prev = 0;
		for (int i = 0; i < arr.length; i++) {
			long d = arr[i] - prev;
			if (d > L) {
				sum += (d + L - 1) / L - 1;
				if (sum > m + 1) {
					return false;
				}
			}
			prev = arr[i];
		}

		return sum <= m + 1;
	}

}
