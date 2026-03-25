package Day110;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;

public class Demo3 {

	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	private static StreamTokenizer st = new StreamTokenizer(reader);
	private static PrintWriter writer = new PrintWriter(new OutputStreamWriter(System.out));

	private static int q, ans, m, x;
	private static final int MAXN = 2000;

	public static void main(String[] args) throws IOException {
		while (st.nextToken() != StreamTokenizer.TT_EOF) {
			q = (int) st.nval;
			while (q-- > 0) {
				st.nextToken();
				m = (int) st.nval;
				st.nextToken();
				x = (int) st.nval;
				ans = (x - 1) % m + 1;
				writer.println(ans);
			}
		}
		writer.flush();
		writer.close();
		reader.close();
	}
}
