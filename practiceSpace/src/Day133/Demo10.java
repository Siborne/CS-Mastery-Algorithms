package Day133;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;

public class Demo10 {

	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	private static StreamTokenizer st = new StreamTokenizer(reader);
	private static PrintWriter writer = new PrintWriter(new OutputStreamWriter(System.out));

	private static int n, m;

	public static void main(String[] args) throws IOException {
		while (st.nextToken() != StreamTokenizer.TT_EOF) {
			n = (int) st.nval;
			st.nextToken();
			m = (int) st.nval;
			StringBuilder sb = new StringBuilder();
			sb.append("+");
			for (int i = 0; i < n; i++) {
				sb.append("-");
			}
			sb.append("+");
			sb.append("\n");
			for (int i = 0; i < m; i++) {
				sb.append("|");
				for (int j = 0; j < n; j++) {
					sb.append(" ");
				}
				sb.append("|");
				sb.append("\n");
			}
			sb.append("+");
			for (int i = 0; i < n; i++) {
				sb.append("-");
			}
			sb.append("+");
			sb.append("\n");
			writer.println(sb.toString());
		}
		writer.flush();
		writer.close();
		reader.close();
	}

}
