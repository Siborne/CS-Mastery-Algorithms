package Day116;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;

public class Demo1 {

	private static BufferedReader reader;
	private static StreamTokenizer st;
	private static PrintWriter writer;

	static {
		reader = new BufferedReader(new InputStreamReader(System.in));
		st = new StreamTokenizer(reader);
		writer = new PrintWriter(new OutputStreamWriter(System.out));
	}

	public static void main(String[] args) throws IOException {
		while (st.nextToken() != StreamTokenizer.TT_EOF) {
			int T = (int) st.nval;
			while (T-- > 0) {
				st.nextToken();
				int n = (int) st.nval;
				st.nextToken();
				int k = (int) st.nval;
				while (k > 0 && n > 1) {
					n = (n + 1) >> 1;
					k--;
				}
				writer.println(n);
			}
		}
		writer.flush();
		writer.close();
		reader.close();
	}

}
