package week2.day3;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.StreamTokenizer;
import java.util.Iterator;

public class T5 {

	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	private static StreamTokenizer st = new StreamTokenizer(reader);
	private static PrintWriter writer = new PrintWriter(new BufferedOutputStream(System.out));

	public static void main(String[] args) throws IOException {
		while (st.nextToken() != StreamTokenizer.TT_EOF) {
			int n = (int) st.nval;
			st.nextToken();
			int m = (int) st.nval;

			int[] diff = new int[n + 1];
			int[] ans = new int[n + 1];
			int[] l = new int[m + 1];
			int[] r = new int[m + 1];
			for (int i = 1; i <= m; i++) {
				st.nextToken();
				l[i] = (int) st.nval;
				st.nextToken();
				r[i] = (int) st.nval;
				diff[l[i]]++;
				if (r[i] + 1 <= n) {
					diff[r[i] + 1]--;
				}
			}

			int sum = 0;
			for (int i = 1; i <= n; i++) {
				diff[i] += diff[i - 1];
				if (diff[i] == 0) {
					sum++;
				}
				ans[i] = ans[i - 1] + (diff[i] == 1 ? 1 : 0);
			}

			for (int i = 1; i <= m; i++) {
				writer.println(ans[r[i]] - ans[l[i] - 1] + sum);
			}

		}
		writer.flush();
		writer.close();
		reader.close();
	}

}
