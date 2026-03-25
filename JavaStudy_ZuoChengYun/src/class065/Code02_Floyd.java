package class065;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;

public class Code02_Floyd {

	private static final int MAXN = (int) 1e2 + 1;
	private static final int MAXM = (int) 1e4 + 1;

	private static int[] path = new int[MAXM];
	private static int[][] distance = new int[MAXN][MAXN];

	private static int n, m, ans;

	private static void build() {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				distance[i][j] = Integer.MAX_VALUE;
			}
		}
	}

	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	private static StreamTokenizer st = new StreamTokenizer(reader);
	private static PrintWriter writer = new PrintWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		while (st.nextToken() != StreamTokenizer.TT_EOF) {
			n = (int) st.nval;
			st.nextToken();
			m = (int) st.nval;
			for (int i = 0; i < m; i++) {
				st.nextToken();
				path[i] = (int) st.nval - 1;
			}
			build();
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					st.nextToken();
					distance[i][j] = (int) st.nval;
				}
			}
			floyd();
			ans = 0;
			for (int i = 1; i < m; i++) {
				ans += distance[path[i - 1]][path[i]];
			}
			writer.println(ans);
		}
		writer.flush();
		writer.close();
		reader.close();
	}

	private static void floyd() {
		for (int bridge = 0; bridge < n; bridge++) {
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					if (distance[i][bridge] != Integer.MAX_VALUE && distance[bridge][j] != Integer.MAX_VALUE
							&& distance[i][j] > distance[i][bridge] + distance[bridge][j]) {
						distance[i][j] = distance[i][bridge] + distance[bridge][j];
					}
				}
			}
		}
	}

}
