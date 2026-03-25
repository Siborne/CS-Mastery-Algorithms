package Day118;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;

public class Demo2 {

	private static BufferedReader reader;
	private static StreamTokenizer st;
	private static PrintWriter writer;

	static {
		reader = new BufferedReader(new InputStreamReader(System.in));
		st = new StreamTokenizer(reader);
		writer = new PrintWriter(new OutputStreamWriter(System.out));
	}

	public static void main(String[] args) throws IOException {
		while (st.nextToken() != StreamTokenizer.TT_EOF) {
			int t = (int) st.nval;
			while (t-- > 0) {
				st.nextToken();
				int x = (int) st.nval;
				st.nextToken();
				int y = (int) st.nval;
				st.nextToken();
				int z = (int) st.nval;

				int maxVal = Math.max(x, Math.max(y, z));
				int count = 0;

				if (x == maxVal) {
					count++;
				}
				if (y == maxVal) {
					count++;
				}
				if (z == maxVal) {
					count++;
				}
				if (count < 2) {
					writer.println("NO");
				} else {
					int a, b, c;
					if (x == maxVal && y == maxVal) {
						a = maxVal;
						b = z;
						c = z;
					} else if (x == maxVal && z == maxVal) {
						a = y;
						b = maxVal;
						c = y;
					} else {
						a = x;
						b = x;
						c = maxVal;
					}

					writer.println("YES");
					writer.println(a + " " + b + " " + c);
				}
			}

		}
		writer.flush();
		writer.close();
		reader.close();
	}

}
