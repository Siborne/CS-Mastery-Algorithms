package week2.day5;

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

	public static void main(String[] args) throws IOException {
		while (st.nextToken() != StreamTokenizer.TT_EOF) {
			int n = (int) st.nval;
			st.nextToken();
			int k = (int) st.nval;
			int[][] diff = new int[n + 2][2];
			while (k-- > 0) {
				st.nextToken();
				int l = (int) st.nval;
				st.nextToken();
				int r = (int) st.nval;
				diff[l][0]++;
				diff[r + 1][0]--;
			}
			for (int i = 1; i <= n; i++) {
				diff[i][0] += diff[i - 1][0];
				diff[i][1] = i;
			}
			Arrays.sort(diff, 1, n + 1, (o1, o2) -> {
				if (o1[0] != o2[0]) {
					return Integer.compare(o1[0], o2[0]);
				}
				return Integer.compare(o1[1], o2[1]);
			});
			st.nextToken();
			int q = (int) st.nval;
			for (int i = 0; i < q; i++) {
				st.nextToken();
				int x = (int) st.nval;

				if (x > diff[n][0]) {
					writer.println(-1);
					continue;
				}
				int l = 1, r = n;
				int j = 0;
				while (l <= r) {
					int mid = l + ((r - l) >> 1);
					if (diff[mid][0] >= x) {
						r = mid - 1;
						j = diff[mid][1];
					} else {
						l = mid + 1;
					}
				}
				writer.println(j);
			}
		}
		writer.flush();
		writer.close();
		reader.close();
	}

}
