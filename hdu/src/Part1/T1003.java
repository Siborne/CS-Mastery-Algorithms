package Part1;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.StreamTokenizer;
import java.math.BigInteger;

public class T1003 {
	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	private static StreamTokenizer st = new StreamTokenizer(reader);
	private static PrintWriter writer = new PrintWriter(new BufferedOutputStream(System.out));
	private static int T, n, num;
	private static int start, ansStart, ansEnd;
	private static long sum, ansSum;
	private static boolean flag;

	public static void main(String[] args) throws IOException {
		while (st.nextToken() != StreamTokenizer.TT_EOF) {
			T = (int) st.nval;
			for (int i = 1; i <= T; i++) {
				st.nextToken();
				n = (int) st.nval;
				sum = 0;
				ansStart = ansEnd = start = 0;
				ansSum = Long.MIN_VALUE;
				flag = false;
				for (int j = 1; j <= n; j++) {
					st.nextToken();
					num = (int) st.nval;
					if (!flag) {
						start = j;
						sum = num;
						flag = true;
						maxFun(j);
						continue;
					}
					if (sum < 0) {
						start = j;
						sum = num;
					} else {
						sum += num;
					}

					maxFun(j);
				}
				StringBuilder line = new StringBuilder();
				line.append(ansSum).append(" ").append(ansStart).append(" ").append(ansEnd);
				writer.println("Case " + i + ":");
				writer.println(line.toString());
				writer.println();
			}
		}
		writer.flush();
		writer.close();
		reader.close();
	}

	private static void maxFun(int endIndex) {
		if (sum > ansSum) {
			ansStart = start;
			ansEnd = endIndex;
			ansSum = sum;
		}
		return;
	}
}
