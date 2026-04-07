package week2.day1;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.StreamTokenizer;

public class T3 {

	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	private static StreamTokenizer st = new StreamTokenizer(reader);
	private static PrintWriter writer = new PrintWriter(new BufferedOutputStream(System.out));

	public static void main(String[] args) throws IOException {
		while (st.nextToken() != StreamTokenizer.TT_EOF) {
			int T = (int) st.nval;
			while (T-- > 0) {
				st.nextToken();
				int n = (int) st.nval;
				// int[] arr = new int[n];
				int ans = 0;
				for (int i = 0; i < n; i++) {
					// arr[i] = 0;
					st.nextToken();
					ans ^= (int) st.nval;
				}
				if (ans == 0) {
					writer.println("YES");
				} else {
					writer.println("NO");
				}
			}
		}
		writer.flush();
		writer.close();
		reader.close();
	}

}
