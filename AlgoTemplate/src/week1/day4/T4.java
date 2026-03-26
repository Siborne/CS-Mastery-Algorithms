package week1.day4;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.StreamTokenizer;
import java.util.Iterator;

public class T4 {

	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	private static StreamTokenizer st = new StreamTokenizer(reader);
	private static PrintWriter writer = new PrintWriter(new BufferedOutputStream(System.out));

	private static final int MAXN = (int) 3e5 + 10;
	private static long[] arr = new long[MAXN];
	private static long[] num = new long[MAXN];
	private static final long MOD = 415;

	public static void main(String[] args) throws IOException {
		while (st.nextToken() != StreamTokenizer.TT_EOF) {
			int n = (int) st.nval;
			st.nextToken();
			int q = (int) st.nval;
			for (int i = 1; i <= n; i++) {
				st.nextToken();
				arr[i] = (int) st.nval;
			}
			for (int i = 1; i <= q; i++) {
				st.nextToken();
				int x = (int) st.nval;
				num[x]++;
			}
			for (int i = 1; i <= n; i++) {
				if (num[i] != 0) {
					long pow33 = quickMod(33, num[i], MOD);
					for (int j = i; j <= n; j += i) {
						arr[j] = arr[j] * pow33 % MOD;
					}
				}
			}
			StringBuilder sb = new StringBuilder();
			for (int i = 1; i <= n; i++) {
				sb.append(arr[i]).append(" ");
			}
			writer.println(sb.toString().trim());
		}
		writer.flush();
		writer.close();
		reader.close();
	}

	private static int quickMod(long base, long exp, long mod) {
		long res = 1;
		base %= mod;
		while (exp != 0) {
			if ((exp & 1) == 1) {
				res = (res * base) % mod;
			}
			base = (base * base) % mod;
			exp >>= 1;
		}
		return (int) res;
	}

}
