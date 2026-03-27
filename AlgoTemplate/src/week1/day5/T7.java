package week1.day5;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.StreamTokenizer;
import java.util.Arrays;

public class T7 {

	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	private static StreamTokenizer st = new StreamTokenizer(reader);
	private static PrintWriter writer = new PrintWriter(new BufferedOutputStream(System.out));

	private static int N;
	private static long[] a, b, c;

	public static void main(String[] args) throws IOException {
		while (st.nextToken() != StreamTokenizer.TT_EOF) {
			N = (int) st.nval;
			a = new long[N];
			b = new long[N];
			c = new long[N];

			for (int i = 0; i < N; i++) {
				st.nextToken();
				a[i] = (long) st.nval;
			}
			for (int i = 0; i < N; i++) {
				st.nextToken();
				b[i] = (long) st.nval;
			}
			for (int i = 0; i < N; i++) {
				st.nextToken();
				c[i] = (long) st.nval;
			}

			Arrays.sort(a);
			Arrays.sort(c);

			long ans = 0;

			for (int j = 0; j < N; j++) {
				long target = b[j];
				long cntA = lowerBound(a, target);
				long cntC = N - upperBound(c, target);

				ans += cntA * cntC;
			}

			writer.println(ans);
		}
		writer.flush();
		writer.close();
		reader.close();
	}

	private static int lowerBound(long[] arr, long target) {
		int left = 0;
		int right = arr.length;
		while (left < right) {
			int mid = left + ((right - left) >> 1);
			if (arr[mid] < target) {
				left = mid + 1;
			} else {
				right = mid;
			}
		}
		return left;
	}

	private static int upperBound(long[] arr, long target) {
		int left = 0;
		int right = arr.length;
		while (left < right) {
			int mid = left + ((right - left) >> 1);
			if (arr[mid] <= target) {
				left = mid + 1;
			} else {
				right = mid;
			}
		}
		return left;
	}
}
