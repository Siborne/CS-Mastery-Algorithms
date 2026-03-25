package Day46;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Demo1 {

	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	private static PrintWriter writer = new PrintWriter(new BufferedOutputStream(System.out));

	private static long[][][] dp = new long[21][21][21];

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		for (int i = 0; i < 21; i++) {
			for (int j = 0; j < 21; j++) {
				for (int k = 0; k < 21; k++) {
					dp[i][j][k] = -1;
				}
			}
		}
		while (true) {
			StringTokenizer st = new StringTokenizer(reader.readLine());
			Long a = Long.parseLong(st.nextToken());
			Long b = Long.parseLong(st.nextToken());
			Long c = Long.parseLong(st.nextToken());
			if (a == -1L && b == -1L && c == -1L) {
				break;
			}
			StringBuilder sb = new StringBuilder();
			sb.append("w(").append(a).append(", ").append(b).append(", ").append(c).append(") = ").append(w(a, b, c));
			writer.println(sb.toString());
		}
		writer.flush();
		writer.close();
		reader.close();
	}

	private static long w(long a, long b, long c) {
		if (a <= 0 || b <= 0 || c <= 0) {
			return 1L;
		}

		if (a > 20 || b > 20 || c > 20) {
			return w(20, 20, 20);
		}

		if (dp[(int) a][(int) b][(int) c] != -1) {
			return dp[(int) a][(int) b][(int) c];
		}

		if (a < b && b < c) {
			dp[(int) a][(int) b][(int) c] = w(a, b, c - 1) + w(a, b - 1, c - 1) - w(a, b - 1, c - 1);
		} else {
			dp[(int) a][(int) b][(int) c] = w(a - 1, b, c) + w(a - 1, b - 1, c) + w(a - 1, b, c - 1)
					- w(a - 1, b - 1, c - 1);
		}

		return dp[(int) a][(int) b][(int) c];
	}

}
