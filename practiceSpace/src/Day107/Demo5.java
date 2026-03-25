package Day107;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;

public class Demo5 {

	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	private static StreamTokenizer st = new StreamTokenizer(reader);
	private static PrintWriter writer = new PrintWriter(new OutputStreamWriter(System.out));

	private static final int MAXN = (int) 1e2 * 2 + 2;
	private static final char[] chs = new char[MAXN];
	private static int n;

	public static void main(String[] args) throws IOException {
		while (st.nextToken() != StreamTokenizer.TT_EOF) {
			n = (int) st.nval;
			for (int i = 0; i < n; i++) {
				chs[i] = 'o';
			}
			for (int i = n; i < 2 * n; i++) {
				chs[i] = '*';
			}
			chs[2 * n] = '-';
			chs[2 * n + 1] = '-';
			output();
			int len = n;
			while (true) {
				movechess(len - 1, 2 * len);
				len--;
				if (len == 3) {
					break;
				}
				movechess(len, 2 * len);
			}
			String ss = "";
			for (int i = 0; i < n - 4; i++) {
				ss += "o*";
			}
			for (int i = 0; i < 4; i++) {
				writer.println(out[i] + ss);
			}
		}
		writer.flush();
		writer.close();
		reader.close();
	}

	private static void swap(int i, int j) {
		char temp = chs[i];
		chs[i] = chs[j];
		chs[j] = temp;
	}

	private static void output() {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n * 2 + 2; i++) {
			sb.append(chs[i]);
		}
		writer.println(sb.toString());
	}

	private static void movechess(int start, int end) {
		swap(start, end);
		swap(start + 1, end + 1);
		output();
	}

	private static String[] out = new String[] { "ooo*o**--*", "o--*o**oo*", "o*o*o*--o*", "--o*o*o*o*" };

}
