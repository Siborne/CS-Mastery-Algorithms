package Day112;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;
import java.util.Arrays;

public class Demo2 {

	private static final int MAXN;
	private static final boolean[] isPrime;
	private static BufferedReader reader;
	private static StreamTokenizer st;
	private static PrintWriter writer;

	static {
		MAXN = (int) 1e6 + 10;
		isPrime = new boolean[MAXN];
		reader = new BufferedReader(new InputStreamReader(System.in));
		st = new StreamTokenizer(reader);
		writer = new PrintWriter(new OutputStreamWriter(System.out));
		Arrays.fill(isPrime, true);
		isPrime[0] = isPrime[1] = false;
		for (int p = 2; p * p < MAXN; p++) {
			if (isPrime[p]) {
				for (int i = p * p; i < MAXN; i += p) {
					isPrime[i] = false;
				}
			}
		}
	}

	private static int t, x;

	public static void main(String[] args) throws IOException {
		while (st.nextToken() != StreamTokenizer.TT_EOF) {
			t = (int) st.nval;
			while (t-- > 0) {
				st.nextToken();
				x = (int) st.nval;
				writer.println(isPrime[x] ? "Yes" : "No");
			}
		}
		writer.flush();
		writer.close();
		reader.close();
	}

}
