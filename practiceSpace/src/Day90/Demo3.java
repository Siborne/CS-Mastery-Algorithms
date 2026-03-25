package Day90;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.StreamTokenizer;

public class Demo3 {

	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	private static StreamTokenizer st = new StreamTokenizer(reader);
	private static PrintWriter writer = new PrintWriter(new BufferedOutputStream(System.out));
	private static int l, r;

	public static void main(String[] args) throws IOException {
		while (st.nextToken() != StreamTokenizer.TT_EOF) {
			l = (int) st.nval;
			st.nextToken();
			r = (int) st.nval;
			long ans = 0;
			for (int i = l; i <= r; i++) {
				int j = i;
				while (j > 0) {
					if (j % 10 == 2) {
						ans++;
					}
					j /= 10;
				}
			}
			writer.println(ans);
		}

		writer.flush();
		writer.close();
		reader.close();
	}

}
