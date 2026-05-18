package week2.day8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;

public class T4 {

	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	private static StreamTokenizer st = new StreamTokenizer(reader);
	private static PrintWriter writer = new PrintWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		while (st.nextToken() != StreamTokenizer.TT_EOF) {
			int n = (int) st.nval;
			st.nextToken();
			int g = (int) st.nval;
			int[] arr = new int[n];
			for (int i = 0; i < n; i++) {
				st.nextToken();
				arr[i] = (int) st.nval;
			}
			boolean[] good = new boolean[n];
			for (int i = 0; i < n; i++) {
				good[i] = (arr[i] % g == 0);
			}

			long ans = 0;
			int i = 0;
			while (i < n) {
				if (!good[i]) {
					i++;
					continue;
				}
				int j = i;
				while (j < n && good[j]) {
					j++;
				}
				long len = j - i;
				ans += len * (len - 1) / 2;
				i = j;
			}

			int[] left = new int[n];
			for (int j = 0; j < n; j++) {
				if (j > 0 && good[j - 1]) {
					left[j] = left[j - 1] + 1;
				} else {
					left[j] = 0;
				}
			}

			int[] right = new int[n];
			for (int j = n - 1; j >= 0; j--) {
				if (j + 1 < n && good[j + 1]) {
					right[j] = right[j + 1] + 1;
				} else {
					right[j] = 0;
				}
			}

			for (int j = 0; j < n; j++) {
				if (good[j]) {
					continue;
				}
				long l = left[j];
				long r = right[j];
				ans += (l + 1) * (r + 1) - 1;
			}
			writer.println(ans);
		}
		writer.flush();
		writer.close();
		reader.close();
	}

}
