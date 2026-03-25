package Day100;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.StreamTokenizer;

public class Demo6 {

	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	private static StreamTokenizer st = new StreamTokenizer(reader);
	private static PrintWriter writer = new PrintWriter(new BufferedOutputStream(System.out));

	public static void main(String[] args) throws IOException {
		while (st.nextToken() != StreamTokenizer.TT_EOF) {
//		st.nextToken();
			int n = (int) st.nval;
			st.nextToken();
			int m = (int) st.nval;
			int[][] arr = new int[n][m];
			int sum = 0;
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < m; j++) {
					st.nextToken();
					arr[i][j] = (int) st.nval;
					sum += arr[i][j];
				}
			}

			int res = Integer.MAX_VALUE;
			int count = 0;
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < m; j++) {
					count += arr[i][j];
					if (j == m - 1) {
						res = Math.min(res, Math.abs(sum - 2 * count));
					}
				}
			}
			count = 0;
			for (int j = 0; j < m; j++) {
				for (int i = 0; i < n; i++) {
					count += arr[i][j];
					if (i == n - 1) {
						res = Math.min(res, Math.abs(sum - 2 * count));
					}
				}
			}
			writer.println(res);
		}
		writer.flush();
		writer.close();
		reader.close();
	}

}
