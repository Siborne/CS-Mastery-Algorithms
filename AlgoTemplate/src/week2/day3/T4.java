package week2.day3;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.StreamTokenizer;

public class T4 {

	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	private static StreamTokenizer st = new StreamTokenizer(reader);
	private static PrintWriter writer = new PrintWriter(new BufferedOutputStream(System.out));

	public static void main(String[] args) throws IOException {
		while (st.nextToken() != StreamTokenizer.TT_EOF) {
			int n = (int) st.nval;
			int[] arr = new int[n + 1];
			long[] f = new long[n + 1];
			for (int i = 1; i <= n; i++) {
				st.nextToken();
				arr[i] = (int) st.nval - 1;
			}

			f[1] = arr[1];
			for (int i = 2; i <= n; i++) {
				if (arr[i] <= arr[i - 1]) {
					f[i] = f[i - 1];
				} else {
					f[i] = f[i - 1] + (arr[i] - arr[i - 1]);
				}
			}
			writer.println(f[n]);
		}
		writer.flush();
		writer.close();
		reader.close();
	}

}
