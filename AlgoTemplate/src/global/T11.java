package global;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;
import java.util.Arrays;

public class T11 {

	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	private static StreamTokenizer st = new StreamTokenizer(reader);
	private static PrintWriter writer = new PrintWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		while (st.nextToken() != StreamTokenizer.TT_EOF) {
			int n = (int) st.nval;
			long[] arr = new long[n];
			for (int i = 0; i < n; i++) {
				st.nextToken();
				arr[i] = (long) st.nval;
			}
			Arrays.sort(arr);
			long ans = 0;
			for (int l = 0, r = n / 2; l < n / 2 && r < n;) {
				if (arr[l] * 2 <= arr[r]) {
					ans++;
					l++;
					r++;
				} else {
					r++;
				}
			}
			writer.println(ans);
		}
		writer.flush();
		writer.close();
		reader.close();
	}

}
