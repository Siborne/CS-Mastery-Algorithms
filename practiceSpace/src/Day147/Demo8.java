package Day147;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;

public class Demo8 {

	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	private static StreamTokenizer st = new StreamTokenizer(reader);
	private static PrintWriter writer = new PrintWriter(new OutputStreamWriter(System.out));

	private static final int MAXN = (int) 5e5 + 1;
	private static int[] queue = new int[MAXN];
	private static int head, tail;

	private static int[] sum = new int[MAXN];
	private static int n, m;
	private static int ans;

	private static void build() {
		head = tail = 0;
		ans = Integer.MIN_VALUE;
	}

	public static void main(String[] args) throws IOException {
		while (st.nextToken() != StreamTokenizer.TT_EOF) {
			n = (int) st.nval;
			st.nextToken();
			m = (int) st.nval;
			for (int i = 1, x; i <= n; i++) {
				st.nextToken();
				x = (int) st.nval;
				sum[i] = sum[i - 1] + x;
			}
			build();

			queue[tail++] = 0;
			for (int i = 1; i <= n; i++) {
				while (head < tail && queue[head] < i - m) {
					head++;
				}

				ans = Math.max(ans, sum[i] - sum[queue[head]]);

				while (head < tail && sum[queue[tail - 1]] >= sum[i]) {
					tail--;
				}
				queue[tail++] = i;
			}

			writer.println(ans);
		}
		writer.flush();
		writer.close();
		reader.close();
	}

}