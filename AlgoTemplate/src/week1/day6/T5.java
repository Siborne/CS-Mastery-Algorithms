package week1.day6;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.StreamTokenizer;
import java.util.Arrays;
import java.util.Collections;

public class T5 {

	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	private static StreamTokenizer st = new StreamTokenizer(reader);
	private static PrintWriter writer = new PrintWriter(new BufferedOutputStream(System.out));

	public static void main(String[] args) throws IOException {
		while (st.nextToken() != StreamTokenizer.TT_EOF) {
			int n = (int) st.nval;
			int[] arr = new int[n];
			int[] brr = new int[n];
			int[] crr = new int[n];

			for (int i = 0; i < n; i++) {
				st.nextToken();
				arr[i] = (int) st.nval;
			}
			for (int i = 0; i < n; i++) {
				st.nextToken();
				brr[i] = (int) st.nval;
			}
			for (int i = 0; i < n; i++) {
				st.nextToken();
				crr[i] = (int) st.nval;
			}

			writer.println(Math.max(f(arr, brr, crr, n, 0), Math.max(f(arr, brr, crr, n, 1), f(arr, brr, crr, n, 2))));
		}
		writer.flush();
		writer.close();
		reader.close();
	}

	private static int f(int[] a, int[] b, int[] c, int n, int t) {
		Integer[] s = new Integer[n];
		for (int i = 0; i < n; i++) {
			if (t == 0) {
				s[i] = a[i] - b[i] - c[i];
			} else if (t == 1) {
				s[i] = b[i] - a[i] - c[i];
			} else {
				s[i] = c[i] - b[i] - a[i];
			}
		}

		Arrays.sort(s, Collections.reverseOrder());

		long sum = 0;
		int ans = 0;
		for (int i = 0; i < n; i++) {
			sum += s[i];
			if (sum > 0) {
				ans++;
			} else {
				break;
			}
		}

		return ans == 0 ? -1 : ans;
	}

}
