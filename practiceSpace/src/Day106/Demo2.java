package Day106;

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

	private static final int MAXN = 100001;
	private static int T, n, m, p;
	private static final int[] seats = new int[MAXN];
	

	public static void main(String[] args) throws IOException {
		while (st.nextToken() != StreamTokenizer.TT_EOF) {
			T = (int) st.nval;
			st.nextToken();
			n = (int) st.nval;
			st.nextToken();
			m = (int) st.nval;
			st.nextToken();
			p = (int) st.nval;

		}
		writer.flush();
		writer.close();
		reader.close();
	}

}
