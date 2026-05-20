package week3.day3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;
import java.util.HashSet;

public class T2 {

	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	private static StreamTokenizer st = new StreamTokenizer(reader);
	private static PrintWriter writer = new PrintWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		while (st.nextToken() != StreamTokenizer.TT_EOF) {
			int n = (int) st.nval;
			int[] s = new int[n];
			for (int i = 0; i < n; i++) {
				st.nextToken();
				s[i] = (int) st.nval;
			}

			int ans = 0;

			for (int l = 0; l < n; l++) {
				HashSet<Integer> set = new HashSet<>();
				int odd = 0;
				int even = 0;

				for (int r = l; r < n; r++) {
					if (set.add(s[r])) {
						if ((s[r] & 1) == 0) {
							even++;
						} else {
							odd++;
						}
					}

					if (odd == even && odd > 0) {
						ans = Math.max(ans, set.size());
					}
				}
			}

			writer.println(ans);
		}
		writer.flush();
		writer.close();
		reader.close();
	}

}
