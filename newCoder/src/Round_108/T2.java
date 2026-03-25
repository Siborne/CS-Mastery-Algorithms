package Round_108;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class T2 {

	private static BufferedReader reader;
	private static StreamTokenizer st;
	private static PrintWriter writer;
	private static List<Integer> odd;
	private static List<Integer> even;

	static {
		reader = new BufferedReader(new InputStreamReader(System.in));
		st = new StreamTokenizer(reader);
		writer = new PrintWriter(new OutputStreamWriter(System.out));
		odd = new ArrayList<>();
		even = new ArrayList<>();
	}

	private static int T, n, x;

	public static void main(String[] args) throws IOException {
		while (st.nextToken() != StreamTokenizer.TT_EOF) {
			T = (int) st.nval;
			while (T-- > 0) {
				st.nextToken();
				n = (int) st.nval;
				odd.clear();
				even.clear();
				for (int i = 0; i < n; i++) {
					st.nextToken();
					x = (int) st.nval;
					if ((x & 1) == 1) {
						odd.add(x);
					} else {
						even.add(x);
					}
				}
				Collections.sort(even);
				Collections.sort(odd);
				StringBuilder res = new StringBuilder();
				for (int x : even) {
					res.append(x).append(" ");
				}
				for (int x : odd) {
					res.append(x).append(" ");
				}
				writer.println(res.toString());
			}
		}
		writer.flush();
		writer.close();
		reader.close();
	}

}
