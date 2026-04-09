package week2.day7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;
import java.util.Arrays;
import java.util.Iterator;

public class T5 {

	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	private static StreamTokenizer st = new StreamTokenizer(reader);
	private static PrintWriter writer = new PrintWriter(new OutputStreamWriter(System.out));

	private static int n, k;
	private static int[] arr;

	public static void main(String[] args) throws IOException {
		while (st.nextToken() != StreamTokenizer.TT_EOF) {
			n = (int) st.nval;
			st.nextToken();
			k = (int) st.nval;
			arr = new int[n];
			for (int i = 0; i < n; i++) {
				st.nextToken();
				arr[i] = (int) st.nval;
			}

			Arrays.sort(arr);
			long[] prefix = new long[n + 1];
			for (int i = 0; i < n; i++) {
				prefix[i + 1] = prefix[i] + arr[i];
			}

			long ans = 0;
			int left = 0;

			for (int right = 0; right < n; right++) {
				while (left <= right && arr[right] - arr[left] > k) {
					left++;
				}
				long sum = prefix[right + 1] - prefix[left];
				ans = Math.max(ans, sum);
			}
			writer.println(ans);
		}
		writer.flush();
		writer.close();
		reader.close();
	}

}
