package Day147;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;

public class Demo7 {

	private static final int MAXN = (int) 2e6 + 1;

	private static int[] queue = new int[MAXN];
	private static int left, right;

	private static int n, m;
	private static int[] arr = new int[MAXN];

	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	private static StreamTokenizer st = new StreamTokenizer(reader);
	private static PrintWriter writer = new PrintWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		while (st.nextToken() != StreamTokenizer.TT_EOF) {
			build();
			n = (int) st.nval;
			st.nextToken();
			m = (int) st.nval;
			for (int i = 0; i < n; i++) {
				st.nextToken();
				arr[i] = (int) st.nval;
			}
			for (int i = 0; i < n; i++) {
				while (!isEmpty() && arr[peekTail()] <= arr[i]) {
					popTail();
				}
				pushTail(i);
				while (!isEmpty() && peekFront() <= i - m) {
					popFront();
				}
				if (i >= m - 1) {
					writer.println(arr[peekFront()]);
				}
			}
		}
		writer.flush();
		writer.close();
		reader.close();
	}

	private static void pushTail(int x) {
		queue[right++] = x;
	}

	private static void popTail() {
		right--;
	}

	private static int peekTail() {
		return queue[right - 1];
	}

	private static void popFront() {
		left++;
	}

	private static int peekFront() {
		return queue[left];
	}

	private static boolean isEmpty() {
		return left == right;
	}

	private static void build() {
		left = right = 0;
	}

}