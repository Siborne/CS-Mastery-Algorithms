package class052;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;

public class Code01_LeftRightLess {

	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	private static StreamTokenizer st = new StreamTokenizer(reader);
	private static PrintWriter writer = new PrintWriter(new OutputStreamWriter(System.out));

	private static final int MAXN = 1000001;
	private static final int[] arr = new int[MAXN];
	private static final int[] stack = new int[MAXN];
	private static final int[][] ans = new int[MAXN][2];
	private static int n, r;

	public static void main(String[] args) throws IOException {
		while (st.nextToken() != StreamTokenizer.TT_EOF) {
			n = (int) st.nval;
			for (int i = 0; i < n; i++) {
				st.nextToken();
				arr[i] = (int) st.nval;
			}
			compute();
			for (int i = 0; i < n; i++) {
				writer.println(ans[i][0] + " " + ans[i][1]);
			}
		}
		writer.flush();
		writer.close();
		reader.close();
	}

	private static void compute() {
		r = 0;
		int cur;
		for (int i = 0; i < n; i++) {
			while (r > 0 && arr[stack[r - 1]] >= arr[i]) {
				cur = stack[--r];
				ans[cur][0] = r > 0 ? stack[r - 1] : -1;
				ans[cur][1] = i;
			}
			stack[r++] = i;
		}
		while (r > 0) {
			cur = stack[--r];
			ans[cur][0] = r > 0 ? stack[r - 1] : -1;
			ans[cur][1] = -1;
		}

		for (int i = n - 2; i >= 0; i--) {
			if (ans[i][1] != -1 && arr[ans[i][1]] == arr[i]) {
				ans[i][1] = ans[ans[i][1]][1];
			}
		}
	}

}
