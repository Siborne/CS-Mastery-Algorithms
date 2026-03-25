package Day148;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;

public class Demo5 {

	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	private static StreamTokenizer st = new StreamTokenizer(reader);
	private static PrintWriter writer = new PrintWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		while (st.nextToken() != StreamTokenizer.TT_EOF) {
			int t = (int) st.nval;
			while (t-- > 0) {
				st.nextToken();
				int n = (int) st.nval;
				st.nextToken();
				int m = (int) st.nval;
				int ans = 0;
				for (int i = 0; i < n; i++) {
					for (int j = 0; j < m; j++) {
						st.nextToken();
						ans |= (int) st.nval;
					}
				}
				writer.println(ans);
			}
		}
		writer.flush();
		writer.close();
		reader.close();
	}

}
