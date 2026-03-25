package Day112;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;
import java.util.Arrays;

public class Demo3 {

	private static final int MAXN, MAXM;
	private static final boolean[] isPrime;
	private static final int[] sum;
	private static BufferedReader reader;
	private static StreamTokenizer st;
	private static PrintWriter writer;

	static {
		MAXN = (int) 1e6 + 1;
		MAXM = (int) 1e6 + 2;
		isPrime = new boolean[MAXN];
		sum = new int[MAXM];
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
		for (int i = 1; i < MAXM; i++) {
			if (isPrime[i - 1]) {
				sum[i]++;
			}
			sum[i] += sum[i - 1];
		}
	}

	private static int n, l, r;

	public static void main(String[] args) throws IOException {
		while (st.nextToken() != StreamTokenizer.TT_EOF) {
			n = (int) st.nval;
			while (n-- > 0) {
				st.nextToken();
				l = (int) st.nval;
				st.nextToken();
				r = (int) st.nval + 1;
				writer.println(sum[r] - sum[l]);
			}
		}
		writer.flush();
		writer.close();
		reader.close();
	}

}
