package week2.day6;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.StreamTokenizer;
import java.util.StringTokenizer;

public class T3 {

	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//	private static StreamTokenizer st = new StreamTokenizer(reader);
	private static PrintWriter writer = new PrintWriter(new BufferedOutputStream(System.out));

	private static int T;
	private static long n, k;

	public static void main(String[] args) throws IOException {

		T = Integer.parseInt(reader.readLine());
		while (T-- > 0) {
			StringTokenizer st = new StringTokenizer(reader.readLine());
			n = Long.parseLong(st.nextToken());
			k = Long.parseLong(st.nextToken());

			// 第一次二分：确定和
			long l = 1, r = n + n;
			while (l + 1 != r) {
				long mid = (l + r) >> 1;
				if (check1(mid)) {
					l = mid;
				} else {
					r = mid;
				}
			}
			long sum = r;

			// 第二次二分：确定第一个数
			l = 1;
			r = n + 1;
			while (l + 1 != r) {
				long mid = (l + r) >> 1;
				if (check2(mid, sum)) {
					l = mid;
				} else {
					r = mid;
				}
			}

			writer.println(l + " " + (sum - l));
		}
//		}
		writer.flush();
		writer.close();
		reader.close();
	}

	private static long count(long x) {
		if (x <= n + 1) {
			return x * (x - 1) / 2;
		} else {
			return n * n - (2 * n - x + 1) * (2 * n - x) / 2;
		}
	}

	private static boolean check1(long x) {
		long sum = count(x);
		return sum < k;
	}

	private static boolean check2(long x, long sum) {
		long res = k - count(sum - 1);
		long one = Math.max(1L, sum - n);
		return x - one + 1 <= res;
	}

}
