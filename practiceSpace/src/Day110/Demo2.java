package Day110;

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

	private static int n, ans;
	private static final int MAXN = 2000;
	private static int[] x;
	private static int[] y;
	private static int[] a1 = new int[MAXN];
	private static int[] a2 = new int[MAXN];

	public static void main(String[] args) throws IOException {
		while (st.nextToken() != StreamTokenizer.TT_EOF) {
			n = (int) st.nval;
			ans = 0;
			x = new int[n];
			y = new int[n];
			for (int i = 0; i < n; i++) {
				st.nextToken();
				x[i] = (int) st.nval;
			}
			for (int i = 0; i < n; i++) {
				st.nextToken();
				y[i] = (int) st.nval;
				int b1 = y[i] - x[i];
				int b2 = y[i] + x[i];
				a1[b1 + 1000]++;
				a2[b2]++;
			}
			for (int i = 0; i < 2000; i++) {
				for (int j = 0; j < 2000; j++) {
					if (a1[i] + a2[j] > ans) {
						int c = 0;
						for (int k = 0; k < n; k++) {
							if (y[k]-x[k]+1000==i||y[k]+x[k]==j) {
								c++;
							}
						}
						ans = Math.max(ans, c);
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
