package Day126;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;

public class Demo1 {

	private static BufferedReader reader;
	private static StreamTokenizer st;
	private static PrintWriter writer;

	static {
		reader = new BufferedReader(new InputStreamReader(System.in));
		st = new StreamTokenizer(reader);
		writer = new PrintWriter(new OutputStreamWriter(System.out));
	}

	private static final long MOD = (long) 1e9 + 7;
	private static final int N = (int) 1e7 + 10;
	private static int[] a = new int[10];
	private static final long[] f = new long[N];

	public static void main(String[] args) throws IOException {
		while (st.nextToken() != StreamTokenizer.TT_EOF) {
			for (int i = 0; i < 10; i++) {
				a[i] = (int) st.nval;
				st.nextToken();
			}
			f[0] = 1;
			f[1] = 1;
			for (int i = 2; i < N; i++) {
				f[i] = (f[i - 1] * i) % MOD;
			}
			long num1 = 0;
			for (int i = 0; i < 10; i++) {
				num1 += a[i];
			}
			long num2 = 1;
			for (int i = 0; i < 10; i++) {
				if (a[i] != 0) {
					num2 = (num2 * f[a[i]]) % MOD;
				}
			}
			writer.println(f[(int) num1] * qmi(num2, MOD - 2, MOD) % MOD);
		}
		writer.flush();
		writer.close();
		reader.close();
	}

	private static long qmi(long a, long b, long mod) {
		long ans = 1;
		while (b != 0) {
			if ((b & 1) != 0) {
				ans = ans * a % mod;
			}
			b >>= 1;
			a = a * a % mod;
		}
		return ans;
	}

}
