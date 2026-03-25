package Day108;

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

	private static int m, n, ans;
	private static List<Integer> list = new ArrayList<>();

	public static void main(String[] args) throws IOException {
		while (st.nextToken() != StreamTokenizer.TT_EOF) {
			m = (int) st.nval;
			st.nextToken();
			n = (int) st.nval;
			ans = 0;
			while (n-- > 0) {
				st.nextToken();
				int x = (int) st.nval;
				if (!list.contains(x)) {
					if (list.size() >= m) {
						list.remove(0);
					}
					list.add(x);
					ans++;
				} else {

				}
			}
			writer.println(ans);
		}
		writer.flush();
		writer.close();
		reader.close();
	}

}
