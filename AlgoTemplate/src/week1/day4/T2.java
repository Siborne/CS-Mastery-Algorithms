package week1.day4;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.StreamTokenizer;
import java.util.Arrays;

public class T2 {

	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	private static StreamTokenizer st = new StreamTokenizer(reader);
	private static PrintWriter writer = new PrintWriter(new BufferedOutputStream(System.out));

	private static final int MAXN = (int) 1e5 + 5;
	private static int[] h = new int[MAXN];
	private static int[] cnt = new int[MAXN];

	public static void main(String[] args) throws IOException {
		while (st.nextToken() != StreamTokenizer.TT_EOF) {
			int n = (int) st.nval;

			for (int i = 1; i <= n; i++) {
				st.nextToken();
				h[i] = (int) st.nval;
				for (int j = 1; j * j <= h[i]; j++) {
					if (h[i] % j == 0) {
						if (j < MAXN) {
							cnt[j]++;
						}
						int other = h[i] / j;
						if (j * j != h[i] && other < MAXN) {
							cnt[other]++;
						}
					}
				}
			}

			int x = 0;

			for (int i = MAXN - 5; i >= 1; i--) {
				if (cnt[i] >= 3) {
					x = i;
					break;
				}
			}
			Arrays.sort(h, 1, n + 1);

			int c = 0;
			StringBuilder sb = new StringBuilder();
			for (int i = 1; i <= n; i++) {
				if (h[i] % x == 0) {
					sb.append(h[i]).append(" ");
					c++;
				}
				if (c == 3) {
					break;
				}
			}

			writer.println(sb.toString().trim());
		}
		writer.flush();
		writer.close();
		reader.close();
	}

}
