package chuanzhi_8_chusai;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Demo3 {

	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	private static StreamTokenizer st = new StreamTokenizer(reader);
	private static PrintWriter writer = new PrintWriter(new OutputStreamWriter(System.out));

	private static int T, n, m, x, y;

	public static void main(String[] args) throws IOException {
		while (st.nextToken() != StreamTokenizer.TT_EOF) {
			T = (int) st.nval;
			while (T-- > 0) {
				st.nextToken();
				n = (int) st.nval;
				st.nextToken();
				m = (int) st.nval;
				st.nextToken();
				x = (int) st.nval;
				st.nextToken();
				y = (int) st.nval;
				int cntXN = x;
				int cntYN = n - y + 1;
				Set<Integer> setX = new HashSet<>();
				Set<Integer> setY = new HashSet<>();

				while (m-- > 0) {
					st.nextToken();
					int p = (int) st.nval;
					if (p <= x) {
						if (setX.contains(p)) {
							setX.remove(p);
						} else {
							setX.add(p);
						}
					}
					if (p >= y) {
						if (setY.contains(p)) {
							setY.remove(p);
						} else {
							setY.add(p);
						}
					}

					StringBuilder sb = new StringBuilder();
					sb.append(cntXN - setX.size()).append(" ").append(cntYN - setY.size());
					writer.println(sb.toString());
				}
			}

		}
		writer.flush();
		writer.close();
		reader.close();
	}

}
