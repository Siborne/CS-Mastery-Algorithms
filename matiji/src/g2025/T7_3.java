package g2025;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.StreamTokenizer;
import java.util.Stack;

public class T7_3 {
	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	private static StreamTokenizer st = new StreamTokenizer(reader);
	private static PrintWriter writer = new PrintWriter(new BufferedOutputStream(System.out));

	private static int T, n;
	private static long ans, x;
	private static int[] a;

	public static void main(String[] args) throws IOException {
		st.nextToken();
		T = (int) st.nval;
		while (T-- > 0) {
			st.nextToken();
			n = (int) st.nval;
			ans = 0;
			a = new int[n];
			for (int i = 0; i < n; i++) {
				st.nextToken();
				a[i] = (int) st.nval;
			}
			for (int i = 0; i < n; i++) {
				for (int j = i + 1; j < n; j++) {
					if (a[j] > a[i]) {
						ans += i;
						break;
					}
				}
			}
			writer.println(ans);
		}

		writer.flush();
		writer.close();
		reader.close();
	}

}
