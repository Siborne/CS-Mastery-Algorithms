package Day90;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.StreamTokenizer;

public class Demo4 {

	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	private static StreamTokenizer st = new StreamTokenizer(reader);
	private static PrintWriter writer = new PrintWriter(new BufferedOutputStream(System.out));
	private static int n, m;
	private static final int MAXN = 1005;
	private static int[][] arr = new int[MAXN][MAXN];
	private static int x1, x2, y1, y2;

	public static void main(String[] args) throws IOException {
		while (st.nextToken() != StreamTokenizer.TT_EOF) {
			n = (int) st.nval;
			st.nextToken();
			m = (int) st.nval;
			for (int i = 0; i < m; i++) {
				st.nextToken();
				x1 = (int) st.nval;
				st.nextToken();
				y1 = (int) st.nval;
				st.nextToken();
				x2 = (int) st.nval;
				st.nextToken();
				y2 = (int) st.nval;
				arr[x1][y1]++;
				arr[x2 + 1][y1]--;
				arr[x1][y2 + 1]--;
				arr[x2 + 1][y2 + 1]++;
			}

			for (int i = 1; i <= n; i++) {
				for (int j = 1; j <= n; j++) {
					arr[i][j] += arr[i - 1][j] + arr[i][j - 1] - arr[i - 1][j - 1];
					writer.print(arr[i][j]);
					if (j != n) {
						writer.print(" ");
					}
				}
				writer.println();
			}

		}
		writer.flush();
		writer.close();
		reader.close();
	}

}
