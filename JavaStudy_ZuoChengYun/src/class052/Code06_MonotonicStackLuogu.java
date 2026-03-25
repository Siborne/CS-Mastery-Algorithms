package class052;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;

public class Code06_MonotonicStackLuogu {

	public static void main(String[] args) throws IOException {
		int n = nextInt();
		int[] arr = new int[n + 1];
		for (int i = 1; i <= n; i++) {
			arr[i] = nextInt();
		}
		int[] stack = new int[n + 1];
		int r = 0;
		for (int i = 1; i <= n; i++) {
			while (r > 0 && arr[stack[r - 1]] < arr[i]) {
				arr[stack[--r]] = i;
			}
			stack[r++] = i;
		}
		while (r > 0) {
			arr[stack[--r]] = 0;
		}
		writer.print(arr[1]);
		for (int i = 2; i <= n; i++) {
			writer.print(" " + arr[i]);
		}
		writer.flush();
		writer.close();
	}

	private static InputStream reader = new BufferedInputStream(System.in);
	private static PrintWriter writer = new PrintWriter(System.out);

	private static int nextInt() throws IOException {
		int ch, sign = 1, ans = 0;
		while (!Character.isDigit(ch = reader.read())) {
			if (ch == '-') {
				sign = -1;
			}
		}
		do {
			ans = ans * 10 + ch - '0';
		} while (Character.isDigit(ch = reader.read()));
		return (ans * sign);
	}

}
