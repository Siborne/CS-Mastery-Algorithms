package Day148;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;

public class Demo4 {

	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	private static StreamTokenizer st = new StreamTokenizer(reader);
	private static PrintWriter writer = new PrintWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		while (st.nextToken() != StreamTokenizer.TT_EOF) {
			int t = (int) st.nval;
			while (t-- > 0) {
				st.nextToken();
				int l = (int) st.nval;
				st.nextToken();
				int r = (int) st.nval;
				boolean flag = false;
				while (l <= r) {
					if (l % 3 == 0) {
						flag = true;
						break;
					}
					l++;
				}
				writer.println(flag ? "YES" : "NO");
			}
		}
		writer.flush();
		writer.close();
		reader.close();
	}

}
