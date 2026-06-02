package global;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;
import java.util.Arrays;

public class T17 {

	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	private static StreamTokenizer st = new StreamTokenizer(reader);
	private static PrintWriter writer = new PrintWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		while (st.nextToken() != StreamTokenizer.TT_EOF) {
			int n = (int) st.nval;
			st.nextToken();
			int m = (int) st.nval;

			int[] p = new int[n];
			for (int i = 0; i < n; i++) {
				st.nextToken();
				int l = (int) st.nval;
				st.nextToken();
				int r = (int) st.nval;
				p[i] = l + r;
			}

			Arrays.sort(p);

			for (int i = 0; i < m; i++) {
				st.nextToken();
				int L = (int) st.nval;
				st.nextToken();
				int R = (int) st.nval;
				long left = 2L * L;
				long right = 2L * R;

				int lo = lowerBound(p, left);
				int hi = upperBound(p, right);
				writer.println(hi - lo);
			}
		}
		writer.flush();
		writer.close();
		reader.close();
	}

	private static int lowerBound(int[] arr, long target) {
		int l = 0;
		int r = arr.length;
		while (l < r) {
			int mid = (l + r) >> 1;
			if (arr[mid] < target) {
				l = mid + 1;
			} else {
				r = mid;
			}
		}
		return l;
	}

	private static int upperBound(int[] arr, long target) {
		int l = 0;
		int r = arr.length;
		while (l < r) {
			int mid = (l + r) >> 1;
			if (arr[mid] <= target) {
				l = mid + 1;
			} else {
				r = mid;
			}
		}
		return l;
	}
}
