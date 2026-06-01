package global;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;

public class T10 {

	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	private static StreamTokenizer st = new StreamTokenizer(reader);
	private static PrintWriter writer = new PrintWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		while (st.nextToken() != StreamTokenizer.TT_EOF) {
			int n = (int) st.nval;
			st.nextToken();
			int m = (int) st.nval;
			int[] arr = new int[n];
			int[] brr = new int[m];
			for (int i = 0; i < n; i++) {
				st.nextToken();
				arr[i] = (int) st.nval;
			}
			for (int i = 0; i < m; i++) {
				st.nextToken();
				brr[i] = (int) st.nval;
			}

			int k = 0;
			long sumA = arr[0];
			long sumB = brr[0];
			int i = 0;
			int j = 0;
			while (i < n && j < m) {
				if (sumA == sumB) {
					k++;
					i++;
					j++;
					if (i < n) {
						sumA = arr[i];
					}
					if (j < m) {
						sumB = brr[j];
					}
				} else if (sumA < sumB) {
					i++;
					if (i < n) {
						sumA += arr[i];
					}
				} else {
					j++;
					if (j < m) {
						sumB += brr[j];
					}
				}
			}
			writer.println(n + m - (k << 1));
		}
		writer.flush();
		writer.close();
		reader.close();
	}

}
