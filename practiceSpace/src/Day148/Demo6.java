package Day148;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;

public class Demo6 {

	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	private static StreamTokenizer st = new StreamTokenizer(reader);
	private static PrintWriter writer = new PrintWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		while (st.nextToken() != StreamTokenizer.TT_EOF) {
			int t = (int) st.nval;
			while (t-- > 0) {
				st.nextToken();
				int n = (int) st.nval;
				st.nextToken();
				int q = (int) st.nval;
				int[] ans = new int[n + 1];
				for (int i = 1, x; i <= n; i++) {
					ans[i] += ans[i - 1];
					st.nextToken();
					x = (int) st.nval;
					if (isGoodNum(x)) {
						ans[i]++;
					}
				}
				while (q-- > 0) {
					st.nextToken();
					int l = (int) st.nval;
					st.nextToken();
					int r = (int) st.nval;
					writer.println(ans[r] - ans[l - 1]);
				}
			}
		}
		writer.flush();
		writer.close();
		reader.close();
	}

	private static boolean isGoodNum(int num) {
		if ((num & 1) == 0) {
			return true;
		}
		int sqrt = (int) Math.sqrt(num);

		return sqrt * sqrt == num;
	}

}
