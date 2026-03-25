package Day105;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;
import java.util.Arrays;

public class Demo2 {

	private static BufferedReader reader;
	private static StreamTokenizer st;
	private static PrintWriter writer;

	static {
		reader = new BufferedReader(new InputStreamReader(System.in));
		st = new StreamTokenizer(reader);
		writer = new PrintWriter(new OutputStreamWriter(System.out));
	}

	private static int T, ans, n, x, y, a, b;

	public static void main(String[] args) throws IOException {
		while (st.nextToken() != StreamTokenizer.TT_EOF) {
			T = (int) st.nval;
			while (T-- > 0) {
				ans = 0;
				st.nextToken();
				n = (int) st.nval;
				while (n-- > 0) {
					st.nextToken();
					x = (int) st.nval;
					st.nextToken();
					y = (int) st.nval;
					st.nextToken();
					a = (int) st.nval;
					st.nextToken();
					b = (int) st.nval;
					ans = Math.max(Math.abs(x - a) + Math.abs(y - b), ans);
				}
				writer.println(ans);
			}
		}
		writer.flush();
		writer.close();
		reader.close();
	}

}
