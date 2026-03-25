package Day108;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;

public class Demo5 {

	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	private static StreamTokenizer st = new StreamTokenizer(reader);
	private static PrintWriter writer = new PrintWriter(new OutputStreamWriter(System.out));

	private static final int MAXN = (int) 3e5 + 5;
	private static final int[] timeQueue = new int[MAXN];
	private static final int[] countryQueue = new int[MAXN];
	private static int[] cnt = new int[(int) 1e5 + 5];

	private static int head = 0;
	private static int tail = -1;

	private static int ans;

	private static int n;

	public static void main(String[] args) throws IOException {
		while (st.nextToken() != StreamTokenizer.TT_EOF) {
			n = (int) st.nval;
			while (n-- > 0) {
				st.nextToken();
				int t = (int) st.nval;
				st.nextToken();
				int k = (int) st.nval;
				for (int i = 0; i < k; i++) {
					st.nextToken();
					int x = (int) st.nval;

					tail++;
					timeQueue[tail] = t;
					countryQueue[tail] = x;
					cnt[x]++;
					if (cnt[x] == 1) {
						ans++;
					}
				}
				while (head <= tail && t - timeQueue[head] >= 86400) {
					int country = countryQueue[head];
					cnt[country]--;
					if (cnt[country] == 0) {
						ans--;
					}
					head++;
				}
				writer.println(ans);
			}
		}
		writer.flush();
		writer.close();
		reader.close();
	}

}
