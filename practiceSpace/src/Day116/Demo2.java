package Day116;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;

public class Demo2 {

	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	private static StreamTokenizer st = new StreamTokenizer(reader);
	private static PrintWriter writer = new PrintWriter(new OutputStreamWriter(System.out));

	private static int n, k, maxLength, tempCount, ans, l, r, mid;
	private static int[] L;

	public static void main(String[] args) throws IOException {
		while (st.nextToken() != StreamTokenizer.TT_EOF) {
			n = (int) st.nval;
			st.nextToken();
			k = (int) st.nval;
			L = new int[n];
			maxLength = 0;
			for (int i = 0; i < n; i++) {
				st.nextToken();
				L[i] = (int) st.nval;
				maxLength = Math.max(maxLength, L[i]);
			}
			ans = 0;
			l = 1;
			r = maxLength;
			while (l <= r) {
				mid = l + ((r - l) >> 1);
				tempCount = 0;
				for (int l : L) {
					tempCount += l / mid;
				}
				if (tempCount >= k) {
					ans = mid;
					l = mid + 1;
				} else {
					r = mid - 1;
				}
			}
			writer.println(ans);
		}
		writer.flush();
		writer.close();
		reader.close();
	}

}
