package Day111;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;

public class Demo5 {

	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	private static StreamTokenizer st = new StreamTokenizer(reader);
	private static PrintWriter writer = new PrintWriter(new OutputStreamWriter(System.out));

	private static long a, b, ans;

	public static void main(String[] args) throws IOException {
		while (st.nextToken() != StreamTokenizer.TT_EOF) {
			a = (long) st.nval;
			st.nextToken();
			b = (long) st.nval;
			if (a == 0 && b == 0) {
				break;
			}
			ans = a + b;
			writer.println(ans);
		}
		writer.flush();
		writer.close();
		reader.close();
	}
}
