package Day112;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;
import java.util.Arrays;

public class Demo4 {

	private static final int MAXN;
	private static final boolean[] isPrime;
	private static BufferedReader reader;
	private static StreamTokenizer st;
	private static PrintWriter writer;

	static {
		MAXN = (int) 1e6 + 1;
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

	private static int n;

	public static void main(String[] args) throws IOException {
		while (st.nextToken() != StreamTokenizer.TT_EOF) {
			n = (int) st.nval;
			long cnt = 0;
			if (n >= 2) {
				cnt++;
			}

			for (long p3 = 3; p3 <= n; p3 += 2) {
				if (!isPrime[(int) p3]) {
					continue;
				}
				long p2_long = p3 * p3 - 2;
				if (p2_long > n) {
					break;
				}
				if (isPrime[(int) p2_long]) {
					cnt += 2;
				}
			}

			writer.println(cnt);
		}
		writer.flush();
		writer.close();
		reader.close();
	}

}
