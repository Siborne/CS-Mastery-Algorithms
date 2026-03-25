package Day107;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;
import java.util.ArrayList;
import java.util.List;

public class Demo9 {

	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	private static StreamTokenizer st = new StreamTokenizer(reader);
	private static PrintWriter writer = new PrintWriter(new OutputStreamWriter(System.out));

	private static int n, m;
	private static List<Integer> list = new ArrayList<>();

	public static void main(String[] args) throws IOException {
		while (st.nextToken() != StreamTokenizer.TT_EOF) {
			n = (int) st.nval;
			st.nextToken();
			m = (int) st.nval;
			for (int i = 1; i <= n; i++) {
				list.add(i);
			}
			StringBuilder sb = new StringBuilder();
			int pos = 0;
			while (!list.isEmpty()) {
				pos = (pos + m - 1) % list.size();
				int out = list.remove(pos);
				sb.append(out).append(" ");
			}
			writer.println(sb.toString().trim());
		}
		writer.flush();
		writer.close();
		reader.close();
	}

}
