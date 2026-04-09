package week2.day7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;
import java.util.Arrays;

public class T2 {

	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	private static StreamTokenizer st = new StreamTokenizer(reader);
	private static PrintWriter writer = new PrintWriter(new OutputStreamWriter(System.out));

	private static int n;
	private static long[] w;

	public static void main(String[] args) throws IOException {
		while (st.nextToken() != StreamTokenizer.TT_EOF) {
			n = (int) st.nval;
			w = new long[2 * n];
			for (int i = 0; i < 2 * n; i++) {
				st.nextToken();
				w[i] = (long) st.nval;
			}
			long ans = 0;
			Arrays.sort(w);
			for (int l = 0, r = 2 * n - 1; l < r; l++, r--) {
				ans += w[l] * w[r];
			}
			writer.println(ans);
		}
		writer.flush();
		writer.close();
		reader.close();
	}

}
