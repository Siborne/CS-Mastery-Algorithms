package Day147;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;

public class Demo9 {

	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	private static StreamTokenizer st = new StreamTokenizer(reader);
	private static PrintWriter writer = new PrintWriter(new OutputStreamWriter(System.out));

	private static final int MAXN = (int) 2e6 + 10;

	private static int[] queue = new int[MAXN];
	private static int left, right;

	private static long[] arr = new long[MAXN];
	private static long[] sum = new long[MAXN];
	private static int n;
	private static int ans;

	private static void build() {
		left = 0;
		right = 0;
		ans = 0;
	}

	public static void main(String[] args) throws IOException {
		while (st.nextToken() != StreamTokenizer.TT_EOF) {
			build();
			n = (int) st.nval;
			for (int i = 1; i <= n; i++) {
				st.nextToken();
				arr[i] = (long) st.nval;
				arr[i + n] = arr[i];
			}

			for (int i = 1; i <= 2 * n - 1; i++) {
				sum[i] = sum[i - 1] + arr[i];
			}

			for (int i = 1; i <= 2 * n - 1; i++) {
				int leftBound = Math.max(i - n + 1, 1);
				while (left < right && queue[left] < leftBound) {
					left++;
				}

				while (left < right && sum[i] <= sum[queue[right - 1]]) {
					right--;
				}
				queue[right++] = i;

				if (i - n + 1 > 0) {
					if (sum[queue[left]] - sum[i - n] >= 0) {
						ans++;
					}
				}
			}
			writer.println(ans);
		}
		writer.flush();
		writer.close();
		reader.close();
	}

}
