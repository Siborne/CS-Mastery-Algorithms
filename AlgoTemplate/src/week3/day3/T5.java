package week3.day3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;
import java.util.HashSet;
import java.util.Set;

public class T5 {

	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	private static StreamTokenizer st = new StreamTokenizer(reader);
	private static PrintWriter writer = new PrintWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		while (st.nextToken() != StreamTokenizer.TT_EOF) {
			int n = (int) st.nval;
			st.nextToken();
			int m = (int) st.nval;
			Set<Long> occupied = new HashSet<>();
			int ans = 0;

			for (int i = 0; i < m; i++) {
				st.nextToken();
				int r = (int) st.nval;
				st.nextToken();
				int c = (int) st.nval;

				long p1 = ((long) r << 32) | c;
				long p2 = ((long) (r + 1) << 32) | c;
				long p3 = ((long) r << 32) | (c + 1);
				long p4 = ((long) (r + 1) << 32) | (c + 1);

				if (!occupied.contains(p1) && !occupied.contains(p2) && !occupied.contains(p3)
						&& !occupied.contains(p4)) {
					occupied.add(p1);
					occupied.add(p2);
					occupied.add(p3);
					occupied.add(p4);
					ans++;
				}

			}

			writer.println(ans);
		}
		writer.flush();
		writer.close();
		reader.close();
	}

}
