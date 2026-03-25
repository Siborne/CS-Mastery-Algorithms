package Day147;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;
import java.util.ArrayList;
import java.util.List;

public class Demo1 {

	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	private static StreamTokenizer st = new StreamTokenizer(reader);
	private static PrintWriter writer = new PrintWriter(new OutputStreamWriter(System.out));

	private static List<Integer> list = new ArrayList<>();
	private static int n, m;

	public static void main(String[] args) throws IOException {
		while (st.nextToken() != StreamTokenizer.TT_EOF) {
			n = (int) st.nval;
			st.nextToken();
			m = (int) st.nval;
			StringBuilder sb = new StringBuilder();
			for (int i = 1; i <= n; i++) {
				list.add(i);
			}
			int index = 0;
			while (!list.isEmpty()) {
				index = (index + m - 1) % list.size();
				sb.append(list.remove(index)).append(" ");
			}
			writer.println(sb.toString());
		}
		writer.flush();
		writer.close();
		reader.close();
	}

}
