package Day148;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;

public class Demo1 {

	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	private static StreamTokenizer st = new StreamTokenizer(reader);
	private static PrintWriter writer = new PrintWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		while (st.nextToken() != StreamTokenizer.TT_EOF) {
			int t = (int) st.nval;
			while (t-- > 0) {
				st.nextToken();
				int a = (int) st.nval;
				st.nextToken();
				int b = (int) st.nval;
				int k = a / b;
				int p = a % b;
				StringBuilder sb = new StringBuilder();
				sb.append(a).append("=").append(k).append("*").append(b).append("+").append(p);
				writer.println(sb.toString());
			}
		}
		writer.flush();
		writer.close();
		reader.close();
	}

}
