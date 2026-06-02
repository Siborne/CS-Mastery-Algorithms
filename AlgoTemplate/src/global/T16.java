package global;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;
import java.util.Iterator;

public class T16 {

	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	private static StreamTokenizer st = new StreamTokenizer(reader);
	private static PrintWriter writer = new PrintWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		while (st.nextToken() != StreamTokenizer.TT_EOF) {
			int n = (int) st.nval;
			long[] pre = new long[n + 1];
			for (int i = 1; i < pre.length; i++) {
				st.nextToken();
				pre[i] = pre[i - 1] + (long) st.nval;
			}
			long sum = pre[n];
			if (sum % 3 != 0) {
				writer.println(0);
				continue;
			}

			long S = sum / 3;
			long cnt1 = 0;
			long ans = 0;

			for (int k = 1; k <= n - 1; k++) {
				if (k >= 2 && pre[k] == 2 * S) {
					ans += cnt1;
				}
				if (k <= n - 2 && pre[k] == S) {
					cnt1++;
				}
			}

			writer.println(ans);
		}
		writer.flush();
		writer.close();
		reader.close();
	}

}
