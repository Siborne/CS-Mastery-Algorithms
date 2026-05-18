package week2.day8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;
import java.util.Arrays;

public class T2 {

	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	private static StreamTokenizer st = new StreamTokenizer(reader);
	private static PrintWriter writer = new PrintWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		while (st.nextToken() != StreamTokenizer.TT_EOF) {
			int n = (int) st.nval;
			long[] arr = new long[n];
			long[] brr = new long[n];

			for (int i = 0; i < n; i++) {
				st.nextToken();
				arr[i] = (int) st.nval;
			}
			for (int i = 0; i < n; i++) {
				st.nextToken();
				brr[i] = (int) st.nval;
			}
			Arrays.sort(arr);
			Arrays.sort(brr);

			int i = 0;
			int j = 0;
			int ans = 0;
			while (i < n && j < n) {
				if (2 * arr[i] > brr[j]) {
					i++;
					j++;
					ans++;
				} else {
					i++;
				}
			}
			writer.println(ans);
		}
		writer.flush();
		writer.close();
		reader.close();
	}

}
