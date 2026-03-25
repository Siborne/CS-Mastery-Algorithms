package Day137;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;
import java.util.HashSet;
import java.util.Set;

public class Demo4 {

	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	private static StreamTokenizer st = new StreamTokenizer(reader);
	private static PrintWriter writer = new PrintWriter(new OutputStreamWriter(System.out));

	private static int t, n, m, x, y;

	public static void main(String[] args) throws IOException {
		while (st.nextToken() != StreamTokenizer.TT_EOF) {
			t = (int) st.nval;
			while (t-- > 0) {
				st.nextToken();
				n = (int) st.nval;
				st.nextToken();
				m = (int) st.nval;
				st.nextToken();
				x = (int) st.nval;
				st.nextToken();
				y = (int) st.nval;
				Set<Integer> xSet = new HashSet<>();
				Set<Integer> ySet = new HashSet<>();
				while (m-- > 0) {
					st.nextToken();
					int p = (int) st.nval;
					if (p <= x) {
						if (xSet.contains(p)) {
							xSet.remove(p);
						} else {
							xSet.add(p);
						}
					}
					if (p >= y) {
						if (ySet.contains(p)) {
							ySet.remove(p);
						} else {
							ySet.add(p);
						}
					}
					StringBuilder sb = new StringBuilder();
					sb.append(x - xSet.size()).append(" ").append(n - y + 1 - ySet.size());
					writer.println(sb.toString());
				}
			}
		}
		writer.flush();
		writer.close();
		reader.close();
	}

}
