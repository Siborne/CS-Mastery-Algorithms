package week1.day3;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.StreamTokenizer;

public class T5 {

	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//	private static StreamTokenizer st = new StreamTokenizer(reader);
	private static PrintWriter writer = new PrintWriter(new BufferedOutputStream(System.out));

	private static boolean[] notPrime = new boolean[4010];
	private static int[] prime = new int[4010];
	private static int tot = 0;

	private static void init(int n) {
		for (int i = 2; i <= n; i++) {
			if (!notPrime[i]) {
				prime[++tot] = i;
				for (int j = i * i; j <= n; j += i) {
					notPrime[j] = true;
				}
			}
		}
	}

	private static boolean check(long x) {
		if (x == 1) {
			return true;
		}
		long y2 = (long) Math.sqrt(x);
		if (y2 * y2 == x || (y2 + 1) * (y2 + 1) == x) {
			return true;
		}

		long y3 = (long) Math.pow(x, 1.0 / 3.0);
		for (long i = y3; i <= y3 + 2; i++) {
			if (i * i * i == x) {
				return true;
			}
		}

		return false;
	}

	private static int T;

	public static void main(String[] args) throws IOException {
		init(4000);
//		while (st.nextToken() != StreamTokenizer.TT_EOF) {
		T = Integer.parseInt(reader.readLine());
		while (T-- > 0) {
			long x = Long.parseLong(reader.readLine());
			if (check(x)) {
				writer.println("yes");
				continue;
			}

			boolean flag = true;
			for (int i = 1; i <= tot; i++) {
				if (x % prime[i] == 0) {
					int now = 0;
					while (x % prime[i] == 0) {
						now++;
						x /= prime[i];
					}
					if (now == 1) {
						flag = false;
						break;
					}
				}
			}

			if (flag && check(x)) {
				writer.println("yes");
			} else {
				writer.println("no");
			}
		}
//		}
		writer.flush();
		writer.close();
		reader.close();
	}

}
