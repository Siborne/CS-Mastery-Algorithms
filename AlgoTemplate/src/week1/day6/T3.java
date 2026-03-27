package week1.day6;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.StreamTokenizer;
import java.util.Arrays;

public class T3 {

	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	private static StreamTokenizer st = new StreamTokenizer(reader);
	private static PrintWriter writer = new PrintWriter(new BufferedOutputStream(System.out));

	private static class point {
		int index;
		long len;

		private point() {

		}

		private point(int index, long len) {
			this.index = index;
			this.len = len;
		}
	}

	public static void main(String[] args) throws IOException {
		while (st.nextToken() != StreamTokenizer.TT_EOF) {
			int n = (int) st.nval;
			st.nextToken();
			int x = (int) st.nval;
			st.nextToken();
			int y = (int) st.nval;
			point[] points = new point[n];
			for (int i = 0, nx, ny; i < points.length; i++) {
				st.nextToken();
				nx = (int) st.nval;
				st.nextToken();
				ny = (int) st.nval;
				long len = (long) Math.pow(x - nx, 2) + (long) Math.pow(y - ny, 2);
				points[i] = new point(i + 1, len);
			}
			Arrays.sort(points, (o1, o2) -> {
				if (o1.len != o2.len) {
					return Long.compare(o1.len, o2.len);
				}
				return Integer.compare(o1.index, o2.index);
			});

			for (int i = 0; i < 3; i++) {
				writer.println(points[i].index);
			}

		}
		writer.flush();
		writer.close();
		reader.close();
	}

}
