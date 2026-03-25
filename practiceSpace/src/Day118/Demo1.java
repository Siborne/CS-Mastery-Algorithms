package Day118;

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

	public static void main(String[] args) throws IOException {
		while (st.nextToken() != StreamTokenizer.TT_EOF) {
			int t = (int) st.nval;
			while (t-- > 0) {
				st.nextToken();
				int n = (int) st.nval;
				long[] a = new long[n];
				for (int i = 0; i < a.length; i++) {
					st.nextToken();
					a[i] = (long) st.nval;
				}
				writer.println(maxAlternatingSubsequenceSum(a, n));
			}
		}
		writer.flush();
		writer.close();
		reader.close();
	}

	private static long maxAlternatingSubsequenceSum(long[] a, int n) {
		if (n == 0) {
			return 0;
		}

		long sum = 0;
		long currentMax = a[0];
		int currentSign = a[0] > 0 ? 1 : -1;

		for (int i = 1; i < a.length; i++) {
			int sign = a[i] > 0 ? 1 : -1;

			if (sign == currentSign) {
				currentMax = Math.max(currentMax, a[i]);
			} else {
				sum += currentMax;
				currentMax = a[i];
				currentSign = sign;
			}

		}
		sum += currentMax;
		return sum;

	}

}
