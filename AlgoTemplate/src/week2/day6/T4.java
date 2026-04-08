package week2.day6;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.StreamTokenizer;
import java.util.StringTokenizer;

public class T4 {

	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//	private static StreamTokenizer st = new StreamTokenizer(reader);
	private static PrintWriter writer = new PrintWriter(new BufferedOutputStream(System.out));

	public static void main(String[] args) throws IOException {
		int T = Integer.parseInt(reader.readLine());
		while (T-- > 0) {
			StringTokenizer st = new StringTokenizer(reader.readLine());
			long n = Long.parseLong(st.nextToken());
			long m = Long.parseLong(st.nextToken());

			if (m >= n) {
				writer.println(1);
				continue;
			}

			if (!check(n, n, m)) {
				writer.println(-1);
				continue;
			}

			long left = 1, right = n;
			while (left < right) {
				long mid = (left + right) >> 1;
				if (check(mid, n, m)) {
					right = mid;
				} else {
					left = mid + 1;
				}
			}
			writer.println(left);
		}
		writer.flush();
		writer.close();
		reader.close();
	}

	private static boolean check(long x, long n, long m) {
		if (x <= 0) {
			return false;
		}

		int k0 = (int) Math.min(m, 64 - Long.numberOfLeadingZeros(x));
		long sum = (1L << k0) - 1;

		long remaining = m - k0;
		long total = sum + remaining * x;

		return total >= n;
	}

}
