package Day92;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.StreamTokenizer;
import java.math.BigInteger;

public class Demo5 {
	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	private static StreamTokenizer st = new StreamTokenizer(reader);
	private static PrintWriter writer = new PrintWriter(new BufferedOutputStream(System.out));

	private static int m, n, len;
	private static BigInteger a, b, c;
	static {
		a = BigInteger.ONE;
		b = BigInteger.ONE;
		c = b;
	}

	public static void main(String[] args) throws IOException {
		while (st.nextToken() != StreamTokenizer.TT_EOF) {
			m = (int) st.nval;
			st.nextToken();
			n = (int) st.nval;
			len = n - m;
			for(int i = 2;i<=len;i++) {
				c = a.add(b);
				a = b;
				b = c;
			}
			writer.println(c);
		}
		writer.flush();
		writer.close();
		reader.close();
	}
}
