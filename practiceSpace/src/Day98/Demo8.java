package Day98;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.StreamTokenizer;

public class Demo8 {

	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	private static StreamTokenizer st = new StreamTokenizer(reader);
	private static PrintWriter writer = new PrintWriter(new BufferedOutputStream(System.out));

	private static long n, m;
	private static long a, b;

	private static final int MOD = (int) 1e8 + 7;

	public static void main(String[] args) throws IOException {
		while (st.nextToken() != StreamTokenizer.TT_EOF) {
			n = (int) st.nval;
			st.nextToken();
			m = (int) st.nval;
			a = 1;
			b = 1;
			for (int i = 1; i <= m; i++) {
				a = a * i % MOD;
				b = b * (n - i + 1) % MOD;
			}
			System.out.println(b * binpow(a, MOD - 2, MOD) % MOD);
		}

		writer.flush();
		writer.close();
		reader.close();
	}

	private static long binpow(long a, long b, long MOD) {
		a %= MOD;
		long res = 1;
		while (b > 0) {
			if ((b & 1) == 1) {
				res = res * a % MOD;
			}
			a = a * a % MOD;
			b >>= 1;
		}
		return res;
	}

}
